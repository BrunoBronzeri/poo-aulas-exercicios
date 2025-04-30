public class CadastroPessoas {
    
    Pessoa[] pessoas;
    int qtdAtual;

    public CadastroPessoas(int tamanho) {
        pessoas = new Pessoa[tamanho];
        qtdAtual = 0;
    }

    void cadastraPessoa(Pessoa p) {
        if (qtdAtual < pessoas.length) {
            pessoas[qtdAtual++] = p;
        } else {
            System.out.println("Cadastro cheio!");
        }
    }

    void imprimeCadastro() {
        for (int i = 0; i < qtdAtual; i++) {
            pessoas[i].imprimeDados();
        }
    }
}
