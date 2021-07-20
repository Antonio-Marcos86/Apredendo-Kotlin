package alura.com.br.kotlin.lacos_e_condicoes

import android.util.Log

class LacosCondicoes {

    //         metodo main no kotlin
//         fun main(){print("Bem vindo")}
//        testaLacos()
//        testaCondicoes()

    private fun testaLacos() {
        var i = 1
        while (i <= 5) {

            val titular = "Antonio $i"
            val numeroConta = 1000 + i
            var saldo = i + 10.0
            Log.i("Teste", "Titular: $titular")
            Log.i("Teste", "Número da Conta: $numeroConta")
            Log.i("Teste", "Saldo: $saldo")
            Log.i("Teste", "________________________")
            i++

        }
        for (i in 1..5) {
            val titular = "Antonio $i"
            val numeroConta = 1000 + i
            var saldo = i + 10.0
            // saldo += 200
            Log.i("Teste", "Titular: $titular")
            Log.i("Teste", "Número da Conta: $numeroConta")
            Log.i("Teste", "Saldo: $saldo")
            Log.i("Teste", "________________________")

            //  testaCondicoes(saldo)


        }
        for (i in 5 downTo 1 step 2) {
            if (i == 4) {
                break
            }
            val titular = "Antonio $i"
            val numeroConta = 1000 + i
            var saldo = i + 10.0
            // saldo += 200
            Log.i("Teste", "Titular: $titular")
            Log.i("Teste", "Número da Conta: $numeroConta")
            Log.i("Teste", "Saldo: $saldo")
            Log.i("Teste", "________________________")


        }
    }

    fun testaCondicoes() {

        var saldo = 10.0
        when {
            saldo > 0.0 -> Log.i("Teste", "Saldo da conta está positiva")
            saldo == 0.0 -> Log.i("Teste", "Saldo da conta está neutra")
            else -> Log.i("Teste", "Saldo da conta está negativa")
        }

        // usando o if comparado com o when
        if (saldo > 0.0) {
            Log.i("Teste", "Saldo da conta está positiva")
        } else if (saldo == 0.0) {
            Log.i("Teste", "Saldo da conta está neutra")
        } else {
            Log.i("Teste", "Saldo da conta está negativa")
        }
    }
}