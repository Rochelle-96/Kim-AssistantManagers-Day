package second.event;

import second.character.Character;

import java.util.Scanner;

import static second.common.Constants.*;

public class EventOfSecondDay {
    private Event event;

    public EventOfSecondDay() {
        this.event = new Event();
    }

    public void processSecondDay(Character character) {
        Scanner sc = new Scanner(System.in); //스캐너
        switch (sc.nextInt()) {
            case 1:
                // 팀프로젝트
                character.calculateExp(this.event.doEvent(EVENT_TEAM_PROJECT));
                // 당구or게임
                if (sc.nextInt() == 1) {
                    character.calculateExp(this.event.doEvent(EVENT_PLAY_BILLIARDS));
                    // 귀가
                    if (sc.nextInt() == 1) {

                    } else {
                        character.calculateExp(this.event.doEvent(EVENT_PLAY_BILLIARDS));
                    }
                }
                break;
            case 2:// 부장님생일
                character.calculateExp(this.event.doEvent(EVENT_MNAGER_BIRTHDAY));
                character.calculateExp(this.event.doEvent(EVENT_COMEBACK_HOME_LATE));
                break;

            case 3:
                character.calculateExp(this.event.doEvent(EVENT_BUSINESS_TRIP));
                character.calculateExp(this.event.doEvent(EVENT_COMEBACK_HOME_LATE));
                break;
        }
    }
}
