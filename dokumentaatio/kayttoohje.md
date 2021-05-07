# Käyttöohje

Lataa tiedosto [ristinollaapp.jar](https://github.com/Tiiawss/ot-harjoitustyo/releases/tag/Ristinolla)


## Ohjelman käynnistäminen

Ohjelma käynnistetään komennolla 

```
mvn compile exec:java -Dexec.mainClass=ristinollaapp.domain.Ristinolla
```

## Kirjautuminen

Sovellus käynnistyy näkymään:

<img src="https://github.com/Tiiawss/ot-harjoitustyo/blob/main/dokumentaatio/kuvat/Screenshot%20from%202021-05-07%2013-15-46.png" width="400">

On 3x3 ruudukko ja ylhäällä oleva teksti kertoo kumman pelaajan vuoro on. Vuoro alkaa aina pelinalussa pelaajasta 1 jolla on pelimerkkinä X ja toisena on aina pelaaja 2 jolla on pelimerkkinä O.

## Pelinaikana

<img src="https://github.com/Tiiawss/ot-harjoitustyo/blob/main/dokumentaatio/kuvat/Screenshot%20from%202021-05-07%2013-16-05.png" width="400">

Ruudukon yllä oleva teksti kertoo kokoajan kumman vuoro on. Kun siinä lukee Vuoro. Pelaaja 2, sijoita O. Pelaaja 2 klikkaa hiirellä haluamaansa ruutua ja ruutuun ilmestyy pelimerkki O.



## Pelin päättyminen

Peli päättyy kun jompikumpi pelaajista saa ruudukkoon omaa merkkiänsä kolme peräkkäin vaaka-, pysty-, tai vino suunnassa.

<img src="https://github.com/Tiiawss/ot-harjoitustyo/blob/main/dokumentaatio/kuvat/Screenshot%20from%202021-05-07%2013-16-15.png" width="400">

Peli ilmoittaa päättymisen tekstillä ylhäällä ja pelin voittajan ruudukon alapuolella.

