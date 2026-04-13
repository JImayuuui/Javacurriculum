package curriculum.b;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	// Q1 for 文を使って 1 から 10 までの数字を 1 つずつ表示	
		for (int x = 1; x <= 10; x++) {   
		System.out.println("Q1: " + x);
		}
		
	//Q2  for 文を使って 2 から 20 までの 偶数 を 1 つずつ表示	
		for (int y = 2; y <= 20; y+=2) {   
			System.out.println("Q2: " + y);
			}
		
	//Q3  for 文を使って 10 から 1 まで カウントダウンして表示
		for (int z = 10;z >= 1 ; z--){   
			System.out.println("Q3: " + z);
			}
		
	//Q4  for 文を使って 1 から 100 までの合計 を表示
		int v = 0;
		for (int w= 1 ;w <= 100; w++) {   
			v+= w;
			}
		System.out.println("Q4: " + v);
		
		
	/*Q5 for 文を使って 以下のような三角形を出力
	 	*
	 	**
	 	***
	 	****
	 	*****
	 */
		for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
		}
		
	//Q6 while 文を使って 1 から 10 まで を 1 つずつ表示	
		int count =1;
		while (count <=10 ) {
		System.out.println("Q6: " + count);
		count++;
		}
		
	//Q7 while 文を使って 2 から 20 までの偶数 を 1 つずつ表示	
		int s = 2;
		while( s <=20) {
	    System.out.println("Q7: " + s);
	    s+=2;
		}
		
	//Q8 while 文を使って 10 から 1 まで のカウントダウンを表示	
		int t = 10;
		while (t >=1) {
		System.out.println("Q8: " + t);
		t--;
		}
		
	//Q9 while 文を使って 1 から 100 までの合計 を表示
		int u =0;
		int r =1;
		while( r <=100) {
		u+= r;
		r++;
		}
		System.out.println("Q9: " + u);	
		
	/*Q10 ユーザーから 数値をコンソール入力 してもらう
		  入力が 0 になるまで 何度でも入力を受け付ける
		  0が入力されたら「終了しました」と表示
		  ※Scannerを使用
		  ※While文を使用してください
	 */
		try(Scanner scanner = new Scanner(System.in) ){
			String input;
			while(true) {
			System.out.print("Q10入力してください:");
			input = scanner.nextLine();
		
			try {
	            int o = Integer.parseInt(input);

			if( o == 0) {
                System.out.println("終了しました");
                break;
            }

            System.out.println("入力したもの: " + o );

        } catch (NumberFormatException e) {
            System.out.println("数値を入力してください");
        }
		}
		}
		
	//Q11 for文を使用して下記の通りに出力してください	
		for (int i = 1; i <= 9; i++) { 
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%02d*%02d=%02d", i, j, i * j);
				 if (j < 9) {
					 System.out.print(" || ");
				 }
			}
			System.out.println();
		
		
		
		
			
		}
		
	}

}
