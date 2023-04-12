package POO

class Conta {

    // properties - set e get. as variaveis já tem, nao precisa implementar uma funcao para isto
    //por defualt já vem

        private var titular=""
            private set(value) {}


    private  var conta: Int = 0
        set(value) {
            if (value>10){
                field = 0
            }
        }
        get() = field

    //está retornando Unit
    fun deposita(valor:Double):Unit{

    }

    fun trans():Boolean{
        return  true
    }

}