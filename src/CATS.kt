class CATS(catsize:Int,catactive:Int) {
    var  size : Int = 1
    init {
        size=catsize

    }
    var activ: Int = 1
    init {
        activ=catactive
    }
    fun mjy () {
        if (size>11){
            println("\u001B[35mговорит:")
            println("\u001B[35mМЯУУУУ")}
        if (size<11){
            println("\u001B[35mговорит:")
            println("\u001B[35mмя")}
    }
    fun eat2 () {
        if (size>11){
            println("\u001B[35mговорит:")
            println("\u001B[35mЖрать")
            size ++
            println("\u001B[35mРазмер:")
            println(size)}
        if (size<11){
            println("\u001B[35mговорит:")
            println("\u001B[35mВСЕЕЕ")
            size ++
            println("\u001B[35mРазмер:")
            println(size)}
    }
    fun trink2 () {
        if (size>11){
            println("\u001B[35mговорит:")
            println("\u001B[35mПИИИТЬЬЬ, ПОМЕРАЮ")}
        if (size<11){
            println("\u001B[35mговорит:")
            println("\u001B[35mЯ ЩАС ЛОПНУ")}
    }
    fun play2 () {
        if (activ<16){
            println("\u001B[35mговорит:")
            println("\u001B[35mЕЩЕ ИГРАТЬ")}

        if (activ>16){
            println("\u001B[35mговорит:")
            println("\u001B[35mИГРАТЬ,ИГРАТЬ,ХОЧУ ИГРАТЬ")}

    }
}