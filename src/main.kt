fun main(args: Array<String>) {
    var BOBY: dog = dog(40, 5)
    var DODO: dog = dog(19, 10)
    var MURZIK: CATS = CATS(15, 15)
    var Snegok: CATS = CATS(10, 20)
    var KarKar: BIRDS = BIRDS(6, 20)
    var Kesha: BIRDS = BIRDS(3, 30)
    var Linda: Monkey = Monkey(40, 100)
    var Bim: Monkey = Monkey(80, 200)

    var ANSI_RESET = "\u001B[0m"
   var ANSI_BLACK = "\u001B[30m"
    var  ANSI_RED = "\u001B[31m";
 //  public static final String ANSI_GREEN = "\u001B[32m";
    var ANSI_YELLOW = "\u001B[33m";
    //public static final String ANSI_BLUE = "\u001B[34m";
     var ANSI_PURPLE = "\u001B[35m";
   // public static final String ANSI_CYAN = "\u001B[36m";
  var ANSI_WHITE = "\u001B[37m";
    //var newdogName:dog=dog()
    //newdogName.size =(15..50).random()
    //newdogName.name = "Рекс"
    var a = 0
    while (a != 9) {
        println(
           ANSI_BLACK+ "Собаки: Напиши 1 - " +
                    "Кормить Бобика\n" +
                    "Собаки: Напиши 2 - " +
                    "Кормить Додо\n" +
                    "Коты: Напиши 3 - " +
                    "Кормить Мурзик\n" +
                    "Коты: Напиши 4 - " +
                    "Кормить Снежок\n"  +
                    "Птицы: Напиши 5 - " +
                    "Напоить Кар Кар\n" +
                    "Птицы: Напиши 6 - " +
                    "Напоить Кеша\n" +
                    "Обезьяны: Напиши 7 - " +
                    "Накормить Линда\n" +
                    "Обезьяны: Напиши 8 - " +
                    "Накормить Бим\n" +
                    "Ннапиши 9 - " +
                    "Завершить Процесс"+ANSI_RESET
        )
        a = readLine().toString().toInt()
        if (a == 1) {
            BOBY.eat1()
        }
        if (a == 2) {
            DODO.eat1()
        }
        if (a == 3) {
            MURZIK.eat2()
        }
        if (a == 4) {
            Snegok.eat2()
        }
        if (a == 5) {
            KarKar.trink3()
        }
        if (a == 6) {
            Kesha.trink3()
        }
        if (a == 7) {
            Linda.eat4()
        }
        if (a == 8) {
            Bim.eat4()
        }
    }





    //BOBY.guv()
    //DODO.guv()
    //MURZIK.mjy()
    //Snegok.mjy()
    //KarKar.sing()
    //Kesha.sing()
    //BOBY.eat1()
    //DODO.eat1()
    //MURZIK.eat2()
    //Snegok.eat2()
    //Linda.eat4()
    //BOBY.trink1()
    //DODO.trink1()
    //MURZIK.trink2()
    //Snegok.trink2()
    //KarKar.trink3()
    //Kesha.trink3()
    //BOBY.play1()
    //DODO.play1()
    //MURZIK.play2()
    //Snegok.play2()
    //KarKar.fly()
    //Kesha.fly()
    //Linda.play4()
    // Bim.play4()
    //newdogName.newdog()



}
