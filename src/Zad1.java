import java.math.BigDecimal;


public class Zad1 {

    public static void Main(String[] args)
    {
        Kadra pracownik = new Kadra();

        pracownik.inicjuj("ds", "ds", "ds", "ds", "ds");
        pracownik.drukuj();

        pracownik.inicjuj("ds", "ds");
        pracownik.drukuj();

        System.out.println("Wynagrodzenie dla pracownika: " + pracownik.wynagrodzenieDoWyplacenia(BigDecimal.valueOf(20.5), 200));
        System.out.println("Wynagrodzenie za nadgodziny: " + pracownik.wynagrodznieZaNadgodziny(BigDecimal.valueOf(20.5), 30));
        System.out.println("Premia: " + Wynagrodzenie.premia(3));
    }





}
