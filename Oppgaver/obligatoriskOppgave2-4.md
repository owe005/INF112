# Obligatorisk oppgave 2, 3 og 4


## Deloppgave 1: Team og prosjekt

**Leveres som Markdown-tekst i filen `Deliverables/obligX.md`, der X er nummeret på obligen. Øverst i filen, skriv navn på prosjektet, navn på teamet, hvem som er med i teamet og hvilken gruppe dere er på.** F.eks.:

```markdown
# Oblig 2 – *Kurt-Mario in the Land of the Mushroom Princess*

* Team: *De hundre tollerne* (Gruppe 5): *Ole-Per Javasen, Jon-Jan Gitland, Nils-Katrine Mavensen, Birgitte-Ingrid C. Sharpee*
```
Det går an å lenke til andre filer (`mer info i [design diskusjonen](design-diskusjon.md)`) eller illustrasjoner (`![Et diagram](diagram.png)`). Husk at GitLab også støtter [korte referanser til issues, snippets, commits, brukere osv.](https://docs.gitlab.com/ee/user/markdown.html#gitlab-specific-references). For eksempel: #2

* Lag korte referat fra team-møtene (ha med dato, hvem som var tilstede,
hva dere diskuterte, hvilke avgjørelser dere tok, og hva dere ble
enige om å gjøre til neste gang)


Følgende skal med i team/prosjekt-rapporten, enten ved at det går frem fra referatene, og/eller at dere skriver en oppsummering. Sjekk at dere har vært innom alle punktene, selv om det bare er for å si at det fungerer bra.

* Hvordan fungerer rollene i teamet? Trenger dere å oppdatere hvem som er teamlead eller kundekontakt?
* Trenger dere andre roller? Skriv ned noen linjer om hva de ulike rollene faktisk innebærer for dere.
* Er det noen erfaringer enten team-messig eller mtp prosjektmetodikk som er verdt å nevne? Synes teamet
at de valgene dere har tatt er gode? Hvis ikke, hva kan dere gjøre annerledes for å forbedre måten teamet
fungerer på?
* Hvordan er gruppedynamikken? Er det uenigheter som bør løses?
* Hvordan fungerer kommunikasjonen for dere?
* Gjør et kort retrospektiv hvor dere vurderer hva dere har klart til nå, og hva som kan forbedres. Dette skal handle om prosjektstruktur, ikke kode. Dere kan selvsagt diskutere kode, men dette handler ikke om feilretting, men om hvordan man jobber og kommuniserer.
* Under vurdering vil det vektlegges at alle bidrar til kodebasen. Hvis det er stor forskjell i hvem som committer, må dere legge ved en kort forklaring for hvorfor det er sånn. Husk å committe alt. (Også designfiler)
* Referat fra møter siden forrige leveranse skal legges ved (mange av punktene over er typisk ting som havner i referat)..
* Bli enige om maks tre forbedringspunkter fra retrospektivet, som skal følges opp under neste sprint.
* *For siste innlevering (Oblig 4)*: Gjør et retrospektiv hvor dere vurderer prosjektet har gått. Hva har dere gjort bra, hva hadde dere gjort annerledes hvis dere begynte på nytt? 


## Deloppgave 2: krav

### «Stretch goal»

* Bestem dere for én litt mer avansert ting som dere vil prøve å få til utover et vanlig single-player platform spill. Dette kan være f.eks.: multiplayer (på samme maskin eller over nett), å porte til en annen platform (Android eller Web, f.eks.), å bytte ut grafikk-frontenden, e.l.
* Dropp multiplayer fra MVP om dere velger noe annet her ;)
* Prioritér MVP og å få de enklere delene av spillet til å fungere – det er mye viktigere å ha et bra enspiller-spill for desktop med høy kodekvalitet, enn å ha noe som funker dårlig i med både én og flere spillere og på flere platformer.
* Det er likevel et poeng i å tenke på dette tidlig i prosessen, så man ikke låser seg i dårlige løsninger. (Forøvrig, godt design, bra skille mellom model / view / controller, og klare abstraksjoner gjør det mye enklere å oppnå «stretch»-forslagene over.)

