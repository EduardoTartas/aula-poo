class Cliente(val idCliente: String, val nome: String){

    private lateinit var endereco: String

    //função para obter o nome do cliente
    fun obterNome():String{
        return this.nome;
    }

    //função publica para mudar o endereço do cliente
    fun definirEndereco(endereco: String){
        this.endereco = endereco;
    }
}