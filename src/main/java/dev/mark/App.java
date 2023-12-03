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
        Person mark = new Person("Mark", "Kil", 1234326, 1994, "Russia", 'H');
        Person giacomo = new Person("Giacomo", "Corso", 1112234, 1985, "France", 'H');
        mark.printPersonInfo();
        System.out.println("---------------------------------");
        giacomo.printPersonInfo();
    }
}
