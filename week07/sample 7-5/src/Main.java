import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num1, num2, num3;
        int result;

        System.out.print("두개의 정수를 입력 : ");
        num1 = keyboard.nextInt();
        num2 = keyboard.nextInt();
        num3 = keyboard.nextInt();

        result = num1 >= num2 ? ((num1 >= num3) ? num1 : num2 >= num3 ? num2 : num3) :
                (num2 >= num3 ? num2 : (num3 >= num1 ? num3 : num1));
        System.out.printf("입력한 정수 %d, %d중에 가장 큰 수는 %d 입니다. \n",
                num1, num2, num3, result);

        if (num1 > num2) {
            if (num1 >= num3) {
                result = num1;
            } else if (num2 >= num3) {
                result = num2;
            } else {
                result = num3;
            }

            System.out.printf("입력한 정수 %d와 %d중에 큰 수는 %d 입니다. \n",
                    num1, num2, result);

            int temp = num1 >= num2 ? 1 : 2;
            switch (temp) {
                case 1:
                    result = num1;
                    break;
                default:
                    result = num2;
            }
            System.out.printf("입력한 정수 %d와 %d중에 큰 수는 %d 입니다. \n",
                    num1, num2, result);
        }
    }