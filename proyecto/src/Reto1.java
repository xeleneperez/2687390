import java.util.Scanner;
public class Reto1 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        int frh, cls;
        System.out.println("Ingrese una temperatura Farenheit que desea pasar a Celcius: ");
        frh = lectura.nextInt();
        cls = (frh - 32) * 5/9;
        System.out.println(frh + "°F son " + cls + "°C");


        
        lectura.close();
}
}
