package Cars;

import Doors.CountDoors;
import beepers.Beeper;
import beepers.Hoot;
import engines.Engine;
import engines.Engine12;

public class Lambo extends Car {

    public Lambo(Beeper beeper, Engine engine, CountDoors countDoors) {
        super(beeper, engine, countDoors);
    }

}
