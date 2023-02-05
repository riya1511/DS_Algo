class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int len = queries.length;
        int[] res = new int[len];
        int count = 0;
        int[] pref_sum = new int[words.length];
        
        for(int i = 0; i < words.length; i++){
            char[] chArray = words[i].toCharArray();
            
            if(isVowel(chArray[0]) && isVowel(chArray[chArray.length-1])) pref_sum[i] = 1;
        }
        
        for(int i = 1; i < pref_sum.length; i++){
            pref_sum[i] = pref_sum[i-1] + pref_sum[i];
        }
        
        int ind = 0;
        
        for(int[] q : queries){
            int l = q[0];
            int r = q[1];
            
            if(l == 0) count = pref_sum[r];
            else count = pref_sum[r] - pref_sum[l-1];
            
            res[ind++] = count;
        }
        
        return res;
    }
    
    public boolean isVowel(Character ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') return true;
        else return false;
    }
}
