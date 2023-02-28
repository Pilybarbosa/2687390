import java.util.Scanner;

public class Reto6 {
    public static void main(String[] args) {
        int given1, given2,  total;
        Scanner lectura  = new Scanner(System.in);

        given1=(int)(Math.random()*6+1);
        given2=(int)(Math.random()*6+1);
        total=given1+given2;
        if (total==3)   {
    System.out.println("el resultado del primer dado "+given1+" y el resultado del segundo dado  "+given2+" es igual al total "+total+" felicitaciones utt ha ganado");
    }  else 
      
        if (total==2) {System.out.println("el resultado del primer dado "+given1+" y el resultado del segundo dado  "+given2+" es igual al total "+total+" felicitaciones utt ha ganado");
    }  else 
        if (total==11) {System.out.println("el resultado del primer dado "+given1+" y el resultado del segundo dado  "+given2+" es igual al total "+total+" felicitaciones utt ha ganado");
    }  else
        if (total==12 || total==2) {System.out.println("el resultado del primer dado "+given1+" y el resultado del segundo dado  "+given2+" es igual al total "+total+" felicitaciones utt ha ganado");
    }  else 
        if (total==7) {System.out.println("el resultado del primer dado "+given1+" y el resultado del segundo dado  "+given2+" es igual al total "+total+" felicitaciones utt ha ganado");
    }   else  {System.out.println("utt no ha ganado ");
     
}
    }
        }
