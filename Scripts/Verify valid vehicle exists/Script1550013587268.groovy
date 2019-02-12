import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://covercheck.vwfsinsuranceportal.co.uk/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Home_Page/input_Please enter the vehicle'), 'OV12UYY')

WebUI.click(findTestObject('Home_Page/button_Find vehicle'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Home_Page/span_09 FEB 2022  16  26'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Home_Page/span_18 FEB 2022  23  59'), 0)

WebUI.closeBrowser()

