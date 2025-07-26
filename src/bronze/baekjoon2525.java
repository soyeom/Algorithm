package bronze;

import java.util.Scanner;

public class baekjoon2525 {
    public static void main(String[] args) {
        // 시간을 분 단위로 자동적으로 계산
        // 시간(0~23), 분(0~59) 을 정수로 주고

        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        sc.nextLine(); // 줄 바꿈을 해주고 그 다음값을 읽고 싶으면 enter를 버려준다
        int cookTime = sc.nextInt();
        int totalTime = hour * 60 + minute + cookTime;

        hour = totalTime / 60 % 24; // 합이 24시간을 넘어가는 경우까지 고려
        minute =totalTime % 60;

        System.out.println(hour + " " + minute);
    }
}
