fun main (){
    
    println("Bem vindo ao Kotlin Simple Calculator | A calculadora desenvolvida no Santander Bootcamp Mobile Developer")
    println("A seguir você deve digitar dois valores, e em seguida escolher qual operação deseja fazer")

    print("Digite o valor 1: ")
    var num1:Float? = readLine()?.toFloat()
    print("Digite o valor 2: ")
    var num2:Float? = readLine()?.toFloat()

    println("Digite o número correspondente à operação que deseja fazer: " +
            "\n 1 - Soma \n 2 - Subtração \n 3- Multiplicação \n 4- Divisão")
    val choose:Int  = readLine()!!.toInt()

    when (choose){
        1 -> {z =calculate(num1,num2,::sum) }
        2 -> {}
        3 -> {}
        4 -> {}
        else -> println("Opção Inválida!")
        }

    }

    fun sum(a1:Float, a2:Float) = a1.plus(a2)

    fun calculate(n1:Float?, n2:Float?,operation: (Float?,Float?)->Float):Float? {
        val resulti = operation(n1, n2)
        return resulti
    }