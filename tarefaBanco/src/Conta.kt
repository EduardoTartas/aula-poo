class Conta(val numeroConta: String,val cliente:Cliente) {

    // O saldo é privado para limitar o acesso somente à classe.
    private var saldo: Double = 0.0

    // Métodos públicos que permitem a manipulação externa do saldo.
    fun depositar(valor: Double){
    }

    fun sacar(valor: Double){
    }

    fun obterSaldo():Double{
        return saldo;
    }
}