public class MetodoBurbujaMejorado {
    public void ordenar(int[] arreglo, boolean isDes) {
        if (isDes) {
            ascendenteBurbujaMejorado(arreglo);
        } else {
            descendenteBurbujaMejorado(arreglo);
        }
    }

    public int ascendenteBurbujaMejorado(int[] arreglo) {

        int n = arreglo.length;
        int comparaciones = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                comparaciones++;
                if (arreglo[i] > arreglo[j]) {
                    int aux = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = aux;
                }
            }
        }
        return comparaciones;
    }

    public int descendenteBurbujaMejorado(int[] arreglo) {
        int n = arreglo.length;
        int comparaciones = 0;

        for (int i = 0; i < n - i; i++) {
            for (int j = 0; j < n - 1; j++) {
                comparaciones++;
                if (arreglo[j] < arreglo[j + 1]) {
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[(j + 1)] = aux;


                }
            }
        }
        return comparaciones;
    }

    public int[] ascendenteBurbujaMejoradoPasos(int[] arreglo) {
        int n = arreglo.length;
        int cambios = 0;
        int comparaciones = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                comparaciones++;
                System.out.println("Comparación N°: " + comparaciones + " | " + arreglo[i] + " > " + arreglo[j] + " | ");
                if (arreglo[i] > arreglo[j]) {
                    System.out.println("Cambio N°: " + (cambios + 1) + " | " + arreglo[i] + " < > " + arreglo[j] + " | ");
                    int aux = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = aux;
                    cambios++;
                } else {
                    System.out.println("No hay cambios");
                }
                for (int k = 0; k < n; k++) {
                    System.out.print(arreglo[k] + " ");
                }
                System.out.println("\n");
            }
        }
        int[] respuesta = {comparaciones, cambios};
        return respuesta;
    }

    public int[] descendenteBurbujaMejoradoPasos(int[] arreglo) {

        int n = arreglo.length;
        int cambios = 0;
        int comparaciones = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                comparaciones++;
                System.out.println("Comparación N°: " + comparaciones + " | " + arreglo[i] + " > " + arreglo[j] + " | ");
                if (arreglo[i] < arreglo[j]) {
                    System.out.println("Cambio N°: " + (cambios + 1) + " | " + arreglo[i] + " < > " + arreglo[j] + " | ");
                    int aux = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = aux;
                    cambios++;
                } else {
                    System.out.println("No hay cambios");
                }
                for (int k = 0; k < n; k++) {
                    System.out.print(arreglo[k] + " ");
                }
                System.out.println("\n");
            }
        }
        int[] respuesta = {comparaciones, cambios};
        return respuesta;
    }

    public void imprimirBurbujaMejorado(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }

}