
package piramideunidad4;

import java.util.Scanner;

public class PiramideUnidad4 {
    public static void main(String[] args) {
        Scanner numfilas= new Scanner (System.in);
        System.out.println(" ingrese las letras");
        int filas=numfilas.nextInt();
        
        for (int i = 0; i <=filas; i++) {
            System.out.print(" ");
            for (int j = 0; j <=filas-i; j++) {
                
            }
            for (int j = 0; j < 1*i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    
}
