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

WebUI.click(findTestObject('Konvensional/Lanjutan Konvensional/button_TABUNGAN TRANSAKSI'))

WebUI.delay(5)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Konvensional/Lanjutan Konvensional/button_Octo Saver'))

WebUI.delay(5)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Konvensional/Lanjutan Konvensional/button_Ya'))

WebUI.delay(5)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Konvensional/Lanjutan Konvensional/dropdown_syarat dan ketentuan'))

WebUI.delay(5)

WebUI.click(findTestObject('Konvensional/Lanjutan Konvensional/span_Saya telah membaca, memahami, dan menyetujui Syarat dan Ketentuan yang berlaku dan fitur-fitur produk'))

WebUI.click(findTestObject('Konvensional/Lanjutan Konvensional/span_Saya adalah wajib pajak Indonesia dan bukan wajib pajak negara lain'))

WebUI.delay(5)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Konvensional/Lanjutan Konvensional/button_Lanjut_syarat dan ketentuan'))

WebUI.delay(8)

WebUI.click(findTestObject('Konvensional/lanjutan_isi form konvensional/button_Oke-keyboard'))

WebUI.click(findTestObject('Konvensional/lanjutan_isi form konvensional/dropdown_nama di kartu ATM'))

WebUI.delay(2)

WebUI.click(findTestObject('Konvensional/lanjutan_isi form konvensional/li_OTNIEL HUDY PRAT'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Konvensional/lanjutan_isi form konvensional/button_Lanjut_identitas2'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Konvensional/lanjutan_isi form konvensional/button_Lanjut_identitas2'))

WebUI.click(findTestObject('Konvensional/lanjutan_isi form konvensional/button_Lanjut_pekerjaan dan transaksi'))

WebUI.click(findTestObject('Konvensional/lanjutan_isi form konvensional/dropdown_sumber dana'))

WebUI.click(findTestObject('Konvensional/lanjutan_isi form konvensional/li_GAJI'))

WebUI.click(findTestObject('Konvensional/lanjutan_isi form konvensional/dropdown_tujuan membuka rekening'))

WebUI.click(findTestObject('Konvensional/lanjutan_isi form konvensional/li_INVESTASI'))

WebUI.click(findTestObject('Konvensional/lanjutan_isi form konvensional/dropdown_tujuan penggunaan dana'))

WebUI.click(findTestObject('Konvensional/lanjutan_isi form konvensional/li_BAYAR TAGIHAN'))

WebUI.click(findTestObject('Konvensional/lanjutan_isi form konvensional/dropdown_rata rata transaksi per bulan'))

WebUI.click(findTestObject('Konvensional/lanjutan_isi form konvensional/li_0 - 24 JUTA'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Konvensional/lanjutan_isi form konvensional/button_lanjut transaksi dan pekerjaan 2'))

WebUI.click(findTestObject('Konvensional/lanjutan_isi form konvensional/dropdown_informasi rekening'))

WebUI.click(findTestObject('Konvensional/lanjutan_isi form konvensional/li_703195368600 - XTRA SAVERS IDR - IDR 10.000.000.000'))

WebUI.click(findTestObject('Konvensional/lanjutan_isi form konvensional/button_Ya cetak kartu debit'))

WebUI.setText(findTestObject('Konvensional/lanjutan_isi form konvensional/input__init-deposit'), '00')

WebUI.click(findTestObject('Konvensional/lanjutan_isi form konvensional/button_Lanjut informasi rekening'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.setText(findTestObject('Konvensional/lanjutan_isi form konvensional/input__user-id'), 'u123456')

WebUI.setText(findTestObject('Konvensional/lanjutan_isi form konvensional/input__oc-password'), 'Halakhita123!')

WebUI.setText(findTestObject('Konvensional/lanjutan_isi form konvensional/input__oc-confirm-password'), 'Halakhita123!')

WebUI.setText(findTestObject('Konvensional/lanjutan_isi form konvensional/input__secure-word'), 'aaaaqqqq')

WebUI.setText(findTestObject('Konvensional/lanjutan_isi form konvensional/input__om-pin'), '060801')

WebUI.setText(findTestObject('Konvensional/lanjutan_isi form konvensional/input__om-confirm-pin'), '060801')

WebUI.setText(findTestObject('Konvensional/lanjutan_isi form konvensional/input__staff-id'), 'S123456')

WebUI.delay(4)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Konvensional/lanjutan_isi form konvensional/button_Lanjut pembuatan user id'))

WebUI.click(findTestObject('Konvensional/lanjutan_isi form konvensional/canvas ttd'))

WebUI.click(findTestObject('Konvensional/lanjutan_isi form konvensional/button_Lanjut ttd'))

WebUI.delay(5)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Konvensional/lanjutan_isi form konvensional/button_Lanjut_konfirmasi'))

WebUI.click(findTestObject('Konvensional/lanjutan_isi form konvensional/button_Ya saya menyatakan'))

WebUI.closeBrowser()

