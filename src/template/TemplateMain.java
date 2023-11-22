package template;

public class TemplateMain {
    public static void main(String[] args) {
        // 'H'를 가진 CharDisplay 인스턴스를 생성
        AbstractDisplay d1 = new CharDisplay('H');

        // "Hello, world."를 가진 StringDisplay 인스턴스를 생성
        AbstractDisplay d2 = new StringDisplay("Hello, world.");

        // d1,d2 모두 같은 AbstractDisplay의 하위 클래스의 인스턴스이므로 상속한 display 메서드를 호출할 수 있다
        // 실제 동작은 CharDisplay나 StringDisplay 클래스에서 정해진다 (다형성 - 오버라이딩)
        d1.display();
        System.out.println();
        d2.display();

        // AbstractDisplay 인터페이스 활용
        AbstractDisplayIF di1 = new CharDisplayImpl('I');
        AbstractDisplayIF di2 = new StringDisplayImpl("Hello, world.");

        di1.display();
        System.out.println();
        di2.display();
    }
}
