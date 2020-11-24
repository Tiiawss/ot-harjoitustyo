# Kalenteriohjelma
**isolla**

-Kalenteriohjelmasta tulee ohjelma joka toimii niin että luot oman käyttäjän ja merkkaat kalenteriin menosi. Kalenteri muistuttaa tulevista menoista. Kalenteria voi siis käyttää monta käyttäjää joilla on omat tunnukset ja täten ohjelma löytää aina oikean henkilön tiedot mitkä näyttää.

-Käyttäjärooleja on 2. Tavallinen käyttäjä ja Admin. Tavallinen käyttäjä pääsee vain omiin kalenterimerkintöihinsä käsiksi, admin hallinnoi kaikkea.

# Suunnitellut toiminnallisuudet
- voit kirjoittaa itsellesi joka päivän kohdalle muistilistoja.
- voit merkata menojasi kalenteriin tunnin tarkkuudella.

# Perusversion laajennusideat
- voit valita että kalenteri muistuttaa sinua tärkeastä menosta 1 päivä etukäteen.







 # Dokumentaatio              
               
[työkirjanpito](https://github.com/Tiiawss/ot-harjoitustyo/blob/master/Dokumentaati/Ty%C3%B6kirjanpito)


[Käyttöohje](https://github.com/Tiiawss/ot-harjoitustyo/blob/master/Dokumentaati/K%C3%A4ytt%C3%B6ohje)


[Vaativuusmäärittely](https://github.com/Tiiawss/ot-harjoitustyo/blob/master/Dokumentaati/Vaatimusm%C3%A4%C3%A4rittely)

## Komentorivitoiminnot



# Testaus
Testit suoritetaan komennolla

mvn test
Testikattavuusraportti luodaan komennolla

mvn jacoco:report
Kattavuusraporttia voi tarkastella avaamalla selaimella tiedosto target/site/jacoco/index.html

# Suoritettavan jarin generointi
Komento

mvn package
generoi hakemistoon target suoritettavan jar-tiedoston Calendar-1.0-SNAPSHOT.jar

# JavaDoc
JavaDoc generoidaan komennolla

mvn javadoc:javadoc
JavaDocia voi tarkastella avaamalla selaimella tiedosto target/site/apidocs/index.html

# Checkstyle
Tiedostoon checkstyle.xml määrittelemät tarkistukset suoritetaan komennolla

 mvn jxr:jxr checkstyle:checkstyle
Mahdolliset virheilmoitukset selviävät avaamalla selaimella tiedosto target/site/checkstyle.html
