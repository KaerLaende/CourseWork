public class Staff {
    String name;
    String surname;
    int age;
    int position;
    int salary;
    Staff(String name, String surname, int age, int position, int salary) {

    }
    public String toString() {
       return "Сотрудник: "+surname +" "+ name +" "+  " возрастом "+age +" лет, находится на должности "+  position+ " текущий оклад равен: "+ salary+" рублей.";
    }
    //ниже я хочу переопределить целочисленную position в название, где номер позиции будет равен индексу массива
    String[] positionList = new String[]{"Стажер", "Специалист", "Ведущий специалист", "Старший специалист", "Заместитель директора", "Директор"};

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
