public class Number1 {
    public static void main(String[] arg){
        int a = 42;
        int b = 15;
        double c = 42.5;
        int ab = - 42;
        int bc = - 15;

        int d = a & b; // Результат операции: 10; двоичный вид: 1010  //
        int d1 = ab & bc; // Результат операции: -42; двоичный вид: 11111111111111111111111111010000 //
        System.out.println(d);
        System.out.println(Integer.toBinaryString(d));
        System.out.println(d1);
        System.out.println(Integer.toBinaryString(d1));

        int e = a | b; // Результат операции: 47; двоичный вид: 101111  //
        int e1 = ab | bc; // Результат операции: -9; двоичный вид:  11111111111111111111111111110111 //
        System.out.println(e);
        System.out.println(Integer.toBinaryString(e));
        System.out.println(e1);
        System.out.println(Integer.toBinaryString(e1));

        int f = a ^ b; // Результат операции: 37; двоичный вид: 100101  //
        int f1 = ab ^ bc; // Результат операции: 39; двоичный вид: 10111 //
        System.out.println(f);
        System.out.println(Integer.toBinaryString(f));
        System.out.println(f1);
        System.out.println(Integer.toBinaryString(f1));

        int g = ~a; // Результат операции: -43; двоичный вид: 11111111111111111111111111010101 //
        int g1 = ~ab; // Результат операции: 41; двоичный вид: 101001 //
        System.out.println(g);
        System.out.println(Integer.toBinaryString(g));
        System.out.println(g1);
        System.out.println(Integer.toBinaryString(g1));

        int h = ~b; // Результат операции: -16; двоичный вид: 11111111111111111111111111110000 //
        int h1 = ~bc; // Результат операции: 14; двоичный вид: 1110 //
        System.out.println(h);
        System.out.println(Integer.toBinaryString(h));
        System.out.println(h1);
        System.out.println(Integer.toBinaryString(h1));

        int i = a << 1; // Результат операции: 84; двоичный вид: 1010100  //
        int i1 = ab << 1; // Результат операции: -84; двоичный вид: 11111111111111111111111110101100 //
        System.out.println(i);
        System.out.println(Integer.toBinaryString(i));
        System.out.println(i1);
        System.out.println(Integer.toBinaryString(i1));

        int j = b << 1; // Результат операции: 30; двоичный вид: 11110  //
        int j1 = bc << 1; // Результат операции: -30; двоичный вид: 11111111111111111111111111100010 //
        System.out.println(j);
        System.out.println(Integer.toBinaryString(j));
        System.out.println(j1);
        System.out.println(Integer.toBinaryString(j1));

        int k = a >> 1; // Результат операции: 21; двоичный вид: 10101  //
        int k1 = ab >> 1; // Результат операции: -21; двоичный вид: 11111111111111111111111111101011 //
        System.out.println(k);
        System.out.println(Integer.toBinaryString(k));
        System.out.println(k1);
        System.out.println(Integer.toBinaryString(k1));

        int l = b >> 1; // Результат операции: 7; двоичный вид: 111  //
        int l1 = bc >> 1; // Результат операции: -8; двоичный вид: 11111111111111111111111111111000 //
        System.out.println(l);
        System.out.println(Integer.toBinaryString(l));
        System.out.println(l1);
        System.out.println(Integer.toBinaryString(l1));

        int m = a >>> 1; // Результат операции: 21; двоичный вид: 10101  //
        int m1 = ab >>> 1; // Результат операции: 2147483627; двоичный вид: 1111111111111111111111111101011 //
        System.out.println(m);
        System.out.println(Integer.toBinaryString(m));
        System.out.println(m1);
        System.out.println(Integer.toBinaryString(m1));

        int n = b >>> 1; // Результат операции: 7; двоичный вид: 111  //
        int n1 = bc >>> 1; // Результат операции: 2147483640; двоичный вид: 1111111111111111111111111111000 //
        System.out.println(n);
        System.out.println(Integer.toBinaryString(n));
        System.out.println(n1);
        System.out.println(Integer.toBinaryString(n1));

    }
}
