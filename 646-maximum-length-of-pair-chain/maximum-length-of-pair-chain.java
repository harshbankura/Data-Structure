import java.util.*;
class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs,Comparator.comparingDouble(o->o[1]));
        int last=pairs[0][1];
        int max=1;
        for(int i=1;i<pairs.length;i++){
            if(pairs[i][0]>last){
                max++;
                last=pairs[i][1];
            }

        }
        return max;

        
    }
}