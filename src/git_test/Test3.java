package git_test;

import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        Random random = new Random();

        System.out.println("컴퓨터가 숫자를 생성하였습니다. 답을 맞춰보세요!");

        int a = random.nextInt(10);

        System.out.println(a);
    }
}
