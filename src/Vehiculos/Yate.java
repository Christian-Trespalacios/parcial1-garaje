package Vehiculos;

import Vehiculos.Vehiculo;

public class Yate extends Vehiculo {

    private int pesoMaximo;

    public Yate(String color, String referencia, int velocidadMaxima, int pesoM){
        super(color, referencia, velocidadMaxima);
        this.pesoMaximo=pesoM;
    }
}
