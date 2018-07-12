package zoo;

class Rabbit extends Animal{
	public void fight(Tiger t) {
		if(isDie == true) {
			System.out.println("�� ������ �׾����ϴ�.");
			return;
		}
		System.out.println("ȣ���̿� �ο��� �䳢�� �׾����ϴ�.");
		isDie = true;
	}
	public void fight(Lion l) {
		if(isDie == true) {
			System.out.println("�� ������ �׾����ϴ�.");
			return;
		}
		System.out.println("���ڿ� �ο��� �䳢�� �׾����ϴ�.");
		isDie = true;
	}
}