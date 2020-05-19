package JcDz2;

public class Main {

    public static void main(String[] args) {
        House First = new House();

        System.out.println( "Первый дом" );
        System.out.println( "Тип дома - " + First.title );
        System.out.println( "Высота дома = " + First.height );
        System.out.println( "Количество этажей - " + First.NumberOfFloors );
        System.out.println( "Количество дверей - " + First.NumberOfDoors );
        System.out.println( "Количество окон - " + First.NumberOfWindows );
        System.out.println( "Материал крыши - " + First.RoofName );
        System.out.println( "Материал стен - " + First.WallMaterial );
        System.out.println( "Расположен в городе - " + First.location );
        System.out.println( "Тип фундамента - " + First.TypeOfFoundation );
        System.out.println( "Следующий дом" );
        House Second = new House( 5, 1, 4 );

        System.out.println( "Высота дома = " + Second.height );
        System.out.println( "Количество этажей - " + Second.NumberOfFloors );
        System.out.println( "Количество окон - " + Second.NumberOfWindows );
        System.out.println( "Запрашиваем цену первого дома" );
        System.out.println( First.getPrice() );
        System.out.println( "Устанавливаем свою цену - 1200000" );
        First.setPrice( 1200000 );

        System.out.println( "Проверяем какая новая цена" );
        System.out.println( First.getPrice() );
        float kursDollars;
        kursDollars = 2.69f;
        float exchangeRate = First.getPrice() / kursDollars;
        System.out.println( "Цена первого дома по курсу доллара = " + exchangeRate );
        if (First.height > Second.height)
            System.out.println( "Первый дом выше второго" );
        else if (Second.height < First.height)
            System.out.println( "Первый дом выше второго" );
        else System.out.println( "Высота домов одинакова" );
        String result;
        result = First.NumberOfFloors > 1 ? "Этот дом многоэтажный" : "Этот дом одноэтажный";
        System.out.println( result );
        System.out.println( "For Task#3" );
        double iCanBuy;
        double kursEuro = 2.5d;
        double iHaveMoneyByn = 300000.0d;
        while (kursEuro < 3.6d) {
            kursEuro = kursEuro + 0.15;
            if (kursEuro > 3.1) {
                iCanBuy = iHaveMoneyByn / kursEuro;
                System.out.println( "Я могу купить " + iCanBuy + " Евро" );
                break;
            }
        }
        KursMoney arrayExchange = new KursMoney();

        arrayExchange.printExchange();

        arrayExchange.mySortArray();

        arrayExchange.foreachPrintExchange();

        House.summ();

        House Third = new House(  );
        Third.rascet();
    }
}
