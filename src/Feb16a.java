import java.util.Random;

public class Feb16a {

	public static void main(String[] args) {
		//長さ20のint 配列を作って、 50未満のrandom な数で初期化しなさい。
		Random gen = new Random();
		//int 配列
		int[] data = new int[20];
		//配列初期化（ランダムで）
		for(int i = 0; i<data.length;i++) {
			data[i] = gen.nextInt(50);
		}
		//この配列の内容を表示
		for(int i=0;i<data.length;i++) {
			System.out.println(data[i]);
		}
		//この配列の値の合計と平均を計算しなさい
		//合計
		double sum =0.0;
		for(int i=0;i<data.length;i++) {
			sum = sum + data[i];
		}
		System.out.println("合計は"+sum);
		//平均
		double ave = sum/data.length;
		System.out.println("平均は"+ ave);

	}

}
