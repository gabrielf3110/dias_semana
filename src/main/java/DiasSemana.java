import java.security.Key;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DiasSemana {
    //Map<Integer, String> diasDaSemana= new HashMap<>();

    public static String verificaDia(Integer dia) {
        switch (dia) {
            case 1:
                return "Domingo";
            case 2:
                return "Segunda-Feira";
            case 3:
                return "Quarta-Feira";
            case 4:
                return "Quinta-Feira";
            case 5:
                return "Sexta-Feira";
            case 6:
                return "Sabado";
            default:
                return "Dia da semana incorreto!";
        }
    }
}
