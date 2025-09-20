public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Donali");
        sb.append("Biswal");

        System.out.println(sb);
        String str = sb.toString();
    }
}
