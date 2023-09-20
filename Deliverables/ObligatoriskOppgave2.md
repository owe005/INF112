
# Oblig 2 – *A platformer*

* Team: *Adkos* (Gruppe 7): *Ole, Kenzo, Andreas, Sanjeth, Daniel*


# linker
***
* Møtereferater: [Referater](MøteReferat.md)
* BrukerHistorier [BrukerHistorier](Brukerhistorier.md)
* Tester: [Tester](/src/test/java/no/uib/app/git/adkos/Tests.md)
* Hvordan å bygge: [README](/README.md)

# rolleforklaring
***

Vi har rollene:
- Teamleder (Sanjeth)

Vi har en teamleder fordi det er viktig å ha noen som kan holde styr på at oppgaver blir gjort, hvem som gjør hva og at oppgaveprogresjon går som planlagt.

- Designer (Ole og Kenzo)

Designerne trenger vi for å få plass det visuelle, det innebærer foreløpig map design, logo design og wiki.

- Kundekontakt (Ole)

Kundekontakten kommuniserer frem og tilbake med eventuell klienter om hva som kan være greit å fikse, legge til, hva som er blitt lagt til, osv..


- Utvikler (Andreas og Daniel)

Utviklerene skriver kode som og samkjører med designerne med hensyn til spillkarakterer, egenskaper og physics.



# del 1
***



Per nå fungerer rollen vi har valgt godt og kommer ikke til å implementere flere roller, men alle kommer til å hjelpe 
mere på Design delen av oppgavene da vi nå har innsett at design er mye arbeid og tar tid å få rett. Grunnet dette har 
vi en ubalanse i commits fra person til person. Har vurdert om vi bruker for lang tid på design kommer vi til å hente
opensource grafikk og animasjoner.
Når det kommer til workflow har vi en god struktur, men har ikke helt truffet på prosjektmetodikken. 


Kort oppsumert:
* Ingen nye roller 
* Teamet fungere godt, alle er på samme side.
* oppsett av møter og komunikasjon fungerer fint og trenger ikke noe tillegg.

Forbedringer
* Når det kommer til prosjetkmetodikk har vi ikke helt truffet og skal gjøre en revurdering av hvilke punkter fra kanban 
og XP vil skal bruke. 
* gjøre kode mer abstrakt så det blir lettere å implementere ny funksjonalitet.
* Større fokus på Design


#del 2
*** 



Vi har valgt å utforske multiplayer til spillet. Helst fully-functional multiplayer der det går ann å spille over nettet, men om det blir co-op over samme datamaskin, det gjenstår å se.

Oppdatert MVP ser følgende ut:

- Vise et spillebrett ✅
- Vise spiller på spillebrett ✅
- Flytte spiller (vha taster e.l.) ✅
- Spiller interagerer med terreng ✅
- Spiller har poeng og interagerer med poenggjenstander ✅
- Vise fiender/monstre; de skal interagere med terreng og spiller ✅
- Spiller kan dø (ved kontakt med fiender, eller ved å falle utfor skjermen) ✅
- Mål for spillbrett (enten et sted, en mengde poeng, drepe alle fiender e.l.) ✅
- Nytt spillbrett når forrige er ferdig ✅
- Start-skjerm ved oppstart / game over ✅
- Støtte flere spillere (enten på samme maskin eller over nettverk) ? mulighet for a angripe monstre/fiener.


Vi har ikke kommet forbi alt i MVP enda, men vi nærmer oss fullførelse. Når det gjelder ny funksjonalitet så prioriteres det etter det som er i MVP'en så langt det ikke blir en del av MVP'en (altså at vi legger det til som veldig viktig funksjonalitet)


Det vil selvfølgelig også komme forbedringer til egenskapene til MVP'en, for eksempel det at den viser fiender/monstre. Den viser en fiende som kan skade spilleren (og drepe spilleren), men den fienden vil endre seg vesentlig etter MVP.

Det som er på agendaen for fremtidig arbeid blir å implementere den første Zonen. Northbarrow and Darkheart Thicket. En main hub, som spilleren starter i før spilleren fortsetter videre inn i en skog.
Da må vi legge til forskjellige fiender, våpen, npc's, map design.

Vi har også tenkt at alle jobber med map design da det ellers vil bli veldig mye arbeid for Kenzo å implementere. (Design til bygninger, npc's, osv..)

Bugs: Ingen bugs vi vet om.


#del 3 
*** 

Det som vi har fikset siden sist innlevering er:
* Vi har fikset rolleforklaringen siden sist gang.
* Vi har lagt til flere brukerhistorier.
* Vi har lagt til akseptansekriterier.

Prosjektet har blitt testet på windows or macOS, og funker fint på begge to.

Klassediagramer kan finnes under UML mappen. Klassediagramene kan være litt utdatert pga konstante oppdateringer.

Jeg kjørte SpotBugs plugin for Intellij, og det gav meg noen bugs. Det den pekte ut var at vi delte en integer som kan gjøre at integeren blir til en double/float, og at noe kode ikke ble kjørt. 
Dette var ikke nyttig siden det spilte ingen rolle om integeren ble om til en double eller float, og koden den pekte på aldri ble kjørt, ble kjørt helt fint hver gang så vet ikke hvor den fikk den tanken fra.

