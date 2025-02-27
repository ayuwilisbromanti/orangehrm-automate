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

WebUI.verifyElementText(findTestObject('Object Repository/AddUserObjects/Page_OrangeHRM/p_For a strong password, please use a hard _685b13'), 
    'For a strong password, please use a hard to guess combination of text with upper and lower case characters, symbols and numbers')

WebUI.verifyElementText(findTestObject('Object Repository/AddUserObjects/Page_OrangeHRM/p_Required'), '* Required')

WebUI.verifyElementText(findTestObject('Object Repository/AddUserObjects/Page_OrangeHRM/label_User Role_AddUser'), 'User Role')

WebUI.click(findTestObject('Object Repository/AddUserObjects/Page_OrangeHRM/div_-- Select --'))

WebUI.click(findTestObject('Object Repository/AddUserObjects/Page_OrangeHRM/div_Admin'))

WebUI.verifyElementText(findTestObject('Object Repository/AddUserObjects/Page_OrangeHRM/label_Status'), 'Status')

WebUI.click(findTestObject('Object Repository/AddUserObjects/Page_OrangeHRM/Select_Status'))

WebUI.click(findTestObject('Object Repository/AddUserObjects/Page_OrangeHRM/Option_Enabled'))

WebUI.verifyElementText(findTestObject('Object Repository/AddUserObjects/Page_OrangeHRM/label_Employee Name'), 'Employee Name')

WebUI.setText(findTestObject('Object Repository/AddUserObjects/Page_OrangeHRM/input'), 'Ranga')

WebUI.focus(findTestObject('Object Repository/AddUserObjects/Page_OrangeHRM/input'))

WebUI.waitForElementVisible(findTestObject('Object Repository/AddUserObjects/Page_OrangeHRM/Option_Ranga  Akunuri'), 3)

WebUI.click(findTestObject('Object Repository/AddUserObjects/Page_OrangeHRM/Option_Ranga  Akunuri'))

WebUI.verifyElementText(findTestObject('Object Repository/AddUserObjects/Page_OrangeHRM/label_Username'), 'Username')

WebUI.setEncryptedText(findTestObject('Object Repository/AddUserObjects/Page_OrangeHRM/input_Password_oxd-input oxd-input--focus'), 
    'ra7PnHonuQLfpHqkVvDUoQ==')

WebUI.verifyElementText(findTestObject('Object Repository/AddUserObjects/Page_OrangeHRM/label_Confirm Password'), 'Confirm Password')

WebUI.setEncryptedText(findTestObject('Object Repository/AddUserObjects/Page_OrangeHRM/input_Confirm Password_oxd-input oxd-input--active'), 
    'ra7PnHonuQLfpHqkVvDUoQ==')

WebUI.verifyElementText(findTestObject('Object Repository/AddUserObjects/Page_OrangeHRM/button_Save'), 'Save')

WebUI.click(findTestObject('Object Repository/AddUserObjects/Page_OrangeHRM/button_Save'))

WebUI.verifyElementVisible(findTestObject('AddUserObjects/Page_OrangeHRM/Required_Username'))

