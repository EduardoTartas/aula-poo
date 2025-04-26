class Cliente(val idCliente: String,private val nome: String, private var endereco: String){

    fun obterNome():String{
        return this.nome;
    }

    fun definirEndereco(endereco: String){
        this.endereco = endereco;
    }
}