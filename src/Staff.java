public class Staff {
    private String name;
    private String surname;
    private int age;
    private int position;
    private int salary;

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
        this.salary = salary;
    }

    //ниже я хочу переопределить целочисленную position в название, где номер позиции будет равен индексу массива
    String[] positionList = new String[]{"Стажер", "Специалист", "Ведущий специалист", "Старший специалист", "Заместитель директора", "Директор"};


    public Staff(String name, String surname, int age, int position, int salary) {
        this.name=name;
        this.surname=surname;
        this.age = age;
        this.position = position;
        this.salary = salary;
    }
    public String toString() {
       return "Сотрудник: "+surname +" "+ name +" "+  " возрастом "+age +" лет, находится на должности " + printStaffPosition(positionList,position) + " текущий оклад равен: "+ salary+" рублей.";
    }

    public static int promotion(int position) {
        return position += 1;
    }
    public static void printStaffPosition(String[] positionList,int position){
        System.out.println("должность сотрудника: "+positionList[position]+".");
    }
    public static int upSalary (int salary, int upSalaryPersent){
        return salary=(salary*upSalaryPersent)+salary;
    }



}

