package second.message;

public class Message {
    public void showIntro() { //인트로 메세지
        System.out.println("당신의 하루가 시작되었습니다.");
        System.out.println("5일동안 화이팅해보세요!");
        System.out.println("현재 당신의 레벨은 Lv.1 입니다."+ "\n");
        System.out.println("부가설명을 들으시겠습니까? <1> 네, <2> 아니오");
    }

    public void showSubExplainYesMessage() {
        System.out.println("사실 부가설명은 없습니다 ㅋ");
        System.out.println("감사의 의미로 경험치 30점 드리겠습니다." + "\n");
    }

    public void showSubExplainNoMessage() {
        System.out.println("그냥 넘어갑니다." + "\n");
    }

    public void showWakeupMenu() {
        System.out.println("<1>일찍 일어난다 <2>제시간에 일어난다 <3>늦게 일어난다");
    }

    public void showErrorMessage() {
        System.out.println("잘못 선택했으니 다시 선택창으로 돌아가" + "\n");
    }

    public void showFirstDayMenu() {
        System.out.println("셋중 하나만 선택하셔야 됩니다.");
        System.out.println("<1> 부장님 : 자네 팀원들끼리 프로젝트 만들어 !");
        System.out.println("<2> 사수  : 프린트 뽑아야되는데 뽑아줄래 ? ");
        System.out.println("<3> 사장님 : 혹시.. 옆 회사로 파견할 사람 구하는데 갈사람 있나 ?");
    }

    public void showSecondDayMenu(){
        System.out.println("셋중 하나만 선택하셔야 됩니다.");
        System.out.println("<1> 부장님 : 자네 팀원들끼리 프로젝트 만들어 !");
        System.out.println("<2> 동기 : 부장님 생신 축하드립니다 ! ");
        System.out.println("<3> 사장님 : 혹시.. 옆 회사로 파견할 사람 구하는데 갈사람 있나 ?");
    }

    public void showThirdDayMenu(){
        System.out.println("셋중 하나만 선택하셔야 됩니다.");
        System.out.println("<1> 부장님 : 자네 팀원들끼리 프로젝트 만들어 !");
        System.out.println("<2> 특근하실 분 구합니다 ! 특근하실 분 구합니다 ! ");
        System.out.println("<3> 사장님 : 혹시.. 옆 회사로 파견할 사람 구하는데 갈사람 있나 ?");
    }

    public void showForthDayMenu(){
        System.out.println("셋중 하나만 선택하셔야 됩니다.");
        System.out.println("<1> 부장님 : 자네 팀원들끼리 프로젝트 만들어 !");
        System.out.println("<2> 팀장님(꼰) : 의견 낼 사람 있어 ? 안내면 니들만 손해야 !  ");
        System.out.println("<3> 사장님 : 혹시.. 옆 회사로 파견할 사람 구하는데 갈사람 있나 ?");
    }

    public void showFifthDayMenu(){
        System.out.println("셋중 하나만 선택하셔야 됩니다.");
        System.out.println("<1> 부장님 : 자네 팀원들끼리 프로젝트 만들어 !");
        System.out.println("<2> 팀장님(꼰) : 너 오늘 야근해 ! 일을 이따위로 하고 있어 ! 짜증나게!");
        System.out.println("<3> 사장님 : 혹시.. 옆 회사로 파견할 사람 구하는데 갈사람 있나 ?");
    }

    public void doWorkMessage(){
        System.out.println("둘중 하나만 선택하셔야 됩니다.");
        System.out.println("동료들과 당구를 치러간다.");
        System.out.println("동료들과 게임을 하러간다. ");
    }
}
