

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

--------------------------------------------------
// TRABALHANDO COM EMPTY E BLANK
// empty = não tem nenhum valor | blank = tem valor mas é em branco

fun main() {
    val empty = ""
    val blank = "  "
    
    println("Tamanho empty: " + empty.length)
    println("Tamanho blank: " + blank.length)
    
    println("\nEmpty é empty e blank? " + (empty.isEmpty() && empty.isBlank()))
   	println("Blank é empty e blank? " + (blank.isEmpty() && empty.isBlank()))
   	
}

-------------------------------------------------

////EXEMPLOS DE FUNÇÃO

// esqueleto
private fun nomeDaFuncao(nome:Tipo):TipoRetorno {
	return
}

private fun getFullName(name:String, lastName:String):String {
    val fullname = "$name $lastName"
    return fullname 
}

    //ou

private fun getFullName(name:String, lastName:String):String {    
    return "$name $lastName"
}

// ou ainda a FUNÇÃO SINGLE LINE

private fun getFullName(name:String, lastName:String) = "$name $lastName"

------------------------------------------------

//EXEMPLOS DE FUNÇÃO DE ORDEM SUPERIOR
fun main() {

   var z:Int
    
   z = calculate(34,90,::sum)
   println(z)
   z = calculate(34,90){a,b -> a*b}
   println(z)
       
}

fun sum(a1:Int, a2:Int) = a1.plus(a2)

fun calculate(n1:Int, n2:Int,operation: (Int,Int)->Int):Int{
    val result = operation(n1,n2)
    return result
}

----------------------------------------------

// ELVIS OPERATOR

fun main() {
	val a:String? = null
    val verify = a ?: "não sou nulo mais"

    println(verify)
   
   	val c:Int? = 8

   val verify2 = a ?: c ?: "são nulos"
    println(verify2)
}

-----------------------------------------------

////EXEMPLOS DE ATRIBUIÇÃO
fun main() {
	val a = 1
    val b = 2 
    
    val MaxValue = if (a > b) a else if (a < b) b else b
   	println(MaxValue)
    
    // ou até
  
    val MinValue = if (a > b){
        println("$b é menor que $a")
        b
    } else if (a < b){
        println("$a é menor que $b")
        a
    } else {
        println("$b é igual a $a")
        a
    }
}

-----------------------------------------------

//// WHEN = SWITCH NAS OUTRAS LINGUAS
fun main() {
    val a = 0
    val b = 1
    
	when {
        a > b -> {a}
        a != b -> {println("diferentes")}
        b == 0 -> {b}
        else -> {println("passou tudo")}
    } 
}

// EXEMPLOS DE WHEN NA PRÁTICA

fun main() {
    
	val grade = (0..10).random()
    println(grade.getStudentStatus())
    
}

fun Int.getStudentStatus():String{
    println("nota $this")
    return when(this){
        in 0..4 -> "Reprovado"
        in 5..7 -> "Tá na média, estude mais na próxima!"
        in 8..9 -> "Bom, quase lá!"
        10 -> "Excelente!"
        else -> "Erro"
    }
    
}

----------------------------------------------

for(variavelIndex in/until/downTo faixa de valores/condicional step intervalo)

// EXEMPLOS
fun main(){

    for(i in 0..20 step 2) {
        println("$i")
    }

    for(i in 0 until 10){
        println("$i")
    }

    for(i in 10 downTo 0){
        println("$i")
    }

}