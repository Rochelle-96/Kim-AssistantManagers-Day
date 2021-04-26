package second.event;

public class EventMessage {
    private EventMessage eventMessage;

    public void showSelectedEventMessage(String message) {
        System.out.print(message);
    }

    public void doLeisureMessage(){
        System.out.println("둘 중 하나만 선택하셔야 됩니다.");
        System.out.println("<1> 동료들과 당구를 치러간다.");
        System.out.println("<2> 동료들과 게임을 하러간다. " + "\n");
    }

    public void comeBackHomeTime1(){
        System.out.println("둘 중 하나만 선택하셔야 됩니다.");
        System.out.println("<1> 제시간에 귀가한다. ");
        System.out.println("<2> 늦게 귀가한다. " + "\n");
    }

    public void comeBackHomeTime(){
        System.out.println("셋 중 하나만 선택하셔야 됩니다.");
        System.out.println("<1> 일찍 귀가한다.");
        System.out.println("<2> 제시간에 귀가한다. ");
        System.out.println("<3> 늦게 귀가한다. " + "\n");
    }

    public void overTimeSelect(){
        System.out.println("둘 중 하나만 선택하셔야 됩니다.");
        System.out.println("<1> 늦게 귀가한다. ");
        System.out.println("<2> 도망친다. " + "\n");
    }
}
