public class Conta {
    private double saldo; //atributo
    int agencia;
    int numero;
    Cliente titular; //= new Cliente()com o new toda conta ja tem um cliente não se preocuparia com o null porque criou uma conta criou um cliente

   

    void deposita(double valor){// metodo void e falar que nao devolve mensagem so recebe e pronto
        this.saldo += valor;
    }

    public boolean saca(double valor /*parametros argumentos*/){
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
            
        }else{
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino){
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        } 
            return false;
    

    }
    public double pegaSaldo(){
        return this.saldo;
    }
}// metodo siginifica comportamento
