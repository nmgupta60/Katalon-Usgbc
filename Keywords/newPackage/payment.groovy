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

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

public class payment {


	@Keyword
	def public java.lang.Object getPayment(int cardNumber, String cardholderName,int expMonth, int expyear, int cvv ) {


		WebUI.setText(findTestObject('payment/Page_Payment Form  dynamic-usgbc/input_name_on_card'), cardholderName)

		WebUI.setText(findTestObject('payment/Page_Payment Form  dynamic-usgbc/input_card_number'), cardNumber)

		WebUI.selectOptionByValue(findTestObject('payment/Page_Payment Form  dynamic-usgbc/select_Select01020304050607080'), expMonth,true)

		WebUI.selectOptionByValue(findTestObject('payment/sample/Page_Payment Form  dynamic-usgbc/select_select20182019202020212'), expyear,true)

		WebUI.setText(findTestObject('payment/sample/Page_Payment Form  dynamic-usgbc/input_security_code'), cvv)

		return payment;
	}


	@Keyword
	def public java.lang.Object getBillingDetails(String address1,String address2, String city, String state, String zip) {


		WebUI.setText(findTestObject('payment/Page_Payment Form  dynamic-usgbc/input_billing_addressaddress_l'), address1)

		WebUI.setText(findTestObject('payment/Page_Payment Form  dynamic-usgbc/input_billing_addressaddress_l_1'), address2)

		WebUI.setText(findTestObject('payment/Page_Payment Form  dynamic-usgbc/input_billing_addresslocality'), city)

		WebUI.selectOptionByValue(findTestObject('payment/Page_Payment Form  dynamic-usgbc/select_- Select -AlabamaAlaska'), state,true)

		WebUI.setText(findTestObject('payment/Page_Payment Form  dynamic-usgbc/input_billing_addresspostal_co'), zip)

		return billingDetails;
	}
}
