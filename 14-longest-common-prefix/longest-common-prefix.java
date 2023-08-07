class Solution {
    public String longestCommonPrefix(String[] arr) {
        int n = arr.length;
      	// Write your code here
		int minLengthWord = Integer.MAX_VALUE;
		for(int i=0;i<n;i++){
			minLengthWord = Math.min(minLengthWord,arr[i].length());
		}
		String ans = "";
		for(int i=0;i<minLengthWord;i++){
			char ch = ' ';
			for(int j=0;j<n;j++){
               if(ch ==' '){
				   ch = arr[j].charAt(i);
			   }else{
				   if(ch!=arr[j].charAt(i)){
					   return ans;
				   }
			   }
			}
			ans = ans+ch;
		}
		return ans;
    }
}