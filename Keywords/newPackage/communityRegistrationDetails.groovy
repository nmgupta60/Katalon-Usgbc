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

public class communityRegistrationDetails {
	
	@Keyword
	def public static void communityDetails(String communityName,String attentionTo,String company,String address1,String address2,String city,String state,String zip){
		
		WebUI.selectOptionByLabel(findTestObject('Object Repository/Community Registration/Page_Community Form  dynamic-usgbc/select_USGBC Northern Californ'),communityName , true)
		
		WebUI.setText(findTestObject('Object Repository/Community Registration/Page_Community Form  dynamic-usgbc/input_attention_to'), attentionTo)
		
		WebUI.setText(findTestObject('Object Repository/Community Registration/Page_Community Form  dynamic-usgbc/input_company'), company)
		
		WebUI.setText(findTestObject('Object Repository/Community Registration/Page_Community Form  dynamic-usgbc/input_addressaddress_line1'),address1)
		
		WebUI.setText(findTestObject('Object Repository/Community Registration/Page_Community Form  dynamic-usgbc/input_addressaddress_line2'), address2)
		
		WebUI.setText(findTestObject('Object Repository/Community Registration/Page_Community Form  dynamic-usgbc/input_addresslocality'), city)
		
		WebUI.selectOptionByValue(findTestObject('Object Repository/Community Registration/Page_Community Form  dynamic-usgbc/select_- Select -AlabamaAlaska'),state, true)
		
		WebUI.setText(findTestObject('Object Repository/Community Registration/Page_Community Form  dynamic-usgbc/input_addresspostal_code'), zip)
		
		WebUI.click(findTestObject('Object Repository/Community Registration/Page_Community Form  dynamic-usgbc/input_how_did_you_hear1'))
		
		WebUI.click(findTestObject('Object Repository/Community Registration/Page_Community Form  dynamic-usgbc/input_terms'))
		
		WebUI.click(findTestObject('Object Repository/Community Registration/Page_Community Form  dynamic-usgbc/input_op'))
	}
}


