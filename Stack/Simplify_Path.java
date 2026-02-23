class Solution {
    public String simplifyPath(String path) {
        String[] arr=path.split("/");
        int n=arr.length;
        Stack<String> s1=new Stack<>();
        for(int i=0;i<n;i++){
            if(arr[i].equals("..")){
                if(!s1.isEmpty()) s1.pop();
            }
            else if(arr[i].equals(".")){
                continue;
            }else if(arr[i].equals("")){
                continue;
            }
            else{
                s1.push(arr[i]);
            }
        }
        String res="/"+String.join("/",s1);
        return res;
    }
}

/**
You are given an absolute path for a Unix-style file system, which always begins with a slash '/'. Your task is to transform this absolute path into its simplified canonical path.

The rules of a Unix-style file system are as follows:

A single period '.' represents the current directory.
A double period '..' represents the previous/parent directory.
Multiple consecutive slashes such as '//' and '///' are treated as a single slash '/'.
Any sequence of periods that does not match the rules above should be treated as a valid directory or file name. For example, '...' and '....' are valid directory or file names.
The simplified canonical path should follow these rules:

The path must start with a single slash '/'.
Directories within the path must be separated by exactly one slash '/'.
The path must not end with a slash '/', unless it is the root directory.
The path must not have any single or double periods ('.' and '..') used to denote current or parent directories.
Return the simplified canonical path.
*/