
fun main() {
    print("Informe seu nome: ")
    val nome:String = readln();
    print("Informe sua idade: ")
    val idade: Int = readln().toInt();

    val pessoa = Pessoa(nome, idade)
    pessoa.apresentar();
}