class Solution {
    public String decodeString(String s) {
         Stack<Integer> cs = new Stack<>();
        Stack<String> ss = new Stack<>();
        
        StringBuilder cst = new StringBuilder();
        int cn = 0;
        
        for (char ch : s.toCharArray()) {
            
            if (Character.isDigit(ch)) {
                cn = cn * 10 + (ch - '0');
            }
            
            else if (ch == '[') {
                cs.push(cn);
                ss.push(cst.toString());
                
                cn = 0;
                cst = new StringBuilder();
            }
            
            else if (ch == ']') {
                int rt = cs.pop();
                String ps = ss.pop();
                
                StringBuilder temp = new StringBuilder(ps);
                for (int i = 0; i < rt; i++) {
                    temp.append(cst);
                }
                
                cst = temp;
            }
            
            else {
                cst.append(ch);
            }
        }
        
        return cst.toString();
    }
}

/**
Given an encoded string, return its decoded string.

The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.

You may assume that the input string is always valid; there are no extra white spaces, square brackets are well-formed, etc. Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. For example, there will not be input like 3a or 2[4].

The test cases are generated so that the length of the output will never exceed 105.*/