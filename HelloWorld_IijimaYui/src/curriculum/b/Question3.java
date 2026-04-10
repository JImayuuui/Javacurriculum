package curriculum.b;

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
			System.out.println("Q4: " + v);
			}
		
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
		
		
		
		
		
	}

}
