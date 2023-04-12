package POO

open class Geral(var titulo: String, var titular: String) {
   open fun g(): Boolean {
        return  true;
    }

    // properti como funcao
        open var propertiesComoFuncao : Double
        get() {}
        set(value) {}
}