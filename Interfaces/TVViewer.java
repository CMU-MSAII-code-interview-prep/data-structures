package Interfaces;

public class TVViewer {
    
    IRemote remoteInRightHand;

    public TVViewer() {
        remoteInRightHand = null;
    }

    public void pickUp(IRemote other) {
        if (remoteInRightHand == null)
            remoteInRightHand = other;
        else
            System.out.println("Can't pick up remote while holding another");
    }

    public void putDown(IRemote other) {
        remoteInRightHand = null;
    }

    public void checkBattery() {
        if (remoteInRightHand == null)
            System.out.println("not holding a remote yet");
        else System.out.println("Battery percentage is " + remoteInRightHand.batteryLevel());
    }

    public static void main(String[] args) {
        AppleTVRemote a = new AppleTVRemote();
        SonyTVRemote s = new SonyTVRemote();
        TVViewer viewer = new TVViewer();

        viewer.checkBattery();
        viewer.pickUp(s);
        viewer.pickUp(a);
        viewer.checkBattery();
    }
}
