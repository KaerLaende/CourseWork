package Staff;

import Staff.Staff;

public class Bosses extends Staff {
    public Bosses(String name, String surname, int age, int position, int salary) {
        super(name, surname, age, position, salary);
        this.department = department;
    }

    String department = "Руководитель!";
    @Override
    public String toString() {
        return super.toString()+ " " + department;
    }

    public static int upSalary(int salary) {
        double persent = 10; // у руководства самый большой процент индексации з\п
        return salary = (int) ((salary * (persent / 100)) + salary); // допустим в компании з\п без учета копеек.
    }
}
