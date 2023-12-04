package singleton;

public class TestMain extends Thread {
    public TestMain(String name) {
        super(name);
    }

    @Override
    public void run() {
        Test test = Test.getInstance();
        System.out.println(getName() + " = obj = " + test);
    }

    public static void main(String[] args) {
        System.out.println("START");
        new TestMain("A").start();
        new TestMain("B").start();
        new TestMain("C").start();
        System.out.println("END");
    }
}
