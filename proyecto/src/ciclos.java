import java.util.Scanner;
public class ciclos{

    public static void main(String[] args) {
        
    Scanner leer=new Scanner(System.in);
    int precio,cantidad,contador,subtotal,acumulador,billete,total,cuenta;


contador=0; acumulador=0;
    for( int x=1; x<5; x++){

    System.out.println("digite el precio del producto ");
    precio=leer.nextInt();
    System.out.println("digite la cantidad del producto");
    cantidad=leer.nextInt();
    contador=contador+1;
    subtotal=precio*cantidad;
    acumulador=acumulador+subtotal;

}
System.out.println(" el total a pagar es de "+acumulador);
System.out.println("ingrese el valor del billete con el cual va a finalizar su compra");
billete=leer.nextInt();
total=acumulador-billete;
System.out.println("su cambio es "+total);
System.out.println("usted cuenta con telefonia movil exito 1 es si 2 es no" );
cuenta=leer.nextInt();

if(cuenta==1){
    System.out.println("sus minutos sumados a la cantidad de productos son  "+contador);

}
else{
    System.out.println("no cuentas para la suma de productos a tus minutos unete a la telefonia  exito");
}
 leer.close();
}
}
   
   