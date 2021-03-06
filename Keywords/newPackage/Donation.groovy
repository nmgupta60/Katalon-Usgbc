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

public class Donation extends BaseClass {

	@Keyword
	def  donationGreenApple(String sheetName,int rowNum){
		String amount = obj.getCellData(sheetName,"Amount", rowNum)
		String donarName = obj.getCellData(sheetName,"donarName", rowNum)
		String dedicatedTo = obj.getCellData(sheetName,"DedicatedTo", rowNum)
		String email = obj.getCellData(sheetName,"Email", rowNum)

		WebUI.selectOptionByValue(findTestObject('Object Repository/Donation GreenApple/Page_Pay by online Donation Form  d/select_2550100other'),amount , false)

		WebUI.setText(findTestObject('Object Repository/Donation GreenApple/Page_Pay by online Donation Form  d/input_donor_name'), donarName)

		WebUI.setText(findTestObject('Object Repository/Donation GreenApple/Page_Pay by online Donation Form  d/input_dedication_to_name'), dedicatedTo)

		WebUI.setText(findTestObject('Object Repository/Donation GreenApple/Page_Pay by online Donation Form  d/input_dedication_to_email'),email)

		WebUI.click(findTestObject('Object Repository/Donation GreenApple/Page_Pay by online Donation Form  d/input_op'))
	}

	@Keyword
	def  donationHaiti(String sheetName,int rowNum){
		String amount = obj.getCellData(sheetName,"Amount", rowNum)
		String donarName = obj.getCellData(sheetName,"donarName", rowNum)
		String dedicatedTo = obj.getCellData(sheetName,"DedicatedTo", rowNum)
		String email = obj.getCellData(sheetName,"Email", rowNum)

		WebUI.selectOptionByValue(findTestObject('Object Repository/Donation Haiti/Page_Pay by online Donation Form  d/select_2550100other'), amount, false)

		WebUI.setText(findTestObject('Object Repository/Donation Haiti/Page_Pay by online Donation Form  d/input_donor_name'), donarName)

		WebUI.setText(findTestObject('Object Repository/Donation Haiti/Page_Pay by online Donation Form  d/input_dedication_to_name'), dedicatedTo)

		WebUI.setText(findTestObject('Object Repository/Donation Haiti/Page_Pay by online Donation Form  d/input_dedication_to_email'),email)

		WebUI.click(findTestObject('Object Repository/Donation Haiti/Page_Pay by online Donation Form  d/input_op'))
	}

	@Keyword
	def  DonationUsgbc(String sheetName,int rowNum){
		String amount = obj.getCellData(sheetName,"Amount", rowNum)
		String donarName = obj.getCellData(sheetName,"donarName", rowNum)
		String dedicatedTo = obj.getCellData(sheetName,"DedicatedTo", rowNum)
		String email = obj.getCellData(sheetName,"Email", rowNum)

		WebUI.selectOptionByValue(findTestObject('Object Repository/Donation Usgbc/Page_Pay by online Donation Form  d/select_2550100other'), amount, false)

		WebUI.setText(findTestObject('Object Repository/Donation Usgbc/Page_Pay by online Donation Form  d/input_donor_name'),donarName)

		WebUI.setText(findTestObject('Object Repository/Donation Usgbc/Page_Pay by online Donation Form  d/input_dedication_to_name'), dedicatedTo)

		WebUI.setText(findTestObject('Object Repository/Donation Usgbc/Page_Pay by online Donation Form  d/input_dedication_to_email'),email)

		WebUI.click(findTestObject('Object Repository/Donation Usgbc/Page_Pay by online Donation Form  d/input_op'))
	}
}
