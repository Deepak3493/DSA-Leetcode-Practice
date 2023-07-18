class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int degree [] = new int[numCourses];
        for(int i=0;i<prerequisites.length;i++){
            degree[prerequisites[i][1]]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(degree[i]==0){
                q.add(i);
            }
        }
        if(q.size()==0){
            return false;
        }
        int count =0;
        while(q.size()>0){
             int k = q.poll();
             for(int i=0;i<prerequisites.length;i++){
                 int j = prerequisites[i][0];
                 if(k==j){
                      degree[prerequisites[i][1]]--;
                      if(degree[prerequisites[i][1]]==0){
                          q.add(prerequisites[i][1]);
                      }
                 }
             }
             count++;
             if(count>numCourses){
                 return false;
             }
        }
        return count == numCourses;
    }
}