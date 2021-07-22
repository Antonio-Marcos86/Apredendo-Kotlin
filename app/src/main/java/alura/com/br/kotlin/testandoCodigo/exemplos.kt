package alura.com.br.kotlin.testandoCodigo

import alura.com.br.kotlin.model.Conta
import android.util.Log

class exemplos {
   fun main(){
    val contaAntonio = Conta("Antonio",1000)
    contaAntonio.deposita(200.0)

    val contaAna = Conta("Ana Paula",1001)
    contaAna.deposita(500.0)
    Log.i("Testando", "Titular: ${contaAntonio.titular}")
    Log.i("Testando", "Conta: ${contaAntonio.conta}")
    Log.i("Testando", "Saldo: ${contaAntonio.saldo}")
    Log.i("Testando", "_______________________________")
    Log.i("Testando", "Titular: ${contaAna.titular}")
    Log.i("Testando", "Titular: ${contaAna.conta}")
    Log.i("Testando", "Titular: ${contaAna.saldo}")
    Log.i("Testando", "__________Depositar______________")
    contaAntonio.deposita(50.0)
    contaAna.deposita(100.0)

    Log.i("Testando", "Saldo Antonio: ${contaAntonio.saldo}")
    Log.i("Testando", "Saldo Ana: ${contaAna.saldo}")
    Log.i("Testando", "__________Sacar_______________")
    contaAntonio.saca(500.0)
    contaAna.saca(10.0)
    Log.i("Testando", "Saldo Antonio: ${contaAntonio.saldo}")
    Log.i("Testando", "Saldo Ana: ${contaAna.saldo}")
    Log.i("Testando", "___________Transferir__________")
    contaAntonio.transferir(contaAna, 100.0)
    Log.i("Testando", "Saldo Antonio: ${contaAntonio.saldo}")
    Log.i("Testando", "Saldo Ana: ${contaAna.saldo}")
   }
}