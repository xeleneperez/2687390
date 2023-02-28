package estructuradatos;

import java.util.Scanner;

public class MisArrays{
    public static void main(String[] args) {
        //Declaracion e inicializacion de un array
        int[] vector1;
        vector1=new int[10];
        // int[] vector1=new int [10]
        //rellenar vector
        int[] vector={30,50,25,85,12,6,32,41,23,63};
        //se puede de manuera manual 
 vector1[6]=32;
for(int p=0;p<vector.length;p++){
System.out.println(vector[p]);
}
// mostrar datos del array con for mejorado solo para imprimir
for (int i : vector) {
    System.out.println(i);
}
Scanner lectura=new Scanner(System.in);
//Rellenar unn arrray de forma dinamica
for(int p=0;p<vector.length;p++){
    System.out.println("digite el dato de la posicion "+p);
    vector1[p]=lectura.nextInt();

    for (int i :vector1){   
        System.out.println();
    }
}
 lectura.close();
}
}