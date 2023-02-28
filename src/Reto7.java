import java.util.Scanner;

public class Reto7 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int compra, descuento, pelota, total ;
        System.out.println("ingres su compra ");
        compra=lectura.nextInt();
        pelota=(int)(Math.random()*4+1);
        descuento=0;
        
        total=compra-descuento;
        if (compra>50000 && pelota==1) {descuento=(compra/100)*10;  total=compra-descuento; System.out.println("felicitaciones utt ha sacado un descuento del 10% ya que saco una pelota roja por lo tanto el valor de su compra es "+total);
    }  else 
        if (compra>50000 && pelota==2) {descuento=(compra/100)*30; total=compra-descuento; System.out.println("felicitaciones utt ha sacado un descuento del 30% ya que saco una pelota azul por lo tanto el valor de su compra es"+total);
    }  else 
        if (compra>50000 && pelota==3) {descuento=(compra/100)*50; total=compra-descuento; System.out.println("felicitaciones utt ha sacado un descuento del 50% ya que saco una pelota amarilla  por lo tanto el valor de su compra es"+total);
    }   else
        if (compra>50000 && pelota==4) {descuento=(compra/100)*100; total=compra-descuento; System.out.println("felicitaciones utt ha sacado un descuento del 100% ya que saco una pelota blanca  por lo tanto el valor de su compra es"+total);
    } else 
     {System.out.println("su compra no es superior a 50000 por lo tanto no recibiras un descuento ");}


    }
}
