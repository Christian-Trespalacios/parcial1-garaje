package Vehiculos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Vehiculo {

    private String color;
    private String referencia;
    private int velocidadMaxima;
    private ArrayList<Vehiculo> vehiculos;

    public Vehiculo() {
        vehiculos = new ArrayList<>();
    }


    public Vehiculo(String color, String referencia, int velocidadMaxima) {
        this.color = color;
        this.referencia = referencia;
        this.velocidadMaxima = velocidadMaxima;

    }
    public List<Vehiculo>ordenarVehiculosPorVelocidadMax(){

        List<Vehiculo> NuevoArray=vehiculos.stream().sorted(Comparator.comparing(Vehiculo::getVelocidadMaxima)).collect(Collectors.toList());

        return NuevoArray;

    }

    public List<Vehiculo>ListarVehiculosNegroAzul(){

        List<Vehiculo> NuevoArray=vehiculos.stream()
                .filter(Vehiculo -> Vehiculo.getColor().equals("NEGRO") || Vehiculo.getColor().equals("AZUL")).map(Vehiculo -> new Vehiculo(Vehiculo.getReferencia(),Vehiculo.getColor(),Vehiculo.getVelocidadMaxima())).collect(Collectors.toList());

        return NuevoArray;
    }

    public String ConcatRefVehiculosBlancoVerde(){

        String RefConcat="";

        List<Vehiculo> NuevoArray=vehiculos.stream()
                .filter(Vehiculo -> Vehiculo.getColor().equals("BLANCO") || Vehiculo.getColor().equals("VERDE")).map(Vehiculo -> new Vehiculo(Vehiculo.getReferencia(),Vehiculo.getColor(),Vehiculo.getVelocidadMaxima())).collect(Collectors.toList());

        for (int i=0;i<NuevoArray.size();i++) {
            RefConcat=RefConcat + NuevoArray.get(i).getReferencia();
        }

        return RefConcat;
    }

    public String VelocidadMaxima(){
        Optional<Vehiculo> VelocidadMax=vehiculos.stream().max(Comparator.comparing(Vehiculo::getVelocidadMaxima));
        return "VEHICULO ES: " + VelocidadMax.get().getReferencia() + " VELOCIDAD MAXIMA ES:   " + VelocidadMax.get().getVelocidadMaxima();
    }


    public String VelocidadMinima(){
        Optional<Vehiculo> VelocidadMin=vehiculos.stream().min(Comparator.comparing(Vehiculo::getVelocidadMaxima));
        return "VEHICULO ES: " + VelocidadMin.get().getReferencia() + "VELOCIDAD MINIMA ES:  " + VelocidadMin.get().getVelocidadMaxima();
    }



    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public void addAvion(){
        Scanner scanVehiculos = new Scanner(System.in);
        Enum enu = new Enum();
        if(vehiculos.size()<10){
            System.out.print("Ingrese el color: ");
            String colorAvion = scanVehiculos.nextLine();
            if(colorAvion == "NEGRO" || colorAvion == "negro"){
                colorAvion=enu.NEGRO;
            }
            if(colorAvion == "BLANCO" || colorAvion == "blanco"){
                colorAvion=enu.BLANCO;
            }
            if(colorAvion == "AZUL" || colorAvion == "azul"){
                colorAvion=enu.AZUL;
            }
            if(colorAvion == "VERDE" || colorAvion == "verde"){
                colorAvion=enu.VERDE;
            }
            if(colorAvion == "GRIS" || colorAvion == "gris"){
                colorAvion=enu.GRIS;
            }

            setColor(colorAvion);
            System.out.print("Ingrese la referencia: ");
            setReferencia(scanVehiculos.nextLine());
            System.out.print("Ingrese la velocidad maxima: ");
            setVelocidadMaxima(scanVehiculos.nextInt());
            System.out.print("Ingrese la altura maxima: ");
            int amaxima = scanVehiculos.nextInt();
            Avion avion = new Avion(getColor(), getReferencia(), getVelocidadMaxima(), amaxima);

            vehiculos.add(avion);
        }else{
            System.out.println("No se pueden agregar mas carros, garaje lleno");
        }
    }

    public void addYate(){
        Scanner scanVehiculos = new Scanner(System.in);
        Enum enu = new Enum();
        if(vehiculos.size()<10){
            System.out.print("Ingrese el color: ");
            String colorYate = scanVehiculos.nextLine();
            if(colorYate == "NEGRO" || colorYate == "negro"){
                colorYate=enu.NEGRO;
            }
            if(colorYate == "BLANCO" || colorYate == "blanco"){
                colorYate=enu.BLANCO;
            }
            if(colorYate == "AZUL" || colorYate == "azul"){
                colorYate=enu.AZUL;
            }
            if(colorYate == "VERDE" || colorYate == "verde"){
                colorYate=enu.VERDE;
            }
            if(colorYate == "GRIS" || colorYate == "gris"){
                colorYate=enu.GRIS;
            }
            setColor(colorYate);
            System.out.print("Ingrese la referencia: ");
            setReferencia(scanVehiculos.nextLine());
            System.out.print("Ingrese la velocidad maxima: ");
            setVelocidadMaxima(scanVehiculos.nextInt());
            System.out.print("Ingrese la peso maximo: ");
            int pesoM = scanVehiculos.nextInt();

            Yate yate = new Yate(getColor(), getReferencia(), getVelocidadMaxima(), pesoM);

            vehiculos.add(yate);
        }else{
            System.out.println("No se pueden agregar mas carros, garaje lleno");
        }

    }

    public void addCarro(){
        Scanner scanVehiculos = new Scanner(System.in);
        Enum enu = new Enum();
        if(vehiculos.size()<10){
            System.out.print("Ingrese el color: ");
            String colorCarro = scanVehiculos.nextLine();
            if(colorCarro == "NEGRO" || colorCarro == "negro"){
                colorCarro=enu.NEGRO;
            }
            if(colorCarro == "BLANCO" || colorCarro == "blanco"){
                colorCarro=enu.BLANCO;
            }
            if(colorCarro == "AZUL" || colorCarro == "azul"){
                colorCarro=enu.AZUL;
            }
            if(colorCarro == "VERDE" || colorCarro == "verde"){
                colorCarro=enu.VERDE;
            }
            if(colorCarro == "GRIS" || colorCarro == "gris"){
                colorCarro=enu.GRIS;
            }
            setColor(colorCarro);
            System.out.print("Ingrese la referencia: ");
            setReferencia(scanVehiculos.nextLine());
            System.out.print("Ingrese la velocidad maxima: ");
            setVelocidadMaxima(scanVehiculos.nextInt());
            System.out.print("Ingrese la numero de puertas: ");
            int nPuertas = scanVehiculos.nextInt();

            Carro carro = new Carro(getColor(), getReferencia(), getVelocidadMaxima(), nPuertas);

            vehiculos.add(carro);
        }else{
            System.out.println("No se pueden agregar mas carros, garaje lleno");
        }
    }

    public void mostrarGaraje(){
        if(vehiculos.isEmpty()){
            System.out.println("garaje vacio");
        }else{
            for(int i=0; i<vehiculos.size();i++){
                Vehiculo vehiculo = vehiculos.get(i);
                System.out.println("----------------------\n"
                        +"Vehiculo #"+(i+1)+"\n"
                        +"color: " + vehiculo.getColor()+"\n"
                        +"referencia: " + vehiculo.getReferencia()+"\n"
                        +"velocidad maxima: " + String.valueOf(vehiculo.getVelocidadMaxima()) + "\n"
                        +"---------------------------------------");
            }
        }

    }


    public int menuGaraje(){
        Scanner scan = new Scanner(System.in);
        int opcion = 0;

        System.out.println("Bienvenido a tu garaje, que deseas hacer?\n"
                +"1.Agregar Vehiculo\n"
                +"2.Mostrar Garaje\n"
                +"3.Salir");
        opcion = scan.nextInt();

        return opcion;
    }

    public int menuAgregarVehiculo(){
        Scanner scan = new Scanner(System.in);
        int opcion = 0;

        System.out.println("Ingrese de 1 a 4 dependiendo del vehiculo que quiera agregar\n"
                +"1.Avion\n"
                +"2.Yate\n"
                +"3.Carro\n"
                +"4.salir");
        opcion = scan.nextInt();

        return opcion;
    }


    public void menuAddVehiculo(){
        int opcionVehiculos = menuAgregarVehiculo();

        if(opcionVehiculos == 1){
            addAvion();
        }
        if(opcionVehiculos == 2){
            addYate();
        }
        if(opcionVehiculos == 3){
            addCarro();
        }
        if(opcionVehiculos == 4){
            System.exit(0);
        }
    }

}

