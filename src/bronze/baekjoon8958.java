package bronze;

import java.util.Scanner;

public class baekjoon8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // nextInt는 숫자만 읽고 줄바꿈을 남겨둠
        int n = sc.nextInt();

        // 문제의 점수는 그 문제까지 연속된 O의 개수

        for(int i = 0; i < n; i++){
            // next()랑 nextInt()는 공백 무시하는데 nextLine()은 공백 무시 안함
            String s = sc.next();

            int score = 0;
            int streak = 0;

            for(int j = 0; j < s.length(); j++){
                if(s.charAt(j) == 'O'){
                    streak++;
                    score += streak;
                }
                else {
                    streak = 0;
                }
            }
            System.out.println(score);
        }
    }
}
