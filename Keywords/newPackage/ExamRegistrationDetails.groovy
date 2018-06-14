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

public class ExamRegistrationDetails extends BaseClass{

	@Keyword
	def  examInfo(String sheetName,int rowNum){
		
		String examType = obj.getCellData(sheetName, "ExamType", rowNum)
		String language = obj.getCellData(sheetName,"Language", rowNum)

		WebUI.selectOptionByLabel(findTestObject('Object Repository/Register Exams/Page_Exam types and information For/select_LEED AP BDC ExamLEED AP'), examType, false)

		WebUI.selectOptionByLabel(findTestObject('Object Repository/Register Exams/Page_Exam types and information For/select_- Select Language -Engl'), language, false)

		WebUI.click(findTestObject('Object Repository/Register Exams/Page_Exam types and information For/input_accomodation'))

		WebUI.click(findTestObject('Object Repository/Register Exams/Page_Exam types and information For/input_veteran'))

		WebUI.click(findTestObject('Object Repository/Register Exams/Page_Exam types and information For/input_op'))
	}

	@Keyword
	def  candidateDetails(String sheetName,int rowNum){

		String address1 = obj.getCellData(sheetName,"Street1",rowNum)
		String address2 = obj.getCellData(sheetName,"Street2",rowNum)
		String city = obj.getCellData(sheetName,"City",rowNum)
		String state = obj.getCellData(sheetName,"StateCode",rowNum)
		String zip = obj.getCellData(sheetName,"Zip",rowNum)
		
		String dob = obj.getCellData(sheetName,"DOB", rowNum)
		String jobTitle = obj.getCellData(sheetName,"JobTitle", rowNum)
		String organization = obj.getCellData(sheetName,"Organization", rowNum)
		
		//WebUI.setText(findTestObject('Object Repository/Register Exams/Page_Exam candidate registration Fo/input_attention_to'), null)

		//WebUI.setText(findTestObject('Object Repository/Register Exams/Page_Exam candidate registration Fo/input_company'), null)

		WebUI.setText(findTestObject('Object Repository/Register Exams/Page_Exam candidate registration Fo/input_addressaddress_line1'), address1)

		WebUI.setText(findTestObject('Object Repository/Register Exams/Page_Exam candidate registration Fo/input_addressaddress_line2'), address2)

		WebUI.setText(findTestObject('Object Repository/Register Exams/Page_Exam candidate registration Fo/input_addresslocality'),city)

		WebUI.selectOptionByValue(findTestObject('Object Repository/Register Exams/Page_Exam candidate registration Fo/select_- Select -AlabamaAlaska'), state, false)

		WebUI.setText(findTestObject('Object Repository/Register Exams/Page_Exam candidate registration Fo/input_addresspostal_code'), zip)

		WebUI.sendKeys(findTestObject('Object Repository/Register Exams/Page_Exam candidate registration Fo/input_bday'), dob)
		//WebUI.setText(findTestObject('Object Repository/Register Exams/Page_Exam candidate registration Fo/input_bday'), dob)

		WebUI.click(findTestObject('Object Repository/Register Exams/Page_Exam candidate registration Fo/input_gender (1)'))

		WebUI.setText(findTestObject('Object Repository/Register Exams/Page_Exam candidate registration Fo/input_jobtitle'), jobTitle)

		WebUI.setText(findTestObject('Object Repository/Register Exams/Page_Exam candidate registration Fo/input_organization'), organization)

		WebUI.click(findTestObject('Object Repository/Register Exams/Page_Exam candidate registration Fo/input_pdl'))

		WebUI.click(findTestObject('Object Repository/Register Exams/Page_Exam candidate registration Fo/input_terms'))

		WebUI.click(findTestObject('Object Repository/Register Exams/Page_Exam candidate registration Fo/input_op (1)'))
	}
}
