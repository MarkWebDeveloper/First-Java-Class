package dev.mark;

/**
 * Hello world!
 */
public final class App {
    private App() {
        
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Person mark = new Person("Mark", "Kil", 2348754, 1994);
        Person giacomo = new Person("Giacomo", "Corso", 1111222, 1916);
        mark.printPersonInfo();
        System.out.println("---------------------------------");
        giacomo.printPersonInfo();
    }
}
