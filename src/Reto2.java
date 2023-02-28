import java.util.Scanner;

public class Reto2 {
    public static void main(String[] args) {
        Scanner lectura= new Scanner (System.in);
        Double pesobebe, mesesbebe, vacuna  ;
        System.out.println("ingrese el peso del bebe  ");
        pesobebe = lectura.nextDouble();
        System.out.println("ingrese cuantos mese tiene el bebe");
        mesesbebe = lectura.nextDouble();
        vacuna=(pesobebe+10 / mesesbebe*10)*8 ;
        if (mesesbebe<12) {
           System.out.println("la dosis es "+vacuna); 
        }else {
            System.out.println("su bebe es mayor a un año ");
        }
        

        lectura.close(); 
        }
    }

