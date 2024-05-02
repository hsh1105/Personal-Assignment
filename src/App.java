import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int result; // 정답 변수 선언
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int first = sc.nextInt(); // 첫번째 번호 입력

        System.out.print("사칙연산 기호를 입력하세요: ");
        char symbol = sc.next().charAt(0); // 사칙연산 입력

        System.out.print("두 번째 숫자를 입력하세요: ");
        int second = sc.nextInt(); // 두번째 번호 입력

        switch (symbol) {
            case '+':
                result = first + second;
                System.out.println("결과 : "+result);
                break;
            case '-':
                result = first - second;
                System.out.println("결과 : "+result);
                break;
            case '*':
                result = first * second;
                System.out.println("결과 : "+result);
                break;
            case '/':
                if (second == 0) {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    break;
                }
                result = first / second;
                System.out.println("결과 : "+result);
                break;
            default:
                System.out.println("올바른 연산기호를 입력해주세요");
        }
    }
}