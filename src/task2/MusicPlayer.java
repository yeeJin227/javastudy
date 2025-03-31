package task2;

public class MusicPlayer {

    //캡슐화
    //속성(멤버변수)과 기능(메서드)을 하나로 묶어서, 메서드를 통해 기능을 외부로 제공하는 것을 캡슐화라고 한다.
    int volume = 0;
    boolean isOn = false;

    void on(){
        isOn = true;
        System.out.println("음악 플레이어 시작");
    }

    void off(){
        isOn = false;
        System.out.println("음악 플레이어 종료");
    }

    void volumeUp() {
        volume++;
        System.out.println("음악 플레이어 볼륨: " + volume);
    }

    void volumeDown() {
        volume--;
        System.out.println("음악 플레이어 볼륨: " + volume);
    }

    void showStatus() {
        System.out.println("음악 플레이어 상태 확인");
        if (isOn) {
             System.out.println("음악 플레이어 On, 볼륨: " + volume);
        } else {
            System.out.println("음악 플레이어 Off");
        }
    }
}

