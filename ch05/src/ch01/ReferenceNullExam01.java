package ch01;

public class ReferenceNullExam01 {

	public static void main(String[] args) {
		
		String str1 = new String("ȫ�浿");
		System.out.println(str1);
		
		//���
		str1=null;  // ������ �����ִ°� null�̴�.
		System.out.println(str1); //null

	}

}
