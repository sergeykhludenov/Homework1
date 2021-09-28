package Cars;

import Doors.CountDoors;
import beepers.Beeper;
import engines.Engine;

public abstract class Car {

    private Beeper beeper;
    private Engine engine;
    private CountDoors countDoors;

    public Car(Beeper beeper, Engine engine, CountDoors countDoors) {
        this.beeper = beeper;
        this.engine = engine;
        this.countDoors = countDoors;
    }

    public String checkBeep() {

        return beeper.makeSound();
    }

    public String checkSpeed() {

        return engine.makeRotation();
    }

    public String checkDoors() {

        return countDoors.numberOfDoors();
    }
}
