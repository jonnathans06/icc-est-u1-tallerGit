public class MetodoSeleccion {

    public void ordenar(int[] arreglo, boolean isDes) {
        if (isDes) {
            ascendenteSeleccion(arreglo);
        } else {
            descendeteSeleccion(arreglo);
        }
    }

    public int ascendenteSeleccion(int[] arreglo) {
        int n = arreglo.length;
        int comparaciones = 0;

        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                comparaciones++;
                if (arreglo[minIdx] > arreglo[j]) {
                    minIdx = j;
                }
            }
            if (minIdx != i) {
                int aux = arreglo[minIdx];
                arreglo[minIdx] = arreglo[i];
                arreglo[i] = aux;
            }
        }
        return comparaciones;
    }

    public int descendeteSeleccion(int[] arreglo) {
        int n = arreglo.length;
        int comparaciones = 0;
        for (int i = 0; i < n - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < n; j++) {
                comparaciones++;
                if (arreglo[maxIdx] < arreglo[j]) {
                    maxIdx = j;
                }
            }
            if (maxIdx != i) {
                int aux = arreglo[maxIdx];
                arreglo[maxIdx] = arreglo[i];
                arreglo[i] = aux;
            }
        }
        return comparaciones;
    }

    public int[] ascendenteSeleccionPasos(int[] arreglo) {
        int n = arreglo.length;
        int pasos = 0;
        int cambios = 0;
        int comparaciones = 0;

        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            pasos++;
            System.out.println("\t\tPaso " + (pasos) + ":");
            for (int j = i + 1; j < n; j++) {
                comparaciones++;
                System.out.println("Comparación: " + (comparaciones) + " | " + arreglo[minIdx] + " > " + arreglo[j] + " | ");
                if (arreglo[minIdx] > arreglo[j]) {
                    minIdx = j;
                }
            }
            if (minIdx != i) {
                cambios++;
                System.out.println("\nCambio: " + (cambios) + " | " + arreglo[i] + " <-> " + arreglo[minIdx] + " | ");
                int aux = arreglo[minIdx];
                arreglo[minIdx] = arreglo[i];
                arreglo[i] = aux;
            } else {
                System.out.println("No hay cambios");
            }
            System.out.print("Estado actual del arreglo: ");
            for (int k = 0; k < n; k++) {
                System.out.print(arreglo[k] + " ");
            }
            System.out.println("\n");
        }

        int[] respuesta = {cambios, comparaciones};
        return respuesta;
    }

    public int[] descdenteSeleccionPasos(int[] arreglo) {
        int n = arreglo.length;
        int pasos = 0;
        int cambios = 0;
        int comparaciones = 0;

        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            pasos++;
            System.out.println("\t\tPaso " + (pasos) + ":");
            for (int j = i + 1; j < n; j++) {
                comparaciones++;
                System.out.println("Comparación: " + (comparaciones) + " | " + arreglo[minIdx] + " < " + arreglo[j] + " | ");
                if (arreglo[minIdx] < arreglo[j]) {
                    minIdx = j;
                }
            }
            if (minIdx != i) {
                cambios++;
                System.out.println("\nCambio: " + (cambios) + " | " + arreglo[i] + " <-> " + arreglo[minIdx] + " | ");
                int aux = arreglo[minIdx];
                arreglo[minIdx] = arreglo[i];
                arreglo[i] = aux;
            } else {
                System.out.println("No hay cambios");
            }
            System.out.print("Estado actual del arreglo: ");
            for (int k = 0; k < n; k++) {
                System.out.print(arreglo[k] + " ");
            }
            System.out.println("\n");
        }

        int[] respuesta = {cambios, comparaciones};
        return respuesta;
    }

    public void imprimirSeleccion(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " - ");
        }
        System.out.println();
    }
}
