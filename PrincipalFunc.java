class PrincipalFunc{
    public static void main(String[] args){
        Funcionario func1 = new Funcionario();
        // func1.codigo = 10; <- can't be done since 'codigo' is private
        // adding get set to 'codigo', I can access codigo this way:
        func1.setCode(10);
        func1.setName("João");
        func1.setWorkedHours(200);
        func1.setHourValue(50);
        func1.mostra();

        Funcionario func2 = new Funcionario(30, "Paulo");
        func2.mostra();
    }
}