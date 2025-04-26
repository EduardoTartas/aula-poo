import java.lang.foreign.SymbolLookup
import java.util.UUID

class Aluno(val id: String, val curso: String, val nota: Double, nome: String, idade: Int):Pessoa(nome, idade) {
    fun exibirDados() {
        println("ID: $id")
        println("Nome: $nome")
        println("Idade: $idade")
        println("Curso: $curso")
        println("Nota: $nota")
    }

    companion object {
        fun getIdUnico(): String {
            return UUID.randomUUID().toString()
        }
    }

    override fun mostrarDados():Boolean{
        return false
    }

    override fun mostrarIdade():Boolean{
        return true;
    }
}