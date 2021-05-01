package Vehiculos;

public class AviónBuilder {
    private String color;
    private String referencia = "";
    private int velocidadMaxima = 0;
    private int altitudM = 0;


    public AviónBuilder(){

    }

    public AviónBuilder setcolor(String color){
        this.color = color;
        return this;
    }

    public AviónBuilder setReferencia(String referencia) {
        this.referencia = referencia;
        return this;
    }

    public AviónBuilder setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
        return this;
    }

    public AviónBuilder setAltitudM(int altitudM) {
        this.altitudM = altitudM;
        return this;
    }

    public Avion build(){ return new Avion(color,referencia,velocidadMaxima,altitudM);}

}
