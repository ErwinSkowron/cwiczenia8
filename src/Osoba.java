import java.util.Scanner;

public class Osoba{
    String nazwisko, imie, ulica, kod, miasto;


    public static void inicjuj(String nazwisko, String imie, String ulica, String kod, String miasto)
    {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Nazwisko: ");
        nazwisko=scanner.nextLine();

        System.out.print("Imie: ");
        imie=scanner.nextLine();

        System.out.print("Ulica: ");
        ulica=scanner.nextLine();

        System.out.print("Kod: ");
        kod=scanner.nextLine();

        System.out.print("Miasto: ");
        miasto=scanner.nextLine();
    }

    public void drukuj()
    {
        System.out.println("Nazwisko: " + nazwisko);

        System.out.println("NImie: " + imie);

        System.out.println("Ulica: " + ulica);

        System.out.println("Kod: " + kod);

        System.out.println("Miasto: " + miasto);
    }
}
