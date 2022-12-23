import Staff.Staff;
import Staff.*;

import java.util.ArrayList;
import java.util.List;

public class EmployeeBook {


    // ниже все те неудачники, которых приняли на работу:
    Staff ivanovIvan = new Staff("Иван", "Иванов", 20, 0, 20000);
    Staff sidorovFedya = new Managers("Фёдор", "Сидоров", 21, 1, 25000);
    Staff petrovaElena = new Managers("Елена", "Петрова", 25, 2, 30000);
    Staff vasilievaMariya = new Managers("Мария", "Васильева", 30, 3, 40000);
    Staff volkovOleg = new Bosses("Волков", "Олег", 35, 4, 50000);
    Staff borisovaOksana = new Bosses("Оксана", "Борисова", 45, 5, 60000);
    // ...я не уверен, работает ли хоть кто нибудь из них нормально...

    /*Создаю "изменяемый" массив всех сотрудников компании,
     *для удобства использования вычеслений касающихся всех сотрудников
     */
    private static List<Staff> staffList = new ArrayList<>();

    //создаю метод получения информации (сеттер) из Листа в других Классах программы
    public static List<Staff> getStaffList() {
        return staffList;
    }

    public static void setStaffList(List<Staff> staffList) {
        EmployeeBook.staffList = staffList;
    }
    /*=================================Изменения в компании===============================*/


    // добавление новых сотрудников (новая порция не удачников)
     Staff ivanovaGalya = new Managers("Галина", "Иванова", 19, 1, 20000);
     Staff sidorovaOlya = new Managers("Ольга", "Сидорова", 20, 1, 25000);
     Staff petrovMisha = new Managers("Михаил", "Петров", 24, 2, 30000);


    /*===================================Методы EmployeeBook========================*/
    //добавление
    public void addStaff(Object o){
        staffList.add((Staff) o);
    }
    //удаление
    public void removeStaff(Object o){
        staffList.remove((Staff) o);
    }

    /* повышение в должности всех изначальных сотрудников
     * за то что сами не уволились :)
     */
    public void promotionOldStaff(){
        for (int i = 0; i < staffList.size(); i++) {
            staffList.get(i).setPosition(Staff.promotion(staffList.get(i).getPosition()));
        }
    }
    public void upDepartment( ){
        for (int i = 0; i < staffList.size(); i++) {
            if(staffList.get(i).getPosition()==1&&staffList.get(i).getClass()==Staff.class){
                //условие по нахождению высокой позиции    ->    ↑ для текущей долженности           ->              ↑
                Object object =new Managers(staffList.get(i).getName(),staffList.get(i).getSurname(),staffList.get(i).getAge(),staffList.get(i).getPosition(),staffList.get(i).getSalary());
                //я несколько раз Ох*ул пока написал эту ↑ строчку
                addStaff(object);
                //удаление старой строчки
                removeStaff(staffList.get(i));

            } else if(staffList.get(i).getPosition()==4&&staffList.get(i).getClass()==Managers.class){
                Object object =new Bosses(staffList.get(i).getName(),staffList.get(i).getSurname(),staffList.get(i).getAge(),staffList.get(i).getPosition(),staffList.get(i).getSalary());
                addStaff(object);
                removeStaff(staffList.get(i));
            }
        }
    }

}

