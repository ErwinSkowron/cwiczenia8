import java.util.Scanner;
import java.math.BigDecimal;

public class Kadra extends Osoba implements Wynagrodzenie {

    String wyksztalcenie, stanowisko;

    public static void inicjuj(String wyksztalcenie, String stanowisko)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Wyksztalcenie: ");
        wyksztalcenie = scanner.nextLine();

        System.out.print("Stanowisko: ");
        stanowisko = scanner.nextLine();
    }

    public void drukuj()
    {
        this.drukuj();

        System.out.println("Wyksztalcenie: " + wyksztalcenie);

        System.out.println("Stanowisko: " + stanowisko);
    }

    @Override
    public BigDecimal wynagrodzenieDoWyplacenia(BigDecimal stawka, int godziny)
    {
        if (godziny<=170)
        {
            return stawka.multiply(BigDecimal.valueOf(godziny));
        }
        else
        {
            return stawka.multiply(BigDecimal.valueOf(170)).add(wynagrodznieZaNadgodziny(stawka, 10));

        }
    }

    @Override
    public BigDecimal wynagrodznieZaNadgodziny(BigDecimal stawka, int liczbaNadgodzin)
    {
        return stawka.multiply(BigDecimal.valueOf(liczbaNadgodzin)).multiply(BigDecimal.valueOf(2));
    }

}
