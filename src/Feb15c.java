import java.util.Random;

public class Feb15c {

	public static void main(String[] args) {
		//�����̔���
		Random gen =new Random();
		double value = gen.nextDouble(100);
		//System.out.println("value= "+value);
		
		//int�^100�����̗�����20�\�������A���̍��v��\�������Ȃ���
		int sum =0;
		for(int i=0;i<10;i++) {
			int value_int = gen.nextInt(10);
			sum = sum + value_int; //��ԏ���
			System.out.println("i="+i+"\tvalue_int= " + value_int+ "\tsum="+sum);
		}
		System.out.println("sum="+sum);
		
		
	}

}
