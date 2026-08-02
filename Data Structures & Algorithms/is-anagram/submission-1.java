class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> mapS=new HashMap<>();
        Map<Character,Integer> mapT=new HashMap<>();

        if(s.length()!=t.length())return false;

        for(int i=0;i<s.length();i++){

            char c=s.charAt(i);
            if(mapS.containsKey(c)){

                int count=mapS.get(c);
                mapS.put(c,count+1);
            }else{
                mapS.put(c,1);
            }
        }

        for(int i=0;i<t.length();i++){

            char c=t.charAt(i);
            if(mapT.containsKey(c)){

                int count=mapT.get(c);
                mapT.put(c,count+1);
            }else{
                mapT.put(c,1);
            }
        }

        return mapT.equals(mapS);
    }
}
