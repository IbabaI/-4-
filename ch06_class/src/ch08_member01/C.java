package ch08_member01;

public class C {

	public void k() {
		 B01 b=new B01();
		 b.n=7;
		 b.g();
	 }
	 
	 public void k1() {
		 //������Ű������
		 //Ŭ������ public�̹Ƿ� ���ٰ���
		 B02 b2=new B02();
		 //�ʵ�� �޼ҵ�� private�̹Ƿ�
		 //���� ��Ű���������� ���� �Ұ�
		 //b2.n=10;
		 //b2.g();
	 }
	 
	 public void k3() {
		 B03 b3=new B03();
		 b3.n=10;
		 b3.g();
	 }
	 
	 public void k4() {
		 B04 b4=new B04();
		 b4.n=10;
		 b4.g();
	 }
}
