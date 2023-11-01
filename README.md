# Open dag workshop Java

# Welkom bij Java!

Om je kennis te laten maken met onze afstudeerrichting Software Development (SD) hebben we deze workshop voor je samengesteld. Je gaat aan de hand van een klein, compact project aan de slag met Java programmeren. Aan de hand van korte mini-opdrachten bouw je een Unit Converter _from scratch_!

## Wat is een Unit Converter?

Een _unit converter_ is een simpele applicatie (of programma) om metingen en eenheden van het ene naar het andere om te rekenen. Een voorbeeld: 1 kilobyte (kB) is 1024 bytes (B). Je kan dus tussen die twee eenheden omrekenen door te delen of vermenigvuldigen met 1024.

Wikipedia zegt het volgende over unit conversie:

> Conversion of units is the conversion between different units of measurement for the same quantity, typically through multiplicative conversion factors which change the measured quantity value without changing its effects. Unit conversion is often easier within the metric or the SI than in others, due to the regular 10-base in all units and the prefixes that increase or decrease by 3 powers of 10 at a time.

Bron: [Conversion of units](https://en.wikipedia.org/wiki/Conversion_of_units)

In deze workshop gaan we een 3-tal eenheden converteren:

1. Van _Celsius_ naar _Fahrenheit_
2. Van _nummer_ 1-7 naar _weekdag_
3. Van kilobytes naar bytes

## Wat is Java?

Java is een programmeertaal die draait op een software platform genaamd Java Runtime Environment (JRE). Je kan Java als programmeertaal op allerlei devices gebruiken, van computers tot smartphones tot wasmachines tot lichtknopjes, juist omdat Java z'n eigen _runtime_ heeft.

Als jij Java code schrijft, wat gewoon in een teksteditor kan, dan 'transformeert' de Java compiler jouw code tot bytecode die door de Java Runtime Environment uitgevoerd kan worden. Zo'n tussenprogramma als JRE zorgt er dus voor dat je je Java programma op elk denkbaar device kunt uitvoeren, zolang de JRE maar op dat device draait.

Java is een veelgebruikte programmeertaal, en heeft een begrijpelijke en uitgebreide syntax, waardoor het uitermate geschikt is voor ons Software Development onderwijscurriculum. Daarnaast wordt Java vaak gebruikt in het bedrijfsleven en het beroepenveld van software ontwikkelaars, wat het een logische taal maakt om te leren tijdens je studie HBO-ICT.

Bron: [https://java.com/nl/download/help/whatis_java.html](https://java.com/nl/download/help/whatis_java.html)

# Opdracht 1: Getting Started

Voordat we kunnen gaan programmeren in Java, moeten we e.e.a. klaarzetten. Stap 1 is het starten van de software (IDE) waarmee we Java gaan programmeren.

Een IDE, of Integrated Development Environment, is een verzameling software die het programmeren makkelijker maakt. Uiteraard zit daar een teksteditor in, maar ook bijv. een Java compiler, project manager, packaging tools, en een debugger.

Je hebt de keuze uit de volgende IDE's:

1. [Eclipse](https://www.eclipse.org/downloads/)
2. [IntelliJ IDEA](https://www.jetbrains.com/idea/)
3. [replit](https://replit.com/)

Eclipse staat al geinstalleerd op de computer waar je nu op werkt. In deze workshop gaan we ervan uit dat je Eclipse gebruikt, maar de stappen zijn ook goed te volgen in de andere IDEs. Als je geen Eclipse of IntelliJ hebt, dan is replit een goede keuze!

## Eclipse starten

Op de computer waar je nu op aan het werk bent, staat links als het goed is een icoon van _Eclipse_ (paarse planeet/maan). Klik op dat icoon om Eclipse te starten.

We gaan nu een nieuw project maken. Doe het volgende:

1. Kies _File -> New -> Java Project_
2. Kies een projectnaam, bijv. _UnitConverter_
3. Vink aan _Use default JRE (currently 'jdk-11.x.y')_
4. Klik op _Finish_

## Java bestand aanmaken

We gaan nu een Java code bestand aanmaken. Doe het volgende:

1. Klap links in de _Package Explorer_ de items onder het project uit, tot je een map ziet die 'src' heet
2. Rechts-klik op de map 'src' en kies _New -> Class_
3. Vul bij _Package_ `opendag.unitconverter` in
3. Vul bij _Name_ `Main` in
4. Klik op _Finish_

Als het goed is, dan opent er nu een nieuw bestand dat `Main.java` heet. Hierin gaan we onze applicatie programmeren.

## Main.java programmeren

Als er al code in `Main.java` staat, vervang het dan met de volgende code:

```java
package opendag.unitconverter;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
```

Wat gebeurt er precies in bovenstaande Java code?

- Allereerst hebben we een bepaalde syntax gebruikt om onze code te structureren, in dit geval een _package_ en een _class_. Maak je geen zorgen, dat soort terminologie leer je als je bij ons komt studeren! In het kort: classes zijn kleine stukken code die bij elkaar horen, en die zijn georganiseerd in pakketten of _packages_.
- De klasse `Main` en de functie (of _method_) `public static void main()` zijn het startpunt van ons programma. Als het operating system onze applicatie opstart, dan roept het die functie in onze code aan. Het programma begint met afspelen van regels code in de functie `main()`. Het zit ook wel een beetje in de naam, "main", of "hoofdpunt" of "beginpunt".
- De regel met `System.out.println()` print een regel tekst naar de output van ons programma. Dat betekent dat de tekst _Hello world!_ verschijnt als we het programma afspelen. Dat `println()` staat voor "print line", wat er eigenlijk op neerkomt dat je een stukje tekst laat zien aan de gebruiker. We noemen dat _printen_ (ook al komt er geen papier aan te pas).

**Tip:** In Java schrijf je achter (bijna) elke regel code een puntkomma `;`!

## Java code runnen

Om te testen of de bovenstaande stappen goed zijn gegaan, kunnen we nu ons Java programma afspelen of _runnen_. Dat gaat zo: Bovenaan Eclipse staan een aantal iconen. Klik op het icoon dat lijkt op een groene Play-button.

Als het goed is zie je nu onderaan Eclipse, in de _Console_, de legendarische woorden _Hello world!_ verschijnen. Dat betekent dat onze code werkt!

# Opdracht 2: Celsius naar Fahrenheit

Stap 2 in deze workshop is het programmeren van de Celsius-naar-Fahrenheit conversie. Daarvoor maken we eerst een menu, en daarna implementeren we een Java-functie om de conversie te doen.

## Main aanpassen

We gaan wat Java code toevoegen aan `Main.java`. Dat moet wel op de goede plek, dus zoek eens in de editor of je de _accolades_ of _squiggly brackets_ `{` en `}` kunt vinden die direct onder `public static void main(...)` staan.

**Tip:** In Java gebruik je `{` en `}` om code tussen te structureren, in blokken. Bij elke open-bracket `{` hoort een sluit-bracket `}`. Doorgaans schrijf je code binnenin zo'n blok een stukje naar rechts. Dat heeft indentation; voor elke regel code staan dan 4 spaties.

Als je de juiste plek hebt gevonden, voeg dan de volgende code toe aan de functie `main()`:

```java
System.out.println("1. Celsius   -> Fahrenheit");
System.out.println("2. Nummer    -> weekdag");
System.out.println("3. Kilobytes -> bytes");
System.out.print("Je keuze: ");
```

De hele `main()` functie ziet er nu zo uit:

```java
public static void main(String[] args)
{
    System.out.println("1. Celsius   -> Fahrenheit");
    System.out.println("2. Nummer    -> weekdag");
    System.out.println("3. Kilobytes -> bytes");
    System.out.print("Je keuze: ");

}
```

Wat gebeurt er in de code? Eigenlijk printen we alleen een kort menu, zodat de gebruiker een keuze kan maken uit de verschillende conversies.

**Tip:** In Java heten functies die bij een klasse horen eigenlijk _methods_. Met _functies_ worden blokken code bedoeld die niet bij een klasse horen. In de praktijk zal je zien dat men beide zaken "functies" noemt.

## Invoer vragen

We gaan nu invoer vragen aan de gebruiker. Welk 1-3 cijfer voeren ze in om een keuze te maken uit het menu? Voeg de volgende code toe in de `main()` functie:

```java
Scanner in = new Scanner(System.in);
String keuze = in.nextLine();
int nummer = Integer.parseInt(keuze);
```

Wat gebeurt er in de code?

1. Eerst maken we een nieuwe _scanner_ aan. Dat is een Java-component, een klasse, die data kan lezen uit een input stream. De input stream is in dit geval de tekst die de gebruiker in Eclipse invoert in de Console.
2. Met `in.nextLine()` vragen we aan de scanner om de volgende regel te lezen. De tekst van die regel wijzen we toe aan de string `keuze`. De invoer van de gebruiker, bijv. `2`, is nu opgeslagen in de variabele `keuze`.
3. Op de laatste regel converteren we de variabele `keuze` van string naar integer. In plaats van tekst, maken we er nu een geheel getal van. Dat nummer slaan we op in de variabele `nummer`.

**Tip:** Variabelen gebruik je in Java om tijdelijk waarden op te slaan. Elke variable heeft een _type_. Je gebruikt `String` voor tekst, en `int` voor gehele getallen (integers). Als een variabele eenmaal een type heeft, kan je dat type niet meer wijzigen. Je kan het wel converteren en opslaan in een nieuwe variabele.

Laten we eens kijken of deze code werkt! Voeg de volgende regel als laatste toe in de functie `main()`:

```java
System.out.println(nummer)
```

Klik vervolgens weer op de Play-knop in Eclipse om je code te runnen. Je kunt nu onderaan het scherm klikken, en daarna bijv. het getal 3 invoeren. Wordt vervolgens jouw invoer netjes geprint? Super!

## Conversie code schrijven

De volgende stap is het schrijven van de code voor de conversie. Voeg de volgende functie toe aan `Main.java`:

```java
public static void celsiusNaarFahrenheit()
{
    
}
```

**Belangrijk:** Voeg deze functie onder de `main()` functie toe, dus niet er in! Kijk goed naar de _squiggly brackets_. Je hele bestand ziet er nu ongeveer zo uit:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        // <jouw code hier>
    }

    public static void celsiusNaarFahrenheit()
    {
        
    }
}

```

Functies (of _methods_) gebruik je in Java om stukken code te verpakken. Functies hebben input, _parameters_ genoemd, en output, genaamd _return waarden_. Je organiseert je code in functies, en andere structuren, om de code leesbaar en overzichtelijk te houden. Het is logisch om de Celsius-naar-Fahrenheit conversie in een functie te verpakken, omdat de code invoer-verwerking-uitvoer omvat. Een perfecte taak voor een functie!

De naam van de functie die we net hebben toegevoegd is `celsiusNaarFahrenheit()`. De functie heeft geen parameters en geen return waarde. De functie gaat straks wel om invoer van de gebruiker vragen, en wat tekst printen naar de Console.

Voeg de volgende code toe aan de functie `celsiusNaarFahrenheit()`:

```java
System.out.print("Geef temperatuur in Celsius: ");

Scanner in = new Scanner(System.in);
double celsius = Double.parseDouble(in.nextLine());
double fahrenheit = (celsius * (9.0 / 5.0)) + 32;

System.out.println(String.format("%.2f °C = %.2f °F", celsius, fahrenheit));
```

Wat gebeurt er in de code?

- Op de eerste regel printen we wat tekst. Op de 2 volgende regels gebruiken we weer de `Scanner` om invoer van de gebruiker te vragen. Die invoer zetten we direct om naar het `double` type. De variabele `celsius` bevat nu de invoer van de gebruiker (bijv. `21.0`) als een kommagetal.
- Vervolgens rekenen we `celsius` om naar `fahrenheit` met een simpele berekening. Je zou zo'n berekening een _algoritme_ kunnen noemen, omdat het tastbare stappen zet van invoer naar uitvoer. De meeste algoritmes zijn natuurlijk ingewikkelder!
- Op de laatste regel laten we het resultaat van de berekening aan de gebruiker zien. Als je goed kijkt, dan zie je `... C = ... F` staan. Op de plek van de puntjes wordt de waarde van `celcius` en `fahrenheit` gezet. Met de code `%.2f` geven we aan dat we een decimaal getal met 2 cijfers achter de komma willen printen. Deze techniek noem je ook wel een _formatted string_.

## De functie aanroepen

Het werken met functies gaat altijd in 2 stappen: je _definieert_ de functie, en dan _roep_ je de functie _aan_. Een functie-definitie programmeer je **1 keer**, terwijl je de functie-aanroep zo **vaak** kan doen als je wil.

Daarin schuilt ook de kracht van programmeren: iets 1x coderen, en dan oneindig herhalen. Er is wel eens gezegd dat goede programmeurs lui zijn, omdat een lui persoon een makkelijke manier vindt om iets te doen. Er is niets makkelijkers dan iets 1x doen, en dan oneindig herhalen!

Voeg de volgende code in de `main()` functie toe, binnenin de functie, onder de rest van de code:

```java
if(nummer == 1) {
    celsiusNaarFahrenheit();
}
```

Hierin doen we 2 dingen:

- Als `nummer` is gelijk aan `1`, dan ...
    + ... roep de functie `celciusNaarFahrenheit()` aan

Die als-dit-dan-dat manier van programmeren heet een if-statement. If-statements gebruik je om beslissingen te nemen in je code. Als het resultaat van een regel code "waar" is, of `true`, dan wordt de code in tussen de `{` en `}` van het if-statement uitgevoerd. Handig!

Je hele code ziet er nu zo uit:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("1. Celsius   -> Fahrenheit");
        System.out.println("2. Nummer    -> weekdag");
        System.out.println("3. Kilobytes -> bytes");
        System.out.print("Je keuze: ");

        Scanner in = new Scanner(System.in);
        String keuze = in.nextLine();
        int nummer = Integer.parseInt(keuze);

        if(nummer == 1) {
            celsiusNaarFahrenheit();
        }
    }

    public static void celsiusNaarFahrenheit()
    {
        System.out.print("Geef temperatuur in Celsius: ");

        Scanner in = new Scanner(System.in);
        double celsius = Double.parseDouble(in.nextLine());
        double fahrenheit = (celsius * (9.0 / 5.0)) + 32;

        System.out.println(String.format("%.2f °C = %.2f °F", celsius, fahrenheit));
    }
}
```

En, werkt het? Run je code door weer op de Play-knop in Eclipse te klikken. Als het goed is kan je dan onder in Eclipse tekst invoeren in de _Console_. Kies 1, Enter, en voer een temperatuur in Celsius in. Nadat je op Enter hebt gedrukt, verschijnt het resultaat van de berekening op je scherm!

```
1. Celsius   -> Fahrenheit
2. Nummer    -> weekdag
3. Kilobytes -> bytes
Je keuze: 1
Geef temperatuur in Celsius: 21
21,00 °C = 69,80 °F
```

# Opdracht 3: Weekdag

We gaan door met de volgende unit conversie: van nummers naar weekdagen. Zo is `1` bijvoorbeeld `maandag`, en `4` gelijk aan `donderdag`. Daartussen kan je dus converteren!

## Functie schrijven

We maken weer een Java functie, namelijk:

```java
public static void nummerNaarWeekdag()
{
    
}
```

Zorg dat je de functie op de juiste plek toevoegt in `Main.java`. Je kan de functie onder de vorige toevoegen, maar let wel op de `{` en `}`.

## Arrays in Java

Voeg de volgende code in de functie toe:

```java
List<String> weekdagen = new ArrayList<String>();
weekdagen.add("maandag");
weekdagen.add("dinsdag");
weekdagen.add("woensdag");
weekdagen.add("donderdag");
weekdagen.add("vrijdag");
weekdagen.add("zaterdag");
weekdagen.add("zondag");
```

Hoe werkt dat?

Op de eerste regel van de bovenstaande code maken we een nieuwe _array_ aan. Op de regels daarna vullen we de array met strings; stukjes tekst.

Een array is een speciaal soort lijst die als een soort ladekast meerdere waarden kan bevatten. Elk item in de array heeft een index, een integer getal dat elke waarde in de lijst aanwijst. Je kan met die index de ladekast open doen om te kijken wat er in de lade zit. We beginnen altijd bij 0 met tellen!

```
0 -> maandag
1 -> dinsdag
2 -> woensdag
3 -> donderdag
...
```

Je ziet het algoritme voor de conversie van nummer naar weekdag misschien al aankomen. Als we 1 bij de indices optellen, dan correspondeert bijv. nummer 4 met `donderdag`. Handig! Laten we dat in Java programmeren.

## Invoer vragen en converteren

We gaan eerst weer om input van de gebruiker vragen. Voeg het volgende stuk code toe aan de functie `nummerNaarWeekdag()`, onder de vorige code:

```java
System.out.print("Geef een getal tussen 1 en 7: ");
Scanner in = new Scanner(System.in);
int nummer = Integer.parseInt(in.nextLine());
```

Net als de volgende keer vragen we weer invoer van de gebruiker en zetten we dat om naar een integer getal, opgeslagen in de variabele `nummer`.

Voeg vervolgens deze code toe aan de functie:

```java
String weekdag = weekdagen.get(nummer - 1);
System.out.println(String.format("%d = %s", nummer, weekdag));
```

Wat gebeurt hier?

- Met de syntax `weekdagen.get(nummer - 1)` vragen we een string op uit de array `weekdagen`. We maken een lade in de ladekast open aan de hand van de index die bij die lade hoort. Daar trekken we wel 1 van af, omdat array indices beginnen te tellen bij 0. Anders zouden we er net 1 naast zitten!
- De string uit de array wordt toegewezen aan de variabele `weekdag`. In die variabele zit dus bijvoorbeeld de waarde `maandag` als de gebruiker `1` heeft ingevoerd.
- Op de tweede regel printen we de invoer en het resultaat uit voor de gebruiker, zodat ze kunnen zien wat het resultaat van de conversie is. Daar gebruiken we weer een _formatted string_ voor. De `%d` correspondeert met 'digit', het integer getal dat in `nummer` is opgeslagen. De `%s` correspondeert met de string in variabele `weekdag`.

## De 2e keuze toevoegen

Tot slot moeten we nog het keuzemenu aanpassen, dat we in stap 1 gemaakt hebben. Zoek het if-statement op in de `main()` functie, en pas het aan naar het volgende:

```java
if(nummer == 1) {
    celsiusNaarFahrenheit();
} else if(nummer == 2) {
    nummerNaarWeekdag();
}
```

In de bovenstaande code voegen we een blok toe aan het if-statement. Daardoor zeggen we:

- Als `nummer` is gelijk aan `1`, roep dan `celciusNaarFahrenheit()` aan.
- Anders, als `nummer` is gelijk aan `2`, roep dan `nummerNaarWeekdag()` aan.

We hebben het if-statement dus uitgebreid met een volgende beslissing. Zo'n if-else if blok voert maar 1 van de 2 keuzes uit. Als `nummer` niet `1` is, maar wel `2`, dan wordt dus die tweede functie pas aangeroepen.

## Code runnen

Je kan nu weer je code uitproberen door op de Play-knop in Eclipse te klikken. Als je voor optie 2 kiest, en dan een cijfer tussen 1 en 7 invoert, dan zou daar als alles goed is gegaan een weekdag uit moeten komen. Super!

**Tip:** Wat gebeurt er eigenlijk als je -1, 9 of 314 invoert? Zoveel dagen zitten er niet in de week... Software Development gaat niet alleen maar over programmeren, maar ook over _debugging_ en het vinden van bugs in je code. In bovenstaande code kunnen we dus iets inbouwen waardoor we checken of de invoer van de gebruiker wel tussen 1 en 7 ligt. Dat voorkomt bugs en fouten!

# Opdracht 3: Bytes, Ontwerp en Analyse

**Let op:** Dit gedeelte van de workshop is nog in aanbouw! Struikelen op eigen risico...

De laatste conversie is best simpel: je kan kilobytes naar bytes omrekenen door te vermenigvuldigen met 1024 (of 2<sup>10</sup>). Is Software Development dan niets meer dan het programmeren van code?

Absoluut niet! Software Development bestrijkt een uitvoerig geheel aan disciplines, technieken en onderwerpen. Bijvoorbeeld:

- Als onderdeel van _requirements engineering_ ga je kijken naar _welke_ software je moet gaan bouwen, en hoe je dat doet. Een klant komt bijvoorbeeld met eisen voor een softwareproduct. Hoe ga je die eisen vertalen naar code?
- Als software developer werk je vaak samen met mensen die verschillende expertises hebben. Daarom is bijvoorbeeld inzicht in grafisch design, UI/UX, management, sales, marketing en subject-matter expertise ook van belang.
- Er zijn tal van technieken om software te structureren en organiseren nog voordat je gaat programmeren. De modelleertaal _UML_ (Unified Modeling Language) helpt je bijvoorbeeld om na te denken welke _entiteiten_ er in het _domein_ van jouw code zitten. Welke attributen horen er bijvoorbeeld bij een persoon? Denk aan: naam, adres, leeftijd, enzovoorts.
- Binnen software development zijn er best practices en design patterns die iets zeggen over de kwaliteit van je code. Software developers zijn het er over eens dat als je bepaalde technieken gebruikt, de kwaliteit van je code toeneemt.

Om die verscheidenheid van software development te illustreren, gaan we de volgende en laatste conversie van onze Unit Converter op een andere manier aanpakken. In plaats van code regel-voor-regel schrijven, pakken we eerst een stukje software ontwerp en analyse erbij. Je maakt ook kennis met objecten, klassen en interfaces in Java.

**UNDER CONSTRUCTION**




