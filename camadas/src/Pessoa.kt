open class Pessoa(val nome: String, val idade:Int) {

    open fun mostrarDados():Boolean {
        return true;
    }

    open fun mostrarIdade():Boolean{
        return false
    }
}