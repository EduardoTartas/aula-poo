fun main() {
    var banco = Banco("Tartas' Bank");
    var agenciaUm = Agencia("agenciaUm");
    var agenciaDois = Agencia("agenciaDois");
    var clienteUm = Cliente("Eduardo");
    var clienteDois = Cliente("Eduardo");
    var contaUm = Conta("123", clienteUm);
    var contaDois = Conta("321", clienteDois);


    banco.adicionarAgencia(agenciaUm);
    banco.adicionarAgencia(agenciaDois);
    banco.removerAgencia(agenciaUm);
    banco.obterAgencia("agenciaUm");

    println("//-------------------------//")

    agenciaUm.adicionarConta(contaUm);
    agenciaDois.adicionarConta(contaDois);
    agenciaUm.removerConta(contaDois);
    agenciaDois.obterConta("contaDois");

    println("//-------------------------//")

    clienteUm.imprimirDetalhesCliente();
    clienteUm.definirEndereco("123 Main Street");
    clienteUm.imprimirDetalhesCliente();
    clienteDois.imprimirDetalhesCliente();

    println("//-------------------------//")

    contaUm.obterSaldo();
    contaUm.depositar(1.200);
    contaUm.sacar(1.000);
    contaDois.obterSaldo();
    contaDois.sacar(4.000);
}