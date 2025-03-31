package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    //member의 초기값 설정 기능을 제공하는 메서드
    void initMember(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
