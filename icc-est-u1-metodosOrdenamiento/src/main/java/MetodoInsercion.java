public class MetodoInsercion {

    public void ordenar (int[] arreglo, boolean isDes) {
        if (isDes) {
            ascendeteInsercion(arreglo);
        } else {
            descendeteInsercion(arreglo);
        }
    }

    public int ascendeteInsercion (int[] arreglo){
        int n = arreglo.length;
        int comparaciones = 0;

        for (int i = 1; i < n; i++) {
            int aux = arreglo[i];
            int pos = i;

            comparaciones++;
            while ((pos > 0) && (arreglo[pos - 1] > aux)) {
                arreglo [pos] = arreglo[pos - 1];
                pos --;
            }
            arreglo [pos] = aux;
        }
        return comparaciones;
    }

    public int descendeteInsercion (int[] arreglo){
        int n = arreglo.length;
        int comparaciones = 0;

        for (int i = 0; i < n; i++) {
            int pos = i;
            int aux = i;
            aux = arreglo[i];
            comparaciones++;

            while ((pos > 0) && (arreglo[pos - 1] < aux)) {
                arreglo [pos] = arreglo[pos - 1];
                pos --;
            }
            arreglo [pos] = aux;
        }
        return comparaciones;
    }

    public int[] ascendenteInsercionPasos(int [] arreglo){
        int n = arreglo.length;
        int comparaciones = 0;
        int cambios = 0;

        for (int i = 1; i < n; i++) {
            int aux = arreglo[i];
            int pos = i;
            boolean cambio = false;

            if (pos > 0) {
                comparaciones++;
                System.out.println("Comparacion N°: " + comparaciones + " | " + arreglo[pos - 1] + " > " + aux + " | ");
            }

            while (pos > 0 && arreglo[pos - 1] > aux) {
                arreglo [pos] = arreglo[pos - 1];
                pos --;
                cambio = true;
            }

            if (cambio) {
                arreglo [pos] = aux;
                cambios++;
                System.out.println("Cambio N°: " + cambios + " | " + arreglo[pos] + " < - > " + pos + " | ");
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

    public int[] descendenteInsercionPasos(int [] arreglo){
        int n = arreglo.length;
        int comparaciones = 0;
        int cambios = 0;

        for (int i = 1; i < n; i++) {
            int aux = arreglo[i];
            int pos = i;
            boolean cambio = false;

            if (pos > 0) {
                comparaciones++;
                System.out.println("Comparacion N°: " + comparaciones + " | " + arreglo[pos - 1] + " < " + aux + " | ");
            }

            while (pos > 0 && arreglo[pos - 1] < aux) {
                arreglo [pos] = arreglo[pos - 1];
                pos --;
                cambio = true;
            }

            if (cambio) {
                arreglo [pos] = aux;
                cambios++;
                System.out.println("Cambio N°: " + cambios + " | " + arreglo[pos] + " < - > " + pos + " | ");
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

    public void imprimirInsercion(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " - ");
        }
        System.out.println();
    }
}