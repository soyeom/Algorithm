import java.util.ArrayList;
import java.util.Scanner;

public class baekjoon1264 {
    public static int countVowel(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'
                    || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U' ) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // 문자열을 여러줄 입력 받음 #을 입력할때까지
        // 모음이 몇개인지 구하세요
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            if (str.equals("#")) {
                break;
            }
            list.add(str);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(countVowel(list.get(i)));
        }
        sc.close();
    }
}
