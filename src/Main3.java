import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Main3 ps = new Main3();
        ps.j003();
    }
    public void j003(){
        double m2_area;
        double pyung_area;
        Scanner in = new Scanner(System.in);
        m2_area = in.nextDouble();
        pyung_area = m2_area / 3.305;
        System.out.printf("%.1f%n", pyung_area);
        in.close();
    }
}
//커밋 다시하기