package itemdebiblioteca;

/**
 *
 * @author lucasmoreirapachêco
 */
public class Livro implements ItemDeBiblioteca {

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
