import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'Step 1: At Page home, click on hyperlink object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/hyperlink_object'))

'Step 2: At Page home, click on hyperlink logout'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/hyperlink_logout'))

'Step 3: At Page home, click on hyperlink make appointment > navigate to Page profile.php'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/hyperlink_make_appointment'))

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
