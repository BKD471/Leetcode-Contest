package lc1;

public class CountNoOfVowelsInRange {
    public boolean isValid(String s){
        int n=s.length();
        if(s.charAt(0)!='a' && s.charAt(0)!='e'  && s.charAt(0)!='i' && s.charAt(0)!='o'  && s.charAt(0)!='u' ) return false;
        if(s.charAt(n-1)!='a' && s.charAt(n-1)!='e'  && s.charAt(n-1)!='i' && s.charAt(n-1)!='o'  && s.charAt(n-1)!='u') return false;
        return true;
    }

    public int vowelStrings(String[] words, int left, int right) {
        int cnt=0;
        for(int i=left;i<=right;i++){
            if(isValid(words[i])) cnt++;
        }
        return cnt;
    }
}
