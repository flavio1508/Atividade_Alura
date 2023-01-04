public class TestaContaSemCliente {
    public static void main(String[] args) {
        Conta contaMarcela = new Conta();
        System.out.println(contaMarcela.pegaSaldo());

        //tirar o null e direcionar para o cliente
        contaMarcela.titular = new Cliente();
        System.out.println(contaMarcela.titular);

        contaMarcela.titular.nome = "Marcela";
        System.out.println(contaMarcela.titular.nome);
    }
}
