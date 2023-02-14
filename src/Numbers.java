import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner lectura= new Scanner (System.in); 
        int number1, number2, number3; 
        System.out.println(" ingrese el primer numero ");
        number1=lectura.nextInt();
        System.out.println ("ingrese su segundo numero ");
        number2=lectura.nextInt();
        if (number1>number2) {number3=number1+number2; System.out.println("el numero "+number1+" es mayor que "+number2+" la suma entre estos dos numeros "+number3); } 
    else{  number3=number1-number2; System.out.println("el numero "+number1+" es menor que "+number2+" la resta entre estos dos numeros "+number3);} 
    lectura.close ();


}
}
