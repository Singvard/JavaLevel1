public class Cat {
    private String name;
    private int appetite;
    private boolean bellyful;

    public Cat (String name, int appetite, boolean bellyful) {
        this.name = name;
        this.appetite = appetite;
        this.bellyful = bellyful;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public int getAppetite() {
        return this.appetite;
    }

    public void setBellyful( boolean bellyful) {
        this.bellyful = bellyful;
    }

    public boolean isBellyful() {
        return this.bellyful;
    }

    public void eat(Plate p) {
        if (isBellyful() == false) {                    //если кот голоден
            boolean result = p.decreaseFood(appetite);  //то пусть попробует поесть
            if (result == true) {                       // если еды хватило
                setBellyful(true);                      // то кот сыт
            } else {                                    // если еды мало
                setBellyful(false);                     // то кот голодный
            }
        }
    }
}
