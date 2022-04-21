/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package auladeselecao;

import java.util.Scanner;

/**
 *
 * @author lucasnoreirapacheco
 */
public class AulaDeSelecao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double nota;
     
        Scanner ler = new Scanner(System.in);
    
        System.out.println("Digite uma nota");
        nota = ler.nextInt();
        if (nota>=60){
            System.out.println("Aprovado!!!");
            return;
        }
        if(nota<60&&nota>=40){
                System.out.println("Recuperação!!!");
        }else{
            System.out.println("Reprovado!!!");
        }
    }
    
}
