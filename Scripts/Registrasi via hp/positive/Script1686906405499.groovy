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

WebUI.callTestCase(findTestCase('Prepare'), [:], FailureHandling.STOP_ON_FAILURE)

'Get Width Height and Store in device_Width variable'
device_Width = Mobile.getDeviceWidth()

'Get Width Height and Store in device_Width variable'
device_Height = Mobile.getDeviceHeight()

'Storing the startX value by dividing device width by 2. Because x coordinates are constant for Vertical Swiping'
int startX = device_Width / 2

'Here startX and endX values are equal for vertical Swiping for that assigning startX value to endX'
int endX = startX

'Storing the startY value'
int startY = device_Height * 0.30

'Storing the endY value'
int endY = device_Height * 0.70

Mobile.tap(findTestObject('Object Repository/Registrasi via hp/android.widget.TextView - Daftar Baru'), 0)

Mobile.tap(findTestObject('Object Repository/Registrasi via hp/android.widget.EditText'), 0)

Mobile.setText(findTestObject('Registrasi via hp/android.widget.EditText (19)'), GlobalVariable.G_Name, 0)

'Hide keyboard'
Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Registrasi via hp/android.widget.EditText (2)'), 0)

Mobile.setText(findTestObject('Object Repository/Registrasi via hp/android.widget.EditText (3)'), GlobalVariable.G_Tempat_Lahir, 
    0)

'Hide keyboard'
Mobile.hideKeyboard()

Mobile.setText(findTestObject('Object Repository/Registrasi via hp/android.widget.EditText (4)'), GlobalVariable.G_Tanggal_Lahir, 
    0)

Mobile.tap(findTestObject('Object Repository/Registrasi via hp/android.widget.EditText (5)'), 0)

Mobile.setText(findTestObject('Object Repository/Registrasi via hp/android.widget.EditText (6)'), GlobalVariable.G_No_Hp, 
    0)

'Hide keyboard'
Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Registrasi via hp/android.widget.EditText (7)'), 0)

Mobile.tap(findTestObject('Object Repository/Registrasi via hp/android.widget.EditText (7)'), 0)

Mobile.setText(findTestObject('Registrasi via hp/android.widget.EditText (7)'), GlobalVariable.G_Email, 0)

'Hide keyboard'
Mobile.hideKeyboard()

'Swipe Vertical from top to bottom'
Mobile.swipe(startX, endY, endX, startY)

Mobile.tap(findTestObject('Object Repository/Registrasi via hp/android.widget.EditText (8)'), 0)

Mobile.setText(findTestObject('Registrasi via hp/android.widget.EditText (8)'), GlobalVariable.G_NIK, 0)

'Hide keyboard'
Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Registrasi via hp/android.widget.EditText (9)'), 0)

Mobile.setText(findTestObject('Object Repository/Registrasi via hp/android.widget.EditText (10)'), GlobalVariable.G_NPWP, 
    0)

'Hide keyboard'
Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Registrasi via hp/android.widget.Spinner'), 0)

Mobile.tap(findTestObject('Object Repository/Registrasi via hp/android.widget.CheckedTextView - Pria'), 0)

Mobile.tap(findTestObject('Object Repository/Registrasi via hp/android.widget.EditText (11)'), 0)

Mobile.setText(findTestObject('Object Repository/Registrasi via hp/android.widget.EditText (12)'), GlobalVariable.G_Alamat, 
    0)

if (Mobile.verifyElementNotChecked(findTestObject('Object Repository/Registrasi via hp/android.widget.CheckBox'), 4)) {
    Mobile.checkElement(findTestObject('Object Repository/Registrasi via hp/android.widget.CheckBox'), 5)
}

Mobile.tap(findTestObject('Object Repository/Registrasi via hp/android.widget.EditText (13)'), 0)

Mobile.setText(findTestObject('Object Repository/Registrasi via hp/android.widget.EditText (14)'), GlobalVariable.G_Alamat_Kerja1, 
    0)

'Hide keyboard'
Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Registrasi via hp/android.widget.EditText (15)'), 0)

Mobile.setText(findTestObject('Object Repository/Registrasi via hp/android.widget.EditText (16)'), GlobalVariable.G_Alamat_Kerja2, 
    0)

'Hide keyboard'
Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Registrasi via hp/android.widget.EditText (17)'), 0)

Mobile.setText(findTestObject('Object Repository/Registrasi via hp/android.widget.EditText (18)'), GlobalVariable.G_Nomor_Induk, 
    0)

'Hide keyboard'
Mobile.hideKeyboard()

Mobile.tapAndHold(findTestObject('Object Repository/Registrasi via hp/android.widget.TextView - DAFTARKAN'), 5, 20)

Mobile.tap(findTestObject('Object Repository/Registrasi via hp/android.widget.Button - YA'), 20)

Mobile.delay(30)

