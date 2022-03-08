public class Lesson5 {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Арнольд Карлович Шварценеггер","Терминатор","mr_olympics@mail.ru",1234567890,1000000,55);

        Employee employee2 = new Employee("Чак Чакович Норрис","Бог-Император Человечества","onepunchman@chuck.com",7777777,7777777, 41);

        Employee employee3 = new Employee("Сильвестр Андреевич Сталлоне","Рэмбо","real_rambo@vietkong.war",892365219,471942,62);

        Employee employee4 = new Employee("Жан Клодович Вам-Дам","Мистер Шпагат","alcodrugs@former.star",1001101001,9999,40);

        Employee employee5 = new Employee("Брюс Лиевич Уиллис","Орешек","hardnuts@alpha.bruce",6660666,56565656,18);

        Employee[] empArr = new Employee[5];
        empArr[0] = employee1;
        empArr[1] = employee2;
        empArr[2] = employee3;
        empArr[3] = employee4;
        empArr[4] = employee5;

        for (int i = 0; i < empArr.length; i++){
            if (empArr[i].age > 40) {
                empArr[i].tellMeMore();
            }
        }
    }

}
