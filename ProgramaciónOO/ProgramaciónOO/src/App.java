import java.util.Scanner;
//Nombre: Ninfa Isabel Rodríguez Briceño
//Carnet: 2024-1649U

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner op = new Scanner(System.in);

        Auto auto = new Auto("Toyota", "Corolla", 2020, 15000, 5, "Gasolina");

        Camion camion = new Camion("Volvo", "FH", 2019, 75000, 20000, 4);

        

        System.out.println("Información del Auto");
        auto.mostrarInfo();
        

        System.out.println("\nInformación del camion:");
        camion.mostrarInfo();


        System.out.println();
        try {
            System.out.println("Desea realizar mantenimiento? presiona:");
            System.out.println("1. si");
            System.out.println("2. No");
            System.out.println("");
            int opcionMantenimiento = op.nextInt();
            switch (opcionMantenimiento) {
                case 1:
                    System.out.println("Desea realizar mantenimiento al Auto o al camion?");
                    System.out.println("(Presiona 1 o 2 respectivamente)");
                    System.out.println("");
                    int opcionVehiculo = op.nextInt();
                    switch (opcionVehiculo) {
                        case 1:
                            System.out.println("Mantenimiento del Auto");
                            auto.realizarMantenimiento();
                            System.out.println();
                            auto.CalcularCostoMantenimiento(15, 50);
                            
                            break;
    
                        case 2:
                            System.out.println("Mantenimiento del Camión");
                            camion.realizarMantenimiento();
    
                            break;
                    
                        default:
                            System.out.println("Opción invalida, intentelo denuevo");
                            break;
                    }
                    break;
    
                case 2:
                    System.out.println("Saliendo.....");
    
                    break;
            
                default:
                    System.out.println("Opción no valida intentelo denuevo");
                    break;
            }
    } catch (Exception e) {
            System.out.println("Ocurrio un error, intentelo denuevo");
        }
    }   
}
