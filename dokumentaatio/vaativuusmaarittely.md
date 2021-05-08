# Vaatimusmäärittely

## Sovelluksen tarkoitus

Sovelluksen on tarkoitus mahdollistaa ristinollan pelaaminen kahden pelaajan välillä. Sovellus kertoo kokoajan kumman pelaajan vuoro on niin kauan kuin peli on käynnissä, pelin loppuessa jommankumman voittoon se kertoo voittajan. Jos kumpikaan ei voita mutta ruudukko tulee täyteen, sovellus kertoo vain pelin päättyneen.

## Käyttäjät

Vain kaksi samoilla oikeuksilla olevaa käyttäjää, eli pelaajat.

## Käyttöliittymä

Käyttölittymä koostuu yhdestä näkymästä jossa on 3x3 ruudukko johon pelaajat merkkaavat pelimerkkinsä. 

 <img src="https://github.com/Tiiawss/ot-harjoitustyo/blob/main/dokumentaatio/kuvat/Screenshot%20from%202021-05-07%2013-15-46.png" width="360">

## Perusversio

- peli luo kaksi pelaajaa, pelaaja 1 ja pelaaja 2, ja antaa niille pelimerkit X ja O.
- pelissä on 3x3 ruudukko johon pelimerkit sijoitetaan ja peli muistaa missä mikäkin merkki on.
- peli kertoo jos jompikumpi on saanut joko vaakasuoraan, pystysuoraan tai vinottain kolme omaa merkkiä peräkkäin. 
- pelaajat näkevät kokoajan ruudukon ja mihin edelliset merkit on laitettu.
- jos jompikumpi voittaa peli kertoo pelin päättyneeksi ja julistaa voittajan. Jos peli päättyy ilman voittajaa se päättyy sitten kun ruudukko on täytetty kokonaan. 

## Jatkokehitysideoita

-pelaajat voisivat valita itse ruudukon koon.

