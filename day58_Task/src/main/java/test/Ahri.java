package test;

public class Ahri implements Champion {
	private Item item;
	
	public Ahri() {
		System.out.println("아리: 똑똑한 여우는 절대 잡히지 않거든.");
	}
	
	public Ahri(Item item) {
		System.out.println("아리: 똑똑한 여우는 절대 잡히지 않거든.");
		this.item = item;
		System.out.println(item + " 구매완료");
	}
	
	public void use() {
		item.use();
	}
	
	public void q() {
		System.out.println("현혹의 구슬");
	}
	public void w() {
		System.out.println("여우불");
	}
	public void e() {
		System.out.println("매혹");
	}
	public void r() {
		System.out.println("혼령 질주");
	}
}
