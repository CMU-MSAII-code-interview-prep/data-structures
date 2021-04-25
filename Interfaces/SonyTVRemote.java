package Interfaces;


public class SonyTVRemote implements IRemote {


    public float batteryLevel() {
        return 75;
    }

    public void turnOn() {
        System.out.println("Turning Sony TV on");
    }


    public void turnOff() {
        System.out.println("Turning Sony TV off");
    }
    
}
