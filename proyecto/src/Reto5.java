import java.util.Scanner;

import java.util.Scanner;

public class Reto5 {
    public static void main(String[] args) {
        Scanner lectura=new Scanner(System.in);
        String nombre,apellido,juntar;
 System.out.println("ingrese su nombre en mayuscula");
nombre=lectura.nextLine();
 System.out.println("ingrese su apellido en minuscula");
apellido=lectura.nextLine();
int contador=nombre.length();
int contar=apellido.length();
System.out.println("los caracteres de su nombre son "+contador+" y los de su apellido son "+contar);
System.out.println("su nombre completo es "+nombre+apellido);
juntar=nombre.substring(0,2)+apellido;
System.out.println("su nombre abreviado es "+juntar);
 lectura.close();
    }
    
}
