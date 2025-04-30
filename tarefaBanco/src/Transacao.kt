import java.util.*

class Transacao(val valor: Double, val data: Date) {
    // IdTransacao é privado para limitar o acesso somente à classe.
    private val idTransacao: String = UUID.randomUUID().toString();

    // Método público que exibe as informações da transação feita.
    fun executar(operacao:String):Boolean{
        println("Transação: $operacao, de valor ${this.valor} resgistrada com o ID ${this.idTransacao}" )
        return true;
    }
}