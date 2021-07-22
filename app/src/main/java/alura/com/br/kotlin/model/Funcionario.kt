package alura.com.br.kotlin.model

class Funcionario(val nome:String, val cpf:String, val salario: Double,val tipo:Int // 0 funcionario, 1 gerente,2 diretor
 ){
    fun bonificacao(): Double {
        when (tipo) {
            0 -> {return salario * 0.1}
            1 -> {return salario * 0.15}
            else -> {return salario * 0.2}
        }

    }

    fun autentica(senha:Int){

    }
}