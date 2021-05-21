public class Canhao {
    Bala bala;

    public void setBala(Bala bala) {
        this.bala = bala;
    }

    public void disparar(double v0, double alphaDeg){
        double GRAVITY = 9.81;
        double alphaRad = Math.toRadians(alphaDeg);
        double alcance = 2 * v0 * v0 * Math.cos(alphaRad) * Math.sin(alphaRad) / GRAVITY;

        this.bala.setY(0);
        this.bala.setX(alcance);

    }

    public double getAlcanceMaximo(){
        return this.bala.getX();
    }
}
