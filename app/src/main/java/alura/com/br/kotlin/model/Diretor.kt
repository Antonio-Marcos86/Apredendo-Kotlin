package alura.com.br.kotlin.model

import android.util.Log

class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int
) : Funcionario(nome = nome, cpf = cpf, salario = salario) {


    override fun bonificacao(): Double = salario * 0.3

    fun autentica(senha: Int) {
        if (this.senha == senha) {
            Log.i("main", "A senha está correta")
        } else {
            Log.i("main", "A senha incorreta")
        }
    }
}