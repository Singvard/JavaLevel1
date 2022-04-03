public class Lesson5 {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.setFullname("Арнольд Карлович Шварценеггер");
        employee1.setPosition("Терминатор");
        employee1.setEmail("mr_olympics@mail.ru");
        employee1.setPhone(1234567890);
        employee1.setSalary(1000000);
        employee1.setAge(55);

        Employee employee2 = new Employee();
        employee2.setFullname("Чак Чакович Норрис");
        employee2.setPosition("Бог-Император Человечества");
        employee2.setEmail("onepunchman@chuck.com");
        employee2.setPhone(7777777);
        employee2.setSalary(7777777);
        employee2.setAge(777);

        Employee employee3 = new Employee();
        employee3.setFullname("Сильвестр Андреевич Сталлоне");
        employee3.setPosition("Рэмбо");
        employee3.setEmail("real_rambo@vietkong.war");
        employee3.setPhone(892365219);
        employee3.setSalary(471942);
        employee3.setAge(62);

        Employee employee4 = new Employee();
        employee4.setFullname("Жан Клодович Вам-Дам");
        employee4.setPosition("Мистер Шпагат");
        employee4.setEmail("alcodrugs@former.star");
        employee4.setPhone(1001101001);
        employee4.setSalary(9999);
        employee4.setAge(40);

        Employee employee5 = new Employee();
        employee4.setFullname("Брюс Лиевич Уиллис");
        employee4.setPosition("Орешек");
        employee4.setEmail("hardnuts@alpha.bruce");
        employee4.setPhone(6660666);
        employee4.setSalary(56565656);
        employee4.setAge(18);

        Employee[] empArr = new Employee[5];
        empArr[0] = employee1;
        empArr[1] = employee2;
        empArr[2] = employee3;
        empArr[3] = employee4;
        empArr[4] = employee5;

        for (int i = 0; i < empArr.length; i++){
            if (empArr[i].getAge() > 40) {
                empArr[i].tellMeMore();
            }
        }
    }

}
