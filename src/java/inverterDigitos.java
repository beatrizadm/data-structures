import java.util.Scanner;

public class inverterDigitos {
    public static void main(String[] args) {
        int n;
        int inverso = 0;
        int digito;
        Scanner prompt = new Scanner(System.in);

        public void inverter() {
            System.out.println("Numero inteiro positivo: ");
            n = prompt.nextInt();

            while (n > 0) {
                digito = n % 10;
                inverso = inverso * 10 + digito;
                n = n / 10;
            }
            System.out.println("numero inverso: " + inverso);
        } 
    }
}