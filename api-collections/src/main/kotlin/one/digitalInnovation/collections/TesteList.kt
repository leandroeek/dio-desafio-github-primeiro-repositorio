package one.digitalInnovation.collections

fun main(){
    val joao = Funcionario(nome = "Joao", salario = 2000.0, "CLT")
    val pedro = Funcionario(nome = "Pedro", salario = 1500.0, "PJ")
    val maria = Funcionario(nome = "Maria", salario = 4000.0, "CLT")

    val funcionarios = listOf(joao, pedro, maria)

    funcionarios.forEach{ println(it)}

    println("---------------------------------------")
    println(funcionarios.find {it.nome == "Maria"})

    println("---------------------------------------")
    funcionarios
        .sortedBy { it.salario }
        .forEach{ println(it)}

    println("---------------------------------------")
    funcionarios
        .groupBy { it.tipoContratacao }
        .forEach{ println(it)}
}

