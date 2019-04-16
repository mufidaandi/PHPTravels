import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.phptravels.net/')

WebUI.click(findTestObject('Sign Up/Page_PHPTRAVELS  Travel Technology/a_My Account'))

WebUI.click(findTestObject('Sign Up/Page_PHPTRAVELS  Travel Technology/a_Sign Up'))

WebUI.setText(findTestObject('Sign Up/Page_Register/input_First Name_firstname'), 'Mufida')

WebUI.setText(findTestObject('Sign Up/Page_Register/input_Last Name_lastname'), 'Andi')

WebUI.setText(findTestObject('Sign Up/Page_Register/input_Mobile Number_phone'), '09959344941')

WebUI.setText(findTestObject('Sign Up/Page_Register/input_Email_email'), 'aaa1234@gmail.com')

WebUI.setEncryptedText(findTestObject('Sign Up/Page_Register/input_Password_password'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.setEncryptedText(findTestObject('Sign Up/Page_Register/input_Confirm Password_confirm'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.scrollToPosition(509, 649)

WebUI.click(findTestObject('Sign Up/Page_Register/button_Sign Up'))

