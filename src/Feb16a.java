import java.util.Random;

public class Feb16a {

	public static void main(String[] args) {
		//����20��int �z�������āA 50������random �Ȑ��ŏ��������Ȃ����B
		Random gen = new Random();
		//int �z��
		int[] data = new int[20];
		//�z�񏉊����i�����_���Łj
		for(int i = 0; i<data.length;i++) {
			data[i] = gen.nextInt(50);
		}
		//���̔z��̓��e��\��
		for(int i=0;i<data.length;i++) {
			System.out.println(data[i]);
		}
		//���̔z��̒l�̍��v�ƕ��ς��v�Z���Ȃ���
		//���v
		double sum =0.0;
		for(int i=0;i<data.length;i++) {
			sum = sum + data[i];
		}
		System.out.println("���v��"+sum);
		//����
		double ave = sum/data.length;
		System.out.println("���ς�"+ ave);

	}

}
