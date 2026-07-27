class Solution {
    public int mySqrt(int x) {
       long start = 1;
       long end = x;
       long ans = 0;
       while(start<=end){
          long mid = start+(end-start)/2;
          long prod = mid*mid;
          if(prod == x)
             return (int)mid;
          else if(prod>x){
             end = mid-1;
             ans = end;
          }
          else{
             ans = start;
             start = mid+1;
          }
       }
       return (int)ans;
    }
        
}