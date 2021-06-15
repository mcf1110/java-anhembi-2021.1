class Main {
    public static void main(String[] args) {
        Horario horario = new Horario(18, 15);

        System.out.println(
                horario
                        .adicionar(new Horario(1, 50))
                        .adicionar(new Minuto(19)));
    }
}