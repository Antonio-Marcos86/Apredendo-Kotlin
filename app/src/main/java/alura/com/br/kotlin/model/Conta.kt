package alura.com.br.kotlin.model

import android.util.Log

open class Conta(var titular: String, var conta: Int) {
    var saldo = 0.0
        private set

    fun deposita(valor: Double) {
        if (valor > 0) {
            saldo += valor
        }
    }

    open fun saca(valor: Double) {
        if (saldo >= valor) {
            saldo -= valor
        } else {
            Log.i("Testando", "Saque em excesso")
        }

    }

    fun transferir(destino: Conta, valor: Double) {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
        } else {
            Log.i("Testando", "Falha na transferência")
        }
//    fun getSaldo():Double{
//        return saldo
//    }
//
//    fun setSaldo(valor:Double){
//        saldo = valor
//    }

    }
}