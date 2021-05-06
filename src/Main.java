import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Circulo c = new Circulo("c1", 4);
        Quadrado q = new Quadrado("q1", 3);
        Triangulo t = new Triangulo("t1", 2, 3);

        ArrayList<FiguraGeometrica> figuraGeometricas = new ArrayList<>();
        figuraGeometricas.add(c);
        figuraGeometricas.add(q);
        figuraGeometricas.add(t);

        for (int i = 0; i < figuraGeometricas.size(); i++) {
            FiguraGeometrica f = figuraGeometricas.get(i);
            System.out.println(f.getNome() + ": " + f.calcularArea());
        }
    }
}
