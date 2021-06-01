import Vehiculos.Vehiculo;

import java.util.*;

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

                System.out.println("\n LA VELOCIDAD MAXIMA ES: " + vehiculo.VelocidadMaxima());

                System.out.println("\n LA VELOCIDAD MINIMA ES: " + vehiculo.VelocidadMinima());

                System.out.println("\n");

                System.out.println("\n VELOCIDAD DE MAYOR A MENOR");


                List<Vehiculo> lVeh=vehiculo.ordenarVehiculosPorVelocidadMax();

                for (int i=lVeh.size()-1;i>=0;i--) {
                    System.out.println("\n Referencia: " + lVeh.get(i).getReferencia() + " / Color: " +lVeh.get(i).getColor() + " / " +lVeh.get(i).getVelocidadMaxima());
                }

                System.out.println("\n");


                System.out.println("\n FILTRADO POR COLOR AZUL y NEGRO");


                List<Vehiculo> lFiltroAN=vehiculo.ListarVehiculosNegroAzul();

                for (int i=lFiltroAN.size()-1;i>=0;i--) {
                    System.out.println("\n Referencia: " + lFiltroAN.get(i).getReferencia() + " / Color: " +lFiltroAN.get(i).getColor() + " / " +lFiltroAN.get(i).getVelocidadMaxima());
                }

                System.out.println("\n");

                System.out.println("\n FILTRADO POR BLANCO Y VERDE");

                System.out.println(vehiculo.ConcatRefVehiculosBlancoVerde());

                System.out.println("\n");
            }

            if (opcionMenu == 3) {
                System.exit(0);
            }
        }


    }

}
