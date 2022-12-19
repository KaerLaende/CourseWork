import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Та да-а-ам!!!
        System.out.println("Компания: Спецвездец ☺");
        // ниже все те неудачники, которых приняли на работу:
        Staff ivanovIvan = new Staff("Иван", "Иванов", 20, 1, 20000);
        Staff sidorovFedya = new Staff("Фёдор", "Сидоров", 21, 2, 25000);
        Staff petrovaElena = new Staff("Елена", "Петрова", 25, 3, 30000);
        Staff vasilievaMariya = new Staff("Мария", "Васильева", 30, 4, 40000);
        Staff volkovOleg = new Staff("Волков", "Олег", 35, 5, 50000);
        Staff borisovaOksana = new Staff("Оксана", "Борисова", 45, 6, 60000);
        // ...не уверен, работает ли хоть кто нибудь из них нормально!?

        //Создаю "изменяемый" массив всех сотрудников компании, для удобства использования вычеслений касающихся всех сотрудников
        List<Staff> staffList = new ArrayList<>();
        staffList.add(ivanovIvan);
        staffList.add(sidorovFedya);
        staffList.add(petrovaElena);
        staffList.add(vasilievaMariya);
        staffList.add(volkovOleg);
        staffList.add(borisovaOksana);
        System.out.println("Количество сотрудников компании: " + staffList.size());// проверка размера массива сотрудников компании
        for (int i = 0; i < staffList.size(); i++) {
            System.out.println(staffList/*почему не даёт написать[i]*/.get(i)/*почему через get(i)*/ +"; "); // и получается везде 0... какого лешего так? Это изза Арайлист, но что с ним не так?
        }


        int[] salaryList = new int[staffList.size()];

        //хочу в созданный листЗарплат с помощью цикла внести данные о зарплатах всех сотрудников
        for (int i = 0; i < salaryList.length; i++) {
            //salaryList[i] = salaryList[i].salary; // как это сделать?
            System.out.print(salaryList[i] + "; ");
        }
        // я хз кто это все наговнокодил... но это точно не Я!

    }
}