import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner lectura= new Scanner (System.in); 
        Double numero1, numero2, resultado, resultado2;
        int op;
        System.out.println(" ingrese su primer numero ");
        numero1=lectura.nextDouble();
        System.out.println(" ingrese su segundo numero ");
        numero2=lectura.nextDouble();
       
         
        System.out.println("1.Suma  2.Resta 3.Multiplicacion 4.Divicion 5.Potencia 6.Radicacion ");
        op=lectura.nextInt();

        switch(op){

            case 1:
            resultado=numero1+numero2;
            System.out.println("la Suma ente los numeros "+numero1+" y "+numero2+" es "+resultado);
            break; 

            case 2:
            resultado=numero1-numero2;
            System.out.println("la Resta ente los numeros "+numero1+" y "+numero2+" es "+resultado);
            break; 

            case 3 :
            resultado=numero1*numero2;
            System.out.println( "la Multiplicacion  ente los numeros "+numero1+" y "+numero2+" es "+resultado);
            break; 

            case 4 :
            resultado=numero1/numero2;
            System.out.println( "la Divicio ente los numeros "+numero1+" y "+numero2+" es "+resultado);
            break;
                
            case 5:
            resultado= Math.pow(numero1, numero2);
             System.out.println(+numero1+" elevado a"+numero2+"igual a"+resultado);
            break;


            case 6:
            resultado= Math.sqrt(numero1);
            resultado2=Math.sqrt(numero2);
             System.out.println("la raiz cuadrada de "+numero1+" es "+resultado);
             System.out.println("la raiz cuadra de "+numero2+" es el"+resultado2);
            break;

                default:
                System.out.println("la opcion no es valida");
                    break;
            }
            lectura.close();
            }
            
            

        }

        
    
