package newPackage

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable
import main.BaseClass
import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

public class payment extends BaseClass {


	@Keyword
	def getPayment(String sheetName,int rowNum ) {
		
		String cardholderName = obj.getCellData(sheetName, "Name",rowNum)
		String cardNumber = obj.getCellData(sheetName, "CardNumber", rowNum)
		String cardExpMonth = obj.getCellData(sheetName, "ExpMonth", rowNum)
		String cardExpYear = obj.getCellData(sheetName, "ExpYear", rowNum)
		String cvv = obj.getCellData(sheetName,"SecurityCode", rowNum)


		WebUI.setText(findTestObject('payment/Page_Payment Form  dynamic-usgbc/input_name_on_card'), cardholderName)

		WebUI.setText(findTestObject('payment/Page_Payment Form  dynamic-usgbc/input_card_number'), cardNumber)

		WebUI.selectOptionByValue(findTestObject('payment/Page_Payment Form  dynamic-usgbc/select_Select01020304050607080'), cardExpMonth,true)

		WebUI.selectOptionByValue(findTestObject('payment/Page_Payment Form  dynamic-usgbc/select_select20182019202020212'), cardExpYear,true)

		WebUI.setText(findTestObject('payment/Page_Payment Form  dynamic-usgbc/input_security_code'), cvv)
	}


	@Keyword
	def getBillingDetails(String sheetName,int rowNum ) {
		
		String billingAddress1 = obj.getCellData(sheetName,"Street1",rowNum)
		String billingAddress2 = obj.getCellData(sheetName,"Street2",rowNum)
		String billingCity = obj.getCellData(sheetName,"City",rowNum)
		String billingState = obj.getCellData(sheetName,"State",rowNum)
		String billingZip = obj.getCellData(sheetName,"Zip",rowNum)


		WebUI.setText(findTestObject('payment/Page_Payment Form  dynamic-usgbc/input_billing_addressaddress_l'), billingAddress1)

		WebUI.setText(findTestObject('payment/Page_Payment Form  dynamic-usgbc/input_billing_addressaddress_ll'), billingAddress2)

		WebUI.setText(findTestObject('payment/Page_Payment Form  dynamic-usgbc/input_billing_addresslocality'), billingCity)

		WebUI.selectOptionByValue(findTestObject('payment/Page_Payment Form  dynamic-usgbc/select_- Select -AlabamaAlaska'), billingState,true)

		WebUI.setText(findTestObject('payment/Page_Payment Form  dynamic-usgbc/input_billing_addresspostal_co'), billingZip)
	}
}
