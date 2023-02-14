import java.util.Scanner;
public class Number {
    public static void main(String[] args) throws Exception {
int number,number2,suma,resta ;
 Scanner lectura = new Scanner(System.in);
 System.out.println("Ingrese un numero");
 number=lectura.nextInt();
System.out.println("ingrese otro numero");
number2=lectura.nextInt();
if (number>number2) {
    suma = number + number2;
    System.out.println("la suma de los numeros es " + suma);

}

else  {
    resta=number-number2;
    System.out.println("la resta de los numeros es"+ resta);
}

 lectura.close();
}

}
