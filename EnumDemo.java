// use to determin the state 
// when we dont want to return in string we return enum
enum ProcessState {
    NEW,
    READY,
    RUNNING,
    WAITING,
    TERMINATED
}
public class EnumDemo {
    public static void main(String[] args) {
        ProcessState state = ProcessState.NEW;
        System.out.println(state);
        if(state == ProcessState.READY){
            System.out.println("Sending for execution");
        } else {
            System.out.println("Process not Ready yet");
        }
    }
}
