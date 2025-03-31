import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int[] arreglo = {10, 9, 21, 5, 15, 2, -1, 0};

        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        // Instanciar Metodos

        MetodoBurbuja mB = new MetodoBurbuja();
        MetodoBurbujaMejorado mBM = new MetodoBurbujaMejorado();
        MetodoSeleccion mS = new MetodoSeleccion();
        MetodoInsercion mI = new MetodoInsercion();

        while (continuar) {
            System.out.println("-- Seleccione una opción: --");
            System.out.println("1. Metodo Burbuja");
            System.out.println("2. Metodo Seleccion");
            System.out.println("3. Metodo Insercion");
            System.out.println("4. Metodo Burbuja Mejorado");
            System.out.println("5. Salir");

            int opcion = getPositve(sc, "");
            sc.nextLine();

            if (opcion == 5) {
                System.out.println("Saliendo");
                continuar = false;
                break;
            }
            System.out.println("-".repeat(20));

            String[] posibles = {"A", "D", "True", "False"};
            String orden = getValidString(sc, posibles, "Desea ver los valores de manera: Ascendente (A) o Descendente? (D)");
            String pasos = getValidString(sc, posibles, "Ver pasos (True), No ver pasos (False)?");
            System.out.println("-".repeat(20));
            switch (opcion) {

                case 1:
                    if (orden.equalsIgnoreCase("A") && pasos.equalsIgnoreCase("True")) {
                        int[] arregloBurbuja = arreglo.clone();
                        System.out.println("-- Metodo Burbuja Pasos --");
                        int[] respuestaBurbuja = mB.ascedenteBurbujaPasos(arregloBurbuja);
                        System.out.println("-".repeat(20));
                        System.out.print("Arreglo original -> ");
                        mB.imprimirBurbuja(arreglo);
                        System.out.print("El arreglo ordenado es -> ");
                        mB.imprimirBurbuja(arregloBurbuja);
                        System.out.println("Comparaciones -> " + respuestaBurbuja[0] + " | Cambios -> " + respuestaBurbuja[1]);
                        System.out.println("-".repeat(20));

                    } else if (orden.equalsIgnoreCase("A") && pasos.equalsIgnoreCase("False")) {
                        int[] arregloBurbuja = arreglo.clone();
                        System.out.print("Arreglo original -> ");
                        mB.imprimirBurbuja(arreglo);
                        System.out.print("El arreglo ordenado es -> ");
                        mB.ordenar(arregloBurbuja, false);
                        mB.imprimirBurbuja(arregloBurbuja);
                        int comparaciones = mB.ascenenteBurbuja(arregloBurbuja);
                        System.out.println("Comparaciones: " + comparaciones);
                        System.out.println("-".repeat(20));

                    } else if (orden.equalsIgnoreCase("D") && pasos.equalsIgnoreCase("True")) {
                        int[] arregloBurbuja = arreglo.clone();
                        System.out.println("-- Metodo Burbuja Pasos --");
                        int[] respuestaBurbuja = mB.descedenteBurbujaPasos(arregloBurbuja);
                        System.out.println("-".repeat(20));
                        System.out.print("Arreglo original -> ");
                        mB.imprimirBurbuja(arreglo);
                        System.out.print("El arreglo ordenado es -> ");
                        mB.imprimirBurbuja(arregloBurbuja);
                        System.out.println("Comparaciones -> " + respuestaBurbuja[0] + " | Cambios -> " + respuestaBurbuja[1]);
                        System.out.println("-".repeat(20));
                    } else if (orden.equalsIgnoreCase("D") && pasos.equalsIgnoreCase("False")) {
                        int[] arregloBurbuja = arreglo.clone();
                        System.out.print("Arreglo original -> ");
                        mB.imprimirBurbuja(arreglo);
                        System.out.print("El arreglo ordenado es -> ");
                        mB.ordenar(arregloBurbuja, true);
                        mB.imprimirBurbuja(arregloBurbuja);
                        int comparaciones = mB.descendenteBurbuja(arreglo);
                        System.out.println("Comparaciones: " + comparaciones);
                        System.out.println("-".repeat(20));
                    }
                    break;
                case 2:
                    if (orden.equalsIgnoreCase("A") && pasos.equalsIgnoreCase("True")) {
                        int[] arregloSeleccion = arreglo.clone();
                        System.out.println("-- Metodo Seleccion Pasos --");
                        int[] respuestaSeleccion = mS.ascendenteSeleccionPasos(arregloSeleccion);
                        System.out.println("-".repeat(20));
                        System.out.print("Arreglo original -> ");
                        mS.imprimirSeleccion(arreglo);
                        System.out.print("El arreglo ordenado es -> ");
                        mS.imprimirSeleccion(arregloSeleccion);
                        System.out.println("Comparaciones -> " + respuestaSeleccion[0] + " | Cambios -> " + respuestaSeleccion[1]);
                        System.out.println("-".repeat(20));
                    } else if (orden.equalsIgnoreCase("A") && pasos.equalsIgnoreCase("False")) {
                        int[] arregloSeleccion = arreglo.clone();
                        System.out.print("Arreglo original -> ");
                        mS.imprimirSeleccion(arreglo);
                        mS.ordenar(arregloSeleccion, true);
                        System.out.print("El arreglo ordenado es -> ");
                        mS.imprimirSeleccion(arregloSeleccion);
                        int comparaciones = mS.ascendenteSeleccion(arregloSeleccion);
                        System.out.println("Comparaciones: " + comparaciones);
                        System.out.println("-".repeat(20));
                    } else if (orden.equalsIgnoreCase("D") && pasos.equalsIgnoreCase("True")) {
                        int[] arregloSeleccion = arreglo.clone();
                        System.out.println("-- Metodo Seleccion Pasos --");
                        int[] respuestaSeleccion = mS.descdenteSeleccionPasos(arregloSeleccion);
                        System.out.println("-".repeat(20));
                        System.out.print("Arreglo original -> ");
                        mS.imprimirSeleccion(arreglo);
                        System.out.print("El arreglo ordenado es -> ");
                        mS.imprimirSeleccion(arregloSeleccion);
                        System.out.println("Comparaciones -> " + respuestaSeleccion[0] + " | Cambios -> " + respuestaSeleccion[1]);
                        System.out.println("-".repeat(20));
                    } else if (orden.equalsIgnoreCase("D") && pasos.equalsIgnoreCase("False")) {
                        int[] arregloSeleccion = arreglo.clone();
                        System.out.print("Arreglo original -> ");
                        mS.imprimirSeleccion(arreglo);
                        System.out.print("El arreglo ordenado es -> ");
                        mS.ordenar(arregloSeleccion, false);
                        mS.imprimirSeleccion(arregloSeleccion);
                        int comparaciones = mS.descendeteSeleccion(arregloSeleccion);
                        System.out.println("Comparaciones: " + comparaciones);
                        System.out.println("-".repeat(20));
                    }
                    break;
                case 3:
                    if (orden.equalsIgnoreCase("A") && pasos.equalsIgnoreCase("True")) {
                        int[] arregloInsercion = arreglo.clone();
                        System.out.println("-- Metodo Insercion Pasos --");
                        int[] respuestaInsercion = mI.ascendenteInsercionPasos(arregloInsercion);
                        System.out.println("-".repeat(20));
                        System.out.print("Arreglo original -> ");
                        mI.imprimirInsercion(arreglo);
                        System.out.print("El arreglo ordenado es -> ");
                        mS.imprimirSeleccion(arregloInsercion);
                        System.out.println("Cambios -> " + respuestaInsercion[0] + " | Comparaciones -> " + respuestaInsercion[1]);
                        System.out.println("-".repeat(20));
                    } else if (orden.equalsIgnoreCase("A") && pasos.equalsIgnoreCase("False")) {
                        int[] arregloInsercion = arreglo.clone();
                        System.out.print("Arreglo original -> ");
                        mI.imprimirInsercion(arreglo);
                        System.out.print("El arreglo ordenado es -> ");
                        mI.ordenar(arregloInsercion, false);
                        mI.imprimirInsercion(arregloInsercion);
                        int comparaciones = mI.descendeteInsercion(arregloInsercion);
                        System.out.println("Comparaciones: " + comparaciones);
                        System.out.println("-".repeat(20));
                    } else if (orden.equalsIgnoreCase("D") && pasos.equalsIgnoreCase("True")) {
                        int[] arregloInsercion = arreglo.clone();
                        System.out.println("-- Metodo Insercion Pasos --");
                        int[] respuestaInsercion = mI.descendenteInsercionPasos(arregloInsercion);
                        System.out.println("-".repeat(20));
                        System.out.print("Arreglo original -> ");
                        mI.imprimirInsercion(arreglo);
                        System.out.print("El arreglo ordenado es -> ");
                        mS.imprimirSeleccion(arregloInsercion);
                        System.out.println("Cambios -> " + respuestaInsercion[0] + " | Comparaciones -> " + respuestaInsercion[1]);
                        System.out.println("-".repeat(20));
                    } else if (orden.equalsIgnoreCase("D") && pasos.equalsIgnoreCase("False")) {
                        int[] arregloInsercion = arreglo.clone();
                        System.out.print("Arreglo original -> ");
                        mI.imprimirInsercion(arreglo);
                        mI.ordenar(arregloInsercion, false);
                        System.out.print("El arreglo ordenado es -> ");
                        mS.imprimirSeleccion(arregloInsercion);
                        int comparaciones = mI.ascendeteInsercion(arregloInsercion);
                        System.out.println("Comparaciones: " + comparaciones);
                        System.out.println("-".repeat(20));
                    }
                    break;
                case 4:
                    if (orden.equalsIgnoreCase("A") && pasos.equalsIgnoreCase("True")) {
                        int[] arregloBurbujaMejorado = arreglo.clone();
                        System.out.println("-- Metodo Burbuja Pasos --");
                        int[] respuestaBurbujaMejorado = mBM.ascendenteBurbujaMejoradoPasos(arregloBurbujaMejorado);
                        System.out.println("-".repeat(20));
                        System.out.print("Arreglo original -> ");
                        mBM.imprimirBurbujaMejorado(arreglo);
                        System.out.print("El arreglo ordenado es -> ");
                        mBM.imprimirBurbujaMejorado(arregloBurbujaMejorado);
                        System.out.println("Comparaciones -> " + respuestaBurbujaMejorado[0] + " | Cambios -> " + respuestaBurbujaMejorado[1]);
                        System.out.println("-".repeat(20));
                    } else if (orden.equalsIgnoreCase("A") && pasos.equalsIgnoreCase("False")) {
                        int[] arregloBurbujaMejorado = arreglo.clone();
                        System.out.print("Arreglo original -> ");
                        mBM.imprimirBurbujaMejorado(arreglo);
                        System.out.print("El arreglo ordenado es -> ");
                        mBM.ordenar(arregloBurbujaMejorado, true);
                        mBM.imprimirBurbujaMejorado(arregloBurbujaMejorado);
                        int comparaciones = mBM.ascendenteBurbujaMejorado(arregloBurbujaMejorado);
                        System.out.println("Comparaciones: " + comparaciones);
                        System.out.println("-".repeat(20));
                    } else if (orden.equalsIgnoreCase("D") && pasos.equalsIgnoreCase("True")) {
                        int[] arregloBurbujaMejorado = arreglo.clone();
                        System.out.println("-- Metodo Burbuja Mejorado Pasos --");
                        int[] respuestasBurbujaMejorado = mBM.descendenteBurbujaMejoradoPasos(arregloBurbujaMejorado);
                        System.out.println("-".repeat(20));
                        System.out.print("Arreglo original -> ");
                        mBM.imprimirBurbujaMejorado(arreglo);
                        System.out.print("El arreglo ordenado es -> ");
                        mBM.imprimirBurbujaMejorado(arregloBurbujaMejorado);
                        System.out.println("Comparaciones -> " + respuestasBurbujaMejorado[0] + " | Cambios -> " + respuestasBurbujaMejorado[1]);
                        System.out.println("-".repeat(20));
                    } else if (orden.equalsIgnoreCase("D") && pasos.equalsIgnoreCase("False")) {
                        int[] arregloBurbujaMejorado = arreglo.clone();
                        System.out.print("Arreglo original -> ");
                        mBM.imprimirBurbujaMejorado(arreglo);
                        System.out.print("El arreglo ordenado es -> ");
                        mBM.ordenar(arregloBurbujaMejorado, false);
                        mBM.imprimirBurbujaMejorado(arregloBurbujaMejorado);
                        int comparaciones = mBM.descendenteBurbujaMejorado(arregloBurbujaMejorado);
                        System.out.println("Comparaciones: " + comparaciones);
                        System.out.println("-".repeat(20));
                    }
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
    }

    public static String getValidString(Scanner scanner, String[] posibles, String message) {
        String input;
        boolean valido;
        do {
            System.out.print(message + ": ");
            input = scanner.next();
            valido = false;
            for (String posible : posibles) {
                if (input.equalsIgnoreCase(posible)) {
                    valido = true;
                    break;
                }
            }

        } while (!valido);
        return input;
    }

    public static int getPositve(Scanner scanner, String message) {
        int number;
        do {
            System.out.print(message + ": ");
            number = scanner.nextInt();
            if (number <= 0) {
                System.out.println("El número debe ser positivo. Intente nuevamente.");
            }
        } while (number <= 0);
        return number;
    }
}