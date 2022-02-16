import java.util.Random;

public class Feb16b {

	public static void main(String[] args) {
		//長さ20のdouble型配列をつくり、50未満の乱数で初期化
		Random gen = new Random();
		double[] data = new double[30];
		for(int i=0; i<data.length;i++) {
			data[i] = gen.nextDouble(50.0);
		}
		//
		for(int i=0; i<data.length;i++) {
			System.out.println(data[i]);
		}
		//配列のデータについて合計と平均を計算
		double sum = 0.0;
		for(int i=0;i<data.length;i++) {
			sum = sum + data[i];
		}
		double ave = sum/data.length;
		System.out.println("合計＝"+sum+"\t平均＝"+ave);
		//分散と標準偏差を計算。
		//偏差の配列を作る
		double [] dev = new double[30];
		for(int i=0;i<data.length;i++) {
			dev[i] = data[i] - ave;
		}
		//偏差を表示
		for(int i=0;i< dev.length;i++) {
			System.out.println(dev[i]);
		}
		//偏差の合計値をとる。
		sum = 0.0;  //sum は上で定義したのでここで使い回し
		for(int i=0; i< dev.length; i++) {
			sum= sum+dev[i];
		}
		System.out.println("偏差の合計："+sum);
		//分散の計算：偏差2乗を合計してデータ数で割る
		sum = 0.0 ; 
		for(int i=0;i<dev.length;i++) {
			sum = sum+ dev[i]*dev[i];
		}
		double var = sum/dev.length;
		System.out.println("分散="+var);
		//
		double stdDev = Math.sqrt(var); //Math.sqrt(n) はnの平方根を計算
		System.out.println("標準偏差="+stdDev);
		

	}

}
