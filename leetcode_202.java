import java.util.HashSet;

public class leetcode_202 {
    public boolean isHappy(int n) {
        HashSet<Integer> hs = new HashSet<>();
        while(!hs.contains(n)) {
            int sum = 0;
            hs.add(n);
            while(n!=0) {
                sum += Math.pow(n%10, 2);
                n = n/10;
            }
            n = sum;
            if(sum==1) {
                return true;
            }
        }
        return false;
    }
}
