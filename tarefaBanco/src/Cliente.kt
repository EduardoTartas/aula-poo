import java.util.*;

class Cliente(private val nome: String) {
    private val idCliente: String = UUID.randomUUID().toString();
    private lateinit var endereco: String;

    fun obterNome(): String {
        println("Nome do cliente é: $nome");
        return nome;
    }

    fun definirEndereco(endereco: String) {
        this.endereco = endereco;
        println("Endereço definido como: $endereco");
    }

    fun imprimirDetalhesCliente() {
        println("ID Cliente: $idCliente");
        println("Nome: $nome");
        println("Endereço: $endereco");
    }
}