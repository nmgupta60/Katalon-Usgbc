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






WebUI.navigateToUrl(GlobalVariable.BaseUrl+store)

//WebUI.navigateToUrl('http://test-dynamic-usgbc.pantheonsite.io/store')

//WebUI.click(findTestObject('Object Repository/Store/Page_USGBC store  dynamic-usgbc/div_Green Apple Lapel Pins30.0'))
WebUI.click(GreenApplePins)
//WebUI.click(findTestObject('Object Repository/Store/Page_Green Apple Lapel Pins  dynami/input_op'))
WebUI.click(AddCart)
//WebUI.click(findTestObject('Object Repository/Store/Page_Shopping cart  dynamic-usgbc/a_Checkout'))
WebUI.click(Checkout)
CustomKeywords.'newPackage.storeDetails.storeContact'(storeSheet, rowNum)
//WebUI.selectOptionByValue(findTestObject('Object Repository/Store/Page_USGBC Store Contact Form  dyna/select_Select a shipping optio'),'GROUND_HOME_DELIVERY', true)
WebUI.selectOptionByValue(ShipServiceType, 'GROUND_HOME_DELIVERY', false)
WebUI.delay(8)

//WebUI.click(findTestObject('Object Repository/Store/Page_USGBC Store Contact Form  dyna/input_how_did_you_hear2'))
WebUI.click(SelectEmail)
//WebUI.click(findTestObject('Object Repository/Store/Page_USGBC Store Contact Form  dyna/input_op (1)'))
WebUI.click(StorePageContinue)
//myData.changeSheet("SignIn")
CustomKeywords.'newPackage.SignIn.getSignIn'(signInSheet, rowNum)
//WebUI.setText(findTestObject('Object Repository/SignIn/Page_Sign-in Page  dynamic-usgbc/input_existinguser_usernamae'),  myData.getValue(6,1))

//WebUI.setText(findTestObject('Object Repository/SignIn/Page_Sign-in Page  dynamic-usgbc/input_existinguser_password'),myData.getValue(7,1))
//def obj = new SignIn()
//obj.getSignIn()
//(new SignIn()).getSignIn()
CustomKeywords.'newPackage.payment.getPayment'(paymentSheet, rowNum)
CustomKeywords.'newPackage.payment.getBillingDetails'(paymentSheet, rowNum)
//CustomKeywords.'newPackage.SignIn.getSignIn'('arjun@gmail.com', 'initpass')

//CustomKeywords.'newPackage.payment.getPayment'(371449635392376, 'Amex', 11, 2028, 9997)
//
//CustomKeywords.'newPackage.payment.getBillingDetails'('1808 Glengate', 'circle', 'Morrisville', 'NC', '27560')

