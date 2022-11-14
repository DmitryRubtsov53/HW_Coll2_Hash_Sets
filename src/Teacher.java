import java.util.*;

public class Teacher {

    private static final int COUNT = 15;
    public static ArrayList<Teacher> tasks;
    public static ArrayList<Teacher> tasks2;
    private int multiplier1;
    private int multiplier2;
    private int result;

    public Teacher(int multiplier1, int multiplier2) {
        this.multiplier1 = multiplier1;
        this.multiplier2 = multiplier2;
        result = multiplier1 * multiplier2;
    }

    public static ArrayList<Teacher> getTasks() { return tasks;     }
    public int getMultiplier1() { return multiplier1;     }
    public int getMultiplier2() { return multiplier2;    }
    public int getResult() { return result;    }

    public static void main(String[] args) {  //------------------------------------------------------------

        System.out.println("HW 3 Задание 2 : 15 уникальных вопросов по таблице умножения_____________________________ ");
        System.out.println();

        ArrayList<Teacher> tasks = new ArrayList<>();
        tasks.add(new Teacher(2,2));tasks.add(new Teacher(2,3));tasks.add(new Teacher(2,4));tasks.add(new Teacher(2,5));
        tasks.add(new Teacher(2,6));tasks.add(new Teacher(2,7));tasks.add(new Teacher(2,8));tasks.add(new Teacher(2,9));
        tasks.add(new Teacher(3,2));tasks.add(new Teacher(3,3));tasks.add(new Teacher(3,4));tasks.add(new Teacher(3,5));
        tasks.add(new Teacher(3,6));tasks.add(new Teacher(3,7));tasks.add(new Teacher(3,8));tasks.add(new Teacher(3,9));
        tasks.add(new Teacher(4,2));tasks.add(new Teacher(4,3));tasks.add(new Teacher(4,4));tasks.add(new Teacher(4,5));
        tasks.add(new Teacher(4,6));tasks.add(new Teacher(4,7));tasks.add(new Teacher(4,8));tasks.add(new Teacher(4,9));
        tasks.add(new Teacher(5,2));tasks.add(new Teacher(5,3));tasks.add(new Teacher(5,4));tasks.add(new Teacher(5,5));
        tasks.add(new Teacher(5,6));tasks.add(new Teacher(5,7));tasks.add(new Teacher(5,8));tasks.add(new Teacher(5,9));
        tasks.add(new Teacher(6,2));tasks.add(new Teacher(6,3));tasks.add(new Teacher(6,4));tasks.add(new Teacher(6,5));
        tasks.add(new Teacher(6,6));tasks.add(new Teacher(6,7));tasks.add(new Teacher(6,8));tasks.add(new Teacher(6,9));
        tasks.add(new Teacher(7,2));tasks.add(new Teacher(7,3));tasks.add(new Teacher(7,4));tasks.add(new Teacher(7,5));
        tasks.add(new Teacher(7,6));tasks.add(new Teacher(7,7));tasks.add(new Teacher(7,8));tasks.add(new Teacher(7,9));
        tasks.add(new Teacher(8,2));tasks.add(new Teacher(8,3));tasks.add(new Teacher(8,4));tasks.add(new Teacher(8,5));
        tasks.add(new Teacher(8,6));tasks.add(new Teacher(8,7));tasks.add(new Teacher(8,8));tasks.add(new Teacher(8,9));
        tasks.add(new Teacher(9,2));tasks.add(new Teacher(9,3));tasks.add(new Teacher(9,4));tasks.add(new Teacher(9,5));
        tasks.add(new Teacher(9,6));tasks.add(new Teacher(9,7));tasks.add(new Teacher(9,8));tasks.add(new Teacher(9,9));

        ArrayList<Teacher> tasks2 = new ArrayList<>();
        System.out.println(uniqueList(tasks));

        Set<Teacher> questions = new HashSet<Teacher>(tasks2);
        questions15(questions);


    } //main ------------------------------------------------------------------------------------------------
    public static void questions15(Set<Teacher> questions) {
        int i = 1;
        Iterator<Teacher> iter = questions.iterator();
        while(iter.hasNext()) {
            Teacher next = iter.next();
            System.out.println(next + "\n");
            if (i == COUNT) {
                break;
            } else i++;
        }
    }
    public static ArrayList<Teacher>  uniqueList(ArrayList<Teacher> tasks) {
        for (Teacher el : tasks) {
            Iterator<Teacher> iter = tasks.iterator();
        while(iter.hasNext()) {
            Teacher next = iter.next();
            if (el.getMultiplier1() != next.getMultiplier2() && el.getMultiplier2() != next.getMultiplier1()) {
                tasks2.add(el);
            } else {
                tasks2.add(el);
                tasks.remove(next);
                }
            }
        }
        return tasks2;
    }

    @Override
    public String toString() {
        return multiplier1 + "*" + multiplier2 + "=" + result + " ";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return multiplier1 == teacher.multiplier1 && multiplier2 == teacher.multiplier2;
    }
    @Override
    public int hashCode() {
        return Objects.hash(multiplier1, multiplier2);
    }
} // Class
