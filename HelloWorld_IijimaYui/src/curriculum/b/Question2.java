package curriculum.b;
import java.util.Scanner;

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
	Scanner scanner1 = new Scanner(System.in);
    System.out.print("Q5値を入力してください: ");
    int num = scanner1.nextInt();
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
	Scanner scanner = new Scanner(System.in);
    System.out.print("Q6値を入力してください: ");
    int value = scanner.nextInt();
	if (value % 2 == 0) {
		System.out.println("偶数です");
	}else {
		System.out.println("奇数です");

	}
	/*Q7  int 型の変数 score にコンソール入力で 0 から 100 のいずれかの数値を代入し
		90 以上なら "優"
		70 以上なら "良"
		50 以上なら "可"
		50 未満なら "不可"　を表示
	 */
	Scanner scanner3 = new Scanner(System.in);
    System.out.print("Q7値を入力してください: ");
    int score1 = scanner3.nextInt();
	if (score1 >= 90 ) {
		System.out.println("優");
		}else if (score1 >= 70 && score1 <= 89) {
		System.out.println("良");
		}else if (score1 >= 50 && score1<= 69) {
		System.out.println("可");
		}else if(score1 < 50){
		System.out.println("不可");
		}
	
	//Q8 コンソール入力が null または空文字（""）のときに「入力が無効です」と表示する処理を作成してください

	try (Scanner scanner2 = new Scanner(System.in)) {
        System.out.print("Q8入力してください:");
        String input = scanner2.nextLine();

        if (input.isBlank()) {
            System.out.println("入力が無効です");
        } else {
            System.out.println("入力したもの: " + input);
        }

     /*Q9  int 型の変数 day を用意（コンソール入力で1～7 のいずれかの数値を代入）
			day の値に応じて曜日を表示
      */
        Scanner scanner4 = new Scanner(System.in);
        System.out.print("Q9値を入力してください: ");
        int day = scanner4.nextInt();
      switch (day) {
        case 1:
            System.out.println("今日は月曜日です");
            break;
           case 2:
            System.out.println("今日は火曜日です");
            break;
           case 3:
            System.out.println("今日は水曜日です");
            break;
           case 4:
            System.out.println("今日は木曜日です");
            break;
           case 5:
            System.out.println("今日は金曜日です");
            break;
           case 6:
            System.out.println("今日は土曜日です");
            break;
           case 7:
            System.out.println("今日は日曜日です");
            break;
           default:
            System.out.println("無効な値です");
      }
	
/*Q10  int 型の変数 month を用意（コンソール入力で1～12 のいずれかの数値を代入）
		month の値に応じて季節を表示
		12, 1, 2 → "冬"
		3, 4, 5 → "春"
		9, 10, 11 → "秋"
		それ以外の値なら "無効な月です" と表示
		※Switch文を使用してくださ
 */
      Scanner scanner5 = new Scanner(System.in);
      System.out.print("Q10値を入力してください: ");
      int month = scanner5.nextInt();
      switch (month) {
      case 1:
    	  System.out.println("冬");
          break;
         case 2:
          System.out.println("冬");
          break;
         case 3:
          System.out.println("春");
          break;
         case 4:
          System.out.println("春");
          break;
         case 5:
          System.out.println("春");
          break;
         case 6:
          System.out.println("夏");
          break;
         case 7:
          System.out.println("夏");
          break;
         case 8:
          System.out.println("夏");
          break;
          case 9:
          System.out.println("秋");
          break;
          case 10:
          System.out.println("秋");
          break;
          case 11:
          System.out.println("秋");
          break;
          case 12:
          System.out.println("冬");
          break;
          default:
          System.out.println("無効な値です");
      }
	}
	}
	}
