package alura.com.br.kotlin.model

class ContaCorrente(titular: String, conta: Int) : Conta(titular, conta) {
    override fun saca(valor: Double) {
        val valorComTaxa = valor + 0.1
        super.saca(valorComTaxa)
    }

}