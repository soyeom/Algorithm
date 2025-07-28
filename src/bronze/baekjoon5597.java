package bronze;

import java.util.Scanner;

public class baekjoon5597 {
    // 정해진 범위 내의 값에서 특정 값을 제외하는 문제는 boolean[]이나 Set을 사용하는 방식이 가장 빠르고 직관적입니다.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         boolean[] arr = new boolean[30];

        for (int i=0; i<28; i++) {
            int index = sc.nextInt();
            arr[index-1] = true; // 배열은 0부터 시작하니까
        }

        // 30개 중에서 false 인 놈 찾고 그 인덱스가 작은거 부터 출력, 인덱스에 +1 해줘야 함 마지막에
        for (int i=0; i<30; i++) {
            if (!arr[i]) {
                System.out.println(i+1);
            }
        }
    }
}
