
public class ShiftTest {
	public static void main(String[] args) {
		byte b = 100;
		int a = b << 40;   //其实是移动了8位，只考虑40的低5位
		String aBinary = Integer.toBinaryString(a);
		System.out.println("对a的移位运算移动了" + (aBinary.length() - aBinary.indexOf("1100100") - 7) + "位");
		long c = 100L;
		long d = c << 100; //其实是移动了36位，只考虑100的低6位
		String cBinary = Long.toBinaryString(d);
		System.out.println("对c的移位运算移动了" + (cBinary.length() - cBinary.indexOf("1100100") - 7) + "位");
	}
}
