public class SuperMan extends Reporter{
    public SuperMan(String man) {
        super(man);
    }

    @Override
    void tomarRaioDaMorte() {
        System.out.println("Superman está vivo!");
    }

    void voar(){
        System.out.println("É um pássaro? É um avião? Não, é o Superman!");
    }
}
