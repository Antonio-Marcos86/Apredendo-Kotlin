package alura.com.br.kotlin.activities

import alura.com.br.kotlin.R
import alura.com.br.kotlin.model.*
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val contaCorrente = ContaCorrente(titular = "Antonio", conta = 1000)
        val contaPoupanca = ContaPoupanca(titular = "Antonio", conta = 1000)

        contaCorrente.deposita(1000.0)
        contaPoupanca.deposita(1000.0)
        Log.i("conta","conta Corrente: ${contaCorrente.saldo}")
        Log.i("conta","conta Poupança: ${contaPoupanca.saldo}")
        contaCorrente.saca(200.0)
        contaPoupanca.saca(200.0)

        Log.i("conta","conta Corrente: ${contaCorrente.saldo}")
        Log.i("conta","conta Poupança: ${contaPoupanca.saldo}")

        contaCorrente.transferir(contaPoupanca,100.0)
        Log.i("conta","conta Corrente após transferir: ${contaCorrente.saldo}")
        Log.i("conta","conta Poupança após transferir: ${contaPoupanca.saldo}")

        contaPoupanca.transferir(contaCorrente,100.0)
        Log.i("conta","conta Corrente após transferir: ${contaCorrente.saldo}")
        Log.i("conta","conta Poupança após transferir: ${contaPoupanca.saldo}")

    }

}



