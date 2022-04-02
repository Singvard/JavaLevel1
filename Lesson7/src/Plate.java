public class Plate {
    private int food;
    public Plate (int food) {
        this.food = food;
    }

    public void info () {
        System.out.println("plate: " + food);
    }

    public void setFood(int food) {
        this.food = food;
    }

    public int getFood() {
        return this.food;
    }

    public boolean decreaseFood(int n) {
        if (food >= n) { //проверка, что кот не мог съесть больше еды, чем есть в миске
            food -= n;
            return true; //считаем, что еды хватило
        } else {
            System.out.println("Еды недостаточно");
            return false; //считаем, что еды не хватило
        }
    }

    public void increaseFood(int m) {
        food += m;
    }
}