package ch04_while;

/* printf("�����ȣ1, �����ȣ2, �����ȣ 3......, ��1, ��2, ��3,....*/
// �����ȣ�� ������ ���� ������ ���ƾ���
// �����ȣ�� ����Ÿ Ÿ�԰� ��Ī�Ǵ� ���� ��ġŸ Ÿ���� ���ƾ���.
/* %d int Ÿ���� ����,
 * %f double Ÿ���� �Ǽ�,
 * %e �ε��Ҽ��� ����
 * %c ����
 * %s String Ÿ���� ���ڿ� */
public class PrintFExam01 {

	public static void main(String[] args) {
		
		System.out.printf("%x \n", 15);   // %x�� 16���� ���� 10���� -> 16������ ǥ��
		System.out.printf("%d \n", 15);   // %d�� 10���� ���� 10����
		System.out.printf("%f \n", 15.0); // %f�� �Ǽ� ����
		System.out.printf("%e \n", 15.0); // %e�� �ε��Ҽ��� ����
		System.out.printf("%s \n", 15.0); // %s�� ���ڿ� "15.0"
		
		// 5������ 2�� ���� 2�̰�, �������� 1�Դϴ�.
		// %�� �����ϴ� ���乮�� %Ÿ�� ������ŭ ����(��)�� ,�� ������.
		// %Ÿ�԰� ����(��) Ÿ���� ���ƾ���.
		System.out.printf("%d ������ %d�� ���� %d�̰�, �������� %d�Դϴ�.\n",5,2,(5/2),(5%2));
		
		

	}

}