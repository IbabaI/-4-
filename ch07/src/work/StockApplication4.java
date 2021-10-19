package work; //이찬호

import java.util.Scanner;

public class StockApplication4 {

	// 100개의 계좌정보를 저장할 배열
		private static Account[] accountArray = new Account[100];
		private static Scanner scanner = new Scanner(System.in);
		// 증가를 위한 변수
		private static int idx;

		public static void main(String[] args) {
			boolean run = true;
			while (run) {
				System.out.println("------------------------------------------");
				System.out.println("1.물품생성 | 2.물품목록 | 3.입고 | 4. 출고 | 5.종료");
				System.out.println("------------------------------------------");
				System.out.print("선택> ");

				int selectNo = scanner.nextInt();

				if (selectNo == 1) {
					createNumber();
				} else if (selectNo == 2) {
					itemList();
				} else if (selectNo == 3) {
					deposit();
				} else if (selectNo == 4) {
					withdraw();
				} else if (selectNo == 5) {
					run = false;
				}
			}
			System.out.println("프로그램 종료");
		}

		// 계좌생성하기
		private static void createNumber() {
			System.out.print("-------\n물품생성\n-------\n");
			// String ano = scanner.next();
			System.out.print("name: ");
			String owner = scanner.next();
			System.out.print("초기재고: ");
			int balance = scanner.nextInt();
			System.out.println("결과: 물품목록이 생성되었습니다.");

			// 위에서 입력받은 name과 초기재고의 값을 acc에 저장
			Account acc = new Account(owner, balance);
			// acc값을 배열에 저장
			accountArray[idx++] = acc;
		}

		// 계좌목록보기
		private static void itemList() {
			System.out.println("-------\n물품목록\n-------");
			for (int i = 0; i < accountArray.length; i++) {
				Account account = accountArray[i];
				if (account != null) { // null이 아닌 경우, 없으면 에러
					System.out.print(account.getAno() + "    ");
					System.out.print(account.getOwner() + "    ");
					System.out.println(account.getBalance() + "    ");
				}
			}
		}

		// 예금하기
		private static void deposit() {
			System.out.println("-------\n입고\n-------");
			System.out.print("item: ");
			String ano = scanner.next();
			System.out.print("qty: ");
			int input = scanner.nextInt(); // 입고 변수
			// 맞는계좌 찾는 함수 호출
			Account acc = findAccount(ano);
			if (acc != null) // acc가 null이 아니면(비어있는 배열이 아니면)
				acc.setBalance(acc.getBalance() + input); // 재고에 +입고량
			System.out.println("결과: 입고가 성공되었습니다.");
		}

		// 출금하기
		private static void withdraw() {
			System.out.println("-------\n출고\n-------");
			System.out.print("name: ");
			String ano = scanner.next();
			System.out.print("qty: ");
			int output = scanner.nextInt(); // 출고 변수
			// 맞는계좌 찾는 함수 호출
			Account acc = findAccount(ano);
			if (acc != null) {
				if (acc.getBalance() - output >= 0) { // 재고-출고>=0 조건 충족시 출고 성공
					acc.setBalance(acc.getBalance() - output);
					System.out.println("결과: 출고가 성공되었습니다.");
				} else {
					System.out.println("결과: 출고가 실패하였습니다.\n수량을 확인해주세요.");
				}
			}
		}

		// 맞는계좌찾기
		private static Account findAccount(String ano) {
			Account account = null; // null로 초기화
			for (int i = 0; i < accountArray.length; i++) {
				account = accountArray[i]; // 배열을 account에 저장
				if (account != null) {
					if (account.getAno().equals(ano))
						return account;
				}
			}
			return account;
		}
	}
