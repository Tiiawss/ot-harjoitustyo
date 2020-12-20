# Arkkitehtuurikuvaus

## Rakenne

Ohelmanrakenne sisältää vain yhden pakkauksen jonka sisällä luokka Calculator.



## Käyttöliittymä

Käyttöliittymässä on yksi näkymä.

<img src="https://github.com/Tiiawss/ot-harjoitustyo/blob/master/laskarit/Screenshot%20from%202020-12-19%2015-30-45.png" width="400">

Laskin sovellus suljetaan sulkemalla ikkuna.


## Tietojen pysyväistallennus

Ei ole, laskin näyttää edelliset syötetyt numerot omassa yläkulmassaan mutta muuta muistitoimintoa ei ole.



### Päätoiminnallisuudet

Kuvataan seuraavaksi sovelluksen toimintalogiikka muutaman päätoiminnallisuuden osalta.

- Lukujen syöttäminen laskimeen tapahtuu hiirellä haluttua lukua painamalla.
- Näyttää "historiassa" yläkulmassa pienellä edellisen syötetyn luvun.
- Laskut syötetään normaalissa laskujärjestyksessä, viimeisenä painetaan yhtämontakuin-nappia ja saadaan tulos.
- Sovellus ikkunasta poistutaan sulkemalla ikkuna.

## Ohjelman rakenteeseen jääneet heikkoudet

-Paljon toisteista koodia esim. näppäinten speksejä asettaessa.
