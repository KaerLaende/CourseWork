package Staff;

import java.util.Objects;

public class Staff {
    private String name;
    private String surname;
    private int age;
    private int position;
    private int salary;

    //====================Инкапсуляция==================
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным");
        }
        this.age = age;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary < 0) {
            throw new IllegalArgumentException("Заработная плата не может быть отрицательной");
        }
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Staff staff = (Staff) o;
        return salary == staff.salary && name.equals(staff.name) && surname.equals(staff.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, salary);
    }
    //=================================================

    //ниже я хочу переопределить целочисленную position в название, где номер позиции будет равен индексу массива
    public static String[] positionList = new String[]{"Стажер", "Специалист", "Ведущий специалист", "Старший специалист", "Заместитель директора", "Директор"};

    //============Конструктор===============
    public Staff(String name, String surname, int age, int position, int salary) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.position = position;
        this.salary = salary;
    }

    //=========Переопределение вывода в консоль обьектов==================
    public String toString() {
        return "Сотрудник: " + surname + " " + name + " " + " возрастом " + age + " лет, находится на должности " + positionList[position] + " текущий оклад равен: " + salary + " рублей.";
    }

    //=========Методы класса==============
    //повышение
    public static int promotion(int position) {
        if (position >= 4) {
            return position; //выше заместителя директора повышения нет!
        } else
            return position += 1;
    }

    /*узнаем должность*/
    public static String getPosition(String[] positionList, int position) {
        return positionList[position];
    }

    //увеличение зарплаты
    public static int upSalary(int salary) {
        double persent = 3; // у руководства самый большой процент индексации з\п
        return salary = (int) ((salary * (persent / 100)) + salary); // допустим в компании з\п без учета копеек.
    }


}

