class Solution {
    public int[] maxSlidingWindow(int[] A, int K) {
        int N = A.length;
        Deque<Integer> dq = new ArrayDeque<>();
        int ans [] = new int[N-K+1];
        int j=0;
        for(int i=0;i<N;i++){
            if(i<K-1){
                while(dq.size()>0){
                    if(dq.getLast()>=A[i]){
                        break;
                    }
                    else{
                        dq.removeLast();
                    }
                }
                dq.add(A[i]);
                continue;
            }
            while(dq.size()>0){
                if(dq.getLast()>=A[i]){
                    break;
                }
                else{
                    dq.removeLast();
                }
            }
            dq.add(A[i]);
            if(dq.size()>0){
                if(dq.getFirst()>=A[i]){
                    ans[j]=dq.getFirst();
                    j++;
                }
                else{
                    ans[j] = A[i];
                    j++;
                }
            }
            else{
                ans[j]=A[i];
                j++;
            }
            if(dq.size()>0 && A[j-1]==dq.getFirst()){
                dq.removeFirst();
            }
            
        }
        return ans;
    }
}