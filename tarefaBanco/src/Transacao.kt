import java.util.Date

class Transacao(val idTransacao: String, val valor: Double, data: Date) {

    fun executar():Boolean{
        return true;
    }
}