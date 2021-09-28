package beepers;

public class Buzzer implements Beeper {

    @Override
    public String makeSound() {
        return "Buzzer";
    }
}
