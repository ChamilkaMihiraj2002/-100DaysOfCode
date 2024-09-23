public class StringBuffer_and_StringBuilder {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" world");
        System.out.println("StringBuffer :" + sb);

        StringBuilder sbb = new StringBuilder("Hello");
        sbb.append(" word");
        System.out.println("StringBuilder : " + sbb);
    }
}
