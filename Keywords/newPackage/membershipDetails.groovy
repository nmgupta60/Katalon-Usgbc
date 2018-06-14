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

public class membershipDetails extends BaseClass {

	@Keyword
	def  personalMailingDetails(String sheetName,int rowNum){
		
		String attentionTo = obj.getCellData(sheetName,"AttentionTo", rowNum)
		String company = obj.getCellData(sheetName,"Company",rowNum)
		String address1 = obj.getCellData(sheetName,"Street1",rowNum)
		String address2 = obj.getCellData(sheetName,"Street2",rowNum)
		String city = obj.getCellData(sheetName,"City",rowNum)
		String state = obj.getCellData(sheetName,"StateCode",rowNum)
		String zip = obj.getCellData(sheetName,"Zip",rowNum)

		WebUI.setText(findTestObject('Object Repository/Membership Registration/Page_Contact Form  dynamic-usgbc/input_attention_to'), attentionTo)

		WebUI.setText(findTestObject('Object Repository/Membership Registration/Page_Contact Form  dynamic-usgbc/input_company'), company)

		WebUI.setText(findTestObject('Object Repository/Membership Registration/Page_Contact Form  dynamic-usgbc/input_addressaddress_line1'), address1)
		WebUI.verifyCheckpoint(findCheckpoint('Checkpoints/Checkpoint'), false)
		WebUI.setText(findTestObject('Object Repository/Membership Registration/Page_Contact Form  dynamic-usgbc/input_addressaddress_line2'), address2)

		WebUI.setText(findTestObject('Object Repository/Membership Registration/Page_Contact Form  dynamic-usgbc/input_addresslocality'), city)

		WebUI.selectOptionByValue(findTestObject('Object Repository/Membership Registration/Page_Contact Form  dynamic-usgbc/select_- Select -AlabamaAlaska'), state, true)

		WebUI.setText(findTestObject('Object Repository/Membership Registration/Page_Contact Form  dynamic-usgbc/input_addresspostal_code'), zip)

		WebUI.click(findTestObject('Object Repository/Membership Registration/Page_Contact Form  dynamic-usgbc/input_terms'))

		WebUI.click(findTestObject('Object Repository/Membership Registration/Page_Contact Form  dynamic-usgbc/input_op'))
	}

	@Keyword
	def  organizationalDetails(String sheetName,int rowNum){
		
		String term = obj.getCellData(sheetName,"Term",rowNum)
		String organizationName = obj.getCellData(sheetName,"OrganizationName",rowNum)
		String website = obj.getCellData(sheetName,"Website",rowNum)
		String email1 = obj.getCellData(sheetName,"Email",rowNum)
		String category = obj.getCellData(sheetName,"IndustryCategory",rowNum)
		String subCategory = obj.getCellData(sheetName,"SubCategory",rowNum)
		String revenue = obj.getCellData(sheetName,"Revenue",rowNum)

		WebUI.selectOptionByValue(findTestObject('Object Repository/Membership Registration/Page_Organization Membership Form/select_1 year2 years3 years'), term, false)

		//WebUI.click(findTestObject('Object Repository/Membership Registration/Page_Organization Membership Form/div_Organizational300year'))

		WebUI.setText(findTestObject('Object Repository/Membership Registration/Page_Organization Membership Form/input_org_name'), organizationName)

		WebUI.setText(findTestObject('Object Repository/Membership Registration/Page_Organization Membership Form/input_website'), website)

		WebUI.setText(findTestObject('Object Repository/Membership Registration/Page_Organization Membership Form/input_email'), email1)

		WebUI.selectOptionByLabel(findTestObject('Object Repository/Membership Registration/Page_Organization Membership Form/select_Select a categoryBuildi'), category, false)

		WebUI.selectOptionByLabel(findTestObject('Object Repository/Membership Registration/Page_Organization Membership Form/select_Select a sub-categoryAr'),subCategory, false)

		WebUI.selectOptionByLabel(findTestObject('Object Repository/Membership Registration/Page_Organization Membership Form/select_Select revenue rangeLes'), revenue, false)

		WebUI.click(findTestObject('Object Repository/Membership Registration/Page_Organization Membership Form/input_op (1)'))


	}
}
