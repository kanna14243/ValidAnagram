public class Solution {
    public boolean isAnagram(String s, String t) {
        int[] map = new int[26];
        for(int i=0;i<s.length();i++){
            map[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            if( map[t.charAt(i)-'a']==0){
                return false;
            }
             map[t.charAt(i)-'a']--;
        }
        for(int i=0;i<map.length;i++){
            if(map[i]!=0){
                return false;
            }
        }
        return true;
    }
}
