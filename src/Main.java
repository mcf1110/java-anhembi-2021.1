import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pet> pets = new ArrayList<>();
        Random gerador = new Random(42);
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            if(gerador.nextInt() <= 40){
                addCachorro(pets, entrada);
            } else {
                addGato(pets, entrada);
            }
        }

        for (int i = 0; i < pets.size(); i++) {
           pets.get(i).mostrarCaracteristicas();
        }
    }

    private static void addCachorro(ArrayList<Pet> pets, Scanner entrada){
        System.out.print("Digite um nome para um cachorro: ");
        String nome = entrada.nextLine();
        System.out.print("Digite o peso do cachorro: ");
        float peso = entrada.nextFloat();
        entrada.nextLine();
        pets.add(new Cachorro(nome, peso));
    }

    private static void addGato(ArrayList<Pet> pets, Scanner entrada){
        System.out.print("Digite um nome para um gato: ");
        String nome = entrada.nextLine();
        System.out.print("Digite o pelo do gato: ");
        String corDoPelo = entrada.nextLine();
        pets.add(new Gato(nome, corDoPelo));
    }
}
