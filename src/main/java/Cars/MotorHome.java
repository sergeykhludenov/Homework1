package Cars;

import Doors.CountDoors;
import beepers.Beeper;
import engines.Engine;

public class MotorHome extends Car{

    public MotorHome(Beeper beeper, Engine engine, CountDoors countDoors) {
        super(beeper, engine, countDoors);
    }


    public void parkingInTheCamp() {
        System.out.println("Motorhome parked in the camp");
    }

}
