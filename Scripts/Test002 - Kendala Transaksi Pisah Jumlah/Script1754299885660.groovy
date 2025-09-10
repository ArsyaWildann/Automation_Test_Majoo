import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import internal.GlobalVariable as GlobalVariable

// === FUNGSI SCROLL ===
def scrollKiriLayar() {
    int width = Mobile.getDeviceWidth()
    int height = Mobile.getDeviceHeight()
    int startX = width / 10
    int startY = height * 3 / 4
    int endY = height / 4
    Mobile.swipe(startX, startY, startX, endY)
}

def scrollTengahLayar() {
    int width = Mobile.getDeviceWidth()
    int height = Mobile.getDeviceHeight()
    int startX = width / 2
    int startY = height * 3 / 4
    int endY = height / 5
    Mobile.swipe(startX, startY, startX, endY)
}

def scrollOrderan() {
    int deviceWidth = Mobile.getDeviceWidth()
    int deviceHeight = Mobile.getDeviceHeight()

    int startX = deviceWidth / 2
    int startY = deviceHeight / 2       // mulai dari tengah
    int endY = startY - 200             // scroll ke atas sedikit

    Mobile.swipe(startX, startY, startX, endY)
    Mobile.delay(1)
}

// === JALANKAN APLIKASI ===
Mobile.startExistingApplication('com.klopos')

// === BUKA KATEGORI DAN SCROLL KIRI ===
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/BUTTON_KATEGORI'), 0)
scrollKiriLayar()

// === TAP KATEGORI CHEESE FOOD ===
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/BUTTON CHEESE FOOD'), 0)

// === PILIH PRODUK BBQ SMOKE BEEF CHEESE ===
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/BBQ SMOKE BEEF CHEESE'), 0)
scrollTengahLayar()
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/EKSTRA BAHAN'), 0)
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/SIMPAN'), 0)

// === PILIH PRODUK-PRODUK LAIN ===
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/CHEESYDOG'), 0)
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/FISHCHEESE'), 0)
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/JELATACHEESE'), 0)
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/JURAGANCHEESE'), 0)
scrollTengahLayar()
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/NIGRATCHEESE'), 0)
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/PITIKCHEESE'), 0)
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/SULTANCHEESE'), 0)
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/SIMPAN (1)'), 0)

// === CEK KONDISI DELETE ORDERAN LAMA ===
if (Mobile.verifyElementExist(findTestObject('Object Repository/DELETE_DAFTAR_ORDER/DAFTAR_ORDER_2'), 2, FailureHandling.OPTIONAL)) {
    println("Data orderan lama ditemukan, proses delete...")
    Mobile.tap(findTestObject('Object Repository/DELETE_DAFTAR_ORDER/DAFTAR_ORDER_2'), 0, FailureHandling.OPTIONAL)
    Mobile.tap(findTestObject('Object Repository/DELETE_DAFTAR_ORDER/PESANAN_2'), 0, FailureHandling.OPTIONAL)   
    Mobile.tap(findTestObject('Object Repository/DELETE_DAFTAR_ORDER/BAYAR'), 0, FailureHandling.OPTIONAL)
    Mobile.tap(findTestObject('Object Repository/DELETE_DAFTAR_ORDER/UANG_PAS'), 0, FailureHandling.OPTIONAL)
    Mobile.tap(findTestObject('Object Repository/DELETE_DAFTAR_ORDER/PROSES_BAYAR'), 0, FailureHandling.OPTIONAL)
    Mobile.tap(findTestObject('Object Repository/DELETE_DAFTAR_ORDER/SELESAI'), 0, FailureHandling.OPTIONAL)
	Mobile.tap(findTestObject('Object Repository/DELETE_DAFTAR_ORDER/BACK'), 0, FailureHandling.OPTIONAL)
    println("Proses delete selesai.")
} else {
    println("Tidak ada orderan lama, langsung ke orderan pertama...")
    Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/ORDERAN 1'), 0, FailureHandling.OPTIONAL)
}

// === ORDERAN 1 ===
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/DAFTAR ORDER'), 0)
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/ORDERAN_1'), 0)
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/BAYAR'), 0)
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/PISAH BAYAR'), 0)
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/PISAH PRODUK'), 0)
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/LANJUTKAN'), 0)
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/TAMBAH_1'), 0)
scrollOrderan()
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/TAMBAH_2'), 0)
scrollOrderan()
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/TAMBAH_1'), 0)
scrollOrderan()
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/TAMBAH_2'), 0)
scrollOrderan()
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/PROSES'), 0)
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/UANG PAS'), 0)
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/PROSES_BAYAR'), 0)
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/SELESAI'), 0)

// === ORDERAN 2 ===
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/ORDERAN_2'), 0)
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/BAYAR'), 0)
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/PISAH BAYAR'), 0)
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/PISAH_PRODUK'), 0)
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/LANJUTKAN'), 0)
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/TAMBAH_2'), 0)
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/DELETE'), 0)
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/TAMBAH_2'), 0)
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/PROSES'), 0)
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/UANG PAS'), 0)
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/PROSES_BAYAR'), 0)
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/SELESAI'), 0)

// === ORDERAN 3 ===
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/ORDERAN_3'), 0)
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/TAMBAH_PESANAN'), 0)
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/CHEESYDOG'), 0)
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/BAYAR_ORDERAN(3)'), 0)
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/UANG PAS (1)'), 0)
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/BACK'), 0)
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/LANJUTKAN (1)'), 0)
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/DAFTAR ORDER'), 0)
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/LANJUTKAN (1)'), 0)
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/ORDERAN_TERAKHIR'), 0)

// === VALIDASI TOTAL AKHIR ===
TestObject totalAkhirObj = findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/Total_akhir')

// coba ambil pakai contentDescription dulu
String actualTotal = Mobile.getAttribute(totalAkhirObj, 'contentDescription', 5)

// fallback kalau null/kosong
if (actualTotal == null || actualTotal.trim() == "") {
    actualTotal = Mobile.getText(totalAkhirObj, 5)
}



// validasi hasil
if (actualTotal == GlobalVariable.expectedTotal) {
    KeywordUtil.markPassed("✅ Validasi berhasil. Expected: ${GlobalVariable.expectedTotal}, Actual: ${actualTotal}")
} else {
    KeywordUtil.markFailed("❌ Validasi gagal. Expected: ${GlobalVariable.expectedTotal}, Actual: ${actualTotal}")
}


