package test;

public class tenThousandIce implements Item{
	public void use() {
		System.out.println("사악!");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "만년 서리";
	}
}
