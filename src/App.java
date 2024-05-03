import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<Integer> resultArray = new ArrayList<>(); // 결과를 저장할 ArrayList 선언
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int first = sc.nextInt(); // 첫번째 번호 입력

            System.out.print("사칙연산 기호를 입력하세요: ");
            char symbol = sc.next().charAt(0); // 사칙연산 입력

            System.out.print("두 번째 숫자를 입력하세요: ");
            int second = sc.nextInt(); // 두번째 번호 입력

            int result;

            switch (symbol) {
                case '+':
                    result = first + second;
                    System.out.println("결과 : " + result);
                    resultArray.add(result); // 결과값을 ArrayList에 추가
                    break;
                case '-':
                    result = first - second;
                    System.out.println("결과 : " + result);
                    resultArray.add(result);
                    break;
                case '*':
                    result = first * second;
                    System.out.println("결과 : " + result);
                    resultArray.add(result);
                    break;
                case '/':
                    if (second == 0) {
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                        break;
                    }
                    result = first / second;
                    System.out.println("결과 : " + result);
                    resultArray.add(result);
                    break;
                default:
                    System.out.println("올바른 연산기호를 입력해주세요");
            }

            System.out.println("더 계산하시겠습니까? (y/n)");
            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            String more = sc.next();

            if (more.equals("n")) {
                System.out.println("계산을 종료합니다.");
                break;
            } else if (more.equals("remove")) {
                System.out.println("가장 먼저 저장된 결과가 삭제되었습니다: " + resultArray.remove(0));
            } else if (more.equals("inquiry")) {
                for (int j : resultArray) {
                    System.out.println(j); // ArrayList 출력
                }
            }
        }
    }
}