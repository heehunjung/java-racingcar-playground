package racingcarGame;

public class Car {
    public String getName() {
        return name;
    }

    public int getLocation() {
        return location;
    }

    String name;
    int location;

    Car(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException();
        }
        this.name = name;
        this.location = 0;
    }
}
