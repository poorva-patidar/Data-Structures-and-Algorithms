package BitwiseOperators;

public class LongestNiceString {
        public String longestNiceSubstring(String s) {
            int n = s.length();
            String ans = "";
            for(int k = 1; k < n - 2; k++){
                for(int i = 0, j = i + k; j < n; j++){
                    checkSubString(i, j, ans, s);
                }
            }
           return ans;
        }

        public void checkSubString(int i, int j, String ans, String s){
            StringBuilder str = new StringBuilder(s);
            String subString = str.substring(i, j + 1);
            int lowMask = 0;
            int upMask = 0;

            for(int b = 0; b < subString.length(); b++){
                char ch = subString.charAt(b);
                if(Character.isLowerCase(ch)){
                     lowMask = lowMask | (1 << (int)(ch - 'a'));
                } else{
                     upMask = upMask | (1 << (int)(ch - 'A'));
                }
            }

            if((lowMask ^ upMask) != 0){
                return;
            } else{
                if(ans.length() < subString.length()){
                    ans = subString;
                }
            }
        }
}
