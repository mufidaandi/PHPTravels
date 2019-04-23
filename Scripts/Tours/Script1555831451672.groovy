import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('https://www.phptravels.net/')

WebUI.click(findTestObject('Tours/Tours'))

WebUI.clickOffset(findTestObject('Tours/Search Bar'), 50, 50)

sheraton = 'Tours/Sheraton Trip'
bbtdubai = 'Tours/Big Bus Tour of Dubai'
dvpoman = 'Tours/Day Visit of Petra from Oman'
hsdsafari = 'Tours/Hurghada Sunset Desert Safari'
lmdpass = 'Tours/Legoland Malaysia Day Pass'
sbbexplorer = 'Tours/Sydney and Bondi Beach Explorer'
ondctour = 'Tours/Old and New Delhi City Tour'
hkitour = 'Tours/Hong Kong Island Tour'
sdathailand = 'Tours/6 Days Around Thailand'
sotntnights = 'Tours/Spectaculars Of The Nile 3 Nights'
ktur = 'Tours/Kapadokya Tur'
nitour = 'Tours/North India Tour'

negypt = 'Tours/Egypt, Nile Egypt'
hk = 'Tours/Hong Kong, Hong Kong'
hegypt = 'Tours/Egypt, Hurghada'
poman = 'Tours/Oman, Petra'
aegypt = 'Tours/Egypt, Alexandria'
cegypt = 'Tours/Egypt, Cairo'
tegypt = 'Tours/Egypt, Tanta'
begypt = 'Tours/Egypt, Baltim'
bthailand = 'Tours/Thailand, Bangkok'
ksthailand = 'Tours/Thailand, Krong Samraong'
utthailand = 'Tours/Thailand, Udon Thani'
ppthailand = 'Tours/Thailand, Phayom Phra'
knindia = 'Tours/India, Kirti Nagar'
rfindia = 'Tours/India, Red For'
pindia = 'Tours/India, Paharganj'
cpindia = 'Tours/India, Connaught Place'
pusaindia = 'Tours/India, Pusa'
tamaustralia = 'Tours/Australia, Tamarama'
bspaustralia = 'Tours/Australia, Bondi Surf Pavilion'
nbaustralia = 'Tours/Australia, North Bondi'
legomalaysia = 'Tours/Malasia, Legoland'
gpmalaysia = 'Tours/Malasia, Gelang Patah'
rgegypt = 'Tours/Egypt, Ras Gharib'
moman = 'Tours/Oman, Muscat'
sharjahuae = 'Tours/United Arab Emirates, Sharjah'
ajmanuae = 'Tours/United Arab Emirates, Ajman'
amritsarin = 'Tours/IN, Amritsar'
adae = 'Tours/AE, Abu Dhabi'
ndin = 'Tours/IN, New Delhi'
chanin = 'Tours/IN, Chandigarh'
dubuae = 'Tours/United Arab Emirates, Dubai'
alatr = 'Tours/TR, Alanya'

KeywordLogger log = new KeywordLogger()

def list = [sheraton, bbtdubai, dvpoman, hsdsafari, lmdpass, sbbexplorer, ondctour, hkitour, sdathailand, sotntnights, ktur, nitour,
	negypt, hk, hegypt, poman, aegypt, cegypt, tegypt, begypt, bthailand, ksthailand, utthailand, ppthailand, knindia, rfindia,
	pindia, cpindia, pusaindia, tamaustralia, bspaustralia, nbaustralia, legomalaysia, gpmalaysia, rgegypt, moman, sharjahuae,
	ajmanuae, amritsarin, adae, ndin, chanin, dubuae, alatr]

for (def item : list) {
		WebUI.click(findTestObject(item))
		
		a = item.split('/')[1]
		b = WebUI.getText(findTestObject('Tours/Selected'))
		
		assert a == b
		
		WebUI.clickOffset(findTestObject('Tours/Search Bar'), 50, 50)
	}

WebUI.clickOffset(findTestObject('Tours/Search Bar'), 550, 50)

one = 'Tours/1'
two = 'Tours/2'
three = 'Tours/3'
four = 'Tours/4'
five = 'Tours/5'

def list2 = [one, two, three, four, five]

for (def item : list2){
	WebUI.click(findTestObject(item))
	
	WebUI.delay(1)
	
	WebUI.clickOffset(findTestObject('Tours/Search Bar'), 550, 50)
}

select = 'Tours/Select'
priv = 'Tours/Private'
joinin = 'Tours/Join-In'
adv = 'Tours/Adventure'
educ = 'Tours/Educational'
corp = 'Tours/Corporate'
coup = 'Tours/Couples'
strain = 'Tours/Staff Training'
dtours = 'Tours/Discovery Tours'
fam = 'Tours/Family'
hol = 'Tours/Holidays'
hist = 'Tours/History - Culture'
bholi = 'Tours/Beach Holidays'
seeing = 'Tours/Sightseeing'

WebUI.clickOffset(findTestObject('Tours/Search Bar'), 750, 50)

def list3 = [select, priv, joinin, adv, educ, corp, coup, strain, dtours, fam, hol, hist, bholi, seeing]

for (def item : list3){
	WebUI.click(findTestObject(item))
	
	WebUI.delay(1)
	
	WebUI.clickOffset(findTestObject('Tours/Search Bar'), 750, 50)
}

WebUI.clickOffset(findTestObject('Tours/Search Bar'), 750, 50)