### MVP og annet

* Oppdater hvilke krav dere har prioritert, hvor langt dere har kommet og hva dere har gjort siden forrige gang. Er dere kommet forbi MVP? Forklar hvordan dere prioriterer ny funksjonalitet. 
* For hvert krav dere jobber med, må dere lage 1) ordentlige brukerhistorier, 2) akseptansekriterier og 3) arbeidsoppgaver. Husk at akseptansekriterier ofte skrives mer eller mindre som tester
* Dersom dere har oppgaver som dere skal til å starte med, hvor dere har oversikt over både brukerhistorie, akseptansekriterier og arbeidsoppgaver, kan dere ta med disse i innleveringen også.
* Forklar kort hvordan dere har prioritert oppgavene fremover
* Har dere gjort justeringer på kravene som er med i MVP? Forklar i så fall hvorfor. Hvis det er gjort endringer i rekkefølge utfra hva som er gitt fra kunde, hvorfor er dette gjort?
* Oppdater hvilke krav dere har prioritert, hvor langt dere har kommet og hva dere har gjort siden forrige gang. 
* Husk å skrive hvilke bugs som finnes i de kravene dere har utført (dersom det finnes bugs). 
* Kravlista er lang, men det er ikke nødvendig å levere på alle kravene hvis det ikke er realistisk. Det er viktigere at de oppgavene som er utført holder høy kvalitet. Utførte oppgaver skal være ferdige.


## Deloppgave 3: Produkt og kode

Evt. tekst / kommentarer til koden kan dere putte i en egen `## Kode`-seksjon i `Deliverables/obligX.md`.

