public class TestaCadastro {
    public static void main(String[] args) {
        CadastroPessoas cadastro = new CadastroPessoas(10);

        Data d1 = new Data(1,1,1990);
        Data d2 = new Data(2,2,1985);
        Data d3 = new Data(3,3,1975);
        
        Cliente cliente = new Cliente("Joao", d1, 123);
        Funcionario funcionario = new Funcionario("Maria", d2, 3000f);
        Gerente gerente = new Gerente("Carlos", d3, 5000f, "TI");

        cadastro.cadastraPessoa(cliente);
        cadastro.cadastraPessoa(funcionario);
        cadastro.cadastraPessoa(gerente);

        cadastro.imprimeCadastro();
    }
}
