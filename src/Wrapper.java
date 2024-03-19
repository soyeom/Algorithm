public class Wrapper {
    public static void main(String[] args) {
        // 생성자로 생성
        Integer integer1 = new Integer(5);
        Integer integer2 = new Integer("1234");

        // 스태틱 메소드 valueOf로 생성
        Integer integer = Integer.valueOf(5);
    }
}
