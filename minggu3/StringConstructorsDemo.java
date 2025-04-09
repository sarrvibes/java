public class StringConstructorsDemo {
public static void main(String args[]) {
    // membuat String kosong
        String s1 = new String();

        char chars[] = { 'h', 'e', 'l', 'l', 'o'};
        // s2 = "hello";
        String s2 = new String(chars);
        byte bytes[] = { 'w', 'o', 'r', 'l', 'd' };
        // s3 = "world"
        String s3 = new String(bytes);
        String s4 = new String(chars, 1, 3);
        String s5 = new String(s2);
        String s6 = s2;
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
    }
}
