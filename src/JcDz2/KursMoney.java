package JcDz2;

public class KursMoney {
    float kursMoney = 1.0f;

    public void kurs() {
        while (kursMoney < 3) {
            System.out.println( kursMoney );
            kursMoney += 0.2;
        }
    }

    float[] exchange = {2.32f, 3.15f, 2.07f, 3.34f, 1.89f, 2.99f, 2.64f, 3.62f, 2.02f, 3.98f};

    public void printExchange() {
        for (int i = 0; i < exchange.length; i++) {
            System.out.println( exchange[i] );
        }
    }

    public void mySortArray() {
        for (int i = 0; i < exchange.length; i++) {
            float min = exchange[i];
            float min_i = i;
            for (int j = i + 1; j < exchange.length; j++) {
                if (exchange[j] < min) {
                    min = exchange[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                float tmp = exchange[i];
                exchange[i] = exchange[(int) min_i];
                exchange[(int) min_i] = tmp;
            }
            System.out.print( exchange[i] + "," );
                    }

        System.out.println();
    }
    public void foreachPrintExchange(){
        for (float i:exchange)
            System.out.println(i);
    }
}
