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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://test-dynamic-usgbc.pantheonsite.io/membership/contact')

WebUI.click(findTestObject('Page_Contact Form  dynamic-usgbc/a_Sign in'))

WebUI.setText(findTestObject('Page_Sign-in Page  dynamic-usgbc/input_existinguser_usernamae'), 'mallik@gmail.com')

WebUI.setText(findTestObject('Page_Sign-in Page  dynamic-usgbc/input_existinguser_password'), 'initpass')

WebUI.click(findTestObject('Page_Sign-in Page  dynamic-usgbc/input_op'))

WebUI.setText(findTestObject('Page_Contact Form  dynamic-usgbc/input_attention_to'), 'gupta')

WebUI.setText(findTestObject('Page_Contact Form  dynamic-usgbc/input_company'), 'promantus')

WebUI.setText(findTestObject('Page_Contact Form  dynamic-usgbc/input_addressaddress_line1'), '1808 Glengate Circle')

WebUI.setText(findTestObject('Page_Contact Form  dynamic-usgbc/input_addressaddress_line2'), 'West')

WebUI.setText(findTestObject('Page_Contact Form  dynamic-usgbc/input_addresslocality'), 'Erie')

WebUI.selectOptionByValue(findTestObject('Page_Contact Form  dynamic-usgbc/select_- Select -AlabamaAlaska'), 'PA', true)

WebUI.setText(findTestObject('Page_Contact Form  dynamic-usgbc/input_addresspostal_code'), '16507')

WebUI.click(findTestObject('Page_Contact Form  dynamic-usgbc/input_terms'))

WebUI.click(findTestObject('Page_Contact Form  dynamic-usgbc/input_op'))

WebUI.verifyTextPresent('This user is already a members...', false, FailureHandling.OPTIONAL)

//WebUI.takeScreenshot()
WebUI.delay(5)
not_run:WebUI.closeBrowser()
