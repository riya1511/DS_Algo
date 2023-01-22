class Solution {

    List<List<String>> result = new ArrayList<>();

    public List<List<String>> partition(String s) {
        List<String> list = new ArrayList<>();
        isPalPartition(s, list);
        return result;
    }

    public void isPalPartition(String s, List<String> list) {
        // Base case
        if( s.length() == 0 || s == null) {
            result.add(new ArrayList<>(list));
            return;
        }
        for(int k = 1; k <= s.length(); k++) {
            String cut = s.substring(0, k);
            if(!isPalindrome(cut)) continue;
            
            list.add(cut); 
            isPalPartition(s.substring(k, s.length()), list);
            list.remove(list.size() - 1); 
        }
        return;
    }

    public boolean isPalindrome(String s){
        int i = 0; int j = s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
