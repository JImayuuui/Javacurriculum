package curriculum.b;

public class Question4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//Q1 int 型の配列 を作成し、1, 2, 3, 4, 5 を格納する
		//配列の全要素を 順番に表示
		int[] numbers = {1, 2, 3, 4, 5};
		
		for (int num : numbers) {
		    System.out.println("Q1:"+num);
		}
		
		/*Q2 int 型の配列 {10, 20, 30, 40, 50} を用意する
			配列の要素を 逆順 に表示
		 */
		int[] numbers2 = {10, 20, 30, 40, 50};
		
		for (int i = numbers2.length - 1; i >= 0; i--) {
			System.out.println("Q2:"+numbers2[i]);
		}
		
		/*Q3 int 型の配列 {3, 5, 7, 9, 11} を用意する
		  配列の全要素の 合計値 を計算し、表示
		 */
		int[] numbers3 = {3, 5, 7, 9, 11};
		int sum = 0;
		for (int num : numbers3) {
			sum += num;
		}
		System.out.println("Q3合計値: " + sum);
		
		//Q4 int 型の配列 {12, 7, 9, 21, 5, 18} を用意する
		//配列の 最大値と最小値 を求めて表示
		int[] numbers4 = {12,7, 9, 21, 5,18};
		int max = numbers4[0];
		int min = numbers4[0];
		
		for (int i = 1; i < numbers4.length; i++) {
		if (numbers4[i] > max ) {
			max = numbers4[i];   //numbers[0]で格納した中の最初の数にしている
		}
		if (numbers4[i] < min ) {
			min = numbers4[i];
		}
		}
		
		System.out.println("最大値："+max);
		System.out.println("最小値："+min);
		
		
		/* Q5　int 型の配列 {1, 2, 3, 4, 5} を用意する
			配列のすべての要素を 2 倍 し、結果を表示
			結果を表示する際の処理に拡張for文を使用してください
		 */
		int[] numbers5 = {1, 2, 3, 4, 5};
		for (int i = 0; i < numbers.length; i++) { 
			numbers[i] = numbers[i] * 2;
		}
		
		for (int num : numbers) {
            System.out.println("Q5："+num);
		}
		
		/* Q6 int 型の配列 {4, 7, 10, 15, 20} を用意する
			ユーザーがコンソール入力した数が 配列に含まれているか を判定し、結果を表示
			結果：（”入力した値”は配列に含まれています／含まれていません）
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
