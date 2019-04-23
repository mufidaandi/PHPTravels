import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('https://www.phptravels.net/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Cars/Pick Up/Cars'))

WebUI.delay(1)

WebUI.click(findTestObject('Cars/Pick Up/Search Bar'))

man = 'Cars/Pick Up/Manchester'
negypt = 'Cars/Pick Up/Nile Egypt'
malay = 'Cars/Pick Up//Malaysia'
pet = 'Cars/Pick Up/Petra'
cai = 'Cars/Pick Up/Cairo'
tan = 'Cars/Pick Up/Tanta'
rfor = 'Cars/Pick Up/Red For'
lego = 'Cars/Pick Up/Legoland'
mus = 'Cars/Pick Up/Muscat'
shar = 'Cars/Pick Up/Sharjah'
ajm = 'Cars/Pick Up/Ajman'
hoon = 'Cars/Pick Up/Hoonani'
kau = 'Cars/Pick Up/Kauai'

def list = [man, negypt, malay, pet, cai, tan, rfor, lego, mus, shar, ajm, hoon, kau]

for (def item : list){
	WebUI.click(findTestObject(item))
	
	WebUI.delay(1)
	
	WebUI.click(findTestObject('Cars/Pick Up/Search Bar'))
}

WebUI.click(findTestObject('Cars/Pick Up/Pick Up Loc'))

WebUI.delay(1)

WebUI.click(findTestObject('Cars/Drop Off/Search Bar'))

manch = 'Cars/Drop Off/Manchester'
nile = 'Cars/Drop Off/Nile Egypt'
mal = 'Cars/Drop Off/Malaysia'
petra = 'Cars/Drop Off/Petra'
alex = 'Cars/Drop Off/Alexandria'
phayom = 'Cars/Drop Off/Phayom Phra'
kirti = 'Cars/Drop Off/Kirti Nagar'
pusa = 'Cars/Drop Off/Pusa'
tamarama = 'Cars/Drop Off/Tamarama'
sharjah = 'Cars/Drop Off/Sharjah'
kapaa = 'Cars/Drop Off/Kapaa'
kauai = 'Cars/Drop Off/Kauai'
dhabi = 'Cars/Drop Off/Abu Dhabi'

def list2 = [manch, nile, mal, petra, alex, phayom, kirti, pusa, tamarama, sharjah, kapaa, kauai, dhabi]

for (def item : list2){
	WebUI.click(findTestObject(item))
	
	WebUI.delay(1)
	
	WebUI.click(findTestObject('Cars/Drop Off/Search Bar'))
}

WebUI.click(findTestObject('Cars/Drop Off/Manchester'))

WebUI.delay(1)