* *Utbedring av feil:* hvis dere har rettet / forbedret noe som dere har fått trekk for tidligere, lag en liste med «Dette har vi fikset siden sist», så det er lett for gruppelederne å få oversikt.
* I `README.md`: Dere må dokumentere hvordan prosjektet bygger, testes og kjøres, slik at det er lett for gruppelederne å bygge, teste og kjøre koden deres. Under vurdering kommer koden også til å brukertestes.
* Prosjektet skal kunne bygge, testes og kjøres på Linux, Windows og OS X – dere kan f.eks. spørre de andre teamene på gruppen om dere ikke har tilgang til alle platformene. *OBS!* Den vanligste grunnen til inkompatibilitet med Linux er at filnavn er *case sensitive*, mens store/små bokstaver ikke spiller noen rolle på Windows og OS X. Det er viktig å sjekke at stiene til grafikk og lyd og slikt matcher eksakt. Det samme vil antakelig også gjelde når man kjører fra JAR-fil.
* Lag og lever et [klassediagram](https://en.wikipedia.org/wiki/Class_diagram). (Hvis det er veldig mange klasser, lager dere for de viktigste.) Det er ikke nødvendig å ta med alle metoder og feltvariabler med mindre dere anser dem som viktige for helheten. (Eclipse har [forskjellige verktøy for dette](https://marketplace.eclipse.org/category/free-tagging/class-diagram).)
* Kodekvalitet og testdekning vektlegges. Dersom dere ikke har automatiske tester for GUI-et, lager dere manuelle tester som gruppelederne kan kjøre basert på akseptansekriteriene.
* Statiske analyseverktøy som [SpotBugs](https://spotbugs.github.io/) eller [SonarQube](https://www.sonarqube.org/) kan hjelpe med å finne feil dere ikke tenker på. Hvis dere prøver det, skriv en kort oppsummering av hva dere fant / om det var nyttig.
* Automatiske tester skal dekke forretningslogikken i systemet (unit-tester). *Coverage* kan hjepe med å se hvor mye av koden som dekkes av testene – i Eclipse kan dette gjøres ved å installere *EclEmma* gjennom Eclipse Marketplace.
* Utførte oppgaver skal være ferdige. Slett filer/kode som ikke virker eller ikke er relevant (ennå) for prosjektet. (Så lenge dere har en egen git branch for innlevering, så er det ikke noe stress å fjerne ting fra / rydde den, selv om dere fortsetter utviklingen på en annen gren.
* *For Oblig 3 og 4:* Prosjektpresentasjon teller ved denne leveransen (holdes etter dere har levert). Dere skal ha med demo av spillet, en beskrivelse av det viktigste dere har lært, ville dere gjort noe annerledes om dere hadde gjort det igjen.


## Vurderingskriterier og vekting

* Vurderingskriterier ligger på Mitt.Uib

* **Innleveringsfrist Oblig 2: 25. mars 2022, klokken 16:00**
* **Innleveringsfrist Oblig 3: 8. april 2022, klokken 16:00**
* **Innleveringsfrist Oblig 4: 29. april 2022, klokken 16:00**
* **Eksamen: 25. mai 2022, klokken 15:00**

For å få oppgaven godkjent, må gruppen:
* Skrive fornuftige Commit meldinger når endringer lastes opp i gruppens repo.
* Laste opp de etterspurte resultatene i repo på `git.app.uib.no`
   * Tekst, diagrammer osv. lastes opp i undermappen `Deliverables`. Skriv tekst i markdown-format (det er ikke nødvendig å legge ved «utskrift» i PDF e.l.).
   * Tekst kan skrives på norsk eller engelsk.
* Laste opp leveransen til github i markdown-format.
* Tag en commit av kildekoden som er leveransen til hver oblig. Dette gjør det enklere for de som skal vurdere å gjøre det på riktig tidspunkt.

**I tillegg til koden, vil dere også vurderes på teamarbeidet gjennom semesteret.**

For å få oppdraget godkjent, må hvert lagmedlem:
* Møte og delta aktivt i minst 75% av ukentlige møter med deres TA.
* Utføre de tildelte oppgavene under og mellom disse ukentlige møtene, som avtalt i teamet.
* Rapportere tilbake til teamet om framdrift og/eller problemer som oppstår, som avtalt i teamet.

**Vektlegging:** Kravene i denne leveransen utgjør 12,5% av sluttkarakteren. Dere vil får tilbakemelding og poeng ihht. retteskjema – **men**, det er meningen dere skal gjøre feil og lære underveis, så tellende poeng settes basert på sluttproduktet på slutten av semesteret.

## Generelt om vurdering av semesterprosjektet

Hovedvekten av vurderingen på sluttproduktet ligger på
spillmekanikken, måten dere jobber sammen og refleksjon over
prosessen, ikke det visuelle. Det er ok å bruke f.eks. [Open Game
Art](https://opengameart.org/) for grafikk – men pass på at dere
overholder lisensvilkårene, og alltid opplyser om hvor grafikk/lyd er
hentet fra (også om dere har laget det selv).

## Tips
* Husk å lese gjennom retteskjema for å få med alle punktene vi gir poeng for. 
* Mockito kan være et bra mock-rammeverk i tillegg til JUnit. Generelt sett er det også mulig å skrive manuelle
tester. Husk at testene dere skriver skal brukes. (Som nevnt i deloppgave 3)
* Travis og Codacy kan være til god hjelp for å sjekke at koden bygger før dere pusher til master.
* Husk å kjøre programmet før dere lager en tag til levering slik at dere vet at det kjører. 

#### Generelle tips/krav til kode
Dere kommer til å lære om disse tingene i løpet av kurset, så ikke få panikk om det høres ukjent ut:
* **Kvalitet:** Test grundig, bruk verktøy som [SpotBugs](https://spotbugs.github.io/) for å finne feil, hold koden lesbar med autoformattering osv.
* **Abstraksjon/[dependency inversion](https://en.wikipedia.org/wiki/Dependency_inversion_principle):** Tenk *interfaces* og skjul klassene – det gjør det enklere å bytte ut funksjonalitet og å «mocke» resten av systemet når du tester en enhet.
* **Decoupling:**  Sørg for at forskjellige enheter i programmet er mest mulig uavhengig av hverandre – spesielt med tanke på *model* (intern representasjon av spillet) og *view* (grafisk representasjon beregnet på brukeren) – se [Model-View-Controller](https://en.wikipedia.org/wiki/Model%E2%80%93view%E2%80%93controller)
