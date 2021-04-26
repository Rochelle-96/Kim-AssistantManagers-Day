package second.character;


public class CharacterMessage {
    protected void showNowExperience(int level, int restExp) {
        System.out.println("현재 level :  " + level);
        System.out.println("현재 남은 exp :  " + restExp + "\n");
    }

    protected void showNameInputMessage() {
        System.out.print("이름을 설정해주세요! ==> ");
    }

    protected void userAge() {
        System.out.print("나이를 설정해주세요! ==> ");
    }

    protected void showCharacterName(String name){ //이름설정
        System.out.println("당신의 이름은 " + name + "입니다." + "\n");
    }

    protected void showAge(int age){
        System.out.println(("당신의 나이는 " + age + "세 입니다." + "\n"));
    }

    protected void showSpoonMenu() {
        System.out.println("어떤 수저를 선택하시겠습니까 ?");
        System.out.println("<1> 금수저, <2> 흙수저");
    }

    protected void showGoldSpoonMessage() {
        System.out.println("금수저를 선택하셨습니다.");
        System.out.println("사실 당신은 흙수저임 ㅋ");
        System.out.println("다시 선택해 주세여ㅋ" + "\n");
    }

    protected void showSoilSpoonMessageMenu() {
        System.out.println("흙수저를 선택하셨네요? ");
        System.out.println("근데 금수저가 더 나은데 괜찮으시겠어요?");
        System.out.println("<1> 흙수저, <2> 금수저");
    }

    protected void showSpoonResult1() {
        System.out.println("그냥 흙수저 하는 걸로 하겠습니다 ㅎ");
    }

    protected void showSpoonResult2() {
        System.out.println("당신의 금수저를 흙수저로 바꿔드렸습니다. ^^");
        System.out.println("당신은 회사원입니다.");
    }

    protected void showJobMenu() {
        System.out.println("어떤 직업을 선택하시겠습니까 ?");
        System.out.println("<1> 영업사원, <2> 일반 회사원 ");
    }

    protected void showSalesmanMessage() {
        System.out.println("영업직을 선택하셨습니다.");
        System.out.println("하지만 현재 코로나의 여파로 영업활동을 할수없어 부서이동되었습니다.");
        System.out.println("그래서 그냥 회사원으로 이동되었습니다." + "\n");
    }

    public void showBusinessmanMessage() {
        System.out.println("일반 회사원을 선택하셨습니다.");
        System.out.println("현재 일반 회사원입니다." + "\n");
    }

    public void showFinalExperience(int level, int restExp) {
        System.out.println("당신의 마지막 level " + level);
        System.out.println("당신의 마지막 exp " + restExp);
    }
}
