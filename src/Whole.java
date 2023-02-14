import java.util.Scanner;

public class Whole {
    public static void main(String[] args) {
        Scanner lectura = new Scanner (System.in); 
        int number1 ;
        System.out.println("ingrese el numero ");
        number1= lectura.nextInt();
        
        if (number1==0){ System.out.println  ("el numero es neutro ");
        } else if (number1>0){ 
            System.out.println ("el numero es positivo ");
        } else {
            System.out.println ("el numero es negativo");
        }
        lectura.close();
    }
}
