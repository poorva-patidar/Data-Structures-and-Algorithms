package Math;

public class RomanToInteger {
    public static void main(String[] args) {
        String s = "XX";
        System.out.println(romanToInt(s));

    }

    public static int romanToInt(String s) {
        int ans = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            switch (ch){
                case 'V':  ans += 5;
                           break;

                case 'L':  ans += 50;
                           break;

                case 'D':  ans += 500;
                           break;

                case 'M':  ans += 1000;
                           break;

                case 'I':  if(i < s.length() - 1){
                              char next = s.charAt(i + 1);
                              if (next == 'V') {
                                  ans += 4;
                                  i++;
                              } else if(next == 'X'){
                                  ans += 9;
                                  i++;
                              } else{
                                  ans += 1;
                              }
                           }else{
                              ans += 1;
                          }
                          break;

                case 'X':  if(i < s.length() - 1){
                                char next = s.charAt(i + 1);
                                if (next == 'L') {
                                    ans += 40;
                                    i++;
                                } else if(next == 'C'){
                                    ans += 90;
                                    i++;
                                } else{
                                    ans += 10;
                                }
                           }else{
                                ans += 10;
                           }
                           break;

                case 'C':  if(i < s.length() - 1){
                                char next = s.charAt(i + 1);
                                if (next == 'D') {
                                    ans += 400;
                                    i++;
                                } else if(next == 'M'){
                                    ans += 900;
                                    i++;
                                } else{
                                    ans += 100;
                                }
                            }else{
                                ans += 100;
                            }
                            break;
            }
        }

        return ans;
    }
}
