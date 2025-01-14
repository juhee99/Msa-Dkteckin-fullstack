package day5;

/*1. 클래스명 : MethodLab6
2. 정의해야 하는 메서드  
   메서드명 : maxNumArray
   매개변수 타입 : int[]
   리턴값의 타입 : int

   매개변수에 전달된 배열의 원소값들 중에서 가장 큰값 리턴
   3. main() 메서드에서 maxNumArray 를 3번 호출한다.
   다음 배열들을 전달하여
     배열 1 : 10, 20, 30
     배열 2 : 100, 500, 300, 200, 400
     배열 3 : 1, 10, 3, 4, 5, 8, 7, 6, 9, 2
   
   호출하고 리턴값을 다음과 같이 출력한다.

     가장 큰 값은 30 입니다.
     가장 큰 값은 500 입니다.
     가장 큰 값은 10 입니다.
   */
public class MethodLab6 {

	public static void main(String[] args) {
		int [][] maxArray = {{10, 20, 30},{100, 500, 300, 200, 400},{ 1, 10, 3, 4, 5, 8, 7, 6, 9, 2}};
		
		int max1 = maxNumArray(maxArray[0]) ;
		int max2 = maxNumArray(maxArray[1]);
		int max3 = maxNumArray(maxArray[2]);
		
		System.out.println("가장 큰 값은 "+ max1 + "입니다.");
		System.out.println("가장 큰 값은 "+ max2 + "입니다.");
		System.out.println("가장 큰 값은 "+ max3 + "입니다.");
		
	}
	
	static int maxNumArray(int [] num) {
		int max = 0;
		
		for(int i=0; i<num.length; i++) {
			if(max < num[i]) max=num[i];
		}
		
		return max;
	}

}
