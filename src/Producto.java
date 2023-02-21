import java.util.Scanner;

public class Producto {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int precio, cantidad, contador, subtotal, acumulador, pago, cambio ;
        String telefonia;
        contador=0; acumulador=0;
        for (int x=1; x<=5; x++) {
            System.out.println("digite el precio del producto ");
            precio=leer.nextInt();
            System.out.println("digite la cantidad del producto ");
            cantidad=leer.nextInt();
            contador=contador+1;
            subtotal=precio*cantidad;
            acumulador= acumulador+subtotal ;
             

            
            


        }
        
        System.out.println("su subtotal es  "+acumulador);
         System.out.println("ingrese valor de  pago");
         pago=leer.nextInt();
         cambio=pago-acumulador;
       System.out.println("su cambio es "+cambio);
       System.out.println("utt maneja telefonia exito ?");
       telefonia=leer.next();
       if (telefonia.equals("si")) {
        System.out.println("utt ha odtenido "+contador+" minutos en su compra ");
       } else {
        System.out.println("no pierdas mas minutos adquiere tu telefonia exito");
       }
       leer.close();

    }
}
