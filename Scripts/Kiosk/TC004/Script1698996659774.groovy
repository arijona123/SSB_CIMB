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

WebUI.openBrowser(url)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Konvensional/img_Digital Lounge  Branch_img-fluid'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Konvensional/input__dlCode'), 'DAE')

WebUI.click(findTestObject('Konvensional/button selanjutnya DAE/button_Selanjutnya'))

WebUI.delay(5)

WebUI.click(findTestObject('cob/scroll/Page_CIMB Niaga/video_cimb'))

WebUI.click(findTestObject('Konvensional/button_BUKA REKENING BARU'))

WebUI.delay(5)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Konvensional/button_Konvensional'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Konvensional/Tabungan berjangka/button_TABUNGAN BERJANGKA'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Konvensional/Tabungan berjangka/button_Saving Plan'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Konvensional/Tabungan berjangka/dropdown_saya telah membaca'))

WebUI.delay(2)

WebUI.click(findTestObject('Konvensional/Tabungan berjangka/span_Saya telah membaca, memahami, dan menyetujui Syarat dan Ketentuan yang berlaku dan fitur-fitur produk'))

WebUI.click(findTestObject('Konvensional/Tabungan berjangka/button_Lanjut_saya telah membaca'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Konvensional/Tabungan berjangka/button_Oke_keyboard'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.selectOptionByIndex(findTestObject('Konvensional/Tabungan berjangka/div_rekening sumber dana'), '703195358100 - XTRA SAVERS IDR - RP 100.000.000.000', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.acceptAlert()

WebUI.click(findTestObject('Konvensional/Tabungan berjangka/div_frekuensi menabung'))

WebUI.click(findTestObject('Konvensional/Tabungan berjangka/li_BULANAN'))

WebUI.closeBrowser()

