# Obligatorisk oppgave 1: Prosjekt Plattformspill – oppstart

*«Kurt-Mario er i trøbbel igjen! Han er sent ute til eksamen, han har ikke lest nok – og hvor er egentlig eksamenslokalet? Hjelp Kurt-Mario å hoppe fra etasje til etasje på Høyteknologisenteret, plukke opp viktig kunnskap (og snacks!) på veien og nå frem til eksamen i tide. Men pass opp for de skumle professorene – vi har ikke tid til å høre om flere teoremer nå!»*

Dette semesterets programmeringsprosjekt er å lage et [plattformspill](https://en.wikipedia.org/wiki/Platform_game) – et 2D-spill der du beveger deg rundt ved å gå eller hoppe og samler ting mens du passer deg for fiender. [Her er et populært eksempel på sjangeren](https://supermarioplay.com/) som dere kan prøve – det er sikkert lurt å gjøre grundig «research» før dere setter i gang!

(Dere står fritt til å velge plott til spillet – Kurt-Mario er bare et eksempel.)

Her er viktige aspekter å ha med i spillet:

* Spillfigur som kan styres – gå til høyre/venstre, hoppe oppover
* Todimensjonal verden:
   * Plattform – horisontal flate spilleren kan stå eller gå på (inkludert «bakken»)
   * Vegg – vertikal flate som spilleren ikke kan gå gjennom
   * Spilleren beveger seg oppover ved å hoppe, og nedover ved å falle
* Fiender som beveger seg og er skadelige ved berøring
* Spilleren kan samle poeng ved å plukke opp ting
* Utfordringen i spillet er gjerne en eller flere av: å bevege seg gjennom terrenget uten å falle utfor, å samle nok poeng, å bekjempe fiendene, å nå frem til og bekjempe en «big boss» 

Vanlige aspekter dere kan vurdere å ha med:

* Verden er bygget opp av blokker med fast størrelse
* Verden har plattformer eller stiger som man kan hoppe opp gjennom
* Verden er større enn skjermen og scroller horisontalt eller vertikalt
* Plattformer som beveger seg
* Spilleren kan drepe fiendene ved å hoppe på dem eller skyte dem
* «Power-ups» som gir spilleren spesielle krefter
* Skjulte gjenstander
* Akrobatikk

Velkjente eksempler er [Donkey Kong (1981)](https://en.wikipedia.org/wiki/Donkey_Kong), [Mario Bros. (1983)](https://en.wikipedia.org/wiki/Mario_Bros.), [Metroid (1986)](https://en.wikipedia.org/wiki/Metroid), [Bubble Bobble (1986)](https://en.wikipedia.org/wiki/Bubble_Bobble), [Castlevania (1986)](https://en.wikipedia.org/wiki/Castlevania), [Sonic the Hedgehog (1991)](https://en.wikipedia.org/wiki/Sonic_the_Hedgehog) – alle disse er fremdeles populære og tilgjengelige i nye utgaver.

Generelle krav:

* Java: Spillet skal skrives i Java, og dere vil få forslag til og tutorials for grafikkbibliotek.
* JUnit: For testing skal JUnit 5 brukes
* Byggesystem:  Dere kan velge mellom Maven og Gradle, men tips og sånt kommer til å være for Maven.
* Skjelett: Når dere skal begynne å programmere vil dere vil få et skjelettprosjekt dere kan bruke som utgangspunkt, men dere kan også sette opp prosjektet selv.
* Versjonskontroll: Bruk Git til versjonskontroll, og gjør aktiv bruk av kollaborativ funksjonalitet i GitLab.

Dere vil få et skjelettprosjekt og en tutorial om grafikk neste uke
som vil hjelpe dere med å løse deloppgave 4.


## Deloppgave 1 (uke 6): Organiser teamet

Gruppen trenger et gruppenavn, som også blir navnet på github-repositoriet
deres. Kartlegg hvilken kompetanse de ulike medlemmene av teamet har, og ta med
en kort oppsummering i innleveringen.

Dere trenger et Git repo for prosjektet. Bruk [git.app.uib.no](https://git.app.uib.no/) – lag en GitLab gruppe med alle team-medlemmene og et GitLab prosjekt. GitLab har innebygged issue tracker, Wiki etc, som vi anbefaler at dere bruker.

Dere skal så fordele roller dere bestemmer dere for (kan feks være
teamlead, kundekontakt osv). Skriv en kort begrunnelse for hvilke
roller dere bestemmer dere for og hvorfor. Sett opp et project board
(Trello, f.eks.). Dette må settes opp, og det er viktig at alle i
gruppen vet hvordan de bruker verktøyene dere velger.

## Deloppgave 2 (uke 6): Velg og tilpass en prosess for laget

Dere må finne ut om dere vil følge en bestemt prosjektmetodikk (XP,
Scrum, Kanban, parprogrammering, testing osv), evt hvilke elementer
fra ulike prosjektmetodikker dere vil ha med.

Diskuter i teamet hvilke metoder som hjelper teamet med å utvikle
fungerende og veldokumentert programvare under prosjektet. Diskuter
også hvilke tilpassninger som trengs for å fungere godt i et slikt
studentprosjekt. Involver gjerne gruppeleder i diskusjonen om mulige
problemer.

Vurder viktige aspekter ved prosessen, for eksempel hvordan organisere
møter, definisjon og tildeling av oppgaver, oppfølging av arbeid,
hvilke programvareutviklingsaktiviteter som trengs (og når), hvilke
prosjekteringsaktiviteter som trengs (og når). Skriv en kort
beskrivelse av prosessen i prosess- og prosjektplanen.

Diskuter i teamet hvordan dere skal organisere dere under
prosjektet. Noen viktige elementer:

* Møter og hyppighet av dem
* Kommunikasjon mellom møter
* Arbeidsfordeling
* Oppfølging av arbeid
* Deling og oppbevaring av felles dokumenter, diagram og kodebase

Skriv en kort beskrivelse av hvordan teamet ditt planlegger å
organisere prosjektet den første tiden.

## Deloppgave 3 (uke 6–7): Få oversikt over forventet produkt

Dere skal lage et plattformspill. Spillet bør inneholde det som
beskrives som «viktige aspekter» over, dere kan ellers velge hva dere
vil ha med, og hva dere vil legge mest vekt på. I første omgang er det
viktig å holde fokus på å nå frem til et *minimum viable product*
(MVP) – enklest mulig, men fremdeles spillbart.

Dere skal lage en spesifikasjon som inneholder:
* En kort beskrivelse av det overordnede målet for applikasjonen
* En liste over brukerhistorier til systemet basert på MVP-kravene.
* For hver brukerhistorie, skal dere ha akseptansekriterier og arbeidsoppgaver, samt beskrivelse av hvilke krav brukerhistorien oppfyller (dette lager dere kun for historier dere er ferdige med, holder på med, eller skal til å begynne med)
* En prioritert liste over hvilke brukerhistorier dere vil ha med i første iterasjon (altså frem til levering av denne oppgaven, se [deloppgave 4](#deloppgave-4-kode) for forslag).
* (**Frivillig**) Krav til MVP er gitt i neste deloppgave. Dersom dere ønsker å utvide denne listen med ytterligere funksjonalitet, skal det også med som en del av denne spesifikasjonen.

### Brukerhistorier
Brukerhistorier er en måte å spesifisere funksjonalitet på ved hjelp av en liten historie:  Som *rolle* trenger jeg *funksjonalitet* for å *oppnå nytteverdi*. Dette gjør det klart *hva* som trengs, men også *hvorfor* det trengs (slik at man kan prioritere) og *hvem* som er målgruppen (hva vil være passende/egnet for brukeren?).

For eksempel: «Som spiller trenger jeg å kunne skille plattformer/vegger fra bakgrunnselementer slik at jeg avgjøre hvordan jeg skal styre spillfiguren.»  (Avhengig av bruker (svaksynt? barn? fargeblind?) vil dette påvirke den grafiske utformingen.)  Eller: «Som programmør trenger jeg å kunne skille plattformer, vegger og bakgrunnselementer fra hverandre, slik at jeg kan avgjøre om spillfiguren kan bevege seg i en gitt retning»

### Vurdering

I vurdering vil vi vektlegge hvor fullstendige brukerhistoriene er
fremfor hvor mange brukerhistorier som er påbegynt.

## Deloppgave 4 (uke 7): Kode

En del av leveransen for denne oppgaven skal være kode – men 

Fokuset i starten bør
være på å levere et minimum viable product (MVP) så raskt som mulig (vi regner
med at flesteparten klarer å nå gjennom MVP til andre oblig). Krav til MVP:

1. Vise et spillebrett
2. Vise spiller på spillebrett
3. Flytte spiller (vha taster e.l.)
4. Spiller interagerer med terreng
5. Spiller har *poeng* og interagerer med poenggjenstander
6. Vise fiender/monstre; de skal interagere med terreng og spiller
7. Spiller kan dø (ved kontakt med fiender, eller ved å falle utfor skjermen)
8. Mål for spillbrett (enten et sted, en mengde poeng, drepe alle fiender e.l.)
9. Nytt spillbrett når forrige er ferdig
10. Start-skjerm ved oppstart / game over
11. Støtte flere spillere (enten på samme maskin eller over nettverk)

## Deloppgave 5: Oppsummering

Utfør et kort prosjekt-retrospektiv og diskuter hva som gikk bra, hva som ikke
fungerte helt som forventet, hva (om noe) som ikke virket i det hele tatt, og
eventuelle nye aktiviteter eller verktøy som teamet vil prøve ut i løpet av
neste obligatoriske oppgave. Diskuter hvorfor ting fungerte eller ikke fungerte.
Skriv opp en kort oppsummering av diskusjonen, og last opp til team repo-et.

På slutten av denne oppgaven kan dere gjøre en liten vurdering av hvor bra dere
traff på oppgaven. Dette kan dere bruke til å justere hvor mange oppgaver dere
tenker å få inn i neste iterasjon, som da leveres med obligatorisk oppgave 2.

## Innleveringen

Oblig 1 består av deloppgave 1–5.

Innleveringsfrist: **21. februar 2021, klokken 16:00**. 

### Forventninger

Til denne innleveringen forventer vi at dere har satt opp og
organisert team og prosjekt, at dere skriver brukerhistorier (husk å
få med hvilke krav brukerhistoriene dekker i beskrivelsen) og
(minimal) kode for MVP punkt 1 til 3.

Dere fortsetter med de neste kravene etterhvert som dere blir ferdig,
det kan lønne seg å begynne på multiplayer så snart som mulig etter
1-5 er oppfylt, for designet må ofte tilpasses en del for å få det
til (dere vil få mer tips om dette).

### Vurderingskriterier og vekting

For å få oppgaven godkjent må gruppen:
* Opprettet en repo-struktur som beskrevet i deloppgave 1.
* Skrive fornuftige commit meldinger når endringer lastes opp i gruppens repo.
* Laste opp de etterspurte resultatene i repo.
* Laste opp leveransen til gitlab i markdown-format
* Leveransen skal lastes opp i egen mappe i repo-et som heter "Deliverables". Hver obligatoriske oppgave blir da "ObligatoriskOppgaveX.md" i denne mappen.
* Tag en commit av kildekoden som er leveransen til hver innlevering. Dette gjør det enkelt for de som skal vurdere å gjøre det på riktig tidspunkt.

Måten dere jobber sammen og løfter alle medlemmene i teamet vil vurderes sammen
med kodekvalitet, oversiktlighet og dokumentasjon. Dere vil få tilgang til
retteskjema samtidig som oppgaven slippes, slik at dere vet hvordan dere blir
vurdert. 

For å få oppgaven godkjent må hvert teammedlem:
* Møte og delta aktivt i minst 75% av ukentlige møter med deres TA.
* Utføre de tildelte oppgavene under og mellom disse ukentlige møtene, som avtalt i teamet.
* Rapportere tilbake til teamet om fremdrift og/eller problemer som oppstår, som avtalt i teamet.

**Vektlegging:** Kravene i denne leveransen utgjør 12,5% av sluttkarakteren. Dere vil får tilbakemelding og poeng ihht. retteskjema – **men**, det er meningen dere skal gjøre feil og lære underveis, så tellende poeng settes basert på sluttproduktet på slutten av semesteret.


## Generelt om vurdering av semesterprosjektet

Hovedvekten av vurderingen på sluttproduktet ligger på
spillmekanikken, måten dere jobber sammen og refleksjon over
prosessen, ikke det visuelle. Det er ok å bruke f.eks. [Open Game
Art](https://opengameart.org/) for grafikk – men pass på at dere
overholder lisensvilkårene, og alltid opplyser om hvor grafikk/lyd er
hentet fra (også om dere har laget det selv).

Koden skal være plattformuavhengig, altså skal den fungere uavhengig
av operativsystem.

#### Generelle tips/krav til kode
Dere kommer til å lære om disse tingene i løpet av kurset, så ikke få panikk om det høres ukjent ut:
* **Kvalitet:** Test grundig, bruk verktøy som [SpotBugs](https://spotbugs.github.io/) for å finne feil, hold koden lesbar med autoformattering osv.
* **Abstraksjon/[dependency inversion](https://en.wikipedia.org/wiki/Dependency_inversion_principle):** Tenk *interfaces* og skjul klassene – det gjør det enklere å bytte ut funksjonalitet og å «mocke» resten av systemet når du tester en enhet.
* **Decoupling:**  Sørg for at forskjellige enheter i programmet er mest mulig uavhengig av hverandre – spesielt med tanke på *model* (intern representasjon av spillet) og *view* (grafisk representasjon beregnet på brukeren) – se [Model-View-Controller](https://en.wikipedia.org/wiki/Model%E2%80%93view%E2%80%93controller)
