package ch01_generics;

public class GenericExMain {

	public static void main(String[] args) {
		// Double 타입의 GStack 생성
				GStack<Double> gs = new GStack<Double>(); 

				GenericMethodExample ge=new GenericMethodExample();
				// 5개의 요소를 스택에 push
				//for (int i=0; i<5; i++) { 
				//	gs.push(new Double(i)); }
				
				GStack<Double> gs2 = ge.reverse(gs);
				for (int i=0; i<5; i++) {
					System.out.println(gs2.pop());
				}
			}
		}
