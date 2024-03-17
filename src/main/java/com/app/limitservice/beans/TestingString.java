package com.app.limitservice.beans;

public class TestingString {

    public static int lengthOfLastWord(String str){
        int count=0;
        int i=0;
        int len=str.length();
        while(i<len){
            if(str.charAt(i)!=' '){
                count++;
                i++;
            }else{
                while(i<len && str.charAt(i)==' ')
                    i++;
                if(i==len)
                    return count;
                else{
                    count =0;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s="Sonu";
        System.out.println(lengthOfLastWord("      Worlds   sbvjhsdb askjbvkjksdbv       jjbkjhb       xyyz                                                     "));
    }
}
