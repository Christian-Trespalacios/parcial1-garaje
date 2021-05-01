package Vehiculos;

public class Carro extends Vehiculo {

    private int numeroDePuertas;

    public Carro(String color, String referencia, int velocidadMaxima, int numeroP){
        super(color, referencia, velocidadMaxima);
        this.numeroDePuertas=numeroP;
    }
}
