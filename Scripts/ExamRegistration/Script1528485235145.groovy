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
import newPackage.ExamRegistrationDetails
import newPackage.SignIn
import newPackage.membershipDetails
import newPackage.payment

import main.XlsReader

String path = RunConfiguration.getProjectDir()+"\\DynamicUsgbc.xlsx"

XlsReader obj = new XlsReader(path)
String email = obj.getCellData("SignIn", "Email", 2)
String password = obj.getCellData("SignIn", "Password", 2)

String examType = obj.getCellData("ExamRegistration", "ExamType", 2)
String language = obj.getCellData("ExamRegistration","Language", 2)

String address1 = obj.getCellData("ExamRegistration","Street1",2)
String address2 = obj.getCellData("ExamRegistration","Street2",2)
String city = obj.getCellData("ExamRegistration","City",2)
String state = obj.getCellData("ExamRegistration","StateCode",2)
String zip = obj.getCellData("ExamRegistration","Zip",2)

String dob = obj.getCellData("ExamRegistration","DOB", 2)
String jobTitle = obj.getCellData("ExamRegistration","JobTitle", 2)
String organization = obj.getCellData("ExamRegistration","Organization", 2)

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
WebUI.delay(2)
ExamRegistrationDetails.examInfo(examType, language)

SignIn.getSignIn(email, password)
WebUI.delay(3)

WebUI.click(exampageContinue)

ExamRegistrationDetails.candidateDetails(address1, address2, city, state, zip, dob, jobTitle, organization)

payment.getPayment(cardholderName, cardNumber, cardExpMonth, cardExpYear, cvv)

payment.getBillingDetails(billingAddress1, billingAddress2, billingCity, billingState, billingZip)
