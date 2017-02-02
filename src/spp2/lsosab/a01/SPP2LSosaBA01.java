//Luisa Fernanda Sosa Brambila
//A01411485
//IIS
package spp2.lsosab.a01;
import java.util.Scanner;
/**
 *
 * @author Fernanda
 */
public class SPP2LSosaBA01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Calcular tangente, seno y coseno ");
        Scanner tec= new Scanner(System.in);
        double a, res;
        int op;
        
        System.out.println("Introduzca el número de la opción deseada: ");
        System.out.println("1.Calcular Tangente");
        System.out.println("2.Calcular Seno");
        System.out.println("3.Calcular Coseno");
        System.out.println("4.Salir");
        op= tec.nextInt();
        
        switch (op){
            case 1:
                System.out.println("Usted a ingresado a Calculo de Tangente");
                res= Math.tan(datos());
                mRes(res,"La tangente ");
                break;
            case 2:
                System.out.println("Usted a ingresado a Calculo de Seno");
                res= Math.sin(datos());
                mRes(res,"El seno ");
                break;
            case 3:
                System.out.println("Usted a ingresado a Calculo de Coseno");
                res= Math.cos(datos());
                mRes(res,"El coseno ");
                break;
            default:
                System.out.println("Bye :)");           
    }
        
        
          
        
    }
    static double datos (){ 
        double a;
        Scanner tec= new Scanner(System.in);
    System.out.println("Ingrese medida del angulo");
        a= tec.nextDouble();
        double aR = Math.toRadians(a);
        return aR;
    }
    static void mRes(double res,String dato){
        System.out.println(dato + "es igual a: " + res);
    }
    
}
