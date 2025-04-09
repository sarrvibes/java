package tugas2;

class StringBufferDemo {
    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer("Sulaiman");
        System.out.println("sb = " + sb);

        /* initial capacity adalah 16 */
        System.out.println("capacity dari sb: " + sb.capacity());
        System.out.println("append 'O' ke sb: " + sb.append("O"));
        System.out.println("sb = " + sb);
        System.out.println("Karakter ke-3 dari sb: " + sb.charAt(2));

        char charArr[] = "Hi XX".toCharArray();
        sb.getChars(0, 2, charArr, 3);
        System.out.print("getChars method: ");
        System.out.println(charArr);

        System.out.println("Insert 'si' pada sel ke-3: " + sb.insert(2, "si"));
        System.out.println("Delete 'si' pada sel ke-3: " + sb.delete(2, 4));
        System.out.println("length dari sb: " + sb.length());
        System.out.println("replace: " + sb.replace(3, 9, "le"));
        System.out.println("substring (1st two characters): " + sb.substring(0, 3));
        System.out.println("implicit toString(): " + sb);
    }
}
