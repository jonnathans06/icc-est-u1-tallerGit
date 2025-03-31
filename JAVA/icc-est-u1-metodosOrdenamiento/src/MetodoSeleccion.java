public class MetodoSeleccion {

    public void ordenar(int[] arreglo, boolean isDes) {
        if (isDes) {
            ordenarSeleccion(arreglo);
        } else {
            ordenarAsdseleccion(arreglo);
        }
    }

    public void ordenarSeleccion(int[] arreglo) {

        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {

            int maxIdx = i;

            for (int j = i + 1; j < n; j++) {
                // CONDICION PARA ENCONTRAR EL INDICE QUE TIENE EL NUMERO MAYOR
                if (arreglo[maxIdx] < arreglo[j]) {

                    maxIdx = j;

                }

            }

            // CAMBIO

            if (maxIdx != i) {

                int aux = arreglo[maxIdx];
                arreglo[maxIdx] = arreglo[i];
                arreglo[i] = aux;

            }

        }

    }

    public void imprimirArrglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }

    public void ordenarAsdseleccion(int[] arreglo) {

        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {

            int maxIdx = i;

            for (int j = i + 1; j < n; j++) {
                // CONDICION PARA ENCONTRAR EL INDICE QUE TIENE EL NUMERO MAYOR
                if (arreglo[maxIdx] > arreglo[j]) {

                    maxIdx = j;

                }

            }

            // CAMBIO

            if (maxIdx != i) {

                int aux = arreglo[maxIdx];
                arreglo[maxIdx] = arreglo[i];
                arreglo[i] = aux;

            }

        }

    }

}
