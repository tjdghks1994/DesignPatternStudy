package strategy;

import java.util.Random;

public class WinningStrategy implements Strategy {
    // 이전 승부에 이겼다면, 다음에도 같은 손을 내는 어리석은 전략을 취한다
    // 만약 이전 승부에서 졌다면, 다음 손은 난수를 사용하여 결정한다

    private Random random;  // 난수를 생성하기 위한 Random 인스턴스
    private boolean won;    // 이전 승부의 결과 값 - 이겼으면 true, 졌으면 false
    private Hand prevHand;  // 이전 승부에서 낸 손

    public WinningStrategy(int seed) {
        random = new Random(seed);
    }
    @Override
    public Hand nextHand() {
        if (!won) {
            prevHand = Hand.getHand(random.nextInt(3));
        }
        return prevHand;
    }

    @Override
    public void study(boolean win) {
        won = win;
    }


}
