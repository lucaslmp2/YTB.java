package auladeorientacaoaobjetos;

/**
 *
 * @author lucasmoreirapacheco
 */
public class Livros {
    private int codigo;
    private String descLivro;
    private String ISBN;
    private Editoras editora;
    
    public Livros(){}
    
    public Livros(int codigo){
    this.codigo = codigo;
    }
    public Livros(String descricao){
        this.descLivro = descricao;
    }
    public Livros(String ISBN, String descricao){
    this.ISBN = ISBN;
    this.descLivro = descricao;
    }

   
    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the descLivro
     */
    public String getDescLivro() {
        return descLivro;
    }

    /**
     * @param descLivro the descLivro to set
     */
    public void setDescLivro(String descLivro) {
        this.descLivro = descLivro;
    }

    /**
     * @return the ISBN
     */
    public String getISBN() {
        return ISBN;
    }

    /**
     * @param ISBN the ISBN to set
     */
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    /**
     * @return the editora
     */
    public Editoras getEditora() {
        return editora;
    }

    /**
     * @param editora the editora to set
     */
    public void setEditora(Editoras editora) {
        this.editora = editora;
    }
   
    
    
    public String toString(){
    return ("Codigo do livro: "+this.getCodigo()+ "\nLivro: " + this.getDescLivro() + "\nISBN do livro: " + this.getISBN() +"\n"+ this.editora.toString());
    }

}
