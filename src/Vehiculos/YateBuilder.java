package Vehiculos;

public class YateBuilder {
    private String color;
    private String referencia = "";
    private int velocidadMaxima = 0;
    private int pesoM = 0;

    public YateBuilder(){

    }

    public YateBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public YateBuilder setReferencia(String referencia) {
        this.referencia = referencia;
        return this;
    }

    public YateBuilder setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
        return this;
    }

    public YateBuilder setPesoM(int pesoM) {
        this.pesoM = pesoM;
        return this;
    }

    public Yate build(){return new Yate(color,referencia,velocidadMaxima,pesoM);}
}
