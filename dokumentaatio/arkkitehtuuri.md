
## Arkkitehtuurikuvaus


# Rakenne


Ohjelmassa on pää pakkaus ristinollaapp joka sisältää käyttöliittymän pakkauksen ui ja sovelluslogiikan pakkauksen domain.  Ohjelmassa on kolmeluokkaa, Main luokkana toimii Ristinolla, Sovelluslogiikasta vastaa Game luokka ja Käyttöliittymästä javaFX:llä tehty RistinollaUI.

<img src="https://github.com/Tiiawss/ot-harjoitustyo/blob/main/dokumentaatio/kuvat/arkkitehtuuri.jpg" width="360">

# Käyttöliittymä

Käyttöliittymässä on yksi näkymä, joka on yksittäinen scene olionsa joka näyttää meille kokoajan ristikon johon ristinollaa pelataan. 

Ristinolla pelin alustaminen ja tulosten päivitys tapahtuu game luokassa josta RistinollaUI saa tarvittavat tiedot eri parametreilla. Kun pelaajat aloittavat pelin ruudukko on tyhjä, sen tilannetta päivitetään joka hiirenpainalluksella ruudukkoon.

# Sovelluslogiikka ja Päätoiminnallisuudet

Tässä kuvattuna Pelimerkin sijoittaminen pelaajan 1 toimesta. Eli käyttöliittymästä vastaavaluokka RistinollaUI ottaa vastaan hiirenpainalluksen ruudukkoonsa, se kertoo luokalle game mikä pelimerkki ja mihin kohtaan se pitää sijoittaa. Game sijoittaa pelimerkin Arraylistoissa oikealle paikalle ja testaa samalla onko peli päättynyt. Tämän jälkeen asetetaan RistinollaUI:n ruudukkoon vielä pelimerkki oikeaan paikkaan.

<img src="https://github.com/Tiiawss/ot-harjoitustyo/blob/main/dokumentaatio/kuvat/175557519_478909486594326_5400645219609623087_n.jpg" width="360">

Kuvasta puuttuu Game luokan tekemä tarkistus päättyykö peli, eli onko jollain 3 merkkiä vierekkäin.

Sovelluksen päätoiminnallisuudet ovat:
- pelimerkin sijoittaminen
- onko peli päättynyt testaus ja jos on voittajan julistaminen

# Ohjelman rakenteesta

Ohjelmaan on jäänyt pari ei ideaalista rakennetta, käyttöliittymäluokan ruudukon nappien alustamisen voisi delegoida siistimin omalle erilliselle metodilleen, ja sovelluslogiikassa metodit ylittävät välillä 20 riviä.


