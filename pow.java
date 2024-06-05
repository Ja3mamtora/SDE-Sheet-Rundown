public class pow {
    public static double power(double x, int n) {
        double res = 1.0d;
        long nn = Math.abs(n);

        while(nn != 0) {
            if(nn%2 == 1) {
                res *= x;
                nn -= 1;
            }
            else {
                x *= x;
                nn /= 2;
            }
        }
        if(n < 0)res = (double)1.0/(double)res;
        return res;
    }
}
