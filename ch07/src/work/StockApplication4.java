package work; //����ȣ

import java.util.Scanner;

public class StockApplication4 {

	// 100���� ���������� ������ �迭
		private static Account[] accountArray = new Account[100];
		private static Scanner scanner = new Scanner(System.in);
		// ������ ���� ����
		private static int idx;

		public static void main(String[] args) {
			boolean run = true;
			while (run) {
				System.out.println("------------------------------------------");
				System.out.println("1.��ǰ���� | 2.��ǰ��� | 3.�԰� | 4. ��� | 5.����");
				System.out.println("------------------------------------------");
				System.out.print("����> ");

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
			System.out.println("���α׷� ����");
		}

		// ���»����ϱ�
		private static void createNumber() {
			System.out.print("-------\n��ǰ����\n-------\n");
			// String ano = scanner.next();
			System.out.print("name: ");
			String owner = scanner.next();
			System.out.print("�ʱ����: ");
			int balance = scanner.nextInt();
			System.out.println("���: ��ǰ����� �����Ǿ����ϴ�.");

			// ������ �Է¹��� name�� �ʱ������ ���� acc�� ����
			Account acc = new Account(owner, balance);
			// acc���� �迭�� ����
			accountArray[idx++] = acc;
		}

		// ���¸�Ϻ���
		private static void itemList() {
			System.out.println("-------\n��ǰ���\n-------");
			for (int i = 0; i < accountArray.length; i++) {
				Account account = accountArray[i];
				if (account != null) { // null�� �ƴ� ���, ������ ����
					System.out.print(account.getAno() + "    ");
					System.out.print(account.getOwner() + "    ");
					System.out.println(account.getBalance() + "    ");
				}
			}
		}

		// �����ϱ�
		private static void deposit() {
			System.out.println("-------\n�԰�\n-------");
			System.out.print("item: ");
			String ano = scanner.next();
			System.out.print("qty: ");
			int input = scanner.nextInt(); // �԰� ����
			// �´°��� ã�� �Լ� ȣ��
			Account acc = findAccount(ano);
			if (acc != null) // acc�� null�� �ƴϸ�(����ִ� �迭�� �ƴϸ�)
				acc.setBalance(acc.getBalance() + input); // ��� +�԰�
			System.out.println("���: �԰� �����Ǿ����ϴ�.");
		}

		// ����ϱ�
		private static void withdraw() {
			System.out.println("-------\n���\n-------");
			System.out.print("name: ");
			String ano = scanner.next();
			System.out.print("qty: ");
			int output = scanner.nextInt(); // ��� ����
			// �´°��� ã�� �Լ� ȣ��
			Account acc = findAccount(ano);
			if (acc != null) {
				if (acc.getBalance() - output >= 0) { // ���-���>=0 ���� ������ ��� ����
					acc.setBalance(acc.getBalance() - output);
					System.out.println("���: ��� �����Ǿ����ϴ�.");
				} else {
					System.out.println("���: ��� �����Ͽ����ϴ�.\n������ Ȯ�����ּ���.");
				}
			}
		}

		// �´°���ã��
		private static Account findAccount(String ano) {
			Account account = null; // null�� �ʱ�ȭ
			for (int i = 0; i < accountArray.length; i++) {
				account = accountArray[i]; // �迭�� account�� ����
				if (account != null) {
					if (account.getAno().equals(ano))
						return account;
				}
			}
			return account;
		}
	}
