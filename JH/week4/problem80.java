import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public ArrayList<Integer> solution(int[] arr, int divisor) {
        // int[] answer = {};
        ArrayList<Integer> res = new ArrayList<Integer>();
        for(int num : arr){
            if(num%divisor == 0){
                res.add(num);
            }
        }
        Collections.sort(res);
        if(res.size()==0){
            res.add(-1);
        }
        return res;
    }
}