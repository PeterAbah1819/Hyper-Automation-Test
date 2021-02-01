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

Mobile.tap(findTestObject('Object Repository/Nav/android.widget.CheckBox - APPS'), 0)

Mobile.scrollToText('Photography')

Mobile.tap(findTestObject('Object Repository/Nav/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/Nav/android.widget.TextView'), 0)

Mobile.tap(findTestObject('Object Repository/Nav/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('Object Repository/Nav/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/Nav/android.widget.CheckBox - GAMES'), 0)

Mobile.tap(findTestObject('Object Repository/Nav/android.widget.ImageView (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Nav/android.view.ViewGroup'), 0)

Mobile.scrollToText('Our Choices')

Mobile.tap(findTestObject('Object Repository/Nav/android.widget.TextView - Read also Top 10 Android TV Apps You Should Be Using'), 
    0)

Mobile.tap(findTestObject('Object Repository/Nav/android.widget.ImageButton (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Nav/android.widget.ImageButton (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Nav/android.widget.ImageView (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Nav/android.widget.Button - READ MORE'), 0)

Mobile.tap(findTestObject('Object Repository/Nav/android.widget.ImageButton (3)'), 0)

Mobile.scrollToText('Additional Information')

Mobile.tap(findTestObject('Object Repository/Nav/android.widget.LinearLayout'), 0)

Mobile.tap(findTestObject('Object Repository/Nav/android.widget.TextView - OK'), 0)

Mobile.tap(findTestObject('Object Repository/Nav/android.widget.ImageView (3)'), 0)

Mobile.tap(findTestObject('Object Repository/Nav/android.widget.TextView (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Nav/android.widget.Button - Copy'), 0)

Mobile.pressBack()

Mobile.closeApplication()

