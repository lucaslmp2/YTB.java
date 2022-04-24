package auladeorientacaoaobjetos;

import java.util.Scanner;

/**
 *
 * @author lucasmoreirapacheco
 */
public class AulaDeOrientacaoAObjetos {


    public static void main(String[] args) {
        Editoras ed1 = new Editoras();
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Entre com o cod. da editora:");
        ed1.setCodEditora(ler.nextInt());
        ler = new Scanner(System.in);
        System.out.println("Entre com a razao social da editora:");
        ed1.setRazaoSocial(ler.nextLine());
        System.out.println("Entre com o contato da editora:");
        ed1.setContato(ler.nextLine());
        System.out.println("entre com o telefone da editora:");
        ed1.setTelefone(ler.nextLine());
        
        Livros l1 = new Livros();
        
        System.out.println("entre com o cod. do livro:");
        l1.setCodigo(ler.nextInt());
        ler = new Scanner(System.in);
        System.out.println("Entre com a descricao do livro:");
        l1.setDescLivro(ler.nextLine());
        System.out.println("Entre com o ISBN do livro:");
        l1.setISBN(ler.nextLine());
        
        l1.setEditora(ed1);
        System.out.println(l1.toString());
    }
    
}
