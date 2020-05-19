package JcDz2;

import java.util.Arrays;

public class House {
    public byte height;
    public byte NumberOfFloors;
    public byte NumberOfWindows;
    public byte NumberOfDoors;
    public String title;
    public String RoofName;
    public String WallMaterial;
    public String location;
    public char TypeOfFoundation;
    private int price;

    public House() {
        height = 5;
        NumberOfFloors = 2;
        NumberOfWindows = 5;
        NumberOfDoors = 2;
        title = "Шале";
        RoofName = "Шифер";
        WallMaterial = "Кирпич";
        location = "Минск";
        TypeOfFoundation = 'A';
        price = 1400000;
    }

    public House(int h, int NoF, int NoW) {
        this.height = (byte) h;
        this.NumberOfFloors = (byte) NoF;
        this.NumberOfWindows = (byte) NoW;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static int numberOfWall = 4;
    public static int numberOfRoofSlopes = 6;

    public static void summ() {
        byte number = 23 + 32;
        byte subtraction = (byte) (number - 6);
        byte result = (byte) (number + subtraction);
        System.out.println( result );
    }
    public final double G_METALL=7.81;
    public final double G_WOOD=0.18;
    public final double G_BETON=2.28;

    public double volumeMetall=230;
    public double volumeWood=1000;
    public double volumeBeton=3450;


    public void rascet(){
         double vesMetall=volumeMetall/G_METALL;
        double vesWood=volumeWood/G_WOOD;
        double vesBeton=volumeBeton/G_BETON;
        System.out.println( vesMetall);
        System.out.println( vesWood);
        System.out.println( vesBeton);
    }

}
