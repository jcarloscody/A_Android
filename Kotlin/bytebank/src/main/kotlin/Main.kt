import POO.Conta

fun main() {
   var titular:String = "titular" //variavel mutavel
   var variavel_por_inferencia= "strin"
   val variavel_imutavel: String //variavel imutavel

   //inicializacao obrigatoria ou null
   var nome= ""

   var variavelDoublePorReferencia = 0.0
   variavelDoublePorReferencia = 1 + 0.0
   //template string
   println("$titular titular ")

   if (1>0){
      println("$titular titular ")
   } else if (3>2){
      println("$titular titular ")
   }else if ( 4>5){
      println("$titular titular ")
   }else {
      println("$titular titular ")
   }

   when{
      1>2 -> println("$titular titular ")
      1>2 -> println("$titular titular ")
      else -> println("$titular titular ")
   }

   testCon(9.0)

   for (i in 10 downTo 0 step 2){
      println(1)
   }

   while (false){

   }

   do {

   }while (false)

   var f = Conta()

}

fun testCon (varivael: Double){
   when {
      varivael >9 -> println()

   }
}