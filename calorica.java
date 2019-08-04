import java.util.Scanner;

/**
 * Programa para hallar la capacidad calorica
 * 
 * @author Carlos Alvarez 
 * @version 20190803
 */
public class calorica
{
    public static void main(String[] args)
    {
        double q,m=20,c=207.7,dt;
        
        Scanner Teclado = new Scanner (System.in);
        
        System.out.println("Suponiendo que la masa del agua es 20gr y la capacidad calórica 207.7J/k");
        
        System.out.println("Según lo anterior ingrese el cambio de la temperatura (Delta T) en °C");
        dt = Teclado.nextDouble();
        
        q = m*c*dt;
                 
        System.out.println("Por tanto la energia necesaria es " + q);
    }
}
