public class MetodoBurbujaMejorado {
    public void ordenarBurbuja (int arreglo[]){
           
        int n = arreglo.length;

        for (int i= 0; i < n - 1 - i; i++){
            for (int j= 0; j < n - 1; j++){
                if (arreglo[j] > arreglo[j + 1]){
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[(j + 1)] = aux;
                    

                }
            }
        }
    }

    public void imprimirArrglo (int [] arreglo){
        for(int i = 0; i < arreglo.length; i++){
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }
    
}