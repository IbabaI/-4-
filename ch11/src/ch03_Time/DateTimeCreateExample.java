package ch03_Time;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTimeCreateExample {

	public static void main(String[] args) {
		
		//��¥ ���
		LocalDate currDate = LocalDate.now();
		System.out.println("���� ��¥: "+currDate);
		
		LocalDate targetDate=LocalDate.of(2024, 5, 10);
		System.out.println("��ǥ ��¥: "+targetDate);
		
		//�ð�
		LocalTime currTime = LocalTime.now();
		System.out.println("���� �ð�: "+currTime);
		
		LocalTime targetTime= LocalTime.of(6, 30,0,0);
		System.out.println("��ǥ �ð�: "+targetTime);
		
		//��¥�� �ð�
		LocalDateTime currDateTime = LocalDateTime.now();
		System.out.println("���� ��¥�� �ð�: "+currDateTime);
		
		LocalDateTime targetDateTime = LocalDateTime.of(2024,05,10,6,30,0,0);
		System.out.println("��ǥ ��¥�� �ð�: "+targetDateTime);

		
		//���� �ÿ� Ÿ����
		ZonedDateTime utcDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println("���� �����: "+utcDateTime);
		
		//Ư�� ������ Ÿ�ӽ����� ���
		Instant instant1 = Instant.now();
		System.out.println(instant1);
	}

}
