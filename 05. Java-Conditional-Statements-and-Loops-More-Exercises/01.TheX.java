import java.util.Scanner;

public class TheX {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=Integer.parseInt(scan.nextLine());
        int t=n-2;
        int m=1;
        int innerSpace=0;
        for (int i = 0; i < n/2; i++) {
            System.out.println(repeatStr(" ",innerSpace)+"x"
                    + repeatStr(" ", t) + "x"+repeatStr(" ",innerSpace));
            t-=2;
            innerSpace++;
        }
        System.out.println(repeatStr(" ",n/2)+"x"+repeatStr(" ",n/2));
        innerSpace--;
        for (int i = 0; i < n/2 ; i++) {
            System.out.println(repeatStr(" ",innerSpace)+"x"
                    + repeatStr(" ", m) + "x"+repeatStr(" ",innerSpace));
            m+=2;
            innerSpace--;
        }
    }

    static String repeatStr(String strToRepeat, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text = text + strToRepeat;
        }
        return text;
    }
}
