import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.testng.annotations.AfterMethod

import com.beust.jcommander.Parameter
import com.beust.jcommander.Parameters
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import main.XlsReader

import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.annotation.BeforeTestSuite
import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.AfterTestSuite
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.context.TestSuiteContext

import main.BaseClass

class Listener {
	/**
	 * Executes before every test case starts.
	 * @param testCaseContext related information of the executed test case.
	 */
	@BeforeTestCase
	def BeforeTestCase(TestCaseContext testCaseContext) {
		
		println("This is before TestCase")
		// String path = RunConfiguration.getProjectDir()+"\\DynamicUsgbc.xlsx"
		
		WebUI.openBrowser('')
		WebUI.navigateToUrl(GlobalVariable.BaseUrl)
		WebUI.maximizeWindow()
		
		
	}


	/**
	 * Executes after every test case ends.
	 * @param testCaseContext related information of the executed test case.
	 */
	@AfterTestCase
	def AfterTestCase(TestCaseContext testCaseContext) {
		println("This is after TestCase")
		WebUI.closeBrowser()
	}
}