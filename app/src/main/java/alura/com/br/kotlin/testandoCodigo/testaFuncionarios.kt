package alura.com.br.kotlin.testandoCodigo

import alura.com.br.kotlin.model.CalculadoraBonificacao
import alura.com.br.kotlin.model.Funcionario
import alura.com.br.kotlin.model.Gerente
import android.util.Log

fun funcionarios() {

    funcionarios()

    val antonio = Funcionario(nome = "Antonio", cpf = "11111", salario = 1000.0)
    Log.i("main", "Nome: ${antonio.nome}")
    Log.i("main", "cpf: ${antonio.cpf}")
    Log.i("main", "Salário: R$ ${antonio.salario}")
    Log.i("main", "Bonificação: ${antonio.bonificacao()}")

    Log.i("main", "_________________________________________")

    val ana = Gerente(nome = "Ana Paula", cpf = "22222", salario = 2000.0, senha = 123)
    Log.i("main", "Nome: ${ana.nome}")
    Log.i("main", "cpf: ${ana.cpf}")
    Log.i("main", "Salário: R$ ${ana.salario}")
    Log.i("main", "Bonificação: ${ana.bonificacao()}")
    ana.autentica(1234)

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(antonio)
    calculadora.registra(ana)

    Log.i("main", "Bonificação Total: ${calculadora.total}")
}