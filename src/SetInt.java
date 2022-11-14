import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class SetInt {

    private static final int COUNT = 20;
    public static ArrayList <SetInt> integers;
    private final int number;

    public SetInt(int number) { this.number = number;
    }
    public static ArrayList<SetInt> getIntegers() { return integers; }
    public int getNumber() { return number;  }

    public static void main(String[] args) {  //-------------------------------------------------------------

        System.out.println("Домашнее задание 3 : Множество целых четных чисел ______________________________ ");
        System.out.println();

        ArrayList<SetInt> integers = new ArrayList<>();

        creatSetInt();
        printInt(integers);
        System.out.println();

        removeOdd();
        printInt(integers);

    }  // main --------------------------------------------------------------------------------------------
    public static void creatSetInt () {
        Random random = new Random();
        for (int i = 0; i < COUNT; i++) {
           integers.add(new SetInt(random.nextInt(1000)));
        }
    }
    public static void removeOdd () {
        Iterator<SetInt> iterator = integers.iterator();
        while(iterator.hasNext()) {
            SetInt next = iterator.next();
            if (next.getNumber() % 2 != 0) {
               integers.remove(next); // или iterator.remove(); - одно и тоже?
            }
        }
    }
    public static void printInt (ArrayList<SetInt> integers) {
        for (int i = 0; i < integers.size(); i++) {
            System.out.print(integers.get(i) + "\t");
        }
    }      // НЕ РАБОТАЕТ !!! toString() не создается!


} // Class

