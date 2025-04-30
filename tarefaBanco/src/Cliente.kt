class Cliente(val idCliente: String, val nome: String){

    //Endereço é privado para limitar o acesso somente à classe.
    private lateinit var endereco: String

    //Método para obter o nome do cliente.
    fun obterNome():String{
        return this.nome;
    }

    //Método públicos que permite a manipulação externa do enderço.
    fun definirEndereco(endereco: String){
        this.endereco = endereco;
    }
}