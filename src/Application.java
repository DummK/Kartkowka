class Device {

    public void turnOn() {
        System.out.println("Turned On");
    }
    public void turnOff() {
        System.out.println("Turned Off");
    }
}

class Smartphone extends Device {
    public void unlock() {
        System.out.println("Unlocked");
    }
}

public class Application {
    public static void main(String[] args) {
        Smartphone phone = new Smartphone();
        phone.turnOn();
        phone.unlock();
        phone.turnOff();
    }
}