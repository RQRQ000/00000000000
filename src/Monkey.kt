class Monkey(mokeysize:Int,monkeyactive:Int) {
    var size : Int = 1
    init {
        size = mokeysize
    }
    var activ: Int = 1
    init {
        activ = monkeyactive
    }
    fun eat4 (){
        if (size>60){
            println("\u001B[33mговорит:")
            println("\u001B[33mЕСТЬ")
            size ++
            println("\u001B[33mРазмер:")
            println(size)
        }
        if (size<60){
            println("\u001B[33mговорит:")
            println("\u001B[33mммммм")
            size++
            println("\u001B[33mРазмер:")
            println(size)
        }
    }
    fun trink4 () {
        if (size>60){
            println("\u001B[33mговорит:")
            println("\u001B[33mЕще")}
        if (size<60){
            println("\u001B[33mговорит:")
            println("\u001B[33mхватит")}
}
    fun play4 () {
        if (activ<150){
            println("\u001B[33mговорит:")
            println("\u001B[33mЕще играть")}
        if (activ>150){
            println("\u001B[33mговорит:")
            println("\u001B[33mКрушить")}

    }

}