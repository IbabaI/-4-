package ch01_generics;

public class GenericExMain {

	public static void main(String[] args) {
		// Double Ÿ���� GStack ����
				GStack<Double> gs = new GStack<Double>(); 

				GenericMethodExample ge=new GenericMethodExample();
				// 5���� ��Ҹ� ���ÿ� push
				//for (int i=0; i<5; i++) { 
				//	gs.push(new Double(i)); }
				
				GStack<Double> gs2 = ge.reverse(gs);
				for (int i=0; i<5; i++) {
					System.out.println(gs2.pop());
				}
			}
		}
