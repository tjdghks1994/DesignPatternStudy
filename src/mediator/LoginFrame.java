package mediator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends Frame implements ActionListener, Mediator {
    private ColleagueCheckBox checkGuest;   // 게스트 로그인
    private ColleagueCheckBox checkLogin;   // 사용자 로그인
    private ColleagueTextField textUser;    // 아이디 입력
    private ColleagueTextField textPass;    // 패스워드 입력
    private ColleagueButton buttonOk;       // OK 버튼
    private ColleagueButton buttonCancel;   // 취소 버튼

    // Colleague를 생성하고 배치한 후에 표시
    public LoginFrame(String title) {
        super(title);
        // 배경색 설정
        setBackground(Color.lightGray);
        // 레이아웃 매니저를 사용해 4x2 그리드를 만든다
        setLayout(new GridLayout(4, 2));
        // Colleague를 생성한다
        createColleagues();

        // 배치한다
        add(checkGuest);
        add(checkLogin);
        add(new Label("Username:"));
        add(textUser);
        add(new Label("Password:"));
        add(textPass);
        add(buttonOk);
        add(buttonCancel);

        // 활성 / 비활성 초기 설정을 한다
        colleagueChanged();

        // 표시한다
        pack();
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent event) {
        System.out.println(event.toString());
        System.exit(0);
    }
    // Colleague를 생성한다
    @Override
    public void createColleagues() {
        // CheckBox
        CheckboxGroup g = new CheckboxGroup();
        checkGuest = new ColleagueCheckBox("Guest", g, true);
        checkLogin = new ColleagueCheckBox("Login", g, false);

        // TextField
        textUser = new ColleagueTextField("", 10);
        textPass = new ColleagueTextField("", 10);
        textPass.setEchoChar('*');

        // Button
        buttonOk = new ColleagueButton("OK");
        buttonCancel = new ColleagueButton("Cacnel");

        // Mediator를 설정한다
        checkGuest.setMediator(this);
        checkLogin.setMediator(this);
        textUser.setMediator(this);
        textPass.setMediator(this);
        buttonCancel.setMediator(this);
        buttonOk.setMediator(this);

        // Listener 설정
        checkGuest.addItemListener(checkGuest);
        checkLogin.addItemListener(checkLogin);
        textUser.addTextListener(textUser);
        textPass.addTextListener(textPass);
        buttonOk.addActionListener(this);
        buttonCancel.addActionListener(this);
    }
    // Colleague의 상태가 바뀌면 호출된다
    @Override
    public void colleagueChanged() {
        if (checkGuest.getState()) {
            // 게스트 로그인
            textUser.setColleagueEnabled(false);
            textPass.setColleagueEnabled(false);
            buttonOk.setColleagueEnabled(true);
        } else {
            // 사용자 로그인
            textUser.setColleagueEnabled(true);
            userpassChanged();
        }
    }

    // textUser 또는 textPass의 변경이 있다
    // 각 Colleague의 활성 / 비활성을 판정한다
    private void userpassChanged() {
        if (textUser.getText().length() > 0) {
            textPass.setColleagueEnabled(true);
            if (textPass.getText().length() > 0) {
                buttonOk.setColleagueEnabled(true);
            } else {
                buttonOk.setColleagueEnabled(false);
            }
        } else {
            textPass.setColleagueEnabled(false);
            buttonOk.setColleagueEnabled(false);
        }
    }


}
