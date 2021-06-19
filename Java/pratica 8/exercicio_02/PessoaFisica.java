public class PessoaFisica extends Pessoa{

    private int[] cpf;

    public PessoaFisica(String[] nome, int[] cpf) {
        super(nome);
        this.cpf = cpf;
    }

    public int[] getCpf(int[] ii) {
        cpf = ii;
        return cpf;
    }

    public void setCpf(int[] cpf) {
        this.cpf = cpf;
    }

}
