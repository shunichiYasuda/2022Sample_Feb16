import java.util.Random;

public class Feb15d {

	public static void main(String[] args) {
		// int �^�z�񒷂�3
		int[] x = new int[3];
		x[0] = -3;
		x[1] = 2;
		x[2] =15;
		//���̒�����\��
		
		//int�^�z�񒷂�20�@�̔z������
		Random gen = new Random();
		int[] value = new int[20];
		for(int i=0;i<value.length;i++) {
			value[i] = gen.nextInt(100);
		}
		//value �̒�����\��
		for(int i=0;i<value.length;i++) {
			System.out.println(value[i]);
		}
		//value �̕��ς��v�Z���Ȃ����B
		int sum = 0;
		for(int i=0;i<value.length;i++) {
			sum = sum+ value[i];
		}
		//����
		double ave = sum/value.length;
		System.out.println("���ϒl��"+ave);
		//value �̕��U�ƕW���΍����v�Z����B
		

	}

}
