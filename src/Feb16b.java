import java.util.Random;

public class Feb16b {

	public static void main(String[] args) {
		//����20��double�^�z�������A50�����̗����ŏ�����
		Random gen = new Random();
		double[] data = new double[30];
		for(int i=0; i<data.length;i++) {
			data[i] = gen.nextDouble(50.0);
		}
		//
		for(int i=0; i<data.length;i++) {
			System.out.println(data[i]);
		}
		//�z��̃f�[�^�ɂ��č��v�ƕ��ς��v�Z
		double sum = 0.0;
		for(int i=0;i<data.length;i++) {
			sum = sum + data[i];
		}
		double ave = sum/data.length;
		System.out.println("���v��"+sum+"\t���ρ�"+ave);
		//���U�ƕW���΍����v�Z�B
		//�΍��̔z������
		double [] dev = new double[30];
		for(int i=0;i<data.length;i++) {
			dev[i] = data[i] - ave;
		}
		//�΍���\��
		for(int i=0;i< dev.length;i++) {
			System.out.println(dev[i]);
		}
		//�΍��̍��v�l���Ƃ�B
		sum = 0.0;  //sum �͏�Œ�`�����̂ł����Ŏg����
		for(int i=0; i< dev.length; i++) {
			sum= sum+dev[i];
		}
		System.out.println("�΍��̍��v�F"+sum);
		//���U�̌v�Z�F�΍�2������v���ăf�[�^���Ŋ���
		sum = 0.0 ; 
		for(int i=0;i<dev.length;i++) {
			sum = sum+ dev[i]*dev[i];
		}
		double var = sum/dev.length;
		System.out.println("���U="+var);
		//
		double stdDev = Math.sqrt(var); //Math.sqrt(n) ��n�̕��������v�Z
		System.out.println("�W���΍�="+stdDev);
		

	}

}
