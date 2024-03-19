public class StringClass {
    public static void main(String[] args) {
        String someString = "This is a lot of text again";

        for(int i=0; i<someString.length();i++) {
            System.out.println(someString.charAt(i));
        }

        // 문자열 객체 생성 대신 문자열 버퍼
        StringBuffer sbf = new StringBuffer("Test");

        sbf.append("123");

        StringBuilder sbl = new StringBuilder("test");
    }
}
