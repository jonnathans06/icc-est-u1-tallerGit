public class MetodoBurbuja {
    public void ordenarAsendente(int [] arreglo) {
            
        int n = arreglo.length;

        for (int i= 0; i < n; i++){
            for (int j= i+1; j < n; j++){
                System.out.println("i = " + i + " j = " + j);
                if (arreglo[i] > arreglo[j]){
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[i];
                    arreglo[i] = aux;
                    

                }
            }
        }
    }

    public void ordenar (int [] arreglo, boolean isDes){

        int n = arreglo.length;

        for (int i= 0; i < n; i++){
            for (int j= i+1; j < n; j++){
                // System.out.println("i = " + i + " j = " + j);
                if (isDes){
                    if (arreglo[i] < arreglo[j]){
                    
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[i];
                    arreglo[i] = aux;}
                }else{
                    if (arreglo[i] > arreglo[j]){
                        int aux = arreglo[j];
                        arreglo[j] = arreglo[i];
                        arreglo[i] = aux;
                    }    
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

