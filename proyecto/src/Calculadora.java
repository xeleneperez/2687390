import java.io.EOFException;
import java.util.Scanner;
public class Calculator  {

    public static void main(String[]args)throws EOFException{
        Scanner lectura=new Scanner(System.in);
        int numero1, numero2,rest,sum,multiplicacion,division,potencia,raiz,op;

System.out.println(" ingrese  su primer numero");
 numero1=lectura.nextInt();
System.out.println("ingrese su segundo numero");
numero2=lectura.nextInt();
System.out.println("1.suma 2.resta 3.multiplicacion 4.division 5.potencia 6.radiacion");
op=lectura.nextInt();
    switch(op){
        case 1 :
        sum=numero1+numero2;
        System.out.println("La suma de los dijitos es "+sum);
        break;

         case 2 :
         rest= numero1 - numero2;
         System.out.println("la resta de los dijitos " +numero1+" y "+numero2+" es de "+rest);
    break;

case 3 :
multiplicacion=numero1*numero2;
System.out.println("la multiplicacion de los dijitos es de "+multiplicacion);
break;

 case 4 :
 division=numero1/numero2;
 System.out.println("la division de los dijitos es de "+division);
 break;

 case 5 :
 double potenciapow =Math.pow (numero1,numero2);
 System.out.println("la potencia de los dijitos "+numero1+" y "+numero2+" es de "+potenciapow);
 break;

 case 6 :
 double raizSqrt = Math.sqrt(numero1);
 double raizSqrt2 =Math.sqrt(numero2);
 System.out.println("la raiz cuadrada de "+numero1+" es "+raizSqrt);
 System.out.println("la raiz cuadrada de "+numero2+" es "+raizSqrt2);
break;
default:
System.out.println("la opcion no es valida");
break;



    }



        lectura.close();
    



    }

    


}
