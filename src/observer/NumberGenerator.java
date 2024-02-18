package observer;

import java.util.ArrayList;
import java.util.List;

public abstract class NumberGenerator {
    // Observer 를 저장한다
    private List<Observer> observers = new ArrayList<>();
    // Observer 를 추가한다
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // Observer 를 삭제한다
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }
    // Observer 에 통지한다
    public void notifyObserver() {
        for (Observer o : observers) {
            o.update(this);
        }
    }

    // 수를 취득한다
    public abstract int getNumber();
    // 수를 생성한다
    public abstract void execute();
}
