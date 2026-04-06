package curriculum.b;

public class Question2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	//Q1  int 型の変数 score に 75 を代入
	//  score が 60 以上なら "合格です！" と表示
	int score = 75;
	if (score >= 60) {System.out.println("合格です！");}
		
	/*Q2  int 型の変数 age に 25 を代入
		  age が 20 以上 30 以下なら "適正年齢です" と表示
		 それ以外の場合は "対象外です" と表示
	 */
	int age = 25;
	if (age >= 20 && age <= 30) {
		System.out.println("適正年齢です");
		}else {
		System.out.println("対象外です");
		}
		
	/*Q3 int 型の変数 age に 18 を代入
		age が 20 以上なら "成人です" と表示
		age が 13 以上 19 以下なら "ティーンエイジャーです" と表示
		age が 12 以下なら "子供です" と表示
	 */
	int age1 = 18;
	if (age1 >= 20 ) {
		System.out.println("成人です");
		}else if (age1 >= 13 && age1 <= 19) {
		System.out.println("ティーンエイジャーです");
		}else if(age1 <= 12){
		System.out.println("子供です");
		}
	/*Q4  int 型の変数 x, y, z に 30, 15, 50 を代入
		  一番大きい数値を判定して表示
	 */
	int x = 30;
	int y = 15;
	int z = 50;
	if (x >= y && x >= z) {
		System.out.println(x + "が一番大きい数です");
		} else if (y >= x && y >= z) {
		System.out.println(y + "が一番大きい数です");
		} else if (z >= x && z >= y) {
		System.out.println(z + "が一番大きい数です");
		}
	
	/* Q5 int 型の変数 num を用意　コンソール入力でいずれかの値を代入し
		num の値が 0 より大きければ "正の数です" と表示
		num の値が 0 なら "0 です" と表示
		num の値が 0 より小さければ "負の数です" と表示
	 */
	int num = -5;
	if (num > 0) {
		System.out.println("正の数です");
	}else if (num == 0) {
		System.out.println("0です");
	}else if (num < 0)	{
		System.out.println("負の数です");
	}
	
	/* Q6 int 型の変数 value を用意　コンソール入力でいずれかの値を代入し
		value が 偶数 なら "偶数です" と表示
		value が 奇数 なら "奇数です" と表示
	 */
	int value = 1500;
	if (value % 2 == 0) {
		System.out.println("偶数です");
	}else {
		System.out.println("奇数です");
	}
	
	//三項演算子バージョン
	int value1 =2525;
	String result = (value1 %2 == 0)?"偶数":"奇数";
	System.out.println(result +"です");
	
	
	
	
	}

}
