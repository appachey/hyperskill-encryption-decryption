class TestDrive {
    public static void main(String[] args) throws InterruptedException {
        BurgerStore burgerStore = new BurgerStore();
        String china = "Chinese";
        String america = "American";
        String russia = "Russian";
        burgerStore.orderBurger(china);
        burgerStore.orderBurger(america);
        burgerStore.orderBurger(russia);
    }
}

abstract class BurgerFactory {

    abstract Burger createBurger(String type);

    Burger orderBurger(String type) throws InterruptedException {
        Burger burger = createBurger(type);
        if (burger == null) {
            System.out.println("Sorry, we are not able to create this kind of burger\n");
            return null;
        }
        System.out.println("Making a " + burger.getName() + " Burger");
        burger.putBun();
        burger.putCutlet();
        burger.putSauce();
        Thread.sleep(1500L);
        System.out.println("Done a " + burger.getName() + " Burger" + "\n");
        return burger;
    }
}

class BurgerStore extends BurgerFactory {
    @Override
    Burger createBurger(String type) {
        switch (type) {
            case "Chinese":
                return new ChineseBurger(type);
            case "American":
                return new AmericanBurger(type);
            case "Russian":
                return new RussianBurger(type);
            default:
                return null;
        }
    }
}

abstract class Burger {
    private String name;

    Burger(String name) {
        this.name = name;
    }

    abstract void someMethod();

    String getName() {
        return name;
    }

    void putBun() {
        System.out.println("Putting bun");
    }

    void putCutlet() {
        System.out.println("Putting cutlet");
    }

    void putSauce() {
        System.out.println("Putting sauce");
    }

}

class ChineseBurger extends Burger {

    public void someMethod() {
        System.out.println("");
    }

    public ChineseBurger(String name) {
        super(name);
    }

}

class AmericanBurger extends Burger {

    public void someMethod() {
        System.out.println("");
    }

    public AmericanBurger(String name) {
        super(name);
    }

}

class RussianBurger extends Burger {

    public void someMethod() {
        System.out.println("");
    }

    public RussianBurger(String name) {
        super(name);
    }

}