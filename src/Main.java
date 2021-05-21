public class Main {
    public static void main(String[] args) {
        Canhao canhao = new Canhao();
        canhao.setBala(new Bala());
        canhao.disparar(10, 45);
        System.out.println(canhao.getAlcanceMaximo());

        canhao.setBala(new Bala());
        canhao.disparar(10, 30);
        System.out.println(canhao.getAlcanceMaximo());

        canhao.setBala(new Bala());
        canhao.disparar(10, 60);
        System.out.println(canhao.getAlcanceMaximo());
    }
}

