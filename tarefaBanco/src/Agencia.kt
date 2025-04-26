class Agencia(val nome: String) {
    // A lista de contas deve ser privada para que só possa ser acessada ou alterada por metodos dentro da propria classe
    private var contas: MutableList<Conta> = mutableListOf();

    //metodos publicos para serem acessados de fora da classe
    fun adicionarConta(conta: Conta){
        this.contas.add(conta);
    }

    fun removerConta(conta: Conta){
        this.contas.remove(conta);
    }

    fun obterConta(numero: String):Conta{
        return this.contas.first{it.numeroConta == numero}
    }
}