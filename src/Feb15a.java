
public class Feb15a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int 型
		int n ; //変数定義
		n= 1234567890;  //初期化
		System.out.println("int 型変数 n="+n);
		//変数の値の変更
		n = -123;
		System.out.println("int 型変数 n="+n);
		//double 型
		double value;
		value = 1.0/4;
		System.out.println("double 型変数 value="+value);
		//char 型
		char ch_value ;
		ch_value = 'y';
		System.out.println("char 型変数 ch_value="+ch_value);
		//String 文字列クラス
		String str = new String("This is a pen.");
		System.out.println(str);
		String str2 = new String("That is a ballpointpen.");
		System.out.println(str+str2);
		str = new String("code\tcode2\tcode3\ncode4\tcode5\tcode6");
		System.out.println(str);
		

	}

}
