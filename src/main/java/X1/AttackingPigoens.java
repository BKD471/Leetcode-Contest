package X1;

public class AttackingPigoens {
    public int turnPigeons(String A) {
        int n=A.length();

        int lcnt=0,cnt=0;
        for(int i=n-1;i>=0;i--){
            if(A.charAt(i)=='L') cnt++;
            else if(A.charAt(i)=='R'){
                if(cnt>0){
                    cnt--;
                    lcnt++;
                }
            }
        }

        return lcnt;
    }
}
