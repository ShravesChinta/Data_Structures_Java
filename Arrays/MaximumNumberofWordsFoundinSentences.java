// Leetcode program to code Maximum Number of Words Found in Sentences

class Solution {
    public int mostWordsFound(String[] sentences) {
        String[] sarray=sentences[0].split(" ");
        int max=sarray.length;
        int counter_len=0;
        for(int i=1;i<sentences.length;i++)
        {
            sarray=sentences[i].split(" ");
            counter_len=sarray.length;
            if(max<counter_len)
                max=counter_len;
        }
        return max;
    }
}


