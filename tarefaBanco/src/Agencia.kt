class Agencia(val nome: String) {
    // A lista de contas é privada para limitar o acesso somente à classe.
    private var contas: MutableList<Conta> = mutableListOf();

    // Métodos públicos que permitem a manipulação externa da lista de contas.
    fun adicionarConta(conta: Conta){
        this.contas.add(conta);
    }

    fun removerConta(conta: Conta){
        this.contas.remove(conta);
    }

    fun obterConta(numero: String): Conta?{
        return this.contas.find{it.numeroConta == numero}
    }
}