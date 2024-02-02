import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'Step 1: Navigate to Page home'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/')

'Step 2: At Page home, click on hyperlink btn make appointment > navigate to Page profile php'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/hyperlink_btn_make_appointment'))

'Step 3: At Page profile php, input on input username'

WebUI.setText(findTestObject('AI-Generated/Page_profile_php/input_username'), input_username)

'Step 4: At Page profile php, click on input password'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_profile_php/input_password'))

'Step 5: At Page profile php, click on button btn login > navigate to Page home'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_profile_php/button_btn_login'))

'Step 6: Add visual checkpoint at Page home'

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Verify Successful Login and Access to Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
