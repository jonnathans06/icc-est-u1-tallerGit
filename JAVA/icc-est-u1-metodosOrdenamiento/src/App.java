import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

     int[] arreglo = {10, 9, 21, 5, 15, 2, -1, 0};
     

        MetodoBurbuja metodoBurbujaClase = new MetodoBurbuja();
        MetodoSeleccion metodoSeleccionClase = new MetodoSeleccion();
        MetodoInsersion metodoInsersion = new MetodoInsersion();
        MetodoBurbujaMejorado metodoBurbujaMejorado = new MetodoBurbujaMejorado();

        metodoBurbujaMejorado.ordenarBurbuja(arreglo);
        metodoBurbujaMejorado.imprimirArrglo(arreglo);
        // MetodoBurbujaMejorado metodoBurbujaMejorado = new MetodoBurbujaMejorado();
        
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("-- Elija una opcion --");
            System.out.println();
            System.out.println("1. Burbuja (Ascendente) ");
            System.out.println("2. Burbuja (Descendente)");
            System.out.println("3. Seleccion (Ascendente)");
            System.out.println("4. Seleccion (Descendente)");
            System.out.println("5. Insercion (Ascendente)");
            System.out.println("6. Insersion (Descente)");
            System.out.println("7. Salir");
            int metodo = getPositive(sc, "\t ingrese la opcion correcta" );
                        
            if (metodo == 7) {
                System.out.println("--- Saliendo del programa ---");
                continuar = false;
                break;
            }

            String[] posibles = {"A", "D"};

            String orden = getValidString(sc, posibles, "Desea ordenar ascendente (A) o descendente (D)");
            

            switch (metodo){
                
                case 1:
                    System.out.println("-- Metodo Burbuja --\n");
                    metodoBurbujaClase.ordenar(arreglo, false);
                    metodoBurbujaClase.imprimirArrglo(arreglo);
                    System.out.println();
                    break;

                case 2:
                    System.out.println("-- Metodo Seleccion --\n");
                    metodoBurbujaClase.ordenar(arreglo, true);
                    metodoBurbujaClase.imprimirArrglo(arreglo);
                    System.out.println();
                    break;

                case 3:
                    System.out.println("-- Metodo Insercion--\n");
                    metodoSeleccionClase.ordenarAsdseleccion(arreglo);
                    metodoSeleccionClase.imprimirArrglo(arreglo);
                    System.out.println();
                    break;  
                
                case 4:
                    System.out.println("-- Metodo Seleccion (Descendente) -- \n");
                    metodoSeleccionClase.ordenarSeleccion(arreglo);
                    metodoSeleccionClase.imprimirArrglo(arreglo);
                    System.out.println();
                    break;
                    
                case 5:
                    System.out.println("-- Metodo Insersion (Ascendente)  --");
                    metodoInsersion.ordearInsercionAscendente(arreglo);
                    metodoInsersion.imprimirInsercion(arreglo);
                    System.out.println();
                    break;

                case 6:
                    System.out.println("-- Metodo Insersion (Descendente) --");
                    metodoInsersion.ordearInsercionDescendente(arreglo);
                    metodoInsersion.imprimirInsercion(arreglo);
                    System.out.println();
                    break;

                default:
                    System.out.println("-- Opcion Incorrecta--");
                    System.out.println();

            }      
        }
    }

    public static int getPositive (Scanner sc, String message){
        System.out.println("Ingrese un numero positivo");
        int number;

        do {
            System.out.print(message + ": ");
            number = sc.nextInt();
            if (number <= 0){
                System.out.println("El numero debe ser un numero positivo. Intente nuevamente.");
            }

        } while (number <= 0);
        return number;
    }

    public static String getValidString (Scanner sc, String[] posibles, String message){
        String input;
        boolean valido;
        do {
            System.out.println(message + ": ");
            input = sc.nextLine();
            valido = false;
            
            for (String posible : posibles) {
                if(input.equalsIgnoreCase(posible)){
                    valido = true;
                    break;
                }
            }
        } while (!valido);
        return input;
    }
}
