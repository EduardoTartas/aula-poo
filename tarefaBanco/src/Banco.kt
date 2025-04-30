class Banco(val nome: String) {
    // A lista de agencias é privada para limitar o acesso somente à classe.
    private var agencias: MutableList<Agencia> = mutableListOf() ;

    // Métodos públicos que permitem a manipulação externa da lista de agencias.
     fun adicionarAgencia(agencia: Agencia){
        this.agencias.add(agencia);
    }

    fun removerAgencia(agencia: Agencia){
        this.agencias.remove(agencia);
    }

    fun obterAgencia(nome: String): Agencia?{
        return this.agencias.find{it.nome == nome};
    }
}