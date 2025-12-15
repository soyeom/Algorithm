package bronze;

import java.util.Scanner;

public class baekjoon10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 총 N개의 정수가 주어졌을때,
        int N = sc.nextInt();
        // 그 정수들을 배열로 저장해서
        int[] num = new int[N];

        for(int i=0; i<N; i++){
            num[i] = sc.nextInt();
        }

        // 정수 v가 몇 개인지 구하시오
        int v = sc.nextInt();
        int total = 0;

        for(int i=0; i<N; i++){
            if(num[i] == v){
                total++;
            }
        }

        System.out.println(total);
    }
}
