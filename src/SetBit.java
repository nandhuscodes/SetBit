import java.util.Scanner;

public class SetBit {
    static int setBit(int A, int B){
        int result = 0;
        result = result|(1<<A);
        result = result|(1<<B);
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        System.out.println(setBit(A, B));
    }
}
