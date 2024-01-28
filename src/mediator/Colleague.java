package mediator;

public interface Colleague {
    // Mediator를 설정한다
    void setMediator(Mediator mediator);

    // Mediator에서 활성/비활성을 지시한다
    void setColleagueEnabled(boolean enabled);
}
