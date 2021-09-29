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

WebUI.verifyElementVisible(findTestObject('Page_PHPTRAVELS - PHPTRAVELS/div_Cookies'), FailureHandling.CONTINUE_ON_FAILURE)

'If Statement for Handling Element Cookies'
if (true) {
    WebUI.click(findTestObject('Page_PHPTRAVELS - PHPTRAVELS/button_Got It'))
}

if (Perjalanan == 'One Way') {
    WebUI.click(findTestObject('Page_Search Hotels - PHPTRAVEL/input_One Way_trip'), FailureHandling.STOP_ON_FAILURE)

    WebUI.setText(findTestObject('Page_Search Hotels - PHPTRAVEL/input_Flying From_from'), From)

    WebUI.sendKeys(findTestObject('Page_Search Hotels - PHPTRAVEL/input_Flying From_from'), Keys.chord(Keys.ARROW_DOWN))

    WebUI.sendKeys(findTestObject('Page_Search Hotels - PHPTRAVEL/input_Flying From_from'), Keys.chord(Keys.ENTER))

    WebUI.setText(findTestObject('Page_Search Hotels - PHPTRAVEL/input_To Destination_to'), Destination)

    WebUI.sendKeys(findTestObject('Page_Search Hotels - PHPTRAVEL/input_To Destination_to'), Keys.chord(Keys.ARROW_DOWN))

    WebUI.sendKeys(findTestObject('Page_Search Hotels - PHPTRAVEL/input_To Destination_to'), Keys.chord(Keys.ENTER))

    WebUI.clearText(findTestObject('Page_Search Hotels - PHPTRAVEL/input_Departure Date_depart'))

    WebUI.setText(findTestObject('Page_Search Hotels - PHPTRAVEL/input_Departure Date_depart'), Departure)

    WebUI.click(findTestObject('Page_Search Hotels - PHPTRAVEL/input_Departure Date_depart'))

    WebUI.click(findTestObject('Page_Login - PHPTRAVEL/Page_PHPTRAVEL - PHPTRAVEL/select_Economy                Business                First'))

    WebUI.selectOptionByValue(findTestObject('Page_Login - PHPTRAVEL/Page_PHPTRAVEL - PHPTRAVEL/select_Economy                Business                First'), 
        Kelas, false)

    WebUI.click(findTestObject('Page_PHPTRAVEL - PHPTRAVEL/span_1'))

    WebUI.setText(findTestObject('Page_Search Hotels - PHPTRAVEL/input_Adults_adults'), Adults)

    WebUI.setText(findTestObject('Page_Search Hotels - PHPTRAVEL/input_Childs_childs'), Childs)

    WebUI.setText(findTestObject('Page_Search Hotels - PHPTRAVEL/input_Infants_childs'), Infants)
} else if (Perjalanan == 'Round Trip') {
    WebUI.click(findTestObject('Page_Search Hotels - PHPTRAVEL/input_Round Trip_trip'), FailureHandling.STOP_ON_FAILURE)

    WebUI.setText(findTestObject('Page_Search Hotels - PHPTRAVEL/input_Flying From_from'), From)

    WebUI.sendKeys(findTestObject('Page_Search Hotels - PHPTRAVEL/input_Flying From_from'), Keys.chord(Keys.ARROW_DOWN))

    WebUI.sendKeys(findTestObject('Page_Search Hotels - PHPTRAVEL/input_Flying From_from'), Keys.chord(Keys.ENTER))

    WebUI.setText(findTestObject('Page_Search Hotels - PHPTRAVEL/input_To Destination_to'), Destination)

    WebUI.sendKeys(findTestObject('Page_Search Hotels - PHPTRAVEL/input_To Destination_to'), Keys.chord(Keys.ARROW_DOWN))

    WebUI.sendKeys(findTestObject('Page_Search Hotels - PHPTRAVEL/input_To Destination_to'), Keys.chord(Keys.ENTER))

    WebUI.clearText(findTestObject('Page_Search Hotels - PHPTRAVEL/input_Departure Date_depart'))

    WebUI.setText(findTestObject('Page_Search Hotels - PHPTRAVEL/input_Departure Date_depart'), Departure)

    WebUI.click(findTestObject('Page_Search Hotels - PHPTRAVEL/input_Departure Date_depart'))

    WebUI.clearText(findTestObject('Page_Search Hotels - PHPTRAVEL/input_Return Date_returning'))

    WebUI.setText(findTestObject('Page_Search Hotels - PHPTRAVEL/input_Return Date_returning'), Return)

    WebUI.click(findTestObject('Page_Search Hotels - PHPTRAVEL/input_Return Date_returning'))

    WebUI.click(findTestObject('Page_Login - PHPTRAVEL/Page_PHPTRAVEL - PHPTRAVEL/select_Economy                Business                First'))

    WebUI.selectOptionByValue(findTestObject('Page_Login - PHPTRAVEL/Page_PHPTRAVEL - PHPTRAVEL/select_Economy                Business                First'), 
        Kelas, false)

    WebUI.click(findTestObject('Page_PHPTRAVEL - PHPTRAVEL/span_1'))

    WebUI.setText(findTestObject('Page_Search Hotels - PHPTRAVEL/input_Adults_adults'), Adults)

    WebUI.setText(findTestObject('Page_Search Hotels - PHPTRAVEL/input_Childs_childs'), Childs)

    WebUI.setText(findTestObject('Page_Search Hotels - PHPTRAVEL/input_Infants_childs'), Infants)
}

WebUI.click(findTestObject('Page_Search Hotels - PHPTRAVEL/button_Search'))

