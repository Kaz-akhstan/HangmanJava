Hangman i Java - Rasmus Johansson 08-02-2022

Inledning
    Syftet med det här projektet var att ta det som vi hittils har lärt oss om och använda det i ett lite större projekt.
    Spelet gick ut på att vara ett simpelt text-baserat hängagubbe

Bakgrund
    Jag började med att göra en plannering över vad jag skulle göra.
        -Välj ord
        -Göra om ord till en Char lista
        -Göra en kopia av listan där bokstäverna ersätts med '-'
        -Ta input av spelaren och jämför den mot bokstäverna i ordet
        -Skriva ditt bokstäver som gissas rätt
        -Förlora liv
        -Rita ut gubben
    Jag började med att göra en simpel, dock lite rörig prototyp av spelet.
    Efter att jag kommit på hur jag ska jämföra bokstäverna så påbörjade jag det riktiga projektet.
    Arbetet gick bra och jag hade ganska snabbt fått en bra grund.
    Efter det så såg jag till att dela in mitt program i funktioner så att det blev mer organiserat och kräver mindre rader.

Positiva erfarenheter
    Det gick väldigt bra att få fram själva grunden till spelet. Genom att använda for loopar för att gå igenom ordets
    bokstäver och jämföra dom mot spelarens bokstav.
    Funktions indelandet gick också väldigt bra, jag såg till att dela upp olika processer i olika funtioner. Speciellt
    funtioner som skulle kallas vid flera tillfällen.
Negativa erfarenheter
    Det var lite svårare att få programmet att läsa in filer. Jag hade först tänkt att den skulle läsa in den
    hängande gubben via en kompakt textfil med radavbryten inbyggda. Dock så fungerade inte det på grund av hur java hanterar
    radavbryten från text filer. För att lösa detta så hade jag tänkt att ha en fil där gubben redan var utritad och
    för att få rätt figur så skulle programmet kolla igenom från vilka rader den skulle börja och sluta läsa.
    Dock så visades det sig att vara lite onödigt komplicerat och tillslut så gjorde jag om hela processen till en
    switch statement.
    När jag sedan jobbade på en annan del av programmet insåg jag att jag kunde ha använt .replaceAll() istället.
Sammanfattning
    Jag tycker att det här projektet har varit ett bra tillfälle att få använda sig av det vi lärt oss hittils.
    Jag lärde mig mer om t.ex. hur man läser in en fil i Java, hur den läser specifika rader och hur Java hanterar
    textfiler.
    Jag känner mig nöjd med projektet och hur det gick. Dock så tycker jag att vissa delar av koden, t.ex. Switchen var
    lite rörig och hade fungerat bättre om den blev inläst via textfil. Jag hade också tänkt att lägga till olika
    svårighetsgrader, men tyvärr så han jag inte med det.