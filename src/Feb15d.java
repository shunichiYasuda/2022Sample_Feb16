import java.util.Random;

public class Feb15d {

	public static void main(String[] args) {
		// int 型配列長さ3
		int[] x = new int[3];
		x[0] = -3;
		x[1] = 2;
		x[2] =15;
		//ｘの中味を表示
		
		//int型配列長さ20　の配列を作る
		Random gen = new Random();
		int[] value = new int[20];
		for(int i=0;i<value.length;i++) {
			value[i] = gen.nextInt(100);
		}
		//value の中味を表示
		for(int i=0;i<value.length;i++) {
			System.out.println(value[i]);
		}
		//value の平均を計算しなさい。
		int sum = 0;
		for(int i=0;i<value.length;i++) {
			sum = sum+ value[i];
		}
		//平均
		double ave = sum/value.length;
		System.out.println("平均値＝"+ave);
		//value の分散と標準偏差を計算する。
		

	}

}
