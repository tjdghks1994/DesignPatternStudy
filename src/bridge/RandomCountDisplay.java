package bridge;

import java.util.Random;

public class RandomCountDisplay extends Display {

    public RandomCountDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void randomDisplay(int times) {
        int randomCount = (int) (Math.random() * times)+1;
        open();
        for (int i = 0; i < randomCount; i++) {
            print();
        }
        close();
    }
}
