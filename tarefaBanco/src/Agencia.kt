class Agencia(val nome: String) {
    // A lista de contas é privada para limitar o acesso somente à classe.
    private var contas: MutableList<Conta> = mutableListOf();

    // Métodos públicos que permitem a manipulação externa da lista de contas.
    fun adicionarConta(conta: Conta){
        if (this.contas.none { it.numeroConta == conta.numeroConta }) {
            this.contas.add(conta);
            println("Conta ${conta.numeroConta} adicionada com sucesso!");
        } else {
            println("Conta ${conta.numeroConta} já existe nesse agencia!");
        }
    }

    fun removerConta(conta: Conta){
        if (!this.contas.none { it.numeroConta == conta.numeroConta }) {
            this.contas.remove(conta);
            println("Conta ${conta.numeroConta} removida com sucesso!");
        } else {
            println("Conta ${conta.numeroConta} não existe nesse banco!");
        }
    }

    fun obterConta(numero: String): Conta?{
        val conta = this.contas.find { it.numeroConta == numero };
        if (conta != null) {
            println("Conta ${conta.numeroConta} encontrada com sucesso!");
            return conta;
        } else {
            println("Conta $numero não foi encontrada")
        }
        return conta;
    }
}

