import java.util.Scanner;

public class phan1bai1 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào một số bất kỳ: ");
        int n = scanner.nextInt();
        if (SNT(n)){
            System.out.println(n + " là số nguyên tố");

        } else{
            System.out.println(n + " không là số nguyên tố");
        }
    }


public static boolean SNT(int n) {
    if (n <= 1){
        return false;
    }
    for (int i = 2; i <= Math.sqrt(n); i++){
        if (n % i == 0) {
            return false;
        }
    }
    return true;
}
    
}
