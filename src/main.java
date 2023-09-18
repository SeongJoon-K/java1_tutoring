import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 스캐너를 이용해 조건문 생성
        System.out.println("점수를 입력하세요 : ");
        int score = sc.nextInt();
        if (score >= 80) {
            System.out.println("합격입니다");
        }
        System.out.println("");
        System.out.println("");
        // 2. if - else 사용
        int mathScore = sc.nextInt();
        if (mathScore < 70) {
            System.out.println("공부가 필요합니다.");
        } else {
            System.out.println("적당히 공부하셨군요 !");
        }
    }
}
