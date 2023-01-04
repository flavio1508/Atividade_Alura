public class TestaBanco {
    public static void main(String[] args) {
        Cliente flavio = new Cliente();
        flavio.nome = "Flávio Augusto";
        flavio.cpf = "222.222.222-22";
        flavio.profissao = "programador";

        Conta contaFlavio = new Conta();
        contaFlavio.deposita(100);
//associa o cliente flavio a conta flavio
        contaFlavio.titular = flavio;//compoen os objeto, fazem a composiçoes dos objetos
        System.out.println(contaFlavio.titular.nome);
        System.out.println(contaFlavio.titular);
        System.out.println(contaFlavio);
    }
}
