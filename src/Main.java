import Vehiculos.Vehiculo;

public class Main {

    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo();

        while (true) {
            int opcionMenu = vehiculo.menuGaraje();

            if (opcionMenu == 1) {
                vehiculo.menuAddVehiculo();
            }

            if (opcionMenu == 2) {
                vehiculo.mostrarGaraje();
            }

            if (opcionMenu == 3) {
                System.exit(0);
            }
        }

    }
    
}