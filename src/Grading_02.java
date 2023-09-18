import java.util.Scanner;

public class Grading_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("점수를 입력하세요");
        // 점수 입력
        int score = sc.nextInt();
        char grade;
        //
        switch (score/10) {
            case 10:
                grade = 'A';
                break;
            case 9:
                grade = 'B';
                break;
            case 8:
                grade = 'C';
                break;
            case 7:
                grade = 'D';
                break;
            default:
                grade = 'F';
        }
    }
}
