import java.util.Scanner;

public class converterBase {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        int n;
        int q;
        int ndigit = 0;
        int[] novarep = new int[10];
        int r;
        public void convert() {
            System.out.println("digite um numero");
            n = prompt.nextInt();
            q = n;
            do {
                r = q % 2;
                novarep[ndigit] = r;
                ndigit++;
                q = q / 2;
            }
            while (q != 0); {
                System.out.println("numero " + n + " na base binaria: ");
                for(int i = ndigit - 1; i >= 0; i--) {
                    System.out.print(novarep[i]);
                }
            }
        }  
    }
}