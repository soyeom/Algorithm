package bronze;

import java.util.Scanner;

public class baekjoon3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 수 10개를 입력받는다
        int num;
        // 42개의 나머지
        boolean [] x = new boolean[42];

        // 이를 42로 나눈 나머지를 구한다
        for(int i = 0; i < 10; i++){
            num = sc.nextInt() % 42;
            x[num] = true;
        }

        int count = 0;
        for(int i = 0; i < 42; i++){
            if(x[i]){
                count++;
            }
        }

        System.out.println(count);

        // set을 쓰는게 더 적절한 경우는 중복 제거, 값이 큼
    }
}