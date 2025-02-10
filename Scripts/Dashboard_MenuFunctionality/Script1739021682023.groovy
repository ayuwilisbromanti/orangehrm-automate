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

WebUI.verifyElementVisible(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/h6_Dashboard'))

WebUI.click(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/span_Admin'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/h6_Admin'))

WebUI.back()

WebUI.click(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/span_PIM'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/h6_PIM'))

WebUI.back()

WebUI.click(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/span_Leave'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/h6_Leave'))

WebUI.back()

WebUI.click(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/span_Time'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/h6_Timesheets'))

WebUI.back()

WebUI.click(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/span_Recruitment'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/h6_Recruitment'))

WebUI.back()

WebUI.click(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/span_My Info'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/h6_PIM'))

WebUI.back()

WebUI.click(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/a_Performance'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/h6_Manage Reviews'))

WebUI.back()

WebUI.click(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/span_Dashboard'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/h6_Dashboard'))

WebUI.click(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/span_Directory'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/h6_Directory'))

WebUI.back()

WebUI.click(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/span_Maintenance'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/h6_Administrator Access'))

WebUI.click(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/span_Claim'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/h6_Claim'))

WebUI.back()

WebUI.click(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/span_Buzz'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/h6_Buzz'))

WebUI.back()

WebUI.click(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/i_Today_oxd-icon bi-stopwatch'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/h6_Attendance_1'))

WebUI.back()

WebUI.click(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/p_(1) Candidate to Interview'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/h5_Candidates'))

WebUI.back()

WebUI.scrollToElement(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/p_Assign Leave'), 5)

WebUI.click(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/div_Assign Leave'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/div_Leave'))

WebUI.back()

WebUI.scrollToElement(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/p_Leave List'), 5)

WebUI.click(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/div_Leave List'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/div_Leave'))

WebUI.back()

WebUI.scrollToElement(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/p_Timesheets'), 5)

WebUI.click(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/div_Timesheets'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/h6_Timesheets'))

WebUI.back()

WebUI.scrollToElement(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/p_Apply Leave'), 5)

WebUI.click(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/div_Apply Leave'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/h6_Apply Leave'))

WebUI.back(FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/p_My Leave'), 5)

WebUI.click(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/div_My Leave'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/h5_My Leave List'))

WebUI.back()

WebUI.scrollToElement(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/p_My Timesheet'), 5)

WebUI.click(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/div_My Timesheet'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/h6_My Timesheet'))

WebUI.back()

WebUI.scrollToElement(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/i_Today_oxd-icon bi-gear-fill orangehrm-lea_f4b820'), 
    5)

WebUI.click(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/i_Today_oxd-icon bi-gear-fill orangehrm-lea_f4b820'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/div_Employees on Leave TodayConfigurationsO_d5d67f'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/p_Configurations'))

WebUI.click(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/button_Cancel_1'))

WebUI.scrollToElement(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/i_Today_oxd-icon bi-gear-fill orangehrm-lea_f4b820'), 
    5)

WebUI.click(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/i_Today_oxd-icon bi-gear-fill orangehrm-lea_f4b820'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/div_Employees on Leave TodayConfigurationsO_d5d67f'), 
    5)

WebUI.verifyElementVisible(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/p_Configurations'))

WebUI.click(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/button_'))

WebUI.scrollToElement(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/p_Employee Distribution by Location'), 
    5)

WebUI.scrollToElement(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/img_Upgrade_oxd-userdropdown-img'), 
    5)

WebUI.click(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/img_Upgrade_oxd-userdropdown-img'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/a_About'))

WebUI.click(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/a_About'))

WebUI.click(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/button__1'))

WebUI.click(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/img_Upgrade_oxd-userdropdown-img'))

WebUI.click(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/a_Support'))

WebUI.verifyElementText(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/h6_Getting Started with OrangeHRM'), 
    'Getting Started with OrangeHRM')

WebUI.back()

WebUI.click(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/img_Upgrade_oxd-userdropdown-img'))

WebUI.click(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/a_Change Password'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/h6_Update Password_1'))

WebUI.back()

WebUI.click(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/img_Upgrade_oxd-userdropdown-img'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/a_Logout'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/button_Admin_oxd-icon-button oxd-main-menu-button'))

WebUI.verifyElementNotVisible(findTestObject('Object Repository/Dashboard_Object/Page_OrangeHRM/span_Admin'))

