package Interfaces;

public class TVRemote implements RemoteController {


    public void on() {
        System.out.println("Turning TV on");
    }

    public void off() {
        System.out.println("Turning TV off");
    }

    public void volumeUp() {
        System.out.println("Turning TV volume up");
    }

    public void volumeDown() {
        System.out.println("Turning TV volume down");
    }
    
}
