import java.util.Scanner;

public class preosupuesto {
    public static void main(String[] args) {
        Scanner lectura= new Scanner(System.in) ;
        int spent,budget,total,op;
        total=0; op=1; budget=100000;
        while(op==1){
           
            System.out.println("ingrese el gasto");
            spent=lectura.nextInt(); total= total+1;
            if(total<=3){
budget=budget-spent;
System.out.println("El gasto fue de"+spent);
System.out.println("el preosupuesto restante es"+budget);
System.out.println("Desea registrar otro gasto 1si 2no");
op= lectura.nextInt();

} else{
    System.out.println("ya cumpliste tu total de gastos");
    System.out.println("ya ha finalizado su trasaccion");
}

        }



        lectura.close(); 
 
    }
  
}
