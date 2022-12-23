import Staff.Staff;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        //Та да-а-ам!!!
        EmployeeBook employeeBook = new EmployeeBook(); //создание обьекта для использования не static методами

        System.out.println("Компания: Спецвездец ☺");
        employeeBook.addStaff(employeeBook.ivanovIvan);
        employeeBook.addStaff(employeeBook.sidorovFedya);
        employeeBook.addStaff(employeeBook.petrovaElena);
        employeeBook.addStaff(employeeBook.vasilievaMariya);
        employeeBook.addStaff(employeeBook.volkovOleg);
        employeeBook.addStaff(employeeBook.borisovaOksana);

        System.out.println("============================Изночально=====================");
        Service.printCountStaff();
        Service.printStaffPositions();
        Service.printStaffList();
        System.out.println();

        System.out.println("Оклады сотрудников составляют:");
        SalaryList.putSalaryInList();
        SalaryList.printSalaryList();
        System.out.println();

        System.out.printf("Сумма ежемесячных затрат компании на зароботную плату сотрудников составила %d рублей.%n", Service.getSumSalary(SalaryList.salaryList));
        System.out.println("Минимальная зарплата в компании составила: " + Service.getMinSalary(SalaryList.salaryList));
        System.out.println("Максимальная зарплата в компании составила: " + Service.getMaxSalary(SalaryList.salaryList));
        System.out.println("Средняя зарплата в компании составила " + Service.getSumSalary(SalaryList.salaryList) / SalaryList.salaryList.length);
        System.out.println("Минимальная зарплата у " + Service.identificateStaff(Service.getMinSalary(SalaryList.salaryList), SalaryList.salaryList, EmployeeBook.getStaffList()));
        System.out.println("Максимальная зарплата у " + Service.identificateStaff(Service.getMaxSalary(SalaryList.salaryList), SalaryList.salaryList, EmployeeBook.getStaffList()));
        System.out.printf("Сумма расходов на з/п  %d рублей.%n", Service.getSumSalary(SalaryList.salaryList));
        System.out.println();

        /*==================================ИЗМЕНЕНИЯ В КОМПАНИИ===================================*/
        System.out.println("===========================>>>Few months later<<<<========================");
        //повышение в должности начальных сотрудников
        employeeBook.promotionOldStaff();
        //Корректировка должности
        employeeBook.upDepartment();

        //индексация зароботной платы
        Service.upSalary(EmployeeBook.getStaffList());

        // за особые заслуги изменили зарплату сотрудника:
        employeeBook.petrovaElena.setSalary(50000);
        System.out.println("После индексации зарплаты в компании составили:");
        SalaryList.putSalaryInList();
        SalaryList.printSalaryList();
        System.out.println();

        //удаление одного из стареньких (была самой умной):
        employeeBook.removeStaff(employeeBook.petrovaElena);
        //добавление новых сотрудников
        employeeBook.addStaff(employeeBook.ivanovaGalya);
        employeeBook.addStaff(employeeBook.sidorovaOlya);
        employeeBook.addStaff(employeeBook.petrovMisha);

        System.out.println("==================Списки сотрудников по отделам=================");
        //распечатываем всех из отдела менеджер по продажам
        Service.printListManagers();
        Service.printListBosses();
        System.out.println();
    }
}

/* if (если в этом коде много ошибок) { то его писал не я!}
   else {код мой!}
 */
