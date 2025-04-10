class Solution {
    static final int MOD = 1_000_000_007;

    public int countGoodNumbers(long n) {
        long evenPositions = (n + 1) / 2;
        long oddPositions = n / 2;

        long evenPow = power(5, evenPositions);
        long oddPow = power(4, oddPositions);

        return (int)((evenPow * oddPow) % MOD);
    }

    private long power(long base, long exp) {
        long result = 1;
        base %= MOD;

        while (exp > 0) {
            if ((exp & 1) == 1) { // if exp is odd
                result = (result * base) % MOD;
            }
            base = (base * base) % MOD;
            exp >>= 1; // divide exp by 2
        }

        return result;
    }
}