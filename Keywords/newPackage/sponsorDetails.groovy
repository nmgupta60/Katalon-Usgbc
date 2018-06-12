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

public class sponsorDetails {
	
	@Keyword
	def public static void sponsrDetails(String communityName,String amount,String startDate,String endDate,String address1,String address2,String city,String state,String zip){
		
		WebUI.selectOptionByLabel(findTestObject('Object Repository/Sponsorship/Page_sponsorship Form  dynamic-usgb/select_USGBC Northern Californ'), communityName, false)
		
		WebUI.click(findTestObject('Object Repository/Sponsorship/Page_sponsorship Form  dynamic-usgb/input_types'))
		
		WebUI.setText(findTestObject('Object Repository/Sponsorship/Page_sponsorship Form  dynamic-usgb/input_amount'), amount)
		
		WebUI.sendKeys(findTestObject('Object Repository/Sponsorship/Page_sponsorship Form  dynamic-usgb/input_start_date'), startDate)
		
		WebUI.sendKeys(findTestObject('Object Repository/Sponsorship/Page_sponsorship Form  dynamic-usgb/input_end_date'), endDate)
		
		WebUI.setText(findTestObject('Object Repository/Sponsorship/Page_sponsorship Form  dynamic-usgb/input_addressaddress_line1'), address1)
		
		WebUI.setText(findTestObject('Object Repository/Sponsorship/Page_sponsorship Form  dynamic-usgb/input_addressaddress_line2'), address2)
		
		WebUI.setText(findTestObject('Object Repository/Sponsorship/Page_sponsorship Form  dynamic-usgb/input_addresslocality'), city)
		
		WebUI.selectOptionByValue(findTestObject('Object Repository/Sponsorship/Page_sponsorship Form  dynamic-usgb/select_- Select -AlabamaAlaska'), state, true)
		
		//WebUI.verifyElementText(findTestObject('Object Repository/Sponsorship/Page_sponsorship Form  dynamic-usgb/input_addresslocality'), 'erie')
		
		WebUI.setText(findTestObject('Object Repository/Sponsorship/Page_sponsorship Form  dynamic-usgb/input_addresspostal_code'), zip)
		
		WebUI.click(findTestObject('Object Repository/Sponsorship/Page_sponsorship Form  dynamic-usgb/input_op'))
	}
}
