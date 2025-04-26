class Pessoa(val nome:String, val idade:Int) {

    fun apresentar() {
        println("Prazer, meu nome é ${this.nome} e tenho ${this.idade} anos de idade.")
    }
}