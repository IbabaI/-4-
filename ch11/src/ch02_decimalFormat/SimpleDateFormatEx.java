package ch02_decimalFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatEx {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyy�� MM�� dd���� ������ D° �� �̰�, ������ w°�ֿ� ���ϰ�, �̴��� W°���Դϴ�.");
		
		String strDate = sdf.format(new Date());
		System.out.println(strDate);

	}

}
