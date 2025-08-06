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

Mobile.startExistingApplication('com.klopos')

Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/BUTTON_KATEGORI'), 0)

// Gunakan swipe manual untuk scroll ke tombol "CHEESE FOOD"
TestObject cheeseFoodButton = findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/BUTTON CHEESE FOOD')
int maxSwipes = 10
int swipeCount = 0
boolean isFound = false

while (!isFound && swipeCount < maxSwipes) {
    if (Mobile.waitForElementPresent(cheeseFoodButton, 2)) {
        isFound = true
    } else {
        Mobile.swipe(500, 1600, 500, 400)  // swipe dari bawah ke atas
        swipeCount++
    }
}

if (isFound) {
    Mobile.tap(cheeseFoodButton, 0)
} else {
    Mobile.comment("CHEESE FOOD button not found after ${maxSwipes} swipes.")
    assert false : "CHEESE FOOD button not found."
}

Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/BBQ SMOKE BEEF CHEESE'), 0)
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/EKSTRA BAHAN'), 0)
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/SIMPAN'), 0)
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/CHEESYDOG'), 0)
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/FISHCHEESE'), 0)
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/JELATACHEESE'), 0)
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/JURAGANCHEESE'), 0)
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/NIGRATCHEESE'), 0)
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/PITIKCHEESE'), 0)
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/SULTANCHEESE'), 0)
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/SIMPAN (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/DAFTAR ORDER'), 0)
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/ORDERAN_1'), 0)
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/BAYAR'), 0)
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/PISAH BAYAR'), 0)
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/PISAH PRODUK'), 0)
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/LANJUTKAN'), 0)
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/TAMBAH_1'), 0)
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/TAMBAH_2'), 0)
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/TAMBAH_1'), 0)
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/TAMBAH_2'), 0)
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/PROSES'), 0)
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/UANG PAS'), 0)
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/PROSES_BAYAR'), 0)
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/SELESAI'), 0)

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

Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/ORDERAN_3'), 0)
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/TAMBAH_PESANAN'), 0)
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/CHEESYDOG'), 0)
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/BAYAR (1)'), 0)
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/UANG PAS (1)'), 0)
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/BACK'), 0)
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/LANJUTKAN (1)'), 0)
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/DAFTAR ORDER'), 0)
Mobile.tap(findTestObject('Object Repository/Kendala_Transaksi_Pisah_Jumlah/ORDERAN_3'), 0)

Mobile.closeApplication()
