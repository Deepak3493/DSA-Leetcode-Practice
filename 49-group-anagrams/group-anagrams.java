class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        HashMap<String,List<String>> mp = new HashMap<>();
        for(int i =0;i<n;i++){
            char chArr[] = strs[i].toCharArray();
            Arrays.sort(chArr);
            String s = String.copyValueOf(chArr);
            if(mp.containsKey(s)){
                List<String> innerList = mp.get(s);
                innerList.add(strs[i]);
            }
            else{
                List<String> innerList  = new ArrayList<>();
                innerList.add(strs[i]);
                mp.put(s, innerList);
            }
        }
        return new ArrayList<>(mp.values());
    }
}