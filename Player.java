package rzutkosciagra;

abstract public class Player {

    protected String name = "Anonim";

    public Player() {

    }

    public Player(String name) {
        setName(name);
    }

    abstract public int guess();

    public final void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Imię ustawiono domyślnie!");
            throw new IllegalArgumentException("Imię nie może być puste!");

        }
    }

    public String getName() {
        return name;
    }

}
