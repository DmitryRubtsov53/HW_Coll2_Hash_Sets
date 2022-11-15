import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class SetInt {

    private static final int COUNT = 20;
    public static ArrayList<SetInt> integers;
    private final int number;

    public SetInt(int number) {
        this.number = number;
    }

    public static ArrayList<SetInt> getIntegers() {
        return integers;
    }

    public int getNumber() {
        return number;
    }

    public static void main(String[] args) {  //-------------------------------------------------------------

        System.out.println("Домашнее задание 3 : Множество целых четных чисел ______________________________ ");
        System.out.println();

        ArrayList<SetInt> integers = creatSetInt();
        printInt(integers);
        System.out.println();

        removeOdd(integers);
        printInt(integers);

    }  // main --------------------------------------------------------------------------------------------

    public static ArrayList<SetInt> creatSetInt() {
        ArrayList<SetInt> integers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < COUNT; i++) {
            integers.add(new SetInt(random.nextInt(1000)));
        }
        return integers;
    }

    public static void removeOdd(ArrayList<SetInt> integers) {
        integers.removeIf(x -> x.getNumber() % 2 != 0);
    }

    public static void printInt(ArrayList<SetInt> integers) {
        for (SetInt integer : integers) {
            System.out.print(integer + " ");
        }
    }
    public String toString() {
        return String.valueOf(number);
    }
}