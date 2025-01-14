package day14;

abstract class Test {
	Test() {
		System.out.println("No Argument sample");
	}

	abstract void output(String s);
}

public class InnerTest3 {
	void pr(Test o) {
		o.output("Test");
	}

	public static void main(String args[]) {
		System.out.println("Main start !!");
		InnerTest3 n = new InnerTest3();  // outer class도 같이 생성
		n.pr(new Test() {   //anonymous class 생성(Test의 자손 class)
			int su = 100;

			public void output(String s) {
				System.out.println("Anonymous Class : " + s);
				System.out.println("Anonymous Class : " + su);
			}
		});
	}
}
