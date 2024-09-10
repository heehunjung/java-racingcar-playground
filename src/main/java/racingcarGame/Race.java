package racingcarGame;

public class Race {

    public Car getCar() {
        return car;
    }

    private final Car car;

    public Race(Car car) {
        this.car = car;
    }

    public Car race() {
        Car car = getCar();
        car.location += 1;
        return car;
    }


}
