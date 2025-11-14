public class RabinKarp {

    public int search(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();

        if (m > n) return -1;

        long patternHash = 0;
        long currentHash = 0;
        long power = 1;

        // Precompute base^(m-1) % mod
        int base = 257;
        long mod = 1_000_000_007;
        for (int i = 0; i < m - 1; i++) {
            power = (power * base) % mod;
        }

        for (int i = 0; i < m; i++) {
            patternHash = (patternHash * base + pattern.charAt(i)) % mod;
            currentHash = (currentHash * base + text.charAt(i)) % mod;
        }

        for (int i = 0; i <= n - m; i++) {

            if (patternHash == currentHash) {
                if (text.substring(i, i + m).equals(pattern)) {
                    return i;
                }
            }       //we verify characters to avoid collision

            if (i < n - m) {
                currentHash = (currentHash - text.charAt(i) * power % mod + mod) % mod;
                currentHash = (currentHash * base + text.charAt(i + m)) % mod;
            }       //remove and replace one character by another
        }

        return -1;
    }
}
