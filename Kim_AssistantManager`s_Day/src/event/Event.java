package second.event;

import java.util.Scanner;

import static second.common.Constants.*;

public class Event {
    private EventMessage eventMessage;
    private Character character;

    public Event() {
        this.eventMessage = new EventMessage();
    }

    public int doEvent(int event) {
        int exp = 0;
        switch (event) {
            case EVENT_WAKE_UP:
                exp = wakeup();
                break;

            case EVENT_TEAM_PROJECT:
                exp = playTeamProject();
                eventMessage.doLeisureMessage();
                break;

            case EVENT_PLAY_BILLIARDS:
                exp = playBilliard();
                eventMessage.comeBackHomeTime1();
                break;

            case EVENT_PLAY_GAME:
                exp = playGame();
                eventMessage.comeBackHomeTime1();
                break;

            case EVENT_PRINT:
                exp = playPrint();
                eventMessage.comeBackHomeTime();
                break;

            case EVENT_BUSINESS_TRIP:
                exp = goBusinessTrip();
                break;

            case EVENT_MNAGER_BIRTHDAY:
                exp = playManagerBirthday();
                break;


            case EVENT_PRESIDENT_OVERTIME:
                exp = playPresidentOvertime();
                break;

            case EVENT_DO_OPNION:
                exp = playDoOpnion();
                eventMessage.comeBackHomeTime();
                break;

            case EVENT_DO_OVERTIME:
                exp = playDoOvertime();
                eventMessage.overTimeSelect();
                break;

            case EVENT_COMEBACK_HOME_EARLY:
                exp = comeBackHomeEarly();
                break;

            case EVENT_COMEBACK_HOME_NORMAL:
                exp = comeBackHomeNormal();
                break;

            case EVENT_COMEBACK_HOME_LATE:
                exp = comeBackHomeLate();
                break;

            case EVENT_RUN:
                System.out.println("▶도망을 쳐서 회사에서 짤렸습니다.◀ 그동안 고생하셨습니다 ㅋㄷ");
        }
        return exp;
    }

    public int wakeup() {
        Scanner sc = new Scanner(System.in);
        int exp = 0;
        switch (sc.nextInt()) {
            case 1:
                System.out.println("일찍 일어났습니다. 경험치 + 60" + "\n");//일찍 일어남
                exp = 60;
                //일찍출근
                break;
            case 2:
                System.out.println("제시간에 일어났습니다. 경험치 + 40" + "\n");//제시간에 일어남
                exp = 40;
                //평상시처럼 출근
                break;
            case 3:
                System.out.println("늦게 일어났습니다. 경험치 + 0" + "\n");//늦게일어남
                //출근 지각
                break;
        }

        return exp;
    }

    public Character playTeamProject() {
        this.eventMessage.showSelectedEventMessage("팀프로젝트를 선택하셨습니다. 경험치 +80" + "\n" + "\n"); //팀프로젝트 선택,

        return 80;

    }

    public Character playBilliard() {
        this.eventMessage.showSelectedEventMessage("(팀원들과 함께) 당구를 치러왔습니다."+ "\n");//당구
        this.eventMessage.showSelectedEventMessage("제가 평균 150은 칩니다 ㅋ 다 이겨드리겠습니다. 경험치 +20" + "\n" + "\n");
        return 20;
    }

    public Character playGame() {
        this.eventMessage.showSelectedEventMessage("(팀원들과 함께) PC방을 왔습니다."+ "\n");//게임
        this.eventMessage.showSelectedEventMessage("\"제가 아칼리 장인입니다. 티어는 마스터구요. 캐리 가능합니다.\" 경험치 +30" + "\n" + "\n");//게임
        return 30;
    }

    public Character comeBackHomeEarly() {

        this.eventMessage.showSelectedEventMessage("\"제가 너무 피곤해서 일찍 들어가 봐야 할 것 같습니다..\" 경험치 +50" + "\n" + "\n");//일찍귀가, 경험치 50

        return 50;
    }

    public Character comeBackHomeNormal(){
        this.eventMessage.showSelectedEventMessage("\"내일 출근을 위해 들어가 보겠습니다 !\" 경험치 +30" + "\n" + "\n");//제시간 귀가, 경험치 50

        return 30;
    }

    public Character comeBackHomeLate() {

        this.eventMessage.showSelectedEventMessage("늦게 귀가합니다. 경험치 +0" + "\n" + "\n");//늦게 귀가, 경험치 50

        return 0;
    }

    public int overtimeRun() {
        this.eventMessage.showSelectedEventMessage("\" ★R★U★N★ \" 경험치 + 5000" + "\n" + "\n");//도망 , 게임오버

        return -5000;
    }

    public Character playPrint() {
        this.eventMessage.showSelectedEventMessage("\"내가 프린트 뽑을려고 여기 온줄아나ㅡㅡ\" 경험치 +50" + "\n" + "\n");//프린트선택

        return 50;
    }

    public Character playManagerBirthday() {
        this.eventMessage.showSelectedEventMessage("\"부장님 생일 축하드립니다(★딸랑딸랑★)\" 경험치 +80" + "\n" + "\n");//부장생일

        return 80;
    }

    public Character playPresidentOvertime() {
        this.eventMessage.showSelectedEventMessage("\"제가 특근 하겠습니다 !\" 경험치 +90" + "\n" + "\n");//사장특근

        return 90;
    }

    public Character playDoOpnion() {
        this.eventMessage.showSelectedEventMessage("\"제 생각에는 여기서 어쩌구 저기서 저쩌구 하는게 좋을것 같습니다.\" 경험치 +50" + "\n" + "\n");//의견내기

        return 50;
    }

    public Character playDoOvertime() {
        this.eventMessage.showSelectedEventMessage("\"개빡치네ㅡㅡ 지가 하면되지 왜 나보고 성질이야ㅡㅡ\" 경험치 +100" + "\n" + "\n");//야근하기

        return 100;
    }

    public Character goBusinessTrip() {

        this.eventMessage.showSelectedEventMessage("\"파견갔다가 일찍 퇴근하겠습니다.\" 경험치 +90" + "\n" + "\n");//파견

        return 90;
    }
}
