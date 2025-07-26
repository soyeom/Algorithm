package bronze;

import java.util.Arrays;
import java.util.Scanner;

public class baekjoon2750 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력하는 수가 많을 때는 BufferedReader 써보자
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = sc.nextInt();

        // ArrayList 대신 int[] 배열 사용 → 불필요한 오토박싱(Integer ↔ int) 제거
        // ArrayList<Integer> num = new ArrayList<>();

        int[] num = new int[n];

        for(int i=0; i<n; i++){
           num[i] = sc.nextInt();
        }

        Arrays.sort(num);

        for(int number: num) {
            System.out.println(number);
        }
    }
}
