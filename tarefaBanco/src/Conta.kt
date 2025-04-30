class Conta(val numeroConta: String, val cliente: Cliente) {
    // O saldo é privado para limitar o acesso somente à classe.
    private var saldo: Double = 0.0

    // Métodos públicos que permitem a manipulação externa do saldo.
    fun depositar(valor: Double) {
        if (valor <= 0) {
            println("Valor para depósito inválido.")
            return
        }
        saldo += valor
        println("Depósito realizado.")
        val transacao = Transacao(valor)
        transacao.executar("Depósito")
    }

    fun sacar(valor: Double) {
        if (valor <= 0) {
            println("Valor para saque inválido.")
            return
        }
        if (saldo < valor) {
            println("Saldo insuficiente para o saque.")
            return
        }
        saldo -= valor
        println("Saque realizado.")
        val transacao = Transacao(valor)
        transacao.executar("Saque")
    }

    fun obterSaldo(): Double {
        println("$numeroConta - Saldo atual: $saldo")
        val transacao = Transacao(saldo)
        transacao.executar("Extrato")
        return saldo
    }
}