package engines;

public class Electro implements Engine {

    public String prepareFSD() {
        return "Prepared";
    }

    @Override
    public String makeRotation() {
        return "330km/h";
    }
}
