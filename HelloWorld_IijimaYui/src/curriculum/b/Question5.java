package curriculum.b;

public class Question5 {
		public static void main(String[] args) {
		//Q1 
		sayHello();
		
		//Q2 
		int innum = 10;
		int result = doubleValue(innum);
		System.out.println(innum + "を 2 倍すると" + result + "です");
		
		//Q3 
		int num1 = 7;
		int num2 = 10;
		boolean result1 =  isEven(num1);
		boolean result2 =  isEven(num2);
		if (isEven(num2)) {
	        System.out.println(num2 + " は偶数です。");
	    } else {
	        System.out.println(num2 + " は奇数です。");
	    }
		if (isEven(num1)) {
	        System.out.println(num1 + " は偶数です。");
	    } else {
	        System.out.println(num1 + " は奇数です。");
	    }

		
		}  //メソッドの終わり
		

		
		//Q1 戻り値の設定
		public static void sayHello() {
		System.out.println("Hello, World！");
		}
		
		//Q2 戻り値の設定
		public static int doubleValue(int num) {
		return num * 2;
		}
		
		//Q3 戻り値の設定
		public static boolean isEven(int num) {
		return num % 2 == 0;
		}
		    
		}
