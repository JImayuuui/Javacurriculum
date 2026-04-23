package sample;

public class sample {

	public static void main(String[] args) {
		// Q1の呼び出し
        sayHello();

        // Q2の処理
        int n = 10;
        int result = doubleValue(n);
        System.out.println(n + " を 2 倍すると " + result + " です");
    }

    /* Q1: 次の条件を満たす メソッド sayHello を作成してください。
       引数なし 戻り値なし "Hello, World!" を表示 */
    public static void sayHello() {
        System.out.println("Hello, World!");
    } // ← ここで sayHello は終わり！

    /* Q2: 次の条件を満たす メソッド doubleValue を作成してください。
       引数：整数 (int num) 戻り値：整数（引数の 2 倍の値） */
    public static int doubleValue(int num) {
        return num * 2;
    } // ← ここで doubleValue は終わり！

} // ← ここで Question5 クラスが終わり！
