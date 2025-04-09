import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        int opcion;
        String marca;
        String modelo;
        int año;
        double precioBase;
        int NumPuertas;
        int cilindraje;


        do{
            System.out.println("""
                    -----MENU OPCIONES-----
                    1. AGREGAR VEHICULO.
                    2. MOSTRAR VEHICULO
                    3. CALCULAR PRECIO FINAL DE VEHICULOS
                    4. SALIR
                    --Seleccione una opcion--
                    """);
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion){
                case 1:
                    System.out.println("¿Es un auto (1) o una moto (2)?");
                    int tipo = teclado.nextInt();
                    System.out.println("Ingrese la marca");
                    marca = teclado.nextLine();
                    System.out.println("Ingrese el modelo");
                    modelo = teclado.nextLine();
                    System.out.println("Ingrese el año");
                    año= teclado.nextInt();;
                    System.out.println("Ingrese el precio base");
                    precioBase = teclado.nextDouble();

                    if (tipo ==1){
                        System.out.println("Indique numero de puertas");
                         NumPuertas = teclado.nextInt();
                        vehiculos.add(new Auto(marca, modelo, año, precioBase, NumPuertas));

                    }else if (tipo == 2){
                        System.out.println("Indique numero cilindraje");
                        cilindraje = teclado.nextInt();
                        vehiculos.add(new Moto(marca, modelo, año, precioBase, cilindraje));

                    }


            case 2:
                if (vehiculos.isEmpty()) {
                    System.out.println("No hay vehículos registrados.");
                } else {
                    System.out.println("Lista de vehículos registrados:");
                    for (Vehiculo v : vehiculos) {
                        System.out.println(v.toString());
                    }
                }
                break;

            case 3:
                if (vehiculos.isEmpty()) {
                    System.out.println("No hay vehículos registrados para calcular el precio final.");
                } else {
                    System.out.println("Precio final de los vehículos:");
                    for (Vehiculo v : vehiculos) {
                        System.out.println(v.getMarca() + " " + v.getModelo() + ": $" + v.calcularPrecioFinal());
                    }
                }
                break;

            case 4:
                System.out.println("Saliendo del sistema...");
                break;

            default:
                System.out.println("Opción inválida. Intente nuevamente.");
        }



        }while (opcion!=4);
            teclado.close();












    }
}