import java.util.Scanner;
public class KT_bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String data = sc.next();
        String A = " ";
            for (int i = 0;i < data.length();i++){
                if (Character.isLetter(i)) {
                    String a = new String(System);
                    a = charAt(i);
                    A += a;
                }
            }
    }
}
