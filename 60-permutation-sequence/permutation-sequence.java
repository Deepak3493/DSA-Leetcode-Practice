class Solution {
    public String getPermutation(int n, int k) {
        List<Integer> arr = new ArrayList<>();
        int fact = 1;
        for(int i=1;i<n;i++){
            fact = fact*i;
            arr.add(i);
        }
        arr.add(n);
        k = k-1;
        String ans = "";
        System.out.println(k+" "+fact);
        while(true){
            ans = ans +""+arr.get(k/fact);
            arr.remove(k/fact);
            if(arr.size()==0){
                return ans;
            }
            k = k%fact;
            fact = fact/arr.size();
        }
    }
}

/* 123  

k = 3 

k = 2


123 
132
213
231

*/

