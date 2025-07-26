package bronze;

import java.util.Scanner;

public class baekjoon1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 공백이 연속해서 나오는 경우는 없다. -> 공백이 한 번만 나오게
        // spilt, trim, replace 가 문자열 공백 관련 함수
        String s = sc.nextLine().trim(); // 앞 뒤 공백 제거

        if(s.isEmpty()) {
            // 빈 문자열이지만 length가 1이 되기 때문에
            System.out.println("0");
        } else {
            String[] strings = s.split("\\s+"); // 하나 이상의 공백 기준으로 분할
            System.out.println(strings.length);
        }
    }
}