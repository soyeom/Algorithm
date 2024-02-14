public class Mychar {
    char ch;
    Mychar(char ch) {
        this.ch = ch;
    }

    boolean isVowel() {
        if(ch == 'a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u')
            return true;

        return false;
    }
    public static void main(String[] args) {
        Mychar myChar = new Mychar('c');

        System.out.println();
    }
}
