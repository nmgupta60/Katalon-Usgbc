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

public class membershipDetails {

	@Keyword
	def public static void personalMailingDetails(String attentionTo,String company,String address1,String address2,String city,String state,String zip){

		WebUI.setText(findTestObject('Object Repository/Membership Registration/Page_Contact Form  dynamic-usgbc/input_attention_to'), attentionTo)

		WebUI.setText(findTestObject('Object Repository/Membership Registration/Page_Contact Form  dynamic-usgbc/input_company'), company)

		WebUI.setText(findTestObject('Object Repository/Membership Registration/Page_Contact Form  dynamic-usgbc/input_addressaddress_line1'), address1)

		WebUI.setText(findTestObject('Object Repository/Membership Registration/Page_Contact Form  dynamic-usgbc/input_addressaddress_line2'), address2)

		WebUI.setText(findTestObject('Object Repository/Membership Registration/Page_Contact Form  dynamic-usgbc/input_addresslocality'), city)

		WebUI.selectOptionByValue(findTestObject('Object Repository/Membership Registration/Page_Contact Form  dynamic-usgbc/select_- Select -AlabamaAlaska'), state, true)

		WebUI.setText(findTestObject('Object Repository/Membership Registration/Page_Contact Form  dynamic-usgbc/input_addresspostal_code'), zip)

		WebUI.click(findTestObject('Object Repository/Membership Registration/Page_Contact Form  dynamic-usgbc/input_terms'))

		WebUI.click(findTestObject('Object Repository/Membership Registration/Page_Contact Form  dynamic-usgbc/input_op'))
	}

	@Keyword
	def public static void organizationalDetails(String term,String organizationName,String website,String email1,String category,String subCategory,String revenue){

		WebUI.selectOptionByValue(findTestObject('Object Repository/Membership Registration/Page_Organization Membership Form/select_1 year2 years3 years'), term, false)

		//WebUI.click(findTestObject('Object Repository/Membership Registration/Page_Organization Membership Form/div_Organizational300year'))

		WebUI.setText(findTestObject('Object Repository/Membership Registration/Page_Organization Membership Form/input_org_name'), organizationName)

		WebUI.setText(findTestObject('Object Repository/Membership Registration/Page_Organization Membership Form/input_website'), website)

		WebUI.setText(findTestObject('Object Repository/Membership Registration/Page_Organization Membership Form/input_email'), email1)

		WebUI.selectOptionByValue(findTestObject('Object Repository/Membership Registration/Page_Organization Membership Form/select_Select a categoryBuildi'), category, false)

		WebUI.selectOptionByValue(findTestObject('Object Repository/Membership Registration/Page_Organization Membership Form/select_Select a sub-categoryAr'),subCategory, false)

		WebUI.selectOptionByValue(findTestObject('Object Repository/Membership Registration/Page_Organization Membership Form/select_Select revenue rangeLes'), revenue, false)

		WebUI.click(findTestObject('Object Repository/Membership Registration/Page_Organization Membership Form/input_op (1)'))


	}
}
