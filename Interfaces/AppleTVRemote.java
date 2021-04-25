package Interfaces;

public class AppleTVRemote implements RemoteController {


    public void on() {
        System.out.println("Turning Apple TV on");  
    }


    public void off() {
        System.out.println("Turning Apple TV off");  
    }

    
    public void volumeUp() {
        System.out.println("Turning Apple TV volume up");  
    }

    public void volumeDown() {
        System.out.println("Turning Apple TV volume down");
    }
    
}
