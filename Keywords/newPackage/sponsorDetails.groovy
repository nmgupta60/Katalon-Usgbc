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

public class sponsorDetails extends BaseClass{

	@Keyword
	def  sponsrDetails(String sheetName,int rowNum){
		String communityName = obj.getCellData(sheetName, "newCommunityName", rowNum)
		String amount = obj.getCellData(sheetName,"Amount", rowNum)
		String startDate = obj.getCellData(sheetName,"StartDate", rowNum)
		String endDate = obj.getCellData(sheetName,"EndDate", rowNum)
		
		String address1 = obj.getCellData(sheetName,"Street1",rowNum)
		String address2 = obj.getCellData(sheetName,"Street2",rowNum)
		String city = obj.getCellData(sheetName,"City",rowNum)
		String state = obj.getCellData(sheetName,"StateCode",rowNum)
		String zip = obj.getCellData(sheetName,"Zip",rowNum)

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
