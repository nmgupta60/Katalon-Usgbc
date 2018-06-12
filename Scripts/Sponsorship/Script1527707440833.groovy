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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import newPackage.SignIn
import newPackage.payment
import newPackage.sponsorDetails
import main.XlsReader

String path = RunConfiguration.getProjectDir()+"\\DynamicUsgbc.xlsx"

XlsReader obj = new XlsReader(path)
String email = obj.getCellData("SignIn", "Email", 2)
String password = obj.getCellData("SignIn", "Password", 2)

String communityName = obj.getCellData("Sponsorship", "newCommunityName", 2)
String amount = obj.getCellData("Sponsorship","Amount", 2)
String startDate = obj.getCellData("Sponsorship","StartDate", 2)
String endDate = obj.getCellData("Sponsorship","EndDate", 2)

String address1 = obj.getCellData("Sponsorship","Street1",2)
String address2 = obj.getCellData("Sponsorship","Street2",2)
String city = obj.getCellData("Sponsorship","City",2)
String state = obj.getCellData("Sponsorship","StateCode",2)
String zip = obj.getCellData("Sponsorship","Zip",2)

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

WebUI.navigateToUrl(GlobalVariable.BaseUrl+sponsorUrl)

sponsorDetails.sponsrDetails(communityName, amount, startDate, endDate, address1,address2, city, state, zip)

SignIn.getSignIn(email,password)

payment.getPayment(cardholderName, cardNumber, cardExpMonth, cardExpYear, cvv)

payment.getBillingDetails(billingAddress1, billingAddress2, billingCity, billingState, billingZip)


