
import java.util.Calendar;

public class Person {

    private String name;
    private MyDate birthday;

    public Person(String name, int pp, int kk, int vv) {
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);
    }
    
    public Person(String name, MyDate birthday){
        this.name = name;
        this.birthday = birthday;
        
    }
    
    public Person(String name){
        this(name, Calendar.getInstance().get(Calendar.DATE),
                Calendar.getInstance().get(Calendar.MONTH) + 1, 
                Calendar.getInstance().get(Calendar.YEAR));      
    }
//    public Person(String name) {
//        this.name = name;
//        Calendar nyt = Calendar.getInstance();
//        int year = nyt.get(Calendar.YEAR);
//        int month = nyt.get(Calendar.MONTH) + 1;
//        int day = nyt.get(Calendar.DATE);
//        this.birthday = new MyDate(day, month, year);
//    }
//    

    public int age() {
// calculate the age based on the birthday and the current day
        // you get the current day as follows: 
        int dayToday = Calendar.getInstance().get(Calendar.DATE);
        int monthToday = Calendar.getInstance().get(Calendar.MONTH) + 1; // January is 0 so we add one
        int yearToday = Calendar.getInstance().get(Calendar.YEAR);
        MyDate dateToday = new MyDate(dayToday, monthToday, yearToday);
        int diffYears = this.birthday.differenceInYears(dateToday);

        return diffYears;
    }

    public boolean olderThan(Person compared) {
        // compare the ages based on birthdays
        if (this.birthday.earlier(compared.birthday)) {
            return true;
        } else {
            return false;
        }
    }


public String getName() {
        return this.name;
    }
    
    public String toString() {
        return this.name + ", born " + this.birthday;
    }
}
