import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import katalon.truetest.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'Step 1: Navigate to Page_home'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/')

'Step 2: At Page home, click on input hospital readmission'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/input_hospital_readmission'))

'Step 3: At Page home, click on label object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/label_object'))

'Step 4: At Page home, click on span object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/span_object'))

'Step 5: At Page home, click on td object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/td_object'))

'Step 6: At Page home, click on textarea comment'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/textarea_comment'))

'Step 7: At Page home, input on textarea comment'

WebUI.setText(findTestObject('AI-Generated/Page_home/textarea_comment'), textarea_comment)

'Step 8: At Page home, click on button btn book appointment > navigate to Page appointment.php'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_btn_book_appointment'))

'Step 9: At Page appointment.php, click on hyperlink menu toggle'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_appointment_php/hyperlink_menu_toggle'))

'Step 10: At Page appointment.php, click on hyperlink logout > navigate to Page home'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_appointment_php/hyperlink_logout'))

'Step 11: At Page home, click on hyperlink btn make appointment > navigate to Page profile.php'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/hyperlink_btn_make_appointment'))

'Step 12: Login into Application'

TrueTestScripts.login()

'Step 13: Add visual checkpoint at Page_home'

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Verify Logging Out and Making Appointment from Profile Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
