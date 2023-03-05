import java.util.Scanner;
import javax.lang.model.util.ElementScanner14;

public class Reto2 {
public static void main(String[] args) {
    Scanner lectura=new Scanner(System.in);
    double edad,peso,dosisvacun;
    System.out.println("ingrese la edad de su bebe  en meses");
    edad=lectura.nextDouble();
System.out.println("ingrese el peso de su bebe en kg");
peso=lectura.nextDouble();
peso=peso+10;
edad= edad*10;
dosisvacun= (peso/edad)*8;
    if(edad>=12){
    System.out.println("su bebe debe aplicarse una dosis ");
    System.out.println("la dosis a aplicar es de "+dosisvacun+" mg");
    }
    else { System.out.println("no es apto para el plan de vacunacion");}

   
    lectura.close();
}
}
