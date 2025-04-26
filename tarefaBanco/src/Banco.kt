class Banco(val nome: String) {
    // A lista de agencias deve ser privada para que só possa ser acessada ou alterada por metodos dentro da propria classe
    private var agencias: MutableList<Agencia> = mutableListOf() ;

    //metodos publicos para serem acessados de fora da classe
     fun adicionarAgencia(agencia: Agencia){
        this.agencias.add(agencia);
    }

    fun removerAgencia(agencia: Agencia){
        this.agencias.remove(agencia);
    }

    fun obterAgencia(nome: String): Agencia? {
        return this.agencias.find{it.nome == nome};
    }
}