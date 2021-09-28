package Cars;

import Doors.CountDoors;
import beepers.Beeper;
import engines.Engine;

public class SportCar extends Car {


    public SportCar(Beeper beeper, Engine engine, CountDoors countDoors) {
        super(beeper, engine, countDoors);
    }

    public void removeTheRoof() {
        System.out.println("Roof removed");
    }


}
