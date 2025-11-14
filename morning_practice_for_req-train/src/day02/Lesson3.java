//追加問題

//パッケージ名 day02
//クラス名 Lesson3.java

//3つの任意の整数をコンソールから入力し、税込み金額（消費税は8％計算）の合計を出しなさい。
//また、平均金額を求めなさい。
//キャストしてすべて整数値で求めること。
//【出力例】
//金額①を入力してください>>210
//金額②を入力してください>>300
//金額③を入力してください>>350
//①から③の合計は税込み928円
//①から③の平均は税込み309円

package day02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson3 {

	public static void main(String[] args) throws IOException {

		int sum = 0;// 合計金額。
		int average = 0;// 平均金額。
		int inputCount = 0;//入力した回数。
		double syouhi = 0.08; // 消費税として。
		int sum1; // 入力した数字を変換。
		int sum2; // 入力した数字を変換。
		int sum3; // 入力した数字を変換。
		
		/*ここから記入*/ //
        System.out.println("金額①を入力してください");
		
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System. in));
		
		String str1 = reader1.readLine();
		inputCount++ ; // 入力した回数としてインクリメント
	    sum1 = Integer.parseInt(str1); // 入力したものをintに代入
		
        System.out.println("金額②を入力してください");
		
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System. in));
		
		String str2 = reader2.readLine();
		inputCount++ ; // 入力回数インクリ
		sum2 = Integer.parseInt(str2); // 入力したものをintに代入
		
        System.out.println("金額③を入力してください");
		
        BufferedReader reader3 = new BufferedReader(new InputStreamReader(System. in));
		
		String str3 = reader3.readLine();
		inputCount++ ; // 入力回数インクリ
		sum3 = Integer.parseInt(str3); // 入力したものをintに代入
		
		sum = (sum1 + sum2 + sum3); // 入力してきた分を足し算
		syouhi *= (int)sum; // 代入演算子
		sum =(int) syouhi + sum; // 消費税分の金額と合計金額を足し算
		average = (sum / inputCount); // 消費税込の数値を平均数値化
		
		//System.out.println(""+sum+""); // 確認用です。
		System.out.println("①から③の合計は税込み" + sum + "円");
		System.out.println("①から③の平均は税込み" + average + "円");
	}

}
