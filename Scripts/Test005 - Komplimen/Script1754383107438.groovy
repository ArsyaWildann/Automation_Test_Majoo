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

import org.openqa.selenium.interactions.PointerInput
import org.openqa.selenium.interactions.Sequence
import java.time.Duration
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.android.nativekey.AndroidKey
import io.appium.java_client.android.nativekey.KeyEvent

// ----------------------
// FUNGSI - SWIPE & SCROLL UNTUK KOMPLIMEN
// ----------------------

String getPageSource() {
    return MobileDriverFactory.getDriver().getPageSource()
}

void swipeUpAreaMetodePembayaran(int width, int height) {
    PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger")
    Sequence swipe = new Sequence(finger, 1)

    int startX = 150
    int startY = (int)(height * 0.85)
    int endX = 150
    int endY = (int)(height * 0.4)

    swipe.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY))
    swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
    swipe.addAction(finger.createPointerMove(Duration.ofMillis(800), PointerInput.Origin.viewport(), endX, endY))
    swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()))

    MobileDriverFactory.getDriver().perform(java.util.Arrays.asList(swipe))
}

boolean scrollSampeMentok(int width, int height, int maxSwipe, int delaySeconds) {
    String lastPageSource = ""
    String currentPageSource = ""
    int i = 0

    while (i < maxSwipe) {
        currentPageSource = getPageSource()
        if (currentPageSource.equals(lastPageSource)) {
            Mobile.comment("Sudah mentok scroll metode pembayaran setelah $i kali swipe.")
            return true
        }
        swipeUpAreaMetodePembayaran(width, height)
        Mobile.delay(delaySeconds)
        lastPageSource = currentPageSource
        i++
    }
    Mobile.comment("Scroll maksimum tercapai ($maxSwipe kali).")
    return false
}

// ----------------------
// SCRIPT UTAMA
// ----------------------

Mobile.startExistingApplication('com.klopos')

// Pilih produk dan bayar
Mobile.tap(findTestObject('Object Repository/MINUS_KOMPLIMEN/CHEESYDOG'), 0)
Mobile.tap(findTestObject('Object Repository/MINUS_KOMPLIMEN/BAYAR'), 0)

// Pilih metode pembayaran
Mobile.tap(findTestObject('Object Repository/MINUS_KOMPLIMEN/NONTUNAI'), 0)
Mobile.tap(findTestObject('Object Repository/MINUS_KOMPLIMEN/BCA DEBIT'), 0)
Mobile.tap(findTestObject('Object Repository/MINUS_KOMPLIMEN/CLOSE'), 0)

// Scroll sampai menemukan tombol KOMPLIMEN
int width = Mobile.getDeviceWidth()
int height = Mobile.getDeviceHeight()
int maxSwipe = 20
int delaySeconds = 1
scrollSampeMentok(width, height, maxSwipe, delaySeconds)

TestObject komplimenBtn = findTestObject('Object Repository/MINUS_KOMPLIMEN/KOMPLIMEN')
boolean found = Mobile.waitForElementPresent(komplimenBtn, 5)

if (found) {
    Mobile.comment("Tombol KOMPLIMEN ditemukan. Tap sekarang.")
    Mobile.tap(komplimenBtn, 0)
} else {
    Mobile.comment("Tombol KOMPLIMEN tidak ditemukan setelah scroll.")
}

// ISI KOMPLIMEN
Mobile.tap(findTestObject('Object Repository/MINUS_KOMPLIMEN/android.widget.EditText - 22,000'), 0)
Mobile.clearText(findTestObject('Object Repository/MINUS_KOMPLIMEN/android.widget.EditText - 22,000 (1)'), 0)
Mobile.setText(findTestObject('Object Repository/MINUS_KOMPLIMEN/21900'), '21900', 0)

// ENTER untuk hide keyboard
AndroidDriver driver = MobileDriverFactory.getDriver()
driver.pressKey(new KeyEvent(AndroidKey.ENTER))

Mobile.tap(findTestObject('Object Repository/MINUS_KOMPLIMEN/android.view.View'), 0)

// PILIH USER
Mobile.tap(findTestObject('Object Repository/MINUS_KOMPLIMEN/PILIH'), 0)
Mobile.tap(findTestObject('Object Repository/MINUS_KOMPLIMEN/MUHAMMADISMY'), 0)
Mobile.setText(findTestObject('Object Repository/MINUS_KOMPLIMEN/PIN'), '123456', 0)
Mobile.tap(findTestObject('Object Repository/MINUS_KOMPLIMEN/SIMPAN'), 0)

// ULANGI PEMBAYARAN
Mobile.tap(findTestObject('Object Repository/MINUS_KOMPLIMEN/NONTUNAI'), 0)
Mobile.tap(findTestObject('Object Repository/MINUS_KOMPLIMEN/BCA DEBIT (1)'), 0)
Mobile.tap(findTestObject('Object Repository/MINUS_KOMPLIMEN/SIMPAN'), 0)
Mobile.tap(findTestObject('Object Repository/MINUS_KOMPLIMEN/PROSES BAYAR'), 0)
Mobile.tap(findTestObject('Object Repository/MINUS_KOMPLIMEN/SELESAI'), 0)
