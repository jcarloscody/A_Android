package POO

class Conta( var titulo2: String, titulo: String, titular: String) : Geral(titulo, titular) {
    var conta:Int =0
    // properties - set e get. as variaveis já tem, nao precisa implementar uma funcao para isto
    //por defualt já vem
   /* var titular=""
            private set(value) {}

    var conta: Int = 0
       set(value) {
            if (value>10){
                field = 0
            }
        }
        get() = field*/

    constructor(conta: Int, titular: String ) : this(titular){
        this.conta=conta
    }

    override fun g(): Boolean {
        return super.g()
    }

    //está retornando Unit
    fun deposita(valor:Double):Unit{

    }

    fun trans():Boolean{
        return  true
    }

}