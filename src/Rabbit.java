class Rabbit extends Animal{
	public void fight(Tiger t) {
		if(isDie == true) {
			System.out.println("그 동물은 죽었습니다.");
			return;
		}
		System.out.println("호랑이와 싸워서 토끼가 죽었습니다.");
		isDie = true;
	}
	public void fight(Lion l) {
		if(isDie == true) {
			System.out.println("그 동물은 죽었습니다.");
			return;
		}
		System.out.println("사자와 싸워서 토끼가 죽었습니다.");
		isDie = true;
	}
}