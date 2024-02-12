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
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://advantageonlineshopping.com/#/register')

WebUI.setText(findTestObject('Sign Up/Page_Advantage Shopping/input__usernameRegisterPage'), 'asepmahmudin')

WebUI.setText(findTestObject('Sign Up/Page_Advantage Shopping/input__emailRegisterPage'), 'workforaces@gmail.com')

WebUI.setText(findTestObject('Sign Up/Page_Advantage Shopping/input__passwordRegisterPage'), 'J4luganteng')

WebUI.setText(findTestObject('Sign Up/Page_Advantage Shopping/input__confirm_passwordRegisterPage'), 'J4luganteng')

WebUI.setText(findTestObject('Object Repository/Sign Up/Page_Advantage Shopping/input_first_nameRegisterPage'), 'Asep')

WebUI.setText(findTestObject('Object Repository/Sign Up/Page_Advantage Shopping/input_last_nameRegisterPage'), 'Mahmudin')

WebUI.setText(findTestObject('Object Repository/Sign Up/Page_Advantage Shopping/input_phone_numberRegisterPage'), '081224029880')

WebUI.click(findTestObject('Object Repository/Sign Up/Page_Advantage Shopping/div_CountryAfganistanAlbaniaAlgeriaAmerican_f7530e'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Sign Up/Page_Advantage Shopping/select_AfganistanAlbaniaAlgeriaAmerican Sam_3cef8a'), 
    'object:250', true)

WebUI.setText(findTestObject('Object Repository/Sign Up/Page_Advantage Shopping/input_cityRegisterPage'), 'Jakarta')

WebUI.setText(findTestObject('Object Repository/Sign Up/Page_Advantage Shopping/input_addressRegisterPage'), 'Sukabumi')

WebUI.click(findTestObject('Object Repository/Sign Up/Page_Advantage Shopping/label_State  Province  Region'))

WebUI.setText(findTestObject('Object Repository/Sign Up/Page_Advantage Shopping/input_state__province__regionRegisterPage'), 
    'Indonesia')

WebUI.setText(findTestObject('Object Repository/Sign Up/Page_Advantage Shopping/input_postal_codeRegisterPage'), '43351')

WebUI.click(findTestObject('Object Repository/Sign Up/Page_Advantage Shopping/input_i_agree'))

WebUI.takeScreenshot()

WebUI.delay(5)

