package test;

public class Teemo implements Champion{
	private Item item;
	
	public Teemo() {
		System.out.println("티모: 티모 대위 정찰 다녀오겠습니다!");
	}
	
	public Teemo(Item item) {
		System.out.println("티모: 티모 대위 정찰 다녀오겠습니다!");
		this.item = item;
		System.out.println(item + " 구매완료");
	}
	
	public void use() {
		item.use();
	}
	
	public void q() {
		System.out.println("실명다트");
	}
	public void w() {
		System.out.println("신속한이동");
	}
	public void e() {
		System.out.println("맹독다트");
	}
	public void r() {
		System.out.println("유독성함정");
	}
}
