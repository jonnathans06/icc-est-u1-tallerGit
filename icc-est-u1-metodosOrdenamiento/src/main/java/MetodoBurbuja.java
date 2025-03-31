public class MetodoBurbuja {

    public void ordenar(int[] arreglo, boolean isDes) {
        if (isDes) {
            descendenteBurbuja(arreglo);
        } else {
            ascenenteBurbuja(arreglo);
        }
    }

    public int ascenenteBurbuja(int[] arreglo) {
        int n = arreglo.length;
        int aux;
        int comparaciones = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                comparaciones++;
                if (arreglo[i] > arreglo[j]) {
                    aux = arreglo[j];
                    arreglo[j] = arreglo[i];
                    arreglo[i] = aux;
                }
            }
        }
        return comparaciones;
    }

    public int descendenteBurbuja(int[] arreglo) {
        int n = arreglo.length;
        int aux;
        int comparaciones = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                comparaciones++;
                if (arreglo[i] < arreglo[j]) {
                    aux = arreglo[j];
                    arreglo[j] = arreglo[i];
                    arreglo[i] = aux;
                }
            }
        }
        return comparaciones;
    }

    public int[] ascedenteBurbujaPasos(int[] arreglo) {
        int n = arreglo.length;
        int comparaciones = 0;
        int cambios = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                comparaciones++;
                System.out.println("Comparación N°: " + comparaciones + " | " + arreglo[i] + " > " + arreglo[j] + " | ");
                if (arreglo[i] > arreglo[j]) {
                    System.out.println("Cambio N°: " + (cambios + 1) + " | " + arreglo[i] + " < > " + arreglo[j] + " | ");

                    int aux;
                    aux = arreglo[j];
                    arreglo[j] = arreglo[i];
                    arreglo[i] = aux;
                    cambios++;

                } else {
                    System.out.println("No hay cambios");
                }
                System.out.print("Estado actual del arreglo: ");
                for (int k = 0; k < n; k++) {
                    System.out.print(arreglo[k] + " ");
                }
                System.out.println("\n");
            }
        }
        int[] respuesta = {comparaciones, cambios};
        return respuesta;
    }

    public int[] descedenteBurbujaPasos(int[] arreglo) {
        int n = arreglo.length;
        int comparaciones = 0;
        int cambios = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                comparaciones++;
                System.out.println("Comparación N°: " + comparaciones + " | " + arreglo[i] + " > " + arreglo[j] + " | ");
                if (arreglo[i] < arreglo[j]) {
                    System.out.println("Cambio N°: " + (cambios + 1) + " | " + arreglo[i] + " < > " + arreglo[j] + " | ");

                    int aux;
                    aux = arreglo[j];
                    arreglo[j] = arreglo[i];
                    arreglo[i] = aux;
                    cambios++;

                } else {
                    System.out.println("No hay cambios");
                }
                System.out.print("Estado actual del arreglo: ");
                for (int k = 0; k < n; k++) {
                    System.out.print(arreglo[k] + " ");
                }
                System.out.println("\n");
            }
        }
        int[] respuesta = {comparaciones, cambios};
        return respuesta;
    }

    public void imprimirBurbuja(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " - ");
        }
        System.out.println();
    }
}