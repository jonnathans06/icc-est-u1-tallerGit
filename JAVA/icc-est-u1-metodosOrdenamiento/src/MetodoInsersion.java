public class MetodoInsersion {
    public void ordearInsercionAscendente (int arreglo[]){ // Crear metodo de ordenamiento ascendente 
        
        int pos;
        
        for (int i = 1; i < arreglo.length; i++){
            pos = i; 
            int aux = arreglo[i];

            while ((pos > 0) && (arreglo[pos-1] > aux)) {
                arreglo[pos] = arreglo[pos-1];
                pos--;
            }
            arreglo[pos] = aux;
        }
    }
    
    public void ordearInsercionDescendente (int arreglo[]){ // Crear metodo de ordenamiento descendente 
        int pos;
        
        for (int i = 1; i < arreglo.length; i++){
            pos = i; 
            int aux = arreglo[i];

            while ((pos > 0) && (arreglo[pos-1] < aux)) {
                arreglo[pos] = arreglo[pos-1];
                pos--;
            }
            arreglo[pos] = aux;
        }
    }


    public void imprimirInsercion (int [] arreglo){ // Imprimir metodo
        for(int i = 0; i < arreglo.length; i++){
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }

}

