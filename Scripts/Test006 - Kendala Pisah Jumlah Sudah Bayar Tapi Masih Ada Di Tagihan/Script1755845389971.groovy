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


def scrollTagihan() {
	int deviceWidth = Mobile.getDeviceWidth()
	int deviceHeight = Mobile.getDeviceHeight()

	int startX = deviceWidth / 2
	int startY = deviceHeight / 2       // mulai dari tengah
	int endY = startY - 600             // scroll ke atas sedikit

	Mobile.swipe(startX, startY, startX, endY)
	Mobile.delay(1)
}



Mobile.tap(findTestObject('Object Repository/Kendala Transaksi Pisah Jumlah Masih Ada Produk/PELANGGAN'), 0)

Mobile.tap(findTestObject('Object Repository/Kendala Transaksi Pisah Jumlah Masih Ada Produk/GILANG'), 0)

Mobile.tap(findTestObject('Object Repository/Kendala Transaksi Pisah Jumlah Masih Ada Produk/CHEESYDOG'), 0)

Mobile.tap(findTestObject('Object Repository/Kendala Transaksi Pisah Jumlah Masih Ada Produk/FISHCHEESE'), 0)

Mobile.tap(findTestObject('Object Repository/Kendala Transaksi Pisah Jumlah Masih Ada Produk/PITIKCHEESE'), 0)

Mobile.tap(findTestObject('Object Repository/Kendala Transaksi Pisah Jumlah Masih Ada Produk/SIMPAN'), 0)

Mobile.tap(findTestObject('Object Repository/Kendala Transaksi Pisah Jumlah Masih Ada Produk/DAFTAR_ORDER'), 0)

Mobile.tap(findTestObject('Object Repository/Kendala Transaksi Pisah Jumlah Masih Ada Produk/TAP_ORDERAN'), 0)

Mobile.tap(findTestObject('Object Repository/Kendala Transaksi Pisah Jumlah Masih Ada Produk/BAYAR'), 0)

Mobile.tap(findTestObject('Object Repository/Kendala Transaksi Pisah Jumlah Masih Ada Produk/PISAH_BAYAR'), 0)

Mobile.tap(findTestObject('Object Repository/Kendala Transaksi Pisah Jumlah Masih Ada Produk/PISAH_PRODUK'), 0)

Mobile.tap(findTestObject('Object Repository/Kendala Transaksi Pisah Jumlah Masih Ada Produk/LANJUTKAN'), 0)

Mobile.tap(findTestObject('Object Repository/Kendala Transaksi Pisah Jumlah Masih Ada Produk/PISAH_CHEESYDOG'), 0)

Mobile.tap(findTestObject('Object Repository/Kendala Transaksi Pisah Jumlah Masih Ada Produk/PISAH_FISHCHEESE'), 0)

Mobile.tap(findTestObject('Object Repository/Kendala Transaksi Pisah Jumlah Masih Ada Produk/PROSES'), 0)

Mobile.tap(findTestObject('Object Repository/Kendala Transaksi Pisah Jumlah Masih Ada Produk/TRANSFER'), 0)

Mobile.tap(findTestObject('Object Repository/Kendala Transaksi Pisah Jumlah Masih Ada Produk/BCA'), 0)

Mobile.tap(findTestObject('Object Repository/Kendala Transaksi Pisah Jumlah Masih Ada Produk/PILIH_BANK'), 0)

Mobile.tap(findTestObject('Object Repository/Kendala Transaksi Pisah Jumlah Masih Ada Produk/SELECT_BANK'), 0)

Mobile.tap(findTestObject('Object Repository/Kendala Transaksi Pisah Jumlah Masih Ada Produk/SIMPANN'), 0)

Mobile.tap(findTestObject('Object Repository/Kendala Transaksi Pisah Jumlah Masih Ada Produk/SIMPAN (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Kendala Transaksi Pisah Jumlah Masih Ada Produk/PROSES_BAYAR'), 0)
scrollTagihan()
Mobile.tap(findTestObject('Object Repository/Kendala Transaksi Pisah Jumlah Masih Ada Produk/LUNASI TAGIHAN'), 0)

Mobile.tap(findTestObject('Object Repository/Kendala Transaksi Pisah Jumlah Masih Ada Produk/BACK'), 0)

Mobile.tap(findTestObject('Object Repository/Kendala Transaksi Pisah Jumlah Masih Ada Produk/LANJUTKAN (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Kendala Transaksi Pisah Jumlah Masih Ada Produk/DAFTAR_ORDER'), 0)

Mobile.tap(findTestObject('Object Repository/Kendala Transaksi Pisah Jumlah Masih Ada Produk/TAP_ORDERAN_TAGIHAN'), 0)

Mobile.tap(findTestObject('Object Repository/Kendala Transaksi Pisah Jumlah Masih Ada Produk/BAYAR'), 0)

Mobile.tap(findTestObject('Object Repository/Kendala Transaksi Pisah Jumlah Masih Ada Produk/UANG_PAS'), 0)

Mobile.tap(findTestObject('Object Repository/Kendala Transaksi Pisah Jumlah Masih Ada Produk/PROSES_BAYAR (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Kendala Transaksi Pisah Jumlah Masih Ada Produk/SELESAI'), 0)

Mobile.tap(findTestObject('Object Repository/Kendala Transaksi Pisah Jumlah Masih Ada Produk/BACK (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Kendala Transaksi Pisah Jumlah Masih Ada Produk/HAMBURGER'), 0)

Mobile.tap(findTestObject('Object Repository/Kendala Transaksi Pisah Jumlah Masih Ada Produk/PENJUALAN'), 0)



