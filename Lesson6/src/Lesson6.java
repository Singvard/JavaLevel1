public class Lesson6 {

    public static void main(String[] args) {
		Cat cat1 = new Cat();
		cat1.setName("Мурзик");
		cat1.run(100);
		cat1.swim(5);

		Cat cat2 = new Cat();
		cat2.setName("Гурджибек");
		cat2.run(201);

		Dog dog1 = new Dog();
		dog1.setName("Рекс");
		dog1.run(489);
		dog1.swim(5);

		Dog dog2 = new Dog();
		dog2.setName("Мухтар");
		dog2.run(501);
		dog2.swim(11);

		Dog dog3 = new Dog();
		dog3.setName("Барбос");
		dog3.run(1);
		dog3.swim(1);

		Cat.howMuch();
		Dog.howMuch();
		Animal.howMuch();
	}
}
