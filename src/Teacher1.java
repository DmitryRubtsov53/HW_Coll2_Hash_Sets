import java.util.*;

public class Teacher1 {

     private static final int COUNT = 15;
     private final int mult1;
     private final int mult2;
     private int result;
        Teacher1 (int mult1, int num2){
            this.mult1 = mult1;
            this.mult2 = num2;
            this.result = mult1*num2;
        }

    public static void main(String[] args) {  //----------------------------------------------------------------------

        System.out.println("HW 3 Задание 2 : 15 уникальных вопросов по таблице умножения_____________________________");
        System.out.println();

        List<Teacher1> tasks = new ArrayList<>();
        for (int i = 2; i < 10; i++) {
            for (int j = 2; j < 10; j++) {
                tasks.add(new Teacher1(i,j));
            }
        }
        Random random = new Random();

        Set<Teacher1> taskSet = new HashSet<>();

        ArrayList<Teacher1> uni = new ArrayList<>();
        for (int i = 0; i < tasks.size()-1; i++) {
            if (tasks.get(i).result!=tasks.get(i+1).result){
                uni.add(tasks.get(i));
            }
        }
        for (int i = 0; i < COUNT; i++){
            taskSet.add(uni.get(random.nextInt(uni.size())));
        }
        printSet(taskSet);

    } //main --------------------------------------------------
    public static void printSet (Set<Teacher1> teacherSet) {
        for (Teacher1 el : teacherSet) {
            System.out.println(el);
        }
    }
    public String toString() {
        return mult1 + "*" + mult2 + " = " + result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher1 teacher1 = (Teacher1) o;
        return mult1 == teacher1.mult1 && mult2 == teacher1.mult2 && result == teacher1.result;
    }

    @Override
    public int hashCode() {
        return Objects.hash(mult1, mult2, result);
    }
} // Class