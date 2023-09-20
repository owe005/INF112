## Mandag 14.02.22

tilstede: Andreas, Kenzo, Sanjeth, Daniel, Ole

- kommet frem til krav for del 3.
    * see del 3 obl1 
- ukentlig mandagsmøte.
  * kl 14:00 digital/på campus
- hvilket bibliotek vi skal bruke.
    * FXGL 
- 2D map edditor.
    * Tiled map editor

Skal fremmover bruke kanban, xp og parprogrammering.
Github er felles kode/dokument deling.


## søndag 20.02.22 
tilstede: Ole, Daniel, Sanjeth, Kenzo, Andreas

- gått igjenom hvordan oppgaver skal fordeles fremover.
    * Oppgaver legges ut på trello
    * oppgavers prioritet går fra høy (øverst til neders på TODO) til lav.
    * oppgavers som velges blir flyttet til doing med en komentar av når de skal være ferdig

- Et sandbox test map skal lages.
    * 16x16 tiles. 
- brukerhistorier
    * fordelt MVP krav og lager brukerhistorier av disse.
    * sanjeth 1-2 , daniel 3-5 , ole 6-7 , Andreas 8-9 , kenzo 10-11
- ukentlig møte
    * Endret møte digitalt med samme tid 14:00 førstkomende Mandag



## Mandag 21.02.22 
Tilstede: Daniel, Kenzo, Ole, Sanjeth, Andreas

* Gått igjenom første itterasjon av av spillet
  - ingen endringer så langt i arbeidsstil.
  
* Gått igjennom bruker historier.
  - valg ut og lagt til historier for innlevering.
  
* Delt ut oppgaver
  - Ole begynner på Storyline for spillet
  - Alle skal gjøre seg bedre kjent med FXGL biblioteket.


## Torsdag 03.03.22 
Tilstede: Kenzo, Ole, Andreas, Sanjeth (Daniel har coronavirus)

* Level 1
  - Level 1 kommer til å være grass-themed
  
* Oppdateringer
  - _Baseline_ for Wiki er opprettet, mer utforming av storyline kommer snarest.
  - Health til spiller fungerer.
  - Enemies gjør nå damage til spilleren.

* Delt ut oppgaver
  - Alle skal gjøre seg bedre kjent med FXGL biblioteket.



## Mandag 07.03.22 
Tilsted: Daniel, Ole, Adreas. - FRIUKE 

* StoryLine 
    - Ole har free reign på storyline, hva han skriver er loven, kan komme med forslag.
    - Finne en måte å fortelle story ingame, enten ved NPC eller en stemme i løpet av spillet. 
    - Zone 2 og miniboss lore, er neste som må gjøres i storyline
* oppgaver 
  - Sanjeth skal jobbe med UML 
  - Skrive tester. 
  - Map textures skal opp på github
  - MVP 8. 
  - Se trello for resterende oppgaver.
* Spillutforming 
  - sentral hub? tenk maplestory? 
  - linjær progresjon? 
  
## Mandag 14.03.22 
Tilstede: Ole, Sanjeth, Daniel, Andreas, Kenzo

* spillutforming 
  - sentral hub man kommer tilbake til, startsone 
  - Her er shopkeeper og andre upgrades.
  - upgrades blir låst opp ved å gjøre objectives samt bruk av ingame currency.
  
  - bakgrunn er .png mens resten av objekter man kan interagere med er pikselerte. 


## Torsdag 17.03.22
tilsted: Sanjeth, Kenzo, Daniel, Ole, Andreas

* Refakotering av kode
  * fiender or player abstraksjoner.
    * trenger mer oversikt over hva som skal inn i finder og spiller. 
  * egen factory for enemies/spiller
  * egen factory map blocks 
  * egen factory for items/objekter.
- StoryLine legges til i egen mappe i platformer. 
* start sone er godt på vei (map)
  * trenger idle player animation.
  
- Komunikasjon
  - så langt er alt godt. 
* Oppgaver
  - daniel: 
    - skrive tester for player movement - angrep - Ta skade
  - andreas:
  - Ole:
    - storyline
    - logo 
  - Kenzo:
    - fullføre start map og begynne på neste sone 
  - sanjeth: 
    - UML chart
    - tester for spawn av objekter/spiller/fiender
    - spilltest av falle utenfor map samt dø 
      - skrive hvordan man kan reprodusere testen
      - hva som skjer når man utfører testen
      - om det er ønsket adferd. 

# mandag 28.03.22
tilstede: Andreas, Ole, Daniel, Kenzo, sanjeth

* prosjektmetodikk
  * til kommende Torsdag 
    * Gå igjenom Kanban og Xp metodikk og skriv ned de delene vi skal bruke/ønsker å bruke. 
* Design 
  * Oppdeling av design oppgaver.
    * trenger flere bakgrunsbilder som passer til story.
      * finne eksempler.
    * 1 sone 
      * npcer 
        * mat = potions 
        * blacksmith for våpen - rustning.
      * Enemies 
        * demon
    * 2 sone
      * last boss General Or'kath 
      * demons 
      * imp (kan bruke magi - fireball ect)
      * demon brute (demon med rustning)


    * 3 sone er satt på pause mens sone 1 og 2 er under konstruksjon.

har bestemt at demon skal være generisk lilla fiende, demon brute bruker basemoddel demon med rustning som ekstra,
imps er små grønne spellcasters. Boss er større enn de generiske modellen, har vinger. angrep kan være fireballs
, kolloner med flammer som kommer opp fra bakken samt vanlige melee angrep. 
