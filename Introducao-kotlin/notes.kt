

-----------------------------------------------
// var (variavel)
// val (constante)
// const val (constante ja definida antes da execucao)



const val MAX_AGE = 60
const val MIN_AGE = 30

//função principal
fun main() {
    val	currentAge:Int
    currentAge = 30
    

    // CHECANDO O CONST VAL MAX_AGE
    println(currentAge < MAX_AGE)
}


-----------------------------------------------
// TO STRING
fun main() {
    var	currentAge = "alguma coisa"
    currentAge = 2021.toString() + " ok"
    println(currentAge)
    
    
}
 
 -----------------------------------------------
// NULL
fun main() {
    // TIPANDO A VARIAVEL NULA com > ? <
    var currentAge:String? = "alguma coisa"
    println(currentAge) 
    
    // INT PARA STRING
    currentAge = 2021.toString() + " ok"
    println(currentAge) 
    
    // ATRIBUINDO VALOR NULO
    currentAge = null
    println(currentAge)    
}

-----------------------------------------------
// OPERADORES ARITMETICOS - EXEMPLO SOMA
fun main() {
 	val count = 19
    val times = 10
    val r = times + count 
    println(r)
    println(count.plus(times))
    
    var times2 = 11
    times2 += count
    println(times2)
        
    
}

-----------------------------------------------
// COMPARATIVO
const val EQUAL = 0
const val LESS = -1
const val MORE = 1

fun main() {
	val a = 22
    val b = 10
    
    println(a<b)
    println(a.compareTo(b) == LESS)
}

-----------------------------------------------
// DIFERENTE OU IGUAL
fun main() {
    val a = 22
    val b = 10
    
    println(a==b)
    println(a!=b)
    println(a.equals(b))
    println(!a.equals(b))
}

-----------------------------------------------
// IN E RANGE 

fun main() {
    val bingo = listOf(8,6,34,2,13)
    var number = (1..34).random()
    
    println(number)
    println(number in bingo)
   
}

// IN E RANGE COM OR 

const val MAX_AGE = 68
const val MIN_AGE = 16

fun main() {
    var age = (10..100).random()
    
    println(age)
    
    // in range
    println(age in (MIN_AGE..MAX_AGE))
    
    // and - or (&& - ||)
    println(age >= MIN_AGE && age <= MAX_AGE)
   
}

-----------------------------------------------

// MANIPULANDO STRINGS

fun main() {
    val welcome = "Bem vindo(a)"
    var name = "Nome"
    
    // capitalize() torna o primeiro caractere Maiúsculo
    println("${welcome}, ${name.capitalize()}!")

   // CAPITALIZE DEPRECIOU, USAR ReplaceFirstChar
    println("${welcome}, ${name.replaceFirstChar {it.uppercase()} }!")
   
   // também funciona, mas não é ideal para manipulação
   println(welcome+name)
   
}