import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable

import org.jsoup.select.Evaluator.IsEmpty
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://advantageonlineshopping.com/')

WebUI.click(findTestObject('Object Repository/FindProduct/Page_Advantage Shopping/svgmenuSearch'))

String A = WebUI.getAttribute(findTestObject('Object Repository/FindProduct/Page_Advantage Shopping/input_mobile_search'),"value")
println('datanya :'+ A)

if (A == '') 
	{
		WebUI.setText(findTestObject('Object Repository/FindProduct/Page_Advantage Shopping/input_mobile_search'), 'tablet')
	}
else {
	WebUI.setText(findTestObject('Object Repository/FindProduct/Page_Advantage Shopping/input_mobile_search'), 'speaker')
}

WebUI.click(findTestObject('Object Repository/FindProduct/Page_Advantage Shopping/svgmenuSearch'))
WebUI.takeScreenshot()
WebUI.delay(5)
WebUI.closeBrowser()
