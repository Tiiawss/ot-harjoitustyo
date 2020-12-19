# Laskinohjelma
****

-Laskinohjelmasta  tulee ohjelma joka toimii nelilaskimen tavoin. Ei sisällä muisipaikkaa.

-Käyttäjärooleja on vain yksi, tavallinen käyttäjä joka käyttää laskinta.

# Suunnitellut toiminnallisuudet
- Kerto, plus, miinus ja jakolasku, historia näkyvissä menossa olevan laskun osalta.
- voit merkata menojasi kalenteriin tunnin tarkkuudella.

# Perusversion laajennusideat
- hieno ulkonäkö.







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
generoi hakemistoon target suoritettavan jar-tiedoston calculator-1.0-SNAPSHOT.jar

# JavaDoc
JavaDoc generoidaan komennolla

mvn javadoc:javadoc
JavaDocia voi tarkastella avaamalla selaimella tiedosto target/site/apidocs/index.html

# Checkstyle
Tiedostoon checkstyle.xml määrittelemät tarkistukset suoritetaan komennolla

 mvn jxr:jxr checkstyle:checkstyle
Mahdolliset virheilmoitukset selviävät avaamalla selaimella tiedosto target/site/checkstyle.html
