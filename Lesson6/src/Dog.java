public class Dog extends Animal {

    public Dog (String name) {
        super(name);
        this.name = name;
    }

    public static int count = 0;
    public Dog(){
        count++;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void run(int distanceRunDog) {
        super.run(distanceRunDog);
        if (distanceRunDog <= 500) {
            System.out.println("Пёс " + name + " пробежал " + distanceRunDog + " м.");
        } else {
            System.out.println("Пёс " + name + " пробежал 500 из " + distanceRunDog + " м. и устал");
        }
    }

    @Override
    public void swim(int distanceSwimDog) {
        super.swim(distanceSwimDog);
        if (distanceSwimDog <= 10) {
            System.out.println("Пёс " + name + " проплыл " + distanceSwimDog + " м.");
        } else {
            System.out.println("Пёс " + name + " проплыл 10 из " + distanceSwimDog + " м. и устал");
        }
    }
    public static void howMuch(){
        System.out.println("Собак создано " + count);
    }

}