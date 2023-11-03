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

WebUI.navigateToUrl('https://mf8.myinfosys.net:8443/cimb/language/id/auth.html')

WebUI.maximizeWindow()

// Menambahkan perintah JavaScript untuk zoom out
String zoomOutScript = 'document.body.style.transform = \'scale(0.8\';'

WebUI.executeJavaScript(zoomOutScript, null)

WebUI.setText(findTestObject('Object Repository/cob/Page_CIMB Niaga/input_Loading_kioskName'), 'BEJ')

WebUI.click(findTestObject('Object Repository/cob/Page_CIMB Niaga/button_Loading_button btn-grey btn-red btn-_5d1c8f'))

WebUI.click(findTestObject('Object Repository/cob/Page_CIMB Niaga/video_Silakan tunggu sebentar, sedang mengh_20eba5'))

// Setelah selesai dengan elemen yang tertutup, mengembalikan zoom ke ukuran semula
String zoomInScript = 'document.body.style.transform = \'scale(1.0\';'

WebUI.executeJavaScript(zoomInScript, null)

WebUI.click(findTestObject('Object Repository/cob/Page_CIMB Niaga/span_BUKA REKENING BARU'))

WebUI.click(findTestObject('Object Repository/cob/Page_CIMB Niaga/span_KONVENSIONAL'))

WebUI.click(findTestObject('Object Repository/cob/Page_CIMB Niaga/span_TABUNGAN TRANSAKSI'))

WebUI.click(findTestObject('Object Repository/cob/Page_CIMB Niaga/span_XTRA Savers'))

WebUI.click(findTestObject('cob/scroll/Page_CIMB Niaga/div_Help_mCSB_1_dragger_vertical'))

WebUI.click(findTestObject('cob/scroll/Page_CIMB Niaga/div_Help_mCSB_draggerContainer'))

WebUI.click(findTestObject('cob/open kiosk/goal saver/Page_CIMB Niaga/a_Help_mCSB_buttonDown'))

WebUI.click(findTestObject('Object Repository/cob/Page_CIMB Niaga/span_Saya telah membaca, memahami, dan meny_88a2d9'))

WebUI.click(findTestObject('Object Repository/cob/Page_CIMB Niaga/span_Lanjut'))

WebUI.click(findTestObject('cob/Page_CIMB Niaga/a_Help_mCSB_buttonDown'))

WebUI.click(findTestObject('Object Repository/cob/Page_CIMB Niaga/span_Saya menyatakan telah membaca, memaham_f4397e'))

WebUI.click(findTestObject('Object Repository/cob/Page_CIMB Niaga/span_Saya adalah wajib pajak Indonesia dan _022220'))

WebUI.click(findTestObject('Object Repository/cob/Page_CIMB Niaga/span_Lanjut'))

WebUI.closeBrowser()

