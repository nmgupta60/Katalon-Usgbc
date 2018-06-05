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

WebUI.navigateToUrl('http://test-dynamic-usgbc.pantheonsite.io/donations/center/online/haiti')

WebUI.selectOptionByValue(findTestObject('Object Repository/Donation Haiti/Page_Pay by online Donation Form  d/select_2550100other'), '$25', true)

WebUI.setText(findTestObject('Object Repository/Donation Haiti/Page_Pay by online Donation Form  d/input_donor_name'), 'promantus')

WebUI.setText(findTestObject('Object Repository/Donation Haiti/Page_Pay by online Donation Form  d/input_dedication_to_name'),'arjun')

WebUI.setText(findTestObject('Object Repository/Donation Haiti/Page_Pay by online Donation Form  d/input_dedication_to_email'),'arjun@gmail.com')

WebUI.click(findTestObject('Object Repository/Donation Haiti/Page_Pay by online Donation Form  d/input_op'))

CustomKeywords.'newPackage.payment.getPayment'(371449635392376, 'Amex',11, 2028,9997)

CustomKeywords.'newPackage.payment.getBillingDetails'('1808 Glengate', 'circle','Morrisville', 'NC', '27560')