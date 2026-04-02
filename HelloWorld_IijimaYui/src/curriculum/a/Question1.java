package curriculum.a;

public class Question1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// Q1. 各型の変数を宣言し、初期値を設定してください。
		byte byteNum = 0;
		short shortNum = 0;
		int intNum = 0;
		long longNum = 0L;
		float floatNum = 0.0f;		
		double doubleNum =0.0;
		char letter = '\u0000';
		String letters = null;
		boolean isBoolean = false;
	//int number;  // int型の変数 number を宣言がこれ基本
		
		// O2. 1で宣言した各型の変数に指定された値を代入してください
		byteNum = 10;
		shortNum = 100;
		intNum = 1000;
		longNum = 10000L;		
		floatNum = 9.5f;
		doubleNum = 10.5;
		letter = 'a';
		letters = "ハロー";
		isBoolean = true;
		
		
		
		//結果表示
		System.out.println("byteNum:" + byteNum);
		System.out.println("shortNum:" + shortNum);
		System.out.println("intNum:" + intNum);
		System.out.println("longNum:" + longNum);
		System.out.println("floatNum:" + floatNum);
		System.out.println("doubleNum:" + doubleNum);
		System.out.println("letter:" + letter);
		System.out.println("letters:" + letters);
		System.out.println("isBoolean:" + isBoolean);
		
		
		//Q3 値を代入した変数を用いて出力をしてください
		/*
	     11110を出力
         20を出力
         a ハロー trueを出力
        11130数字を全て足して出力
        10000000000小数点以外の数字を全てかけて出力
        0.105 10.5割る100をして出力
        -90 10引く100をして出力
        System.out.println( );
		*/
		
		System.out.println( byteNum + shortNum + intNum + longNum );
		//byteNum + byteNum
		System.out.println( byteNum + byteNum );
		
		//floatNum + doubleNum
		//System.out.println( floatNum + doubleNum );
		
		System.out.println( letter + letters + isBoolean);
		
		 System.out.println( byteNum + shortNum + intNum + longNum + byteNum + byteNum );
		
		 System.out.println( byteNum * shortNum * intNum * longNum );
		
		 System.out.println( doubleNum / shortNum );
		
		 System.out.println( byteNum - shortNum );
		
		
		 /*Q4 name という String型の変数 を宣言し
		 その変数に "山田太郎" という値を代入してください。
		 name変数を使用してコンソールに こんにちは、山田太郎さん！ と表示してください。
		*/
		
		 String name = "名前";
		name = "山田太郎";
		System.out.println( "こんにちは、" + name + "さん！" );
		
		//Q5
		/* age という int型の変数 を宣言し
         その変数に 25 を代入してください。
         age変数を使用してコンソールに  年齢: 25歳 という表示してください。
		*/
		
		int age = 25;
		System.out.println("年齢：" + age +"歳" );
		
		/*Q6
		 num1 という int型の変数 を宣言し、10 を代入
         num2 という int型の変数 を宣言し、5 を代入
         num1 と num2 を足した結果を sum という変数に代入し、コンソールに表示してください。
		*/
		
		int num1 = 10;
		int num2 = 5;
		int sum = ( num1 + num2 );
		System.out.println( sum );
		
		//Q7 score という int型の変数 を宣言し、80 を代入
		//score に 20 を加えて、更新する
		
		int score = 80;
		score = score + 20;
		System.out.println( score );
		
		//Q8  price という double型の変数 を宣言し、99.99 を代入
		//price を int型 に変換し、整数価格: 99 とコンソールに表示してください。
		
		double price =99.99;
		
		
		
		
		
	}
	}

