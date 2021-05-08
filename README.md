

## RistinollaApp
Ristinolla sovelluksen avulla on tarkoitus pystyä kahden ihmisen pelata ristinollaa.Sovellus toimii myös Helsingin yliopiston Tietojenkäsittelytieteen kurssin Ohjelmistotekniikan menetelmät kurssityönä.
# Dokumentaatio

[Tuntikirjanpito](https://github.com/Tiiawss/ot-harjoitustyo/blob/main/dokumentaatio/tuntikirjanpito.md)

[Arkkitehtuuri](https://github.com/Tiiawss/ot-harjoitustyo/blob/main/dokumentaatio/arkkitehtuuri.md)

[Käyttöohje](https://github.com/Tiiawss/ot-harjoitustyo/blob/main/dokumentaatio/kayttoohje.md)

[Testaus](https://github.com/Tiiawss/ot-harjoitustyo/blob/main/dokumentaatio/testaus.md)

[Vaativuusmäärittely](https://github.com/Tiiawss/ot-harjoitustyo/blob/main/dokumentaatio/vaativuusmaarittely.md)


# Releaset 

[Viikko 5](https://github.com/Tiiawss/ot-harjoitustyo/releases/tag/viiikko5)

 lopullinen :[ristinollaapp.jar](https://github.com/Tiiawss/ot-harjoitustyo/releases/tag/Ristinolla)


# Komentorivitoiminnot
 ## Testaus
 
- Testit suoritetaan komennolla mvn test


- Testikattavuusraportti luodaan komennolla mvn jacoco:report


# Suoritettavan jarin generointi
## Komento

- mvn package generoi hakemistoon target suoritettavan jar-tiedoston Ristinolla-1.0-SNAPSHOT.jar

- mvn compile exec:java -Dexec.mainClass=ristinollaapp.domain.Ristinolla

## JavaDoc
- JavaDoc generoidaan komennolla mvn javadoc:javadoc


## Checkstyle
- Tiedostoon checkstyle.xml määrittelemät tarkistukset suoritetaan komennolla mvn jxr:jxr checkstyle:checkstyle
