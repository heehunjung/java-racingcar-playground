package racingcarGame;

public class Car {
    private final String name;
    private int location;

    public String getName() {
        return name;
    }

    public int getLocation() {
        return location;
    }

    Car(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException();
        }
        this.name = name;
        this.location = 0;
    }

    public void move(int rand) {
        if (rand >= 4 )
            this.location += 1;
    }
}
