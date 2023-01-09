package POO.exercicios.heranca;

public class Aplicacao {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario(); //Instaciamento do objeto da classe

        //upcast
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        // Downcast
        Vendedor vendedor_ = (Vendedor) new Funcionario();

    }
}
