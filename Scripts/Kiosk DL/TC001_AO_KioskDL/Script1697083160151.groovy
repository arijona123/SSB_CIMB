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

WebUI.navigateToUrl('https://mf8.myinfosys.net:8443/cimb')

WebUI.maximizeWindow()

// Menambahkan perintah JavaScript untuk zoom out
String zoomOutScript = 'document.body.style.transform = \'scale(0.8\';'

WebUI.executeJavaScript(zoomOutScript, null)

WebUI.setText(findTestObject('cob/open kiosk/Page_CIMB Niaga/input_Loading_kioskName'), 'DAE')

WebUI.click(findTestObject('cob/open kiosk/Page_CIMB Niaga/button_Loading_button btn-grey btn-red btn-light-red button--round-l no-margin button-login'))

WebUI.click(findTestObject('cob/open kiosk/Page_CIMB Niaga/video_Silakan tunggu sebentar, sedang menghubungkan dengan server_videoParent'))

// Setelah selesai dengan elemen yang tertutup, mengembalikan zoom ke ukuran semula
String zoomInScript = 'document.body.style.transform = \'scale(1.0\';'

WebUI.executeJavaScript(zoomInScript, null)

WebUI.click(findTestObject('cob/open kiosk/goal saver/Page_CIMB Niaga/span_BUKA REKENING BARU'))

WebUI.takeFullPageScreenshot('Screenshot_Step_10')

WebUI.click(findTestObject('cob/open kiosk/goal saver/Page_CIMB Niaga/span_KONVENSIONAL'))

WebUI.takeFullPageScreenshot('Screenshot_Step_10')

WebUI.click(findTestObject('cob/open kiosk/goal saver/Page_CIMB Niaga/span_TABUNGAN TRANSAKSI'))

WebUI.takeScreenshot('Screenshot_Step_10')

WebUI.click(findTestObject('cob/open kiosk/goal saver/Page_CIMB Niaga/button_XTRA Savers'))

WebUI.takeScreenshot('Screenshot_Step_10')

WebUI.delay(15)

WebUI.click(findTestObject('cob/open kiosk/goal saver/Page_CIMB Niaga/a_Help_mCSB_buttonDown'))

WebUI.delay(8)

WebUI.click(findTestObject('cob/open kiosk/goal saver/Page_CIMB Niaga/span_Saya telah membaca, memahami, dan menyetujui Ringkasan Informasi Produk dan Layanan (RIPLAY)'))

WebUI.click(findTestObject('cob/open kiosk/goal saver/Page_CIMB Niaga/button_Lanjut'))

WebUI.delay(5)

WebUI.click(findTestObject('cob/open kiosk/syarat/Page_CIMB Niaga/a_Syarat dan Ketentuan_mCSB_buttonDown'))

WebUI.delay(5)

WebUI.click(findTestObject('cob/open kiosk/syarat/Page_CIMB Niaga/span_Saya menyatakan telah membaca, memahami, dan menyetujui syarat dan ketentuan yang berlaku, fitur-fitur produk, dan pemberitahuan privasi Bank yang berlaku'))

WebUI.delay(5)

WebUI.click(findTestObject('cob/open kiosk/syarat/Page_CIMB Niaga/span_Saya adalah wajib pajak Indonesia dan bukan wajib pajak negara lain'))

WebUI.click(findTestObject('cob/open kiosk/syarat/Page_CIMB Niaga/button_Lanjut'))

