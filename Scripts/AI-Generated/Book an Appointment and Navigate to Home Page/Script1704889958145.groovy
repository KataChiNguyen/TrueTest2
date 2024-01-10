import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'Step 1: At Page home, click on select facility'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/select_facility'))

'Step 2: At Page home, click on label object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/label_object'))

'Step 3: At Page home, click on input hospital readmission'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/input_hospital_readmission'))

'Step 4: At Page home, click on label object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/label_object_1'))

'Step 5: At Page home, click on input programs'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/input_programs'))

'Step 6: At Page home, click on input visit date'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/input_visit_date'))

'Step 7: At Page home, click on span object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/span_object'))

'Step 8: At Page home, click on td object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/td_object'))

'Step 9: At Page home, click on textarea comment'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/textarea_comment'))

'Step 10: At Page home, input on textarea comment'

WebUI.setText(findTestObject('AI-Generated/Page_home/textarea_comment'), '')

'Step 11: At Page home, click on button book appointment > navigate to Page appointment.php'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_book_appointment'))

'Step 12: At Page appointment.php, click on hyperlink object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_appointment_php/hyperlink_object'))

'Step 13: At Page appointment.php, click on hyperlink profile > navigate to Page profile.php'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_appointment_php/hyperlink_profile'))

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
