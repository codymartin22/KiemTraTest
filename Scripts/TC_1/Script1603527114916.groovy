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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('online.hcmue.edu.vn')

WebUI.click(findTestObject('Object Repository/Record/Page_UP Portal  HoChiMinh University of Pedagogy/td_ng nhp'))

WebUI.click(findTestObject('Object Repository/Record/Page_UP Portal  HoChiMinh University of Pedagogy/a_ng nhp'))

WebUI.setText(findTestObject('Object Repository/Record/Page_UP Portal  HoChiMinh University of Pedagogy/input_Tn ng nhp_ctl00ContentPlaceHolder1ctl_537cb7'), 
    '43.01.104.194')

WebUI.setEncryptedText(findTestObject('Object Repository/Record/Page_UP Portal  HoChiMinh University of Pedagogy/input_Mt m_ctl00ContentPlaceHolder1ctl00ctl_4544f5'), 
    'H9dtcEBS5K4A9HlRbYRjNw==')

WebUI.click(findTestObject('Object Repository/Record/Page_UP Portal  HoChiMinh University of Pedagogy/input_S lng truy cp _ctl00ContentPlaceHolde_c71575'))

WebUI.waitForElementPresent(findTestObject('Page_UP Portal  HoChiMinh University of Pedagogy/Page_UP Portal  HoChiMinh University of Pedagogy/td_Mt m truy cp khng chnh xc'), 
    5)

WebUI.closeBrowser()

