
public class ShiftTest {
	public static void main(String[] args) {
		byte b = 100;
		int a = b << 40;   //其实是移动了8位
		System.out.println(Integer.toBinaryString(a));
	}
}
