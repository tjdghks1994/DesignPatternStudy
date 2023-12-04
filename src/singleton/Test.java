package singleton;

public class Test {
    private static Test test = null;

    private Test() {
        System.out.println("인스턴스가 생성되었습니다.");
        slowdown();
    }

    public static Test getInstance() {
        if (test == null) {
            test = new Test();
        }
        return test;
    }

    private void slowdown() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
