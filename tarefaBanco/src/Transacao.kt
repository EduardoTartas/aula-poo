import java.util.Date
import javax.xml.crypto.Data

class Transacao(val idTransacao: String, val valor: Double, data: Date) {

    fun executar():Boolean{
        return true;
    }
}