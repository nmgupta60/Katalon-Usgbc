import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.configuration.RunConfiguration
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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

import newPackage.SignIn
import newPackage.payment

import main.XlsReader

String path = RunConfiguration.getProjectDir()+"\\DynamicUsgbc.xlsx"

XlsReader obj = new XlsReader(path)
String email = obj.getCellData("SignIn", "Email", 2)
String password = obj.getCellData("SignIn", "Password", 2)

String examType = obj.getCellData("ExamRegistration", "ExamType", 2)
String language = obj.getCellData("ExamRegistration","Language", 2)

String address1 = obj.getCellData("MembershipContact","Street1",2)
String address2 = obj.getCellData("MembershipContact","Street2",2)
String city = obj.getCellData("MembershipContact","City",2)
String state = obj.getCellData("MembershipContact","StateCode",2)
String zip = obj.getCellData("MembershipContact","Zip",2)

String dob = obj.getCellData("MembershipContact","DOB", 2)
String jobTitle = obj.getCellData("MembershipContact","JobTitle", 2)
String organization = obj.getCellData("MembershipContact","Organization", 2)

String cardholderName = obj.getCellData("Payment", "Name", 2)
String cardNumber = obj.getCellData("Payment", "CardNumber", 2)
String cardExpMonth = obj.getCellData("Payment", "ExpMonth", 2)
String cardExpYear = obj.getCellData("Payment", "ExpYear", 2)
String cvv = obj.getCellData("Payment","SecurityCode", 2)

String billingAddress1 = obj.getCellData("Payment","Street1",2)
String billingAddress2 = obj.getCellData("Payment","Street2",2)
String billingCity = obj.getCellData("Payment","City",2)
String billingState = obj.getCellData("Payment","State",2)
String billingZip = obj.getCellData("Payment","Zip",2)

WebUI.navigateToUrl(GlobalVariable.BaseUrl+examRegistrationUrl)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Register Exams/Page_Exam types and information For/select_LEED AP BDC ExamLEED AP'), examType, false)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Register Exams/Page_Exam types and information For/select_- Select Language -Engl'), language, false)

WebUI.click(findTestObject('Object Repository/Register Exams/Page_Exam types and information For/input_accomodation'))

WebUI.click(findTestObject('Object Repository/Register Exams/Page_Exam types and information For/input_veteran'))

WebUI.click(findTestObject('Object Repository/Register Exams/Page_Exam types and information For/input_op'))

SignIn.getSignIn(email, password)
WebUI.delay(3)
WebUI.click(findTestObject('Object Repository/Register Exams/Page_Exam types and information For/input_op'))

//WebUI.setText(findTestObject('Object Repository/Register Exams/Page_Exam candidate registration Fo/input_attention_to'), null)

//WebUI.setText(findTestObject('Object Repository/Register Exams/Page_Exam candidate registration Fo/input_company'), null)

WebUI.setText(findTestObject('Object Repository/Register Exams/Page_Exam candidate registration Fo/input_addressaddress_line1'), address1)

WebUI.setText(findTestObject('Object Repository/Register Exams/Page_Exam candidate registration Fo/input_addressaddress_line2'), address2)

WebUI.setText(findTestObject('Object Repository/Register Exams/Page_Exam candidate registration Fo/input_addresslocality'),city)

WebUI.selectOptionByValue(findTestObject('Object Repository/Register Exams/Page_Exam candidate registration Fo/select_- Select -AlabamaAlaska'), state, false)

WebUI.setText(findTestObject('Object Repository/Register Exams/Page_Exam candidate registration Fo/input_addresspostal_code'), zip)

WebUI.setText(findTestObject('Object Repository/Register Exams/Page_Exam candidate registration Fo/input_bday'), dob)

WebUI.click(findTestObject('Object Repository/Register Exams/Page_Exam candidate registration Fo/input_gender (1)'))

WebUI.setText(findTestObject('Object Repository/Register Exams/Page_Exam candidate registration Fo/input_jobtitle'), jobTitle)

WebUI.setText(findTestObject('Object Repository/Register Exams/Page_Exam candidate registration Fo/input_organization'), organization)

WebUI.click(findTestObject('Object Repository/Register Exams/Page_Exam candidate registration Fo/input_pdl'))

WebUI.click(findTestObject('Object Repository/Register Exams/Page_Exam candidate registration Fo/input_terms'))

payment.getPayment(cardholderName, cardNumber, cardExpMonth, cardExpYear, cvv)

payment.getBillingDetails(billingAddress1, billingAddress2, billingCity, billingState, billingZip)
