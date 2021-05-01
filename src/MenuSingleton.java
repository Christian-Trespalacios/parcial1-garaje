public class MenuSingleton {
    private static MenuSingleton MenuSingleton;
    private String menuGaraje;
    private String menuAgregarVehiculo;


    private MenuSingleton(){
        this.menuGaraje = "Bienvenido a tu garaje, que deseas hacer?\n"
                +"1.Agregar Vehiculo\n"
                +"2.Mostrar Garaje\n"
                +"3.Salir";
        this.menuAgregarVehiculo =  "Ingrese de 1 a 4 dependiendo del vehiculo que quiera agregar\n"
                +"1.Avion\n"
                +"2.Yate\n"
                +"3.Carro\n"
                +"4.salir";
    }
    public static MenuSingleton getInstance(){
        if(null == MenuSingleton){
            MenuSingleton = new MenuSingleton();
        }
        return MenuSingleton;
    }

    public String getMenuGaraje(){return this.menuGaraje;}

    public String getMenuAgregarVehiculo(){return this.menuAgregarVehiculo;}

}
