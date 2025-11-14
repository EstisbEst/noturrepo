import java.util.Random;
class ursign{
    private Random randoms = new Random();
    ursign(){
        int x = randoms.nextInt(4);
        char s = 'x';
        if (x == 0) {
            s = '\u03B1';
        } else if (x == 1) {
            s = '\u03B2';
        } else if (x==2) {
            s = '\u03C3';  
        } else if (x==3) {
            s = '\u03C9';
        }
        System.out.println("You are an "+s);
    }
    public static void main(String[] args) {
        new ursign();
    }
}