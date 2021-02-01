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

Mobile.startApplication('C:\\Users\\peter\\Desktop\\Mine\\Coding\\Tester\\APKs\\radio.apk', true)

Mobile.tap(findTestObject('Object Repository/SignUp/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/SignUp/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/SignUp/android.widget.Button - LOG INREGISTER'), 0)

Mobile.tap(findTestObject('Object Repository/SignUp/android.widget.CheckBox'), 0)

Mobile.tap(findTestObject('Object Repository/SignUp/android.widget.Button - CONNECT WITH EMAIL'), 0)

Mobile.setText(findTestObject('Object Repository/SignUp/android.widget.EditText - Your email here'), 'peterabah@gmail.com', 
    0)

Mobile.scrollToText('We\'ll send you a magic link')

Mobile.tap(findTestObject('Object Repository/SignUp/android.widget.Button - SEND MAGIC LINK'), 0)

Mobile.closeApplication()

WebUI.comment('Done Beeshees')

