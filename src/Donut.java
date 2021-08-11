import java.util.Arrays;

public class Donut {
    public static void main(String[] args) {
        int k;
        double A = 0, B = 0, i, j;
        double[] z = new double[1760];
        char[] b = new char[1760];
        System.out.print("\u001b[2J");
        for (; ; ) {
            Arrays.fill(b, 0, 1760, ' ');
            Arrays.fill(z, 0, 1760, 0);
            for (j = 0; 6.28 > j; j += 0.07)
                for (i = 0; 6.28 > i; i += 0.02) {
                    double c = Math.sin(i),
                            d = Math.cos(j),
                            e = Math.sin(A),
                            f = Math.sin(j),
                            g = Math.cos(A),
                            h = d + 2,
                            D = 1 / (c * h * e + f * g + 5),
                            l = Math.cos(i),
                            m = Math.cos(B),
                            n = Math.sin(B),
                            t = c * h * g - f * e;
                    int x = (int) (40 + 30 * D * (l * h * m - t * n)),
                            y = (int) (12 + 15 * D * (l * h * n + t * m)),
                            o = x + 80 * y,
                            N = (int) (8 * ((f * e - c * d * g) * m - c * d * e - f * g - l * d * n));
                    if (22 > y && y > 0 && x > 0 && 80 > x && D > z[o]) {
                        z[o] = D;
                        b[o] = new char[]{'.', ',', '-', '~', ':', ';', '=', '!', '*', '#', '$', '@'}[Math.max(N, 0)];
                    }
                }
            System.out.print("\u001b[H");
            for (k = 0; 1761 > k; k++)
                System.out.print(k % 80 > 0 ? b[k] : 10);
            A += 0.04;
            B += 0.02;
        }
    }
}