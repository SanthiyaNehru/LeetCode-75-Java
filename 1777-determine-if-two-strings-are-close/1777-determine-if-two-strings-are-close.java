class Solution {
    public boolean closeStrings(String word1, String word2) {
        int fm1[] = new int[26];
        int fm2[] =new int[26];

        for(int i=0;i<word1.length();i++)
        {
            char ch=word1.charAt(i);
            fm1[ch-'a']+=1;
        }
        for(int i=0;i<word2.length();i++)
        {
            char ch=word2.charAt(i);
            fm2[ch-'a']+=1;
        }

        for(int i=0;i<25;i++)
        {
            if((fm1[i]!=0 && fm2[i]==0) || (fm1[i]==0 && fm2[i]!=0))
            {
                return false;
            }
        }
        Arrays.sort(fm1);
        Arrays.sort(fm2);
        return Arrays.equals(fm1,fm2);
    }
}