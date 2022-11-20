 public class Main {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int N, sum = 0;
do {
System.out.print("Enter a number: ");
N = scanner.nextInt();
} while (N % 2 != 1 || N <= 25 || N >= 100);
for (int i = 25; i < N; i++) {
if (i % 2 == 0) sum += i;
}
System.out.printf("Result: %d", sum);
scanner.close();
}
}