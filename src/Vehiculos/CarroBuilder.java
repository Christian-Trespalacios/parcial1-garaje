package Vehiculos;

public class CarroBuilder {
    private String color;
    private String referencia = "";
    private int velocidadMaxima = 0;
    private int numeroP = 0;

    public CarroBuilder(){

    }
    public CarroBuilder setColor(String color){
        this.color = color;
        return this;
    }

    public CarroBuilder setReferencia(String referencia) {
        this.referencia = referencia;
        return this;
    }

    public CarroBuilder setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
        return this;
    }

    public CarroBuilder setNumeroP(int numeroP) {
        this.numeroP = numeroP;
        return this;
    }

    public Carro build(){return new Carro(color,referencia,velocidadMaxima,numeroP);}
}
