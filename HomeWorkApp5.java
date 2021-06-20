public class HomeWorkApp5 {
    public static void main (String[] args) {
        Employee[] employArray = new Employee[5];
        employArray[0] = new Employee("Иванов Андрей", "Начальник отдела", "ivanov@firma.ru", "+79102482331", 100000, 47);
        employArray[1] = new Employee("Андреев Николай", "Зам.нач.отдела", "andreev@firma.ru", "+79102487601", 90000, 55);
        employArray[2] = new Employee("Николаева Ольга", "Секретарь", "nikolaeva@firma.ru", "+79102484848", 35000, 22);
        employArray[3] = new Employee("Ольгин Сергей", "Ведущий инженер", "olgin@firma.ru", "+79102488327", 90000, 42);
        employArray[4] = new Employee("Сергеев Олег", "Младший инженер", "sergeev@firma.ru", "+79102485190", 25000, 19);

        int olderThan=40;
        getEmployeeOlderThan(employArray,olderThan);
    }

    private static void getEmployeeOlderThan (Employee[] allOffice, int olderThan) {
        for (Employee person : allOffice) {
            if (person.getAge() > olderThan) {
                person.printEmployee();
            }
        }
    }

}
