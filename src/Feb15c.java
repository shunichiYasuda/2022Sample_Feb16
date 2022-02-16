import java.util.Random;

public class Feb15c {

	public static void main(String[] args) {
		//乱数の発生
		Random gen =new Random();
		double value = gen.nextDouble(100);
		//System.out.println("value= "+value);
		
		//int型100未満の乱数を20個表示させ、その合計を表示させなさい
		int sum =0;
		for(int i=0;i<10;i++) {
			int value_int = gen.nextInt(10);
			sum = sum + value_int; //定番処理
			System.out.println("i="+i+"\tvalue_int= " + value_int+ "\tsum="+sum);
		}
		System.out.println("sum="+sum);
		
		
	}

}
