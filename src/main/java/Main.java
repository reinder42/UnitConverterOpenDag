import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        // Menu printen
        System.out.println("1. Celsius   -> Fahrenheit");
        System.out.println("2. Nummer    -> weekdag");
        System.out.println("3. Kilobytes -> bytes");
        System.out.print("Je keuze: ");

        // Invoer van gebruiker vragen
        Scanner in = new Scanner(System.in);
        String keuze = in.nextLine();
        int nummer = Integer.parseInt(keuze);

        // Functies aanroepen
        if(nummer == 1) {
            celsiusNaarFahrenheit();
        } else if(nummer == 2) {
            nummerNaarWeekdag();
        }
    }

    public static void celsiusNaarFahrenheit()
    {
        // Invoer vragen van gebruiker
        System.out.print("Geef temperatuur in Celsius: ");

        // Invoer verwerken met Scanner
        Scanner in = new Scanner(System.in);
        double celsius = Double.parseDouble(in.nextLine());

        // Celsius omrekenen naar Fahrenheit
        double fahrenheit = (celsius * (9.0 / 5.0)) + 32;

        // Resultaat tonen aan gebruiker
        System.out.println(String.format("%.2f °C = %.2f °F", celsius, fahrenheit));
    }

    public static void nummerNaarWeekdag()
    {
        // Array maken met weekdagen
        List<String> weekdagen = new ArrayList<String>();
        weekdagen.add("maandag"); // index 0
        weekdagen.add("dinsdag");
        weekdagen.add("woensdag");
        weekdagen.add("donderdag");
        weekdagen.add("vrijdag");
        weekdagen.add("zaterdag");
        weekdagen.add("zondag");

        // Invoer vragen aan gebruiker
        System.out.print("Geef een getal tussen 1 en 7: ");
        Scanner in = new Scanner(System.in);
        int nummer = Integer.parseInt(in.nextLine());

        // Juiste weekdag uit de array pakken met index
        String weekdag = weekdagen.get(nummer - 1);

        // Resultaat tonen aan gebruiker
        System.out.println(String.format("%d = %s", nummer, weekdag));
    }
}
