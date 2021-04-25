package Interfaces;

public class AppleTVRemote implements IRemote {


    public float batteryLevel() {
        return 55;
    }

    public void turnOn() {
        System.out.println("Turning Apple TV on");
    }


    public void turnOff() {
        System.out.println("Turning Apple TV off");
    }
    
}
