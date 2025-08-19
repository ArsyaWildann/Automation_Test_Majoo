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

// ==== FUNCTION LOGIN ====
def loginAwal() {
    Mobile.tap(findTestObject('Object Repository/PIN_PAGE/PIN_1'), 0)
    Mobile.tap(findTestObject('Object Repository/PIN_PAGE/SELECT_KARYAWAN'), 0)
    Mobile.tap(findTestObject('Object Repository/PIN_PAGE/PILIH'), 0)
    Mobile.tap(findTestObject('Object Repository/PIN_PAGE/PIN_1'), 0)
    Mobile.tap(findTestObject('Object Repository/PIN_PAGE/PIN_2'), 0)
    Mobile.tap(findTestObject('Object Repository/PIN_PAGE/PIN_3'), 0)
    Mobile.tap(findTestObject('Object Repository/PIN_PAGE/PIN_4'), 0)
    Mobile.tap(findTestObject('Object Repository/PIN_PAGE/PIN_5'), 0)
    Mobile.tap(findTestObject('Object Repository/PIN_PAGE/PIN_6'), 0)
    Mobile.tap(findTestObject('Object Repository/PIN_PAGE/NANTI'), 0)
}

// ==== FUNCTION BUKA KASIR ====
def bukaKasir() {
    Mobile.tap(findTestObject('Object Repository/PIN_PAGE/BUKA_KASIR'), 0)
    Mobile.tap(findTestObject('Object Repository/PIN_PAGE/SINKRONISASI'), 0)
}

// ==== FUNCTION TUTUP KASIR ====
def tutupKasir() {
    Mobile.tap(findTestObject('Object Repository/PIN_TUTUP_KASIR/PIN_TUTUP_KASIR(1)'), 0)
    Mobile.tap(findTestObject('Object Repository/PIN_TUTUP_KASIR/PIN_TUTUP_KASIR(2)'), 0)
    Mobile.tap(findTestObject('Object Repository/PIN_TUTUP_KASIR/PIN_TUTUP_KASIR(3)'), 0)
    Mobile.tap(findTestObject('Object Repository/PIN_TUTUP_KASIR/PIN_TUTUP_KASIR(4)'), 0)
    Mobile.tap(findTestObject('Object Repository/PIN_TUTUP_KASIR/PIN_TUTUP_KASIR(5)'), 0)
    Mobile.tap(findTestObject('Object Repository/PIN_TUTUP_KASIR/PIN_TUTUP_KASIR(6)'), 0)
    Mobile.tap(findTestObject('Object Repository/PIN_TUTUP_KASIR/LANJUTKAN'), 0)
    Mobile.tap(findTestObject('Object Repository/PIN_TUTUP_KASIR/TUTUP_KASIR'), 0)
}

// ==== START TEST ====
Mobile.startExistingApplication('com.klopos')

// Jalankan login awal
loginAwal()

// ==== CEK KONDISI TUTUP KASIR ====
if (Mobile.verifyElementExist(findTestObject('Object Repository/PIN_TUTUP_KASIR/PIN_TUTUP_KASIR(1)'), 3, FailureHandling.OPTIONAL)) {
    tutupKasir()
    loginAwal() // login ulang setelah tutup kasir
}

// ==== CEK KONDISI BUKA KASIR ====
if (Mobile.verifyElementExist(findTestObject('Object Repository/PIN_PAGE/BUKA_KASIR'), 3, FailureHandling.OPTIONAL)) {
    bukaKasir()
}

Mobile.comment('Proses selesai')
