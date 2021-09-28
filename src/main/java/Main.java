import Cars.SportCar;
import Cars.Lambo;
import Cars.MotorHome;
import Doors.Coupe;
import Doors.HouseOnWheels;
import Doors.Sedan;
import beepers.Buzzer;
import beepers.Hoot;
import beepers.Horn;
import engines.Diesel;
import engines.Electro;
import engines.Engine12;

public class Main {

    public static void main(String[] args) {
        Horn horn = new Horn();
        Buzzer buzzer = new Buzzer();
        Hoot hoot = new Hoot();

        Engine12 engine12 = new Engine12();
        Diesel diesel = new Diesel();
        Electro electro = new Electro();
        Sedan sedan = new Sedan();
        Coupe coupe = new Coupe();
        HouseOnWheels houseOnWheels = new HouseOnWheels();

        Lambo lambo = new Lambo(hoot, engine12, coupe);
        MotorHome motorHome = new MotorHome(buzzer, diesel, houseOnWheels);
        SportCar sportcar = new SportCar(horn, electro, coupe);

        System.out.println("\nLAMBO");
        System.out.println(lambo.checkBeep());
        System.out.println(lambo.checkSpeed());
        System.out.println(lambo.checkDoors());

        System.out.println("\nMOTOR HOME");
        motorHome.parkingInTheCamp();
        System.out.println(motorHome.checkBeep());
        System.out.println(motorHome.checkSpeed());
        System.out.println(motorHome.checkDoors());

        System.out.println("\nSportcar");
        System.out.println(sportcar.checkBeep());
        System.out.println(sportcar.checkSpeed());
        System.out.println(sportcar.checkDoors());
        sportcar.removeTheRoof();
    }
}
