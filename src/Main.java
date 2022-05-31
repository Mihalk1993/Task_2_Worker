public class Main {

    public static void main(String[] args) {
        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener errrorListener = System.out::println;

        Worker worker = new Worker(listener, errrorListener);
        worker.start();

    }
}
