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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

WebUI.setText(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/input_Username_username'), 'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/input_Password_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/button_Login'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/span_Admin'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/span_PIM'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/span_Leave'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/span_Time'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/span_Recruitment'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/span_My Info'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/span_Performance'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/span_Dashboard'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/span_Directory'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/span_Maintenance'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/span_Claim'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/span_Buzz'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/input_Admin_oxd-input oxd-input--focus'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/p_Time at Work'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/p_My Actions'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/p_Quick Launch'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/p_Buzz Latest Posts'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/p_Employees on Leave Today'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/p_Employee Distribution by Sub Unit'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/p_Employee Distribution by Location'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/img_Upgrade_oxd-userdropdown-img'))

WebUI.verifyElementVisible(findTestObject('Dashboard_Object/Page_OrangeHRM/button_Admin_oxd-icon-button oxd-main-menu-button'))

