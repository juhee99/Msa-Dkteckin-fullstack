package day6;
import java.util.Scanner;
public class ScannerTest1 {
	public static void main(String[] args) {
		System.out.print("입력 : ");
		Scanner sc = new Scanner(System.in); // 표준 입력장치로 부터 스캔하겠다.키보드
		String a,b,c,d;
		a = sc.next();
		b = sc.next();
		c = sc.next();
		d = sc.next();
		System.out.println("a = [" + a + "]");
		System.out.println("b = [" + b+ "]");
		System.out.println("c = [" + c+ "]");
		System.out.println("d = [" + d+ "]");	
		sc.close();
	}
}
