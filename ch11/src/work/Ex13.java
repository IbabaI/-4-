package work;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex13 {

	public static void main(String[] args) {
		
		System.out.println("SimpleDateFormatŬ������ �̿��ؼ� ������ ��¥�� ������ ���� ����ϴ� �ڵ带 �ۼ��� ������.");
		
		System.out.println("2024�� 05�� 08�� ȭ���� 10�� 30��");
		
		Date now = new Date();
		
		//���⼭ �ڵ带 �ۼ��ϼ���.
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� E���� HH�� mm��");
		System.out.println(sdf.format(now));

	}

}
