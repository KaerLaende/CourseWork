package Staff;

import java.util.Objects;

public class Managers extends Staff {
    public Managers(String name, String surname, int age, int position, int salary) {
        super(name, surname, age, position, salary);
    }
    private final String department = " Отдел продаж";

    public String getDepartment() {
        return department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Managers managers = (Managers) o;
        return department.equals(managers.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), department);
    }

    @Override
    public String toString() {
        return super.toString()+ " " + department;
    }

    public static int upSalary(int salary) {
        double persent = 5; // у манагеров повышенный процент индексации з\п
        return salary = (int) ((salary * (persent/100)) + salary); // допустим в компании з\п без учета копеек.
    }
}
