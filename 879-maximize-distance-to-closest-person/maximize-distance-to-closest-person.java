class Solution {
    public int maxDistToClosest(int[] seats) {
     int L = seats.length;
        int dis = -1;
        int pre = -1;
        for (int i=0; i<L; i++) {
            if (seats[i] == 0) continue;
            if (pre == -1) {
                dis = i;
            } else if (pre + 1 < i) {
                int mid = (i - pre) / 2 + pre;
                int d = Math.min(mid - pre, i - mid);
                if (d > dis) dis = d;
            }
            pre = i;
        }
        return Math.max(L - 1 - pre, dis);
        
    }
}