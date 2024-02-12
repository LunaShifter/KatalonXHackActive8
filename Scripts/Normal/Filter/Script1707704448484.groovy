import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
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
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://advantageonlineshopping.com/')

//WebUI.click(findTestObject('Object Repository/Filter/Page_Advantage Shopping/svgmenuUser'))
//
//WebUI.setText(findTestObject('Object Repository/Filter/Page_Advantage Shopping/input_username'), 'asepmahmudin')

//WebUI.setEncryptedText(findTestObject('Object Repository/Filter/Page_Advantage Shopping/input_password'), 'NEZKLnAlcz5D7xppCzl9wA==')

//WebUI.sendKeys(findTestObject('Object Repository/Filter/Page_Advantage Shopping/input_password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Filter/Page_Advantage Shopping/div_LAPTOPS                        Shop Now'))
'Filter Product'
//def a=spesifikasi;
println('ini spesifikasi'+ spesifikasi)
switch (spesifikasi) {
	case 'Windows 10' :
		WebUI.click(findTestObject('Object Repository/Filter/Page_Advantage Shopping/h4_OPERATING SYSTEM'))
		WebUI.click(findTestObject('Object Repository/Filter/Page_Advantage Shopping/input_operating_system_1'))
		WebUI.scrollToPosition(50, 350)
		WebUI.takeScreenshot()
		WebUI.delay(5)
	break
	
	case 'Chrome OS':
		WebUI.click(findTestObject('Object Repository/Filter/Page_Advantage Shopping/h4_OPERATING SYSTEM'))
		WebUI.click(findTestObject('Object Repository/Filter/Page_Advantage Shopping/input_operating_system_0'))
		WebUI.scrollToPosition(50, 350)
		WebUI.takeScreenshot()
		WebUI.delay(5)
	break
	
	case 'Windows 8':
		WebUI.click(findTestObject('Object Repository/Filter/Page_Advantage Shopping/h4_OPERATING SYSTEM'))
		WebUI.click(findTestObject('Object Repository/Filter/Page_Advantage Shopping/input_operating_system_2'))
		WebUI.scrollToPosition(50, 350)
		WebUI.takeScreenshot()
		WebUI.delay(5)
	break
	
	case 'Windows 7':
		WebUI.click(findTestObject('Object Repository/Filter/Page_Advantage Shopping/h4_OPERATING SYSTEM'))
		WebUI.click(findTestObject('Object Repository/Filter/Page_Advantage Shopping/input_operating_system_3'))
		WebUI.scrollToPosition(50, 350)
		WebUI.takeScreenshot()
		WebUI.delay(5)
	break
	
	default:
	println('Invalid Filter Type')
	
}


