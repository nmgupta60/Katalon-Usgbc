import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')
WebUI.maximizeWindow()
WebUI.navigateToUrl('http://test-dynamic-usgbc.pantheonsite.io/sponsorship/content')

WebUI.click(findTestObject('sponser/Page_sponsorship Form  dynamic-usgb/input_types'))

WebUI.setText(findTestObject('sponser/Page_sponsorship Form  dynamic-usgb/input_amount'), '50')
WebUI.takeScreenshot()
WebUI.setText(findTestObject('sponser/Page_sponsorship Form  dynamic-usgb/input_addressaddress_line1'), '725 chestnut st')

WebUI.setText(findTestObject('sponser/Page_sponsorship Form  dynamic-usgb/input_addressaddress_line2'), 'west')

WebUI.setText(findTestObject('sponser/Page_sponsorship Form  dynamic-usgb/input_addresslocality'), 'erie')

WebUI.selectOptionByValue(findTestObject('sponser/Page_sponsorship Form  dynamic-usgb/select_- Select -AlabamaAlaska'), 
    'PA', true)
WebUI.verifyElementText(findTestObject('sponser/Page_sponsorship Form  dynamic-usgb/input_addresslocality'), 'erie')
WebUI.setText(findTestObject('sponser/Page_sponsorship Form  dynamic-usgb/input_addresspostal_code'), '16507')

WebUI.click(findTestObject('sponser/Page_sponsorship Form  dynamic-usgb/input_op'))

WebUI.setText(findTestObject('sponser/Page_Sign-in Page  dynamic-usgbc/input_existinguser_usernamae'), 'mallik@gmail.com')

WebUI.setText(findTestObject('sponser/Page_Sign-in Page  dynamic-usgbc/input_existinguser_password'), 'initpass')

WebUI.click(findTestObject('sponser/Page_Sign-in Page  dynamic-usgbc/input_op'))

WebUI.setText(findTestObject('sponser/Page_Payment Form  dynamic-usgbc/input_name_on_card'), 'amex')

WebUI.setText(findTestObject('sponser/Page_Payment Form  dynamic-usgbc/input_card_number'), '98318378758743287')

WebUI.selectOptionByValue(findTestObject('sponser/Page_Payment Form  dynamic-usgbc/select_Select01020304050607080'), '11', 
    true)

WebUI.selectOptionByValue(findTestObject('sponser/Page_Payment Form  dynamic-usgbc/select_select20182019202020212'), '2022', 
    true)

WebUI.setText(findTestObject('sponser/Page_Payment Form  dynamic-usgbc/input_security_code'), '234')

WebUI.setText(findTestObject('sponser/Page_Payment Form  dynamic-usgbc/input_billing_addressaddress_l'), '725 chestnut st')

WebUI.setText(findTestObject('sponser/Page_Payment Form  dynamic-usgbc/input_billing_addressaddress_l_1'), 'west')

WebUI.setText(findTestObject('sponser/Page_Payment Form  dynamic-usgbc/input_billing_addresslocality'), 'erie')

WebUI.selectOptionByValue(findTestObject('sponser/Page_Payment Form  dynamic-usgbc/select_- Select -AlabamaAlaska'), 'PA', 
    true)

WebUI.setText(findTestObject('sponser/Page_Payment Form  dynamic-usgbc/input_billing_addresspostal_co'), '16507')

WebUI.click(findTestObject('sponser/Page_Payment Form  dynamic-usgbc/div_Payment type'))

WebUI.closeBrowser()

