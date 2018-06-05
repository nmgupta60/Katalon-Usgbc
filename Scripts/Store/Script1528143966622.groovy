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
import com.kms.katalon.core.testdata.ExcelData
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import newPackage.SignIn

ExcelData myData = (ExcelData) findTestData("Test Data")

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://test-dynamic-usgbc.pantheonsite.io/store')

WebUI.click(findTestObject('Object Repository/Store/Page_USGBC store  dynamic-usgbc/div_Green Apple Lapel Pins30.0'))

WebUI.click(findTestObject('Object Repository/Store/Page_Green Apple Lapel Pins  dynami/input_op'))

WebUI.click(findTestObject('Object Repository/Store/Page_Shopping cart  dynamic-usgbc/a_Checkout'))
myData.changeSheet("Store")
WebUI.setText(findTestObject('Object Repository/Store/Page_USGBC Store Contact Form  dyna/input_addressaddress_line1'), myData.getValue(5,1))

WebUI.setText(findTestObject('Object Repository/Store/Page_USGBC Store Contact Form  dyna/input_addressaddress_line2'),myData.getValue(7,1))

WebUI.setText(findTestObject('Object Repository/Store/Page_USGBC Store Contact Form  dyna/input_addresslocality'), myData.getValue(9, 1))

WebUI.selectOptionByValue(findTestObject('Object Repository/Store/Page_USGBC Store Contact Form  dyna/select_- Select -AlabamaAlaska'), 
    'PA', true)

WebUI.setText(findTestObject('Object Repository/Store/Page_USGBC Store Contact Form  dyna/input_addresspostal_code'), myData.getValue(12, 1))

WebUI.delay(3)

WebUI.selectOptionByValue(findTestObject('Object Repository/Store/Page_USGBC Store Contact Form  dyna/select_Select a shipping optio'), 
    'GROUND_HOME_DELIVERY', true)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Store/Page_USGBC Store Contact Form  dyna/input_how_did_you_hear2'))

WebUI.click(findTestObject('Object Repository/Store/Page_USGBC Store Contact Form  dyna/input_op (1)'))
myData.changeSheet("SignIn")

//WebUI.setText(findTestObject('Object Repository/SignIn/Page_Sign-in Page  dynamic-usgbc/input_existinguser_usernamae'),  myData.getValue(6,1))

//WebUI.setText(findTestObject('Object Repository/SignIn/Page_Sign-in Page  dynamic-usgbc/input_existinguser_password'),myData.getValue(7,1))
//def obj = new SignIn()
//obj.getSignIn()
//(new SignIn()).getSignIn()
SignIn.getSignIn()

//CustomKeywords.'newPackage.SignIn.getSignIn'('arjun@gmail.com', 'initpass')

CustomKeywords.'newPackage.payment.getPayment'(371449635392376, 'Amex', 11, 2028, 9997)

CustomKeywords.'newPackage.payment.getBillingDetails'('1808 Glengate', 'circle', 'Morrisville', 'NC', '27560')

