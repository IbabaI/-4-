package ch02_switch;

/*�ڹ� 6���� switch()�� �ȿ� - byte, char, short, int, long ������ �������� �����ϴ� ����ĸ� �ü� ����*/
public class SwitchCahrExam {

	public static void main(String[] args) {
		
		char grade = 'B';
		
		switch(grade) {
		case 'A':  //�����ݷ� �ƴϰ� �Ϲ� �ݷ� ���
		case 'a':
		System.out.println("��� ȸ���Դϴ�.");
		break;
		case 'B':  
		case 'b':
		System.out.println("�Ϲ� ȸ���Դϴ�.");
		break;
		default:
			System.out.println("�մ��Դϴ�.");
		}

	}

}
