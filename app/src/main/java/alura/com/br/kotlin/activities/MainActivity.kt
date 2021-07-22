package alura.com.br.kotlin.activities

import alura.com.br.kotlin.R
import alura.com.br.kotlin.model.Funcionario
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val antonio = Funcionario(nome ="antonio", cpf = "111111111110", salario = 1000.0,2)
        Log.i("main","Nome: ${antonio.nome}")
        Log.i("main","cpf: ${antonio.cpf}")
        Log.i("main","Salário: R$ ${antonio.salario}")
        Log.i("main","Bonificação: ${antonio.bonificacao()}")

    }


}



