class Conta(val numeroConta: String,val cliente:Cliente) {


    private var saldo: Double = 0.0


    fun depositar(valor: Double){
    }

    fun sacar(valor: Double){
    }

    fun obterSaldo():Double{
        return saldo;
    }
}