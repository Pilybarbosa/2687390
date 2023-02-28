import java.util.Scanner;

public class budget {
public static void main(String[] args) {
    Scanner lectura= new Scanner(System.in);
    int spent, budget,  op ;
    op=1; budget= 100000;
    while (op== 1 ) {
        System.out.println("ingese su gasto ");
        spent=lectura.nextInt();
        System.out.println("desea registrar otro gasto? 1.si 2.no");
        op=lectura.nextInt();
    
        budget=budget-spent ;
        
        System.out.println("su presupuesto es de "+budget);
        while (spent<=2) {
        System.out.println("yanoppuedemasxd");
            
        }
    }
}    
}
