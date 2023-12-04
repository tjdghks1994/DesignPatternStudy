package singleton;

public class TicketMaker {
    private static TicketMaker ticketMaker = new TicketMaker();
    private TicketMaker () {
        System.out.println("Singleton 패턴을 적용하여 인스턴스는 1개만 생성됩니다.");
    }
    public static TicketMaker getInstance() {
        return ticketMaker;
    }
    private int ticket = 1000;

    public synchronized int getNextTicketNumber() {
        return ticket++;
    }

    public int getTicket() {
        return ticket;
    }

    public static void main(String[] args) {
        TicketMaker ticketMaker = TicketMaker.getInstance();
        ticketMaker.getNextTicketNumber();
        ticketMaker.getNextTicketNumber();
        ticketMaker.getNextTicketNumber();

        System.out.println(ticketMaker.getTicket());
    }
}
