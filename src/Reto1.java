import java.util.Scanner;

public class Reto1 {
    public static void main(String[] args) throws Exception{
        Scanner lectura = new Scanner (System.in);
        double temperatura1, temperatura2;
        System.out.println("ingrese la temperatura1 engrados centigrados ");
        temperatura1= lectura.nextDouble();
        temperatura2=(temperatura1-32)/1.8 ;
        System.out.println ("la temoperatura en grados  farenheit es "+temperatura2); 

        lectura.close();
    }
   
}
