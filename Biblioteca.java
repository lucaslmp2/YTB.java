package itemdebiblioteca;

/**
 *
 * @author lucasmoreirapachĂȘco
 */
public class Biblioteca {

    /**
     *
     * @param args
     */
    public static void main(String[] args){
    Livro l1 = new Livro();
    l1.disponivel();
    Revista r1 = new Revista();
    r1.emAtraso();
    }
}
