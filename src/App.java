import java.util.Scanner;
public class App {
   
    public static void main(String[] args){ 
        double ancho, largo, presupuesto,area;
        System.out.println("ingrese el ancho");

        Scanner lectura =new Scanner(System.in);
        ancho= lectura.nextDouble();
        System.out.println("ingrese el largo");
        largo= lectura.nextDouble();
        area = largo*ancho;
        presupuesto=45000*area;
        System.out.println( " la superficie a cubrir tiene "+ancho+" metros de ancho x "+largo+" metros de largo, con "+area+" metros cuadrados, el presupuesto del proyecto es $ "+presupuesto );
        lectura.close();
      
    }
}
