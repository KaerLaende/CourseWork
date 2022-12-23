import Staff.Staff;
import Staff.*;

import java.util.List;

public class Service {
    /* Класс - помощник
    *  хранящий в себе методы для работы с масивами и обьектами
    *  данной программы
    *
    *=================================Методы класса===============================*/

    // проверка размера массива сотрудников компании
    public static void printCountStaff() {
        System.out.println("Количество сотрудников компании: " + EmployeeBook.getStaffList().size());
    }
    //вывод перечня сотрудников:
    public static void printStaffList() {
        for (int i = 0; i < EmployeeBook.getStaffList().size(); i++) {
            System.out.println(EmployeeBook.getStaffList().get(i) + "; ");
        }
    }
    //вывод перечня должностей
    public static void printStaffPositions() {
        System.out.println("Перечень должностей сотрудников:");
        for (int i = 0; i < Staff.positionList.length; i++) {
            System.out.print(Staff.positionList[i] + ';' + ' ');
        }
        System.out.println();
    }

    //метод получения суммы целочисленного массива
    public static int getSumSalary(int[] salary) {
        int sumSalary = 0;
        for (int i = 0; i < salary.length; i++) {
            sumSalary += salary[i];
        }
        return sumSalary;
    }

    public static int getMinSalary(int[] salary) {
        int minSalary = salary[1];//берем любое число из массива. Если не угадали - циклом оно поменяется на верное.
        for (int i = 0; i < salary.length; i++) {
            if (minSalary > salary[i]) {
                minSalary = salary[i];
            }
        }
        return minSalary;
    }

    public static int getMaxSalary(int[] salary) {
        int maxSalary = salary[1];
        for (int i = 0; i < salary.length; i++) {
            if (maxSalary < salary[i]) {
                maxSalary = salary[i];
            }
        }
        return maxSalary;
    }
    // работа с отделом - в данном случае классом через equals
    public static void printListManagers() {
        System.out.println("Отдел продаж:");
        for (int i = 0; i < EmployeeBook.getStaffList().size(); i++) {
            if (EmployeeBook.getStaffList().get(i).getClass().equals(Managers.class)) {
                System.out.println(EmployeeBook.getStaffList().get(i));
            }
        }
    }
    public static void printListBosses() {
        System.out.println("Отдел начальников:");
        for (int i = 0; i < EmployeeBook.getStaffList().size(); i++) {
            if (EmployeeBook.getStaffList().get(i).getClass().equals(Bosses.class)) {
                System.out.println(EmployeeBook.getStaffList().get(i));
            }
        }
    }


    // метод определения обьекта по сумме затрат
    public static Staff identificateStaff(int salary, int[] listInt, List<Staff> listObject) {
        int i;
        for (i = 0; i < listInt.length; i++) {// цикл прохода по каждому элементу массива
            if (salary == listInt[i]) {//находим совпадение в зарплате
                return listObject.get(i);// возвращаем элемент массива с соответствующей ячейкой [i]
            }
        }
        Object object = listObject.get(i);
        return listObject.get(i);// возврат найденого обьекта
    } // пока работает - не лезть!

    // >М<етод индексации зарплаты, в зависимости от отдела
    public static void upSalary(List<Staff> listObject){
        for (int i = 0; i < listObject.size(); i++) {
            if (listObject.get(i).getPosition() == 0) {
                listObject.get(i).setSalary(Staff.upSalary(listObject.get(i).getSalary()));
                // я оХ*Ел пока написал эту ↑ строчку
            } else if (listObject.get(i).getPosition() > 0 && listObject.get(i).getPosition() < 4) {
                listObject.get(i).setSalary(Managers.upSalary(listObject.get(i).getSalary()));
            } else {
                listObject.get(i).setSalary(Bosses.upSalary(listObject.get(i).getSalary()));
            }
        }
    }

}
