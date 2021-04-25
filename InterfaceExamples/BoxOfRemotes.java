package InterfaceExamples;
import java.util.Stack;

public class BoxOfRemotes {
    
    Stack<RemoteController> remotes;

    public BoxOfRemotes() {
        remotes = new Stack<RemoteController>();
    }

    public void addRemote(RemoteController remote) {
        remotes.push(remote);
    }

    public void turnAllOn() {
        for (RemoteController remote : remotes)
            remote.on();
    }
    
    // public static void main(String args[]) {
    //     TVRemote r1 = new TVRemote();
    //     AppleTVRemote r2 = new AppleTVRemote();
    //     TVRemote r3 = new TVRemote();
    //     AppleTVRemote r4 = new AppleTVRemote();

    //     BoxOfRemotes box = new BoxOfRemotes();
        
    //     box.addRemote(r1);
    //     box.addRemote(r4);
    //     box.addRemote(r2);
    //     box.addRemote(r3);

    //     box.turnAllOn();
    // }
}
