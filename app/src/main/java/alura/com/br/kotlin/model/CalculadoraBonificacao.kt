package alura.com.br.kotlin.model

import android.util.Log

class CalculadoraBonificacao {

    var total: Double = 0.0
    private set

    fun registra(funcionario: Funcionario){
        Log.i("main","Bonificação Total: ${funcionario.nome}")
        this.total += funcionario.bonificacao()
    }

}