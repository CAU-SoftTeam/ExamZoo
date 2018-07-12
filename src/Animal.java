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
			System.out.println("그 동물은 죽었습니다.");
			return;
		}
		System.out.println("무언가를 먹었습니다.~");
		this.satiety += 1;
	}
	public void sleep() {
		if(isDie == true) {
			System.out.println("그 동물은 죽었습니다.");
			return;
		}
		System.out.println("잠을 잡니다~");
		this.satiety -= 1;
	}
	public void shit() {
		if(isDie == true) {
			System.out.println("그 동물은 죽었습니다.");
			return;
		}
		System.out.println("X를 쌉니다~");
	}
	public void fight(Tiger t) {
		if(isDie == true) {
			System.out.println("그 동물은 죽었습니다.");
			return;
		}
		System.out.println("호랑이와 싸워서 호랑이가 죽었습니다.");
		t.die();
	}
	public void fight(Lion l) {
		if(isDie == true) {
			System.out.println("그 동물은 죽었습니다.");
			return;
		}
		System.out.println("사자와 싸워서 사자가 죽었습니다.");
		l.die();
	}
	public void fight(Rabbit t) {
		if(isDie == true) {
			System.out.println("그 동물은 죽었습니다.");
			return;
		}
		System.out.println("토끼와 싸워서 토끼가 죽었습니다.");
		t.die();
	}
	public void die() {
		if(isDie == true) {
			System.out.println("그 동물은 죽었습니다.");
			return;
		}
		System.out.println("죽었습니다.");
		isDie = true;
	}
}