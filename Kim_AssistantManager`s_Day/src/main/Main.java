package second.main;

import second.character.Character;
import second.event.*;
import second.message.Message;

import java.util.Scanner;

import static second.common.Constants.EVENT_WAKE_UP;

public class Main {



    public static void main(String[] args) {
        Message message = new Message();
        Character character = new Character();
        Event event = new Event();
        Scanner sc = new Scanner(System.in); //스캐너

        // 캐릭터 프로필 & 수저 설정
        character.setCharacter();

        // 인트로
        message.showIntro();

        // 부가 설명
        if ((sc.nextInt()) == 1) {
            message.showSubExplainYesMessage();
            character.calculateExp(30);
        } else {
            message.showSubExplainNoMessage();
        }

        for (int day = 1; day <= 5; day++) {
            message.showWakeupMenu();
            int exp = event.doEvent(EVENT_WAKE_UP);
            if (exp == -1) {
                message.showErrorMessage();
                continue;
            }
            character.calculateExp(exp);

            if (day == 1) { // 첫날
                message.showFirstDayMenu();
                EventOfFirstDay eventOfFirstDay = new EventOfFirstDay();
                eventOfFirstDay.processFirstDay(character);

            } else if (day == 2) { //둘째날
                message.showSecondDayMenu();
                EventOfSecondDay eventOfSecondDay = new EventOfSecondDay();
                eventOfSecondDay.processSecondDay(character);

            } else if (day == 3) { // 셋째날
                message.showThirdDayMenu();
                EventOfThirdDay eventOfThirdDay = new EventOfThirdDay();
                eventOfThirdDay.processThirdDay(character);

            } else if (day == 4) { // 넷째날
                message.showForthDayMenu();
                EventOfForthDay eventOfForthDay = new EventOfForthDay();
                eventOfForthDay.processForthDay(character);

            } else if (day == 5) { //다섯째날
                message.showFifthDayMenu();
                EventOfFifthDay eventOfFifthDay = new EventOfFifthDay();
                eventOfFifthDay.processFifthDay(character);

            }
        }
    }
}
