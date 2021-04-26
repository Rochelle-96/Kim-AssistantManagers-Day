package second.event;

import second.character.Character;

import java.util.Scanner;

import static second.common.Constants.*;

public class EventOfFifthDay {
    private Event event;

    public EventOfFifthDay() {
        this.event = new Event();
    }

    public void processFifthDay(Character character) {
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
                        character.calculateExp(this.event.doEvent(EVENT_COMEBACK_HOME_NORMAL));
                    } else {
                        character.calculateExp(this.event.doEvent(EVENT_COMEBACK_HOME_LATE));
                    }
                } else {
                    character.calculateExp(this.event.doEvent(EVENT_PLAY_GAME));
                    if (sc.nextInt() == 1) {
                        character.calculateExp(this.event.doEvent(EVENT_COMEBACK_HOME_NORMAL));
                    } else {
                        character.calculateExp(this.event.doEvent(EVENT_COMEBACK_HOME_LATE));
                    }
                }
                break;
            case 2:
                //야근하기
                character.calculateExp(this.event.doEvent(EVENT_DO_OVERTIME));
                if(sc.nextInt() == 1) {
                    character.calculateExp(this.event.doEvent(EVENT_COMEBACK_HOME_LATE));
                } else {
                    character.calculateExp(this.event.doEvent(EVENT_RUN));
                }
                break;
            case 3:
                //파견가기
                character.calculateExp(this.event.doEvent(EVENT_BUSINESS_TRIP));
                character.calculateExp(this.event.doEvent(EVENT_COMEBACK_HOME_LATE));
                break;
        }
    }
}
