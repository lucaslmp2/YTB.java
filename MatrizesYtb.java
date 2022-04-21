/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrizesytb;

/**
 *
 * @author lucasnoreirapacheco
 */
public class MatrizesYtb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int vet[][] = new int [10][2];
        
        for(int i=0;i<vet.length;i++){
            for(int j=0;j<vet[i].length;j++){
            vet[i][j]=i+j;
            }
        }
        for(int i=0; i<vet.length;i++){
            for(int j=0;j<vet[i].length;j++){
                System.out.println(vet[i][j]);
            }
    }
    }
    
}
