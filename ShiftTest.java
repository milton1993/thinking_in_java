
public class ShiftTest {
	public static void main(String[] args) {
		byte b = 100;
		int a = b << 40;   //��ʵ���ƶ���8λ��ֻ����40�ĵ�5λ
		String aBinary = Integer.toBinaryString(a);
		System.out.println("��a����λ�����ƶ���" + (aBinary.length() - aBinary.indexOf("1100100") - 7) + "λ");
		long c = 100L;
		long d = c << 100; //��ʵ���ƶ���36λ��ֻ����100�ĵ�6λ
		String cBinary = Long.toBinaryString(d);
		System.out.println("��c����λ�����ƶ���" + (cBinary.length() - cBinary.indexOf("1100100") - 7) + "λ");
	}
}
