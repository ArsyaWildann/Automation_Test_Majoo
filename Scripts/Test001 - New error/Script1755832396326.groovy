import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys



 //=== BUKA KATEGORI DAN SCROLL KIRI ===
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/BUTTON_KATEGORI'), 0)
scrollKiriLayar()

// === TAP KATEGORI CHEESE FOOD (TANPA SCROLL LAGI SETELAHNYA) ===
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/BUTTON CHEESE FOOD'), 0)

// === TAP PRODUK PERTAMA: BBQ SMOKE BEEF CHEESE ===
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/BBQ SMOKE BEEF CHEESE'), 0)

// === SCROLL TENGAH SEDIKIT UNTUK MUNCULKAN EKSTRA BAHAN ===
scrollTengahLayar()

// === TAMBAH EKSTRA BAHAN & SIMPAN ===
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/EKSTRA BAHAN'), 0)
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/SIMPAN'), 0)

// === PILIH PRODUK-PRODUK ===
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/CHEESYDOG'), 0)
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/FISHCHEESE'), 0)
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/JELATACHEESE'), 0)
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/JURAGANCHEESE'), 0)

scrollTengahLayar()
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/NIGRATCHEESE'), 0)
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/PITIKCHEESE'), 0)
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/SULTANCHEESE'), 0)
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/SIMPAN (1)'), 0)


//=== CEK KONDISI DELETE ===

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

Mobile.tap(findTestObject('Object Repository/Pisah_jumlah/Pisah_bayar'), 0)

Mobile.tap(findTestObject('Object Repository/Pisah_jumlah/Pisah_Jumlah'), 0)

Mobile.tap(findTestObject('Object Repository/Pisah_jumlah/5'), 0)

Mobile.tap(findTestObject('Object Repository/Pisah_jumlah/0'), 0)

Mobile.tap(findTestObject('Object Repository/Pisah_jumlah/0'), 0)

Mobile.tap(findTestObject('Object Repository/Pisah_jumlah/0'), 0)

Mobile.tap(findTestObject('Object Repository/Pisah_jumlah/0'), 0)

Mobile.tap(findTestObject('Object Repository/Pisah_jumlah/Proses'), 0)

Mobile.tap(findTestObject('Object Repository/Pisah_jumlah/Uang_pas'), 0)

Mobile.tap(findTestObject('Object Repository/Pisah_jumlah/Bayar'), 0)

Mobile.tap(findTestObject('Object Repository/Pisah_jumlah/Selesai'), 0)



def scrollKiriLayar() {
    int width = Mobile.getDeviceWidth()

    int height = Mobile.getDeviceHeight()

    int startX = width / 10

    int startY = (height * 3) / 4

    int endY = height / 4

    Mobile.swipe(startX, startY, startX, endY)
}

def scrollTengahLayar() {
    int width = Mobile.getDeviceWidth()

    int height = Mobile.getDeviceHeight()

    int startX = width / 2

    int startY = (height * 3) / 4

    int endY = height / 5

    Mobile.swipe(startX, startY, startX, endY)
}

