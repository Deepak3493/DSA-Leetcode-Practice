class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int ans = 1;
        int j=0;
        for(int i=0;i<fruits.length;i++){
            mp.put(fruits[i],mp.getOrDefault(fruits[i],0)+1);
            while(mp.size()>2 && j<=i){
                 int k = fruits[j];
                 if(mp.containsKey(k)){
                    mp.put(k, mp.get(k)-1);
                    if(mp.get(k)==0){
                        mp.remove(k);
                    }
                 }
                 j++;
            }
            int sum =0;
            for(int l:mp.values()){
                sum+=l;
            }
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}