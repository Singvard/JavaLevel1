public class Employee {

    String fullname;
    String position;
    String email;
    int phone;
    int salary;
    int age;

    public Employee(String nameForText, String posForText, String emailForText, int phoneForText, int salaryForText, int ageForText){
        fullname = nameForText;
        position = posForText;
        email = emailForText;
        phone = phoneForText;
        salary = salaryForText;
        age = ageForText;
    }
    public void tellMeMore() {
        System.out.println("ФИО: " + fullname);
        System.out.println("Должность: " + position);
        System.out.println("Эл.почта: " + email);
        System.out.println("Телефон: " + phone);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
        System.out.println();
    }
}
