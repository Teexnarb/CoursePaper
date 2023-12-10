public class Main {
    private static final Employee[] employee = new Employee[10];
    public static void main(String[] args) {
        System.out.println("Пункт a");
        employee[0] = new Employee("Гайбышев Данил Радифович", 20000.02, 1, 1);
        employee[1] = new Employee("Волкова Анна Олеговна", 75000.00, 1, 2);
        employee[2] = new Employee("Мещеряков Владислав Олегович", 35529.91, 2, 3);
        employee[3] = new Employee("Петров Степан Всеволодович", 19923.23, 2, 4);
        employee[4] = new Employee("Шолохов Никита Сергеевич", 45879.31, 3, 5);
        employee[5] = new Employee("Яшков Антон Сергеевич", 39876.76, 3, 6);
        employee[6] = new Employee("Сельнихин Евгений Фёдорович", 98765.43, 4, 7);
        employee[7] = new Employee("Варачев Андрей Евгеньевич", 54321.09, 4, 8);
        employee[8] = new Employee("Крылосов Иван Юрьевич", 98765.00, 5, 9);
        employee[9] = new Employee("Сельнихина Надежда Даниловна", 76532.41, 5, 10);
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i]);
        }
        System.out.println("Пункт b");
        double sum = 0;
        for (int i = 0; i < employee.length; i++) {
            sum +=employee[i].getSalaries();
        }
        System.out.println(sum);
        System.out.println("Пункт c");
        double maxSalaries = -1;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getSalaries() > maxSalaries) {
                maxSalaries = employee[i].getSalaries();
            }
        }
        System.out.println("Максимальная зарплата сотрудника "+maxSalaries);
        System.out.println("Пункт d");
        double minSalaries = 1000000;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getSalaries() < minSalaries) {
                minSalaries = employee[i].getSalaries();
            }
        }
        System.out.println("Минимальная зарплата сотрудника "+minSalaries);
        System.out.println("Пункт e");
        double sum1 = 0;
        for (int i = 0; i < employee.length; i++) {
            sum1 += employee[i].getSalaries();
        }
        double average = sum1 / employee.length;
        System.out.println("Средняя трата на зарплату составляет - " + average);
        System.out.println("Пункт f");
        for (int i = 0; i < employee.length; i++) {
            System.out.println("ФИО сотрудника: " + employee[i].getInitials() + ".");
        }
    }
}