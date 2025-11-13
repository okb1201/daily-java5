/*問題
パッケージ名 day01
クラス名 Lesson1.java

"出力します"とコンソールに出力してください。
続けて12、 1.6、 "こんにちは"、 trueをそれぞれ変数に代入しコンソールに出力してください。
変数名は任意とします
また上記から変数を１つを選び、代入する値を1行コメントで記入しなさい。（コメント例 〇〇を代入する）

【出力例】
出力します
12
1.6
こんにちは
true
 * 
 */
package day01;

public class Lesson1 {

	public static void main(String[] args) {
		/*ここから記入*/
		int num1; // 変数の宣言をしている。
		double num2;
		String str = "こんちには";
		boolean b;
		
		num1 = 12; // num1に12を代入している。
		num2 = 1.6;
		b = true;
		
		//パターン1
		//System.out.println("出力します");
		//System.out.println(""+ num1 +"");
		//System.out.println(""+ num2 +"");
		//System.out.println(""+ str +"");
		//System.out.println(""+ b +"");
		//System.out.println("\t*");
		//System.out.println("\t*/");
		
		// パターン2
		System.out.print("出力します\n"+ num1 +"\n"+ num2 +"\n"+ str +"\n"+ b +"\n\t*\n\t+/");
	
	}

}
