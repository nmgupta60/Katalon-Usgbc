import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import javax.xml.stream.events.Comment

import org.junit.After
import org.testng.annotations.Listeners

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.configuration.RunConfiguration
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
import newPackage.payment
import newPackage.storeDetails
import main.XlsReader
import internal.GlobalVariable


String path = RunConfiguration.getProjectDir()+"\\DynamicUsgbc.xlsx"

XlsReader obj = new XlsReader(path)
String email = obj.getCellData("SignIn", "Email", 2)
String password = obj.getCellData("SignIn", "Password", 2)

String address1 = obj.getCellData("Store","Street1",2)
String address2 = obj.getCellData("Store","Street2",2)
String city = obj.getCellData("Store","City",2)
String state = obj.getCellData("Store","StateCode",2)
String zip = obj.getCellData("Store","Zip",2)

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


WebUI.navigateToUrl(GlobalVariable.BaseUrl+store)

//WebUI.navigateToUrl('http://test-dynamic-usgbc.pantheonsite.io/store')

WebUI.click(findTestObject('Object Repository/Store/Page_USGBC store  dynamic-usgbc/div_Green Apple Lapel Pins30.0'))

WebUI.click(findTestObject('Object Repository/Store/Page_Green Apple Lapel Pins  dynami/input_op'))

WebUI.click(findTestObject('Object Repository/Store/Page_Shopping cart  dynamic-usgbc/a_Checkout'))

storeDetails.storeContact(address1, address2, city, state, zip)

WebUI.selectOptionByValue(findTestObject('Object Repository/Store/Page_USGBC Store Contact Form  dyna/select_Select a shipping optio'), 
    'GROUND_HOME_DELIVERY', true)

WebUI.delay(8)

WebUI.click(findTestObject('Object Repository/Store/Page_USGBC Store Contact Form  dyna/input_how_did_you_hear2'))

WebUI.click(findTestObject('Object Repository/Store/Page_USGBC Store Contact Form  dyna/input_op (1)'))
//myData.changeSheet("SignIn")
SignIn.getSignIn(email, password)

//WebUI.setText(findTestObject('Object Repository/SignIn/Page_Sign-in Page  dynamic-usgbc/input_existinguser_usernamae'),  myData.getValue(6,1))

//WebUI.setText(findTestObject('Object Repository/SignIn/Page_Sign-in Page  dynamic-usgbc/input_existinguser_password'),myData.getValue(7,1))
//def obj = new SignIn()
//obj.getSignIn()
//(new SignIn()).getSignIn()
payment.getPayment(cardholderName, cardNumber, cardExpMonth, cardExpYear, cvv)

payment.getBillingDetails(billingAddress1, billingAddress2, billingCity, billingState, billingZip)

//CustomKeywords.'newPackage.SignIn.getSignIn'('arjun@gmail.com', 'initpass')

//CustomKeywords.'newPackage.payment.getPayment'(371449635392376, 'Amex', 11, 2028, 9997)
//
//CustomKeywords.'newPackage.payment.getBillingDetails'('1808 Glengate', 'circle', 'Morrisville', 'NC', '27560')

