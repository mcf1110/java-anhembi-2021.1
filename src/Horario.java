public class Horario {
    private Hora hora;
    private Minuto minuto;

    Horario() {
        this(0, 0);
    }

    Horario(int h) {
        this(h, 0);
    }

    Horario(int h, int m) {
        this(new Hora(h), new Minuto(m));
    }

    Horario(Hora h) {
        this(h, new Minuto(0));
    }

    Horario(Minuto m) {
        this(new Hora(0), m);
    }

    Horario(Hora h, Minuto m) {
        this.hora = h;
        this.minuto = m;
    }

    public Horario adicionar(Horario outro) {
        int h, m;

        m = this.minuto.getValor() + outro.minuto.getValor();
        h = this.hora.getValor() + outro.hora.getValor() + m / 60;
        m = m % 60;

        return new Horario(h, m);
    }

    public Horario adicionar(Minuto outro) {
        return this.adicionar(new Horario(outro));
    }

    public Horario adicionar(Hora outro) {
        return this.adicionar(new Horario(outro));
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d", hora.getValor(), minuto.getValor());
    }
}
