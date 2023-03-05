import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class dados {
    public static void main(String[] args) {
        Scanner lectura=new Scanner(System.in);
    System.out.println("craps apuestas a un solo tiro");
        Random R1=new Random();
        int dado1=1+R1.nextInt(6);
        int dado2=1+R1.nextInt(6);
        int tiro=dado1+dado2;
        System.out.println("Los dados son " + dado1 +" y " + dado2 );
        System.out.println("EL RESULTADO ES: " + tiro);
if(tiro==2){ 
System.out.println("ganaste");
}
if(tiro==3){
    System.out.println("ganaste");
}
if(tiro==12){
    System.out.println("ganaste");
}
if(tiro==11){
    System.out.println("ganaste");
}
if(tiro==7){
    System.out.println("ganaste");
}
else{
    System.out.println("perdiste");
}
}
    }

