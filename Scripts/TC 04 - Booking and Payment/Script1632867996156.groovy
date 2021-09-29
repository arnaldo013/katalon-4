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

WebUI.verifyElementVisible(findTestObject('Page_Flights - PHPTRAVEL/button_Book Now'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Flights - PHPTRAVEL/button_Book Now'))

if (Passenger == 1) {
    WebUI.scrollToElement(findTestObject('Page_Flight Booking - PHPTRAVEL/select_Title1'), 0)

    WebUI.selectOptionByValue(findTestObject('Page_Flight Booking - PHPTRAVEL/select_Title1'), Title1, false)

    WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVEL/input_First Name_firstname_1'), First1)

    WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVEL/input_Last Name_lastname_1'), Last1)

    WebUI.selectOptionByValue(findTestObject('Page_Flight Booking - PHPTRAVEL/select_nationality1'), Nationality1, false)

    WebUI.selectOptionByValue(findTestObject('Page_Flight Booking - PHPTRAVEL/select_Month1'), DOBMonth1, false)

    WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVEL/input_Date of Birth_dob_day_1'), DOBDay1)

    WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVEL/input_Date of Birth_dob_year_1'), DOBYear1)

    WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVEL/input_Passport or ID number_passport_1'), Passport1)

    WebUI.selectOptionByValue(findTestObject('Page_Flight Booking - PHPTRAVEL/select_Month_expiry1'), ExpiryMonth1, false)

    WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVEL/input_Expiry Date_passport_day_1'), ExpiryDay1)

    WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVEL/input_Expiry Date_passport_year_1'), ExpiryYear1)
} else if (Passenger == 2) {
    WebUI.scrollToElement(findTestObject('Page_Flight Booking - PHPTRAVEL/select_Title1'), 0)

    WebUI.selectOptionByValue(findTestObject('Page_Flight Booking - PHPTRAVEL/select_Title1'), Title1, false)

    WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVEL/input_First Name_firstname_1'), First1)

    WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVEL/input_Last Name_lastname_1'), Last1)

    WebUI.selectOptionByValue(findTestObject('Page_Flight Booking - PHPTRAVEL/select_nationality1'), Nationality1, false)

    WebUI.selectOptionByValue(findTestObject('Page_Flight Booking - PHPTRAVEL/select_Month1'), DOBMonth1, false)

    WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVEL/input_Date of Birth_dob_day_1'), DOBDay1)

    WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVEL/input_Date of Birth_dob_year_1'), DOBYear1)

    WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVEL/input_Passport or ID number_passport_1'), Passport1)

    WebUI.selectOptionByValue(findTestObject('Page_Flight Booking - PHPTRAVEL/select_Month_expiry1'), ExpiryMonth1, false)

    WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVEL/input_Expiry Date_passport_day_1'), ExpiryDay1)

    WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVEL/input_Expiry Date_passport_year_1'), ExpiryYear1)

    WebUI.scrollToElement(findTestObject('Page_Flight Booking - PHPTRAVEL/select_MR2'), 0)

    WebUI.selectOptionByValue(findTestObject('Page_Flight Booking - PHPTRAVEL/select_MR2'), Title2, false)

    WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVEL/input_First Name_firstname_2'), First2)

    WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVEL/input_Last Name_lastname_2'), Last2)

    WebUI.selectOptionByValue(findTestObject('Page_Flight Booking - PHPTRAVEL/select_nationality2'), Nationality2, false)

    WebUI.selectOptionByValue(findTestObject('Page_Flight Booking - PHPTRAVEL/select_Month2'), DOBMonth2, false)

    WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVEL/input_Date of Birth_dob_day_2'), DOBDay2)

    WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVEL/input_Date of Birth_dob_year_2'), DOBYear2)

    WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVEL/input_Passport or ID number_passport_2'), Passport2)

    WebUI.selectOptionByValue(findTestObject('Page_Flight Booking - PHPTRAVEL/select_Month_expiry2'), ExpiryMonth2, false)

    WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVEL/input_Expiry Date_passport_day_2'), ExpiryDay2)

    WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVEL/input_Expiry Date_passport_year_2'), ExpiryYear2)
} else if (Passenger == 3) {
    WebUI.scrollToElement(findTestObject('Page_Flight Booking - PHPTRAVEL/select_Title1'), 0)

    WebUI.selectOptionByValue(findTestObject('Page_Flight Booking - PHPTRAVEL/select_Title1'), Title1, false)

    WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVEL/input_First Name_firstname_1'), First1)

    WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVEL/input_Last Name_lastname_1'), Last1)

    WebUI.selectOptionByValue(findTestObject('Page_Flight Booking - PHPTRAVEL/select_nationality1'), Nationality1, false)

    WebUI.selectOptionByValue(findTestObject('Page_Flight Booking - PHPTRAVEL/select_Month1'), DOBMonth1, false)

    WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVEL/input_Date of Birth_dob_day_1'), DOBDay1)

    WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVEL/input_Date of Birth_dob_year_1'), DOBYear1)

    WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVEL/input_Passport or ID number_passport_1'), Passport1)

    WebUI.selectOptionByValue(findTestObject('Page_Flight Booking - PHPTRAVEL/select_Month_expiry1'), ExpiryMonth1, false)

    WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVEL/input_Expiry Date_passport_day_1'), ExpiryDay1)

    WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVEL/input_Expiry Date_passport_year_1'), ExpiryYear1)

    WebUI.scrollToElement(findTestObject('Page_Flight Booking - PHPTRAVEL/select_MR2'), 0)

    WebUI.selectOptionByValue(findTestObject('Page_Flight Booking - PHPTRAVEL/select_MR2'), Title2, false)

    WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVEL/input_First Name_firstname_2'), First2)

    WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVEL/input_Last Name_lastname_2'), Last2)

    WebUI.selectOptionByValue(findTestObject('Page_Flight Booking - PHPTRAVEL/select_nationality2'), Nationality2, false)

    WebUI.selectOptionByValue(findTestObject('Page_Flight Booking - PHPTRAVEL/select_Month2'), DOBMonth2, false)

    WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVEL/input_Date of Birth_dob_day_2'), DOBDay2)

    WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVEL/input_Date of Birth_dob_year_2'), DOBYear2)

    WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVEL/input_Passport or ID number_passport_2'), Passport2)

    WebUI.selectOptionByValue(findTestObject('Page_Flight Booking - PHPTRAVEL/select_Month_expiry2'), ExpiryMonth2, false)

    WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVEL/input_Expiry Date_passport_day_2'), ExpiryDay2)

    WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVEL/input_Expiry Date_passport_year_2'), ExpiryYear2)

    WebUI.selectOptionByValue(findTestObject('Page_Flight Booking - PHPTRAVEL/select_MR3'), Title2, false)

    WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVEL/input_First Name_firstname_3'), First3)

    WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVEL/input_Last Name_lastname_3'), Last3)

    WebUI.selectOptionByValue(findTestObject('Page_Flight Booking - PHPTRAVEL/select_nationality3'), Nationality3, false)

    WebUI.selectOptionByValue(findTestObject('Page_Flight Booking - PHPTRAVEL/select_Month3'), DOBMonth3, false)

    WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVEL/input_Date of Birth_dob_day_3'), DOBDay3)

    WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVEL/input_Date of Birth_dob_year_3'), DOBYear3)

    WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVEL/input_Passport or ID number_passport_3'), Passport3)

    WebUI.selectOptionByValue(findTestObject('Page_Flight Booking - PHPTRAVEL/select_Month_expiry3'), ExpiryMonth3, false)

    WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVEL/input_Expiry Date_passport_day_3'), ExpiryDay3)

    WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVEL/input_Expiry Date_passport_year_3'), ExpiryYear3)
}

WebUI.scrollToElement(findTestObject('Page_Flight Booking - PHPTRAVEL/input_bank transfer_payment_gateway'), 0)

if (Payment == 'Bank Transfer') {
    WebUI.click(findTestObject('Page_Flight Booking - PHPTRAVEL/input_bank transfer_payment_gateway'))
} else if (Payment == 'PayPal') {
    WebUI.click(findTestObject('Page_Flight Booking - PHPTRAVEL/input_paypal_payment_gateway'))
} else if (Payment == 'Pay Later') {
    WebUI.click(findTestObject('Page_Flight Booking - PHPTRAVEL/input_Payment Method_payment_gateway'))
} else if (Payment == 'Strip') {
    WebUI.click(findTestObject('Page_Flight Booking - PHPTRAVEL/input_stripe_payment_gateway'))
} else if (Payment == 'Paddle') {
    WebUI.click(findTestObject('Page_Flight Booking - PHPTRAVEL/input_wallet balance_payment_gateway'))
}

WebUI.scrollToElement(findTestObject('Page_Flight Booking - PHPTRAVEL/label_By continuing, you agree to the   Terms and Conditions'), 
    0)

WebUI.click(findTestObject('Page_Flight Booking - PHPTRAVEL/label_By continuing, you agree to the   Terms and Conditions'))

WebUI.click(findTestObject('Page_Flight Booking - PHPTRAVEL/button_Confirm Booking'))

WebUI.delay(3)

