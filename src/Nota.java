import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Double nota1,nota2, nota3, asistencia, promedio;
        String nombre;
        Scanner lectura=new Scanner (System.in);

        System.out.println("nombre");
        nombre=lectura.next();
        System.out.println(" ingrese su primera nota ");
        nota1=lectura.nextDouble();
        System.out.println(" ingrese su segunda nota ");
        nota2=lectura.nextDouble();
        System.out.println(" ingrese su tercera nota");
        nota3=lectura.nextDouble();
        System.out.println(" ingrese su promedio de asistencia ");
        asistencia=lectura.nextDouble();

        promedio=(nota1+nota2+nota3+asistencia)/3;

        if (promedio>=3.5 && asistencia>=70 || nombre.equals("jenifer")){
            //si condicion se cumple 
            System.out.println("aprobaste "); 

        } else { 
            // si condicion no se cumple 
            System.out.println(" no aprobaste ");
            
        }
        lectura.close();
    }
}
