public class Main {
    public static void main(String[] args){
        Pessoa p = new Pessoa("João");
        System.out.println(p.getNome());

        // Create a new instance of PessoaJuridica
        PessoaJuridica pj = new PessoaJuridica("Empresa XYZ", "12.345.678/0001-90");
        System.out.println(pj.getNome());

        PessoaFisica pf = new PessoaFisica("Maria", "123.456.789-00");
         
    }
}