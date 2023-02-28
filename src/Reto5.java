import java.util.Scanner;

public class Reto5 {
    public static void main(String[] args) {
        Scanner lectura =  new Scanner(System.in);
        String nombre, apellido,nombrecompleto;
        
       
        System.out.println("ingrese su nombre ");
        nombre=lectura.next();
        System.out.println("ingrese su apellido ");
        apellido=lectura.next();

        int longitud = nombre.length(); 
        int longitud2 = apellido.length();
        System.out.println("el numero de caracterez del nombre es "+longitud+" y el numero de caracterez del apellido es "+longitud2);
        nombrecompleto=nombre+apellido;
        System.out.println("el nombre completo es "+nombrecompleto);
        
        System.out.println(nombre.toUpperCase()+" "+apellido.toLowerCase());
        System.out.println(nombre.substring(0,2)+apellido);

lectura.close();
    }
    
}
