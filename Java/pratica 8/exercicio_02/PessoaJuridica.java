public class PessoaJuridica extends Pessoa{

    private int[] cnpj;

    public PessoaJuridica(String nome[], int cnpj[]) {
        super(nome);
        this.cnpj = cnpj;
    }

    public int[] getCpnj(int[] ii) {
        cnpj = ii;
        return cnpj;
    }

    public void setCpnj(int[] cnpj) {
        this.cnpj = cnpj;
    }
}
