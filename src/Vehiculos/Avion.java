package Vehiculos;

public class Avion extends Vehiculo {

    private int altitudMaxima;

    public Avion(String color, String referencia, int velocidadMaxima, int altitudM){
        super(color, referencia, velocidadMaxima);
        this.altitudMaxima = altitudM;
    }

}
