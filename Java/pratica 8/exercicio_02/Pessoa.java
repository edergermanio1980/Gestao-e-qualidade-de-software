public class Pessoa {

    private String[] nome;

    public Pessoa(String[] nome){
        this.nome = nome;
    }

    public String[] getNome(String[] n) {
        nome = n;
        return nome;
    }

    public void setNome(String[] nome) {
        this.nome = nome;
    }
}
