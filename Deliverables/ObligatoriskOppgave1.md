# Obligatorisk Oppgave 1 ADKOS Gruppe 7



### Del 1
_Gruppemedlemmers kompetanse_

*** 
**Ole:**

> Studerer Datateknologi, og er på andre året. Han har litt erfaring med Google Translate API, Weather API, Reddit API. Han har også brukt en del Photoshop, designet Russelogo f.eks..
+ kundekontakt og designer 

**Andreas:**

> Studerer Datateknologi, er også på andre året. Begynte å programmere på VGS i andre klasse ettersom det var et valgfag. Har erfaring før han begynte på studie. 

 + utvikler 

**Daniel:**

> 1,5 år erfaring med koding, studerer Datateknologi, drevet litt med hacking tidligere.

+ utvikler 

**Kenzo:**

> Studerer Datasikkerhet, sliter litt med kodedelen. 
+ designer 


**Sanjeth:**

> Driver med Datateknologi, litt det samme som Daniel, er ikke den beste men jobber hardt.
+ Gruppeleder
***

### Del 2


_Ukentlig prosses_

- Mandagsmøte  14:00 - 16:00
    - Gjennomgang av tildgere uke og eventuelle endringer.
    - Oppdatering av Trello board 
    - Tildelig av oppgaver fra board
    - Oppfølging av oppgaver

* GruppeTime Torsdag 10:15 - 12:00
    * Digitalt over discord
    * Oppfølging/hjelp med oppgaver 

- Prosject metodikk:
    - Kanban, XP 
    - Parkoding 
    - Testdreven utvikling
+ All deling av kode, dokumenter og lignende blir delt via github repo. 

_Plan for prosjekt i begynnelsen_

> Vente på skjelettkode og se hvordan den ser ut. Begynne å forme et _MVP_. 
> Vi vil også begynne å sette opp Trello, fylle inn det som trengs å gjøres. 
> Når vi har full kontroll på hvordan vi ønsker spillet skal se ut, og hva det kommer til å gjøre,
> så vil vi komme på et spill-navn. Utforming vil komme på Mandag-Torsdag neste uke.
***

## Del 3:

Overordnet mål med applikasjonen:

Lage et 2D platform spill med en medieval setting hvor man skal sloss seg til en Boss for å klare spillet.
PÅ veien dit skal man ha mulighet til å finne samt bytte våpen, møte NPC's og interagere med terreng. 

_vektlagte aspekter_

    - Setting : zombies/undead.
    - medival setting ? 
    - last boss engame.
    - flere "mini bosser" på veien. 
    - oppgradere samt finne bedre våpen hvor våpen: (mulighet for kreativitet senere)
        * skjold 
        * sverd 
        * bue
        * ect
    - ødelege deler av platfor.
    - puzzle game aktig for å finne vei ?  
    - flere soner med forskjellig setting.
    - level design gjort for hånd. (tmx files)
    - zoomer inn på spiller og ser deler av map mens man går.
    - brukerhistorikk legges i github wiki.

###BrukerHistorier i første itterasjon. 

1. Som bruker vil jeg kunne se et spillbrett.
* Arbeidsoppgaver:
  - Kunne se spillbrettet for å orientere meg.
  - Når spillet starter ønsker jeg å se et vindu med grafikk av spillbrettet.
  - For å se spillbrettet må man først starte spillet fra menyen

2. Som bruker vil jeg kunne se spiller på spillbrettet.
* Arbeidsoppgaver:
  - Kunne vite hvor jeg er på spillbrettet, klare å skille plattformer og vegger fra bakgrunns elementer,
    slik at jeg kan avgjøre hvordan jeg skal styre spilleren.
  - Når spillet starter ønsker jeg å se spilleren på spillbrettet.
  - For å se spiller må man først starte spillet fra menyen
  
3. Som bruker vil jeg kunne flytte på en spiller og utforske spillet.
* ArbeidsOppgaver:
  - la spiller kunne bevege på seg via taster.

4. Som bruker vil jeg interagere med terreng/spillverden for en større  innlevelse i spillet.
* Arbeidsoppgaver:
  - gi mulighet for å klatre, (stiger eller lignende), ødelegge vegger, komme seg til nye platformer.
  - NPC's



***

## Del 4

### MVP:  
1. Vise et spillebrett
2. Vise spiller på spillebrett
3. Flytte spiller (vha taster e.l.)
4. Spiller interagerer med terreng
5. Spiller har poeng og interagerer med poenggjenstander
6. Vise fiender/monstre; de skal interagere med terreng og spiller
7. Spiller kan dø (ved kontakt med fiender, eller ved å falle utfor skjermen)
8. Mål for spillbrett (enten et sted, en mengde poeng, drepe alle fiender e.l.)
9. Nytt spillbrett når forrige er ferdig
10. Start-skjerm ved oppstart / game over
11. Støtte flere spillere (enten på samme maskin eller over nettverk) ? 
12. mulgihet for a angripe monstre/fiener.


***

##Del 5

Over de siste ukene har vi jobbet godt sammen med god komunikasjon mellom oss.
Alle har vært hyppige på å melde fra på discord eller møter om det skulle være noe man trenger hjelp med.
Har også blitt tatt opp om vi trenger endringer og lignende på hvert møte. Føler vi har truffet godt på oppgaven 
og fått god oversikt over hva som skal gjøres videre. 


Fremmover kommer alle til å gjøre seg bedre kjent med FXGL biblioteket og fortsett videre med MVP krav.
Design av Tiled maps kommer også til å bli utviklet basert på en storyline som også er påbegynt. 

Forløpig ferdige krav er 1 til 4 av MVP med deler av 7 og 10 på vei.  

Krav til neste obligatorisk er å bli ferdig med MVP, Demo til hvordan design av maps og spiller modell skal se ut 
samt en grov start på storyline. 

***

### Lenker
1. Trello: [ADKOS Trello board](https://trello.com/b/8x4Wp7V0/adkos-kanban)
2. git: [ADKOS GIT](https://git.app.uib.no/adkos)

open source files:
1. brick: [brick](https://github.com/AlmasB/FXGL/blob/release/fxgl-samples/src/main/resources/assets/textures/brick.png)
2. player: [playermodel](https://github.com/AlmasB/FXGLGames/blob/master/Mario/src/main/resources/assets/textures/player.png)