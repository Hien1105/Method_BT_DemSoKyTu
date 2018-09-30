import java.util.Scanner;

public class Method_BT_DemSoKyTu {
    public static void main(String[] args) {
        String s;
        System.out.print("Mời nhập chuỗi: ");
        Scanner scanner = new Scanner(System.in);
        s = scanner.nextLine();
        int length = s.length();
        System.out.println("Số ký tự của chuỗi là: "+length);

    }
}
