public class SalaryList {
    static int[] salaryList = new int[EmployeeBook.getStaffList().size()];

    //хочу в созданный листЗарплат с помощью цикла внести данные о зарплатах всех сотрудников
    public static void putSalaryInList() {
        for (int i = 0; i < salaryList.length; i++) {
            salaryList[i] = EmployeeBook.getStaffList().get(i).getSalary(); //получаем зарплату сотрудника по индексу массива сотрудников
        }
    }
    //вывод в консоль з\п
    public static void printSalaryList(){
        for (int i = 0; i < salaryList.length; i++) {
            salaryList[i] = EmployeeBook.getStaffList().get(i).getSalary(); //получаем зарплату сотрудника по индексу массива сотрудников
            System.out.print(salaryList[i] + "; ");
        }
    }
}
