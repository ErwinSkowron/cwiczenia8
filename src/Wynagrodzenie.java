import java.math.BigDecimal;


    public interface Wynagrodzenie
    {
        BigDecimal wynagrodzenieDoWyplacenia(BigDecimal stawka, int godziny);

        default BigDecimal wynagrodznieZaNadgodziny(BigDecimal stawka, int
                                                    liczbaNadgodzin)
        {
            return stawka.multiply(BigDecimal.valueOf(liczbaNadgodzin)).multiply(BigDecimal.valueOf(1.5));

        }

        static boolean premia(int doswiadczenie)
        {
            if (doswiadczenie>5)
                return true;
            return false;
        }
    }
