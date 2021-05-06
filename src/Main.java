import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Reporter r = new Reporter("Joao");
        Reporter loisLane = new Reporter("Lois Lane");
        Reporter clarkKent = new SuperMan("Clark Kent");
        ArrayList<Reporter> planetaDiario = new ArrayList<>();

        planetaDiario.add(r);
        planetaDiario.add(loisLane);
        planetaDiario.add(clarkKent);

//        // todo mundo trabalhando
//        for (int i = 0; i < planetaDiario.size(); i++) {
//            planetaDiario.get(i).trabalhar();
//        }
//
//        // lex luthor apareceu!
//        for (int i = 0; i < planetaDiario.size(); i++) {
//            planetaDiario.get(i).tomarRaioDaMorte();
//        }


    }
}
