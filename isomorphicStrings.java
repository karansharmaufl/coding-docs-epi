class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> hm = new HashMap<Character, Character>();
        int len1 = s.length();
        int len2 = t.length();
        if(len1==0 && len2 ==0)
            return true;
        if(len1!=len2)
            return false;
        
        for(int i=0;i<len1;i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            
            if(hm.containsKey(c1)){
                if(hm.get(c1)!=c2)
                    return false;
            }else{
                if(hm.containsValue(c2)){
                    return false;
                }
                hm.put(c1,c2);
            }
        }return true;
    }
}
