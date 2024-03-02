package command.command;

import java.util.ArrayDeque;
import java.util.Deque;

public class MacroCommand implements Command {
    // 명령의 배열
    private Deque<Command> commands = new ArrayDeque<>();
    @Override
    public void execute() {
        // 모든 명령을 실행
        for (Command c : commands) {
            c.execute();
        }
    }

    // 추가
    public void append(Command command) {
        if (command == this) {
            throw new IllegalArgumentException("자기자신을 추가할 수 없습니다.");
        }
        commands.push(command);
    }

    // 마지막 명령을 삭제
    public void undo() {
        if (!commands.isEmpty()) {
            commands.pop();
        }
    }

    // 전부 삭제
    public void clear() {
        commands.clear();
    }
}
