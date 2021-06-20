public class Employee {
    private String fio;
    private String profession;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String fio,String profession,String email,String phone,int salary,int age) {
        this.fio = fio;
        this.profession = profession;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;

    }
    int getAge() {
        return age;
    }

    void printEmployee () {
        System.out.println("Имя: " + fio + " Должность: " + profession + " Эл.почта: " + email + " Телефон: " + phone + " ЗП : " + salary + " Возраст: " + age);
    }

}
