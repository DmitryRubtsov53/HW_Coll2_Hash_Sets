import java.util.*;

public class Passport {

    private final String numberPass;
    private String fullName;
    private String birthday;

    public Passport(String numberPass, String fullName, String birthday) {
        this.numberPass = numberPass;
        this.fullName = fullName;
        this.birthday = birthday;
    }

    public String getNumberPass() { return numberPass; }

    public String getFullName() {   return fullName;   }
    public void   setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getBirthday()   {  return birthday;  }
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    public static void main(String[] args) {  //-------------------------------------------------------------

    System.out.println("HW 3 Задание 3 :  Паспорта (уникальность и смена владельца) _____________________ ");
        System.out.println();

        Set<Passport> base = new HashSet<>();
        base.add(new Passport("123456", "Иван Иванович Иванов", "01.01.2000"));
        base.add(new Passport("223456", "Пётр Иванович Петров", "01.01.2000"));
        base.add(new Passport("323456", "Семён Иванович Титов", "01.01.2000"));
        base.add(new Passport("423456", "Антон Иванович Котов", "01.01.2000"));

        System.out.println(base);   System.out.println();
        System.out.println();

        System.out.println(  findPass(base)  );

        Passport savva = new Passport("223456", "Савва Тимофеевич Морозов", "15.02.1862");
        Passport iosif = new Passport("123456", "Иосиф Виссарионович Сталин", "18.12.1878");

        addPass(base,savva);
        System.out.println(base);   System.out.println();
        addPass(base,iosif);
        System.out.println(base);   System.out.println();

    } // main ------------------------------------------------------------------------------
    public static void addPass (Set<Passport> base, Passport pass) {
        Iterator<Passport> iter = base.iterator();
          while(iter.hasNext()) {
              Passport next = iter.next();
              if (!(pass.getNumberPass()).equals(next.getNumberPass())) {
                  base.add(pass);
              } else {
                  next.setFullName(pass.getFullName());
                  next.setBirthday(pass.getBirthday());
              }
          }
    }

    public static Passport findPass (Set<Passport> base) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Для поиска по Базе ведите 6-и значный номер паспорта:");
        String p = scanner.nextLine();
        for (Passport el : base) {
            if (p.equals(el.getNumberPass()))
                return el;
        }
            return null;
    }

// -----------------------------------------------------------------------------------------
    @Override
    public String toString() {
        return "Паспорт № " + numberPass + ", ФИО: " + fullName + ", ДР: " + birthday + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return Objects.equals(numberPass, passport.numberPass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberPass);
    }
}
