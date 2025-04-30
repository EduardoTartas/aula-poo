import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

class Transacao(private val valor: Double) {
    // IdTransacao é privado para limitar o acesso somente à classe.
    private val idTransacao: String = UUID.randomUUID().toString();

    //Pega a data atual
    val formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy - HH:mm:ss");
    val data = LocalDateTime.now().format(formatter)

    // Método público que exibe as informações da transação feita.
    fun executar(operacao:String):Boolean{
        println("Transação: $operacao, de valor ${this.valor} registrada com o ID ${this.idTransacao} em $data" )
        return true;
    }
}