class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        String ans = "";
        for(int i=0;i<n;i++){
           int k1 = i-1;
           int j1 = i+1;
           int count1 = 1;
           while(k1>=0 && j1<n){
               if(s.charAt(k1)==s.charAt(j1)){
                   count1+=2;
               }
               else{
                   break;
               } 
               k1--;
               j1++;
           }

           int k2 = i;
           int j2 = i+1;
           int count2 = 0;
           while(k2>=0 && j2<n){
               if(s.charAt(k2)==s.charAt(j2)){
                   count2+=2;
               }
               else{
                   break;
               } 
               k2--;
               j2++;
           }

           int k3 = i-1;
           int j3 = i;
           int count3 = 0;
           while(k3>=0 && j3<n){
               if(s.charAt(k3)==s.charAt(j3)){
                   count3 += 2;
               }
               else{
                   break;
               } 
               k3--;
               j3++;
           }
           //System.out.println(count1+" "+count2+" "+count3+" "+i);
           if(count1>count2 && count1>count3 && count1>ans.length()){
               ans = s.substring(k1+1,j1);
           }
           else if(count2>count1 && count2>count3 && count2>ans.length()){
               ans = s.substring(k2+1,j2);
           }
           else if(count3>count1 && count3>count2 && count3>ans.length()){
               ans = s.substring(k3+1,j3);
           }
        }
        return ans;
    }
}