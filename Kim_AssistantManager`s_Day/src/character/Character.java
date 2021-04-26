package second.character;

import java.util.Scanner;

public class Character {
    private String name;
    private int age;
    private int level = 1;
    private int exp = 0;
    private int restExp = 0;
    private CharacterMessage characterMessage;

    public Character() {
        this.characterMessage = new CharacterMessage();
    }

    public void calculateExp(int exp) {
        while (true) {
            this.exp += exp;
            if (this.exp >= 100) {
                this.restExp = this.exp - 100;
                this.exp = this.exp - 100;
                this.level++;
            } else {
                this.restExp = this.exp;
            }
            break;
        }
        this.characterMessage.showNowExperience(this.level, this.restExp);
    }

    public void setCharacter() {
        setCharacterProfile();
        setCharacterSpoon();
        setCharacterJob();
    }

    private void setCharacterProfile() {
        Scanner sc = new Scanner(System.in);

        characterMessage.showNameInputMessage();//이름작성
        this.name = String.valueOf(sc.next());
        characterMessage.showCharacterName(this.name);//캐릭터 이름 출력
        characterMessage.userAge();//나이작성
        this.age = sc.nextInt();//나이 출력
        characterMessage.showAge(this.age);
    }

    private void setCharacterSpoon() {
        Scanner sc = new Scanner(System.in);

        while (true) { // 금수저 or 흙수저
            characterMessage.showSpoonMenu(); //출력클래스 내의 수저질문 메소드
            if ((sc.nextInt() == 1)) {
                characterMessage.showGoldSpoonMessage(); //출력클래스 내의 금수저 메소드
                continue;
            } else {
                characterMessage.showSoilSpoonMessageMenu(); //출력클래스 내의 흙수저 메소드
                if ((sc.nextInt() == 1)) {
                    characterMessage.showSpoonResult1(); //출력클래스 내의 금수저 or 흙수저 메소드
                } else {
                    characterMessage.showSpoonResult2();//출력클래스 내의 흙수저 메소드
                }
                break;
            }
        }
    }

    private void setCharacterJob() {
        Scanner sc = new Scanner(System.in);
        characterMessage.showJobMenu();
        if ((sc.nextInt() == 1)) {
            characterMessage.showSalesmanMessage();
        } else {
            characterMessage.showBusinessmanMessage();
        }
    }

}
