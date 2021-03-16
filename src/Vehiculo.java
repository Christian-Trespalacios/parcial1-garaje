import java.util.ArrayList;
import java.util.Scanner;


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

    public void definirColor(String colorS){
        Enum enume = new Enum();
        if(colorS == "NEGRO" || colorS == "negro"){
            setColor(enume.NEGRO);
        }
        if(colorS == "BLANCO" || colorS == "blanco"){
            setColor(enume.BLANCO);
        }
        if(colorS == "AZUL" || colorS == "azul"){
            setColor(enume.AZUL);
        }
        if(colorS == "VERDE" || colorS == "verde"){
            setColor(enume.VERDE);
        }
        if(colorS == "GRIS" || colorS == "gris"){
            setColor(enume.GRIS);
        }
    }
    public void addAvion(String color, String referencia, int velocidadMaxima, int altitudM){
        definirColor(color);
        setReferencia(referencia);
        setVelocidadMaxima(velocidadMaxima);
        Avion avion = new Avion(getColor(), getReferencia(), getVelocidadMaxima(), altitudM);
        if(vehiculos.size()<10){
            vehiculos.add(avion);
        }else{
            System.out.println("No se pueden agregar mas aviones, garaje lleno");
        }
    }

    public void addYate(String color, String referencia, int velocidadMaxima, int pesoM){
        definirColor(color);
        setReferencia(referencia);
        setVelocidadMaxima(velocidadMaxima);
        Yate yate = new Yate(getColor(), getReferencia(), getVelocidadMaxima(), pesoM);
        if(vehiculos.size()<10){
            vehiculos.add(yate);
        }else{
            System.out.println("No se pueden agregar mas yate, garaje lleno");
        }

    }
    public void addCarro(String color, String referencia, int velocidadMaxima, int numeroP){
        definirColor(color);
        setReferencia(referencia);
        setVelocidadMaxima(velocidadMaxima);
        Carro carro = new Carro(getColor(), getReferencia(), getVelocidadMaxima(), numeroP);
        if(vehiculos.size()<10){
            vehiculos.add(carro);
        }else{
            System.out.println("No se pueden agregar mas carros, garaje lleno");
        }
    }

    public void mostrarGaraje(){
        if(vehiculos.isEmpty()){
            System.out.println("Garaje vacio");
        }else{
            for(int i=0; i<vehiculos.size();i++){
                Vehiculo vehiculo = vehiculos.get(i);
                System.out.println("----------------------\n"
                        +"Vehiculo #"+i+1+"\n"
                        +"Color: " + vehiculo.getColor()+"\n"
                        +"Referencia: " + vehiculo.getReferencia()+"\n"
                        +"Velocidad Maxima: " + String.valueOf(vehiculo.getVelocidadMaxima()) + "\n"
                        +"---------------------------------------");
            }
        }

    }

    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo();
        Scanner scan = new Scanner(System.in);

        while(true){
            int opcion = 0;

            System.out.println("Bienvenido a tu garaje, que deseas hacer?\n"
                    +"1.Agregar Vehiculo\n"
                    +"2.Mostrar Garaje\n"
                    +"3.Salir");
            opcion = scan.nextInt();

            if(opcion==1){
                Scanner scanVehiculos = new Scanner(System.in);
                System.out.println("Ingrese de 1 a 4 dependiendo del vehiculo que quiera agregar\n"
                        +"1.Avion\n"
                        +"2.Yate\n"
                        +"3.Carro\n"
                        +"4.salir");
                int opcionVehiculos = 0;
                opcionVehiculos = scan.nextInt();
                if(opcionVehiculos == 1){
                    System.out.print("Ingrese el color: ");
                    String color = scanVehiculos.nextLine();
                    System.out.print("Ingrese la referencia: ");
                    String referencia = scanVehiculos.nextLine();
                    System.out.print("Ingrese la velocidad maxima: ");
                    int vmaxima = scanVehiculos.nextInt();
                    System.out.print("Ingrese la altura maxima: ");
                    int amaxima = scanVehiculos.nextInt();
                    vehiculo.addAvion(color, referencia, vmaxima, amaxima);
                }
                if(opcionVehiculos == 2){
                    System.out.print("Ingrese el color: ");
                    String color = scanVehiculos.nextLine();
                    System.out.print("Ingrese la referencia: ");
                    String referencia = scanVehiculos.nextLine();
                    System.out.print("Ingrese la velocidad maxima: ");
                    int vmaxima = scanVehiculos.nextInt();
                    System.out.print("Ingrese el peso maximo: ");
                    int pmaximo = scanVehiculos.nextInt();
                    vehiculo.addYate(color, referencia, vmaxima, pmaximo);
                }
                if(opcionVehiculos == 3){
                    System.out.print("Ingrese el color: ");
                    String color = scanVehiculos.nextLine();
                    System.out.print("Ingrese la referencia: ");
                    String referencia = scanVehiculos.nextLine();
                    System.out.print("Ingrese la velocidad maxima: ");
                    int vmaxima = scanVehiculos.nextInt();
                    System.out.print("Ingrese el numero de puertas: ");
                    int npuertas = scanVehiculos.nextInt();
                    vehiculo.addCarro(color,referencia,vmaxima,npuertas);
                }
                if(opcionVehiculos == 4){
                    System.exit(0);
                }
            }

            if(opcion == 2){
                vehiculo.mostrarGaraje();
            }

            if(opcion == 3){
                System.exit(0);
            }

        }

    }

}
