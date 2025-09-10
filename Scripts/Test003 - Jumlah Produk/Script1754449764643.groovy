import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import internal.GlobalVariable as GlobalVariable

// Start aplikasi
Mobile.startExistingApplication('com.klopos')

// Langkah-langkah tap
Mobile.tap(findTestObject('Object Repository/ERROR_JUMLAH/Kategori Produk'), 0)
Mobile.tap(findTestObject('Object Repository/ERROR_JUMLAH/Produk Paket'), 0)
Mobile.tap(findTestObject('Object Repository/ERROR_JUMLAH/MAKAN_SIANG_ENAK'), 0)
Mobile.tap(findTestObject('Object Repository/ERROR_JUMLAH/SIMPAN'), 0)
Mobile.tap(findTestObject('Object Repository/ERROR_JUMLAH/MAKAN_SIANG_ENAK(3)'), 0)
Mobile.tap(findTestObject('Object Repository/ERROR_JUMLAH/TAMBAH 1'), 0)
Mobile.tap(findTestObject('Object Repository/ERROR_JUMLAH/SIMPAN'), 0)

// TestObject untuk total paket
TestObject totalPaketObj = findTestObject('Object Repository/ERROR_JUMLAH/Total_paket')

// Pastikan element ada
if (Mobile.waitForElementPresent(totalPaketObj, 10, FailureHandling.OPTIONAL)) {
    // Ambil beberapa atribut sekaligus
    String textAttr   = Mobile.getAttribute(totalPaketObj, 'text', 5, FailureHandling.OPTIONAL)
    String descAttr   = Mobile.getAttribute(totalPaketObj, 'contentDescription', 5, FailureHandling.OPTIONAL)
    String nameAttr   = Mobile.getAttribute(totalPaketObj, 'name', 5, FailureHandling.OPTIONAL)
    String labelAttr  = Mobile.getAttribute(totalPaketObj, 'label', 5, FailureHandling.OPTIONAL)

    KeywordUtil.logInfo("DEBUG >>> text='${textAttr}', contentDesc='${descAttr}', name='${nameAttr}', label='${labelAttr}'")

    // Tentukan actual value: pilih atribut yang ada isinya
    String rawValue = (textAttr ?: descAttr ?: nameAttr ?: labelAttr ?: "").trim()

    if (rawValue == '') {
        KeywordUtil.markFailed("❌ Element ditemukan tapi semua atribut kosong. Cek locator lagi.")
    } else {
        // Split per baris untuk expected & actual
        List<String> actualLines   = rawValue.split("\\r?\\n")*.trim().findAll { it }
        List<String> expectedLines = (GlobalVariable.expectedPaket ?: "").split("\\r?\\n")*.trim().findAll { it }

        KeywordUtil.logInfo("DEBUG >>> Actual lines: ${actualLines}")
        KeywordUtil.logInfo("DEBUG >>> Expected lines: ${expectedLines}")

        boolean allMatch = true
        for (String expected : expectedLines) {
            if (!actualLines.contains(expected)) {
                allMatch = false
                KeywordUtil.logWarning("⚠️ Tidak ditemukan di actual: '${expected}'")
            }
        }

        if (allMatch) {
            KeywordUtil.markPassed("✅ Validasi sukses. Semua expected ada di actual.\nExpected:\n${expectedLines.join("\n")}\nActual:\n${actualLines.join("\n")}")
        } else {
            KeywordUtil.markFailed("❌ Validasi gagal.\nExpected:\n${expectedLines.join("\n")}\nActual:\n${actualLines.join("\n")}")
        }
    }
} else {
    KeywordUtil.markFailed("❌ Object 'ERROR_JUMLAH/Total_paket' tidak ditemukan.")
}
