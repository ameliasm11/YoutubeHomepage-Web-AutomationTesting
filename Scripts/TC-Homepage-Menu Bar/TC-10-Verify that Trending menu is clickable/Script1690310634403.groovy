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

CustomKeywords.'myKeywords.OpenBrowserKeyword.openMaxBrowser'()

CustomKeywords.'myKeywords.optionalBurgerMenuIcon.optionalClickBurgerMenuIcon'()

//if(WebUI.verifyElementVisible(findTestObject('Page_YouTube/menuBarMinimized'), FailureHandling.OPTIONAL)){
//	WebUI.click(findTestObject('Page_YouTube/MenuBarBurgerIcon'), FailureHandling.OPTIONAL)
//}
WebUI.click(findTestObject('Page_YouTube/TrendingMenu'))

WebUI.waitForElementVisible(findTestObject('Page_Trending/Verify_Text_Trending'), 15)

WebUI.verifyElementPresent(findTestObject('Page_Trending/Verify_Text_Trending'), 0)

WebUI.delay(15)

WebUI.closeBrowser()
