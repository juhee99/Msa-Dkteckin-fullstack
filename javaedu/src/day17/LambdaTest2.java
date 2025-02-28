package day17;

interface Calculation {
	public int add(int a, int b);
}

public class LambdaTest2 {
	public static void exec(Calculation com) {
		int k = 10;
		int m = 20;
		int value = com.add(k, m);
		System.out.println("덧셈 결과 : " + value);
	}

	public static void main(String[] args) {
		exec(new Calculation() {               //anonymous class : LambdaTest2$1
			public int add(int a, int b) {
				return a + b;
			}
		});

		exec((int a, int b) -> {
			return a + b;
		});
		
		exec((a, b) -> a*a + b*b); // 매개변수 타입 생략, 괄호 생략x
	}
}
