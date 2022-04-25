/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itemdebiblioteca;

/**
 *
 * @author lucasnoreirapacheco
 */
public class Revista implements ItemDeBiblioteca{

   @Override
     public void disponivel() {
        System.out.println("Tem");
    }

    @Override
    public void emprestado() {
        System.out.println("Não, Tem");
    }

    @Override
    public void emAtraso() {
        System.out.println("Não, Tem");
    }

    @Override
    public void reservado() {
        System.out.println("Não, Tem");
    }
    
}
