import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual valor você deseja convertar? ");
        double valor = entrada.nextDouble();

        mostrarMenu();

        int tipoDeConversao = entrada.nextInt();
        Double resultado = calcularResultado(valor, tipoDeConversao);
        if (resultado == null) return;

        System.out.println("Resultado: " + resultado);
    }

    private static Double calcularResultado(double valor, int tipoDeConversao) {
        double resultado;
        switch (tipoDeConversao) {
            case 1:
                resultado = Conversor.metrosParaMilimetros(valor);
                break;
            case 2:
                resultado = Conversor.metrosParaCentimetros(valor);
                break;
            case 3:
                resultado = Conversor.metrosParaDecimetros(valor);
                break;
            case 4:
                resultado = Conversor.milimetrosParaMetros(valor);
                break;
            case 5:
                resultado = Conversor.centimetrosParaMetros(valor);
                break;
            case 6:
                resultado = Conversor.decimetrosParaMetros(valor);
                break;
            default:
                System.out.println("Erro! Conversão inválida");
                return null;
        }
        return resultado;
    }

    private static void mostrarMenu() {
        System.out.println("Qual o tipo de conversão desejado?");
        System.out.println("\t1: de metros para milimetros");
        System.out.println("\t2: de metros para centimetros");
        System.out.println("\t3: de metros para decímetros");
        System.out.println("\t4: de milímetros para metros");
        System.out.println("\t5: de centímetros para metros");
        System.out.println("\t6: de decímetros para metros");
        System.out.print("> ");
    }
}