import java.util.Scanner;
public class Reto7 {
    public static void main(String[] args) throws Exception {
     int valor,descuento,colors,total=0;     
 Scanner lectura = new Scanner(System.in);
 colors=(int)(Math.random()*10+1);
;
System.out.println("ingrese el valor de su compra");
valor=lectura.nextInt();

if (valor<=50000){  
}
switch (colors){
    case 1:
    System.out.println("obtuviste el 10% de descuento en el valor de tu compra");
    total=valor-(valor*100)/10;
    break;
    case 2:
    System.out.println("obtuviste el 30% en el valor de tu compra");
    total=valor*100/30;
    break;
    case 3:
    System.out.println("obtuviste el 30% en el valor de tu compra");
    total=valor-(valor*100)/30;
    break;
    case 4:
    System.out.println("obtuviste el 30% en el valor de tu compra");
    total=valor-(valor*100)/30;
    break;
    case 5:
    System.out.println("obtuviste el 50% en el valor de tu compra");
    total=valor-(valor*100)/50;
    break;
    case 6:
    System.out.println("obtuviste el 50% en el valor de tu compra");
    total=valor-(valor*100)/50;
    break;
    case 7:
    System.out.println("obtuviste el 50% en el valor de tu compra");
    total=valor-(valor*100)/50;
    break;
    case 8:
    System.out.println("obtuviste el 50% en el valor de tu compra");
    total=valor-(valor*100)/50;
    break;
    case 9:
    System.out.println("obtuviste el 50% en el valor de tu compra");
    total=valor-(valor*100)/50;
    break;
    case 10:
    System.out.println("tu compra es gratis felicidades!!");
    total=valor-0;
    break;
    default:
}
System.out.println("el total de su compra es de"+total);
lectura.close();
}

}





