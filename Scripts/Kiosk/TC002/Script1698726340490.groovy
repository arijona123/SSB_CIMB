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

WebUI.navigateToUrl('https://mf8.myinfosys.net:8443/cimb_tablet')

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

WebUI.click(findTestObject('Konvensional/Tabungan berjangka/div_rekening sumber dana'))

WebUI.click(findTestObject('Konvensional/Tabungan berjangka/li_703195368600 - XTRA SAVERS IDR - RP 10.000.000.000'))

WebUI.click(findTestObject('Konvensional/Tabungan berjangka/div_frekuensi menabung'))

WebUI.click(findTestObject('Konvensional/Tabungan berjangka/li_BULANAN'))

WebUI.click(findTestObject('Konvensional/Tabungan berjangka/div_jangka waktu'))

WebUI.click(findTestObject('Konvensional/Tabungan berjangka/li_12 BULAN'))

WebUI.click(findTestObject('Konvensional/Tabungan berjangka/span__tanggal pendebatan pertama'))

WebUI.click(findTestObject('Konvensional/Tabungan berjangka/button_30 november 2023'))

WebUI.click(findTestObject('Konvensional/Tabungan berjangka/button_OK tanggal'))

WebUI.click(findTestObject('Konvensional/buton lanjut/button_Lanjut'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Konvensional/Tabungan berjangka/div_ sumber dana'))

WebUI.click(findTestObject('Konvensional/Tabungan berjangka/li_GAJI'))

WebUI.click(findTestObject('Konvensional/Tabungan berjangka/div_tujuan membuka rekening'))

WebUI.click(findTestObject('Konvensional/Tabungan berjangka/li_INVESTASI'))

WebUI.click(findTestObject('Konvensional/Tabungan berjangka/div_tujuan penggunaan dana'))

WebUI.click(findTestObject('Konvensional/Tabungan berjangka/li_BAYAR TAGIHAN'))

WebUI.click(findTestObject('Konvensional/Tabungan berjangka/div_rata rata transaksi per bulan'))

WebUI.click(findTestObject('Konvensional/Tabungan berjangka/li_0 - 24 JUTA'))

WebUI.click(findTestObject('Konvensional/Tabungan berjangka/button_Lanjut tanda tangan'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Konvensional/Tabungan berjangka/canvas tanda tangan'))

WebUI.click(findTestObject('Konvensional/Tabungan berjangka/button_Lanjut tanda tangan'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Konvensional/Tabungan berjangka/button_Lanjut konfirmasi'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Konvensional/Tabungan berjangka/button_Ya menyatakan'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.verifyElementPresent(findTestObject('Konvensional/Tabungan berjangka/p_SELAMAT Anda berhasil membuka Tabungan GOAL Savers.Berikut adalah Nomor Rekening Anda'), 
    100)

WebUI.closeBrowser()

