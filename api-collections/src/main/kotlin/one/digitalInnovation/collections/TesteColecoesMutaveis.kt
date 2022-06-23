package one.digitalInnovation.collections

fun main() {
    val joao = Funcionario(nome = "Joao", salario = 2000.0, "CLT")
    val pedro = Funcionario(nome = "Pedro", salario = 1500.0, "PJ")
    val maria = Funcionario(nome = "Maria", salario = 4000.0, "CLT")

    println("---------List------------")
    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach{ println(it)}

    println("-----------------------------")
    funcionarios.add(pedro)
    funcionarios.forEach { println(it) }

    println("-----------------------------")
    funcionarios.remove(joao)
    funcionarios.forEach { println(it) }

    println("------------SET--------------")
    val funcionariosSet = mutableSetOf(joao)
    funcionariosSet.forEach { println(it) }

    println("-----------------------------")
    funcionarios.add(pedro)
    funcionarios.add(maria)
    funcionariosSet.forEach { println(it) }

    println("-----------------------------")
    funcionarios.remove(maria)
    funcionariosSet.forEach { println(it) }
}