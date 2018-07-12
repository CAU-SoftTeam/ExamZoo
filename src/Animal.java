public class Animal {
	protected int isThisKing = 0;
	protected int satiety = 0;
	protected boolean isDie = false;
	
	public Animal(int King) {
		this.isThisKing = King;
	}
	public Animal() {
		
	}
	public void eat() {
		if(isDie == true) {
			System.out.println("�� ������ �׾����ϴ�.");
			return;
		}
		System.out.println("���𰡸� �Ծ����ϴ�.~");
		this.satiety += 1;
	}

	public void eat(Rabbit r) {
		if(isDie == true) {
			System.out.println("�� ������ �׾����ϴ�.");
			return;
		}
		r.isDie = false;
		System.out.println("���𰡸� �Ծ����ϴ�.~");
		this.satiety += 1;
	}

	public void sleep() {
		if(isDie == true) {
			System.out.println("�� ������ �׾����ϴ�.");
			return;
		}
		System.out.println("���� ��ϴ�~");
		this.satiety -= 1;
	}
	public void shit() {
		if(isDie == true) {
			System.out.println("�� ������ �׾����ϴ�.");
			return;
		}
		System.out.println("X�� �Դϴ�~");
	}
	public void fight(Tiger t) {
		if(isDie == true) {
			System.out.println("�� ������ �׾����ϴ�.");
			return;
		}
		System.out.println("ȣ���̿� �ο��� ȣ���̰� �׾����ϴ�.");
		t.die();
	}
	public void fight(Lion l) {
		if(isDie == true) {
			System.out.println("�� ������ �׾����ϴ�.");
			return;
		}
		System.out.println("���ڿ� �ο��� ���ڰ� �׾����ϴ�.");
		l.die();
	}
	public void fight(Rabbit t) {
		if(isDie == true) {
			System.out.println("�� ������ �׾����ϴ�.");
			return;
		}
		System.out.println("�䳢�� �ο��� �䳢�� �׾����ϴ�.");
		t.die();
	}
	public void die() {
		if(isDie == true) {
			System.out.println("�� ������ �׾����ϴ�.");
			return;
		}
		System.out.println("�׾����ϴ�.");
		isDie = true;
	}
}