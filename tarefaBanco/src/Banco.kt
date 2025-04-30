class Banco(val nome: String) {

    // A lista de agencias é privada para limitar o acesso somente à classe.
    private var agencias: MutableList<Agencia> = mutableListOf();

    // Métodos públicos que permitem a manipulação externa da lista de agencias.
    fun adicionarAgencia(agencia: Agencia) {
        if (this.agencias.none { it.nome == agencia.nome }) {
            this.agencias.add(agencia);
            println("Agencia ${agencia.nome} adicionada com sucesso!");
        } else {
            println("Agencia ${agencia.nome} já existe nesse banco!");
        }
    }

    fun removerAgencia(agencia: Agencia) {
        if (!this.agencias.none { it.nome == nome }) {
            this.agencias.remove(agencia);
            println("Agencia ${agencia.nome} removida com sucesso!");
        } else {
            println("Agencia ${agencia.nome} não existe nesse banco!");
        }
    }

    fun obterAgencia(nome: String): Agencia? {
        val agencia = this.agencias.find { it.nome == nome }
        if (agencia != null) {
            println("Agencia ${agencia.nome} encontrada com sucesso!");
            return agencia;
        } else {
            println("Agencia $nome não foi encontrada");
        }
        return agencia;
    }
}