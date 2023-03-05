import java.util.Scanner;
public class Reto8 {
    public static void main(String[] args) throws Exception {
        int valortotal,descuento,precio,colors,total=0,op;   
    Scanner lectura = new Scanner(System.in);
    colors=(int)(Math.random()*10+1);
do{
    System.out.println(" ingrese el precio de su producto");
    precio=lectura.nextInt();
    System.out.println("desea agregar otro producto? 1 es si 2 es no");
    op=lectura.nextInt();
valortotal=precio+total;
}while( op==1 );
   if (precio<=50000){  
   }
   switch (colors){
       case 1:
       System.out.println("obtuviste el 10% de descuento en el valor de tu compra");
       total=precio-(precio*10)/100;
       break;
       case 2:
       System.out.println("obtuviste el 30% en el valor de tu compra");
       total=precio-(precio*30)/100;
       break;
       case 3:
       System.out.println("obtuviste el 30% en el valor de tu compra");
       total=precio-(precio*30)/100;
       break;
       case 4:
       System.out.println("obtuviste el 30% en el valor de tu compra");
       total=precio-(precio*30)/100;
       break;
       case 5:
       System.out.println("obtuviste el 50% en el valor de tu compra");
       total=precio-(precio*50)/10200;
       break;
       case 6:
       System.out.println("obtuviste el 50% en el valor de tu compra");
       total=precio-(precio*50)/100;
       break;
       case 7:
       System.out.println("obtuviste el 50% en el valor de tu compra");
       total=precio-(precio*50)/100;
       break;
       case 8:
       System.out.println("obtuviste el 50% en el valor de tu compra");
       total=precio-(precio*50)/100;
       break;
       case 9:
       System.out.println("obtuviste el 50% en el valor de tu compra");
       total=precio-(precio*50)/100;
       break;
       case 10:
       System.out.println("tu compra es gratis felicidades!!");
       total=precio-0;
       break;
       default:
   }
   System.out.println("el total de su compra es de "+total);
   lectura.close();
   }
}
