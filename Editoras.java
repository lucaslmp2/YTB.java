
package auladeorientacaoaobjetos;

/**
 *
 * @author lucasmoreirapacheco
 */
public class Editoras {
    private int codEditora;
    private String razaoSocial;
    private String contato;
    private String telefone;
    
    public Editoras(){}
    
    public Editoras(int codigo){
    this.codEditora = codigo;
    }

    public void setCodEditora(int codigo) {
        this.codEditora = codigo;
    }
    
    /**
     * @return the codEditora
     */
    public int getCodEditora() {
        return this.codEditora;
    }

 

    /**
     * @return the razaoSocial
     */
    public String getRazaoSocial() {
        return razaoSocial;
    }

    /**
     * @param razaoSocial the razaoSocial to set
     */
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    /**
     * @return the contato
     */
    public String getContato() {
        return contato;
    }

    /**
     * @param contato the contato to set
     */
    public void setContato(String contato) {
        this.contato = contato;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
   
    public String toString(){
    return ("Codigo da editora: "+this.getCodEditora()+"\nRazao Social: "+this.getRazaoSocial()+"\nEndereco: "+this.getContato()+"\nTelefone: "+this.getTelefone());
    }
    
}
