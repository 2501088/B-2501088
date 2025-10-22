import java.util.Scanner;
import java.util.SplittableRandom;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num1, num2;
        float result;

        System.out.print("분자 입력 : ");
        num1 = keyboard.nextInt();
        System.out.print("분모 입력 : ");
        num2 = keyboard.nextInt();


        if (num2 == 0){
            System.err.println("ERROR : 분모가 0으로 나누셈을 할수없음");
        } else {
            result = (float) num1 / num2;
            System.out.printf("%d / %d = %.2f\n" , num1, num2, result);
        }







    }
}