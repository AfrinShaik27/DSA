package com.linearsearch.learning;

public class Eg3 {
    static void main(String[] args) {
        String name="Afrin";
        char ch='r';
       boolean ans= linearSearch2(name,ch);
        System.out.println(ans);

    }
    static boolean linearSearch2(String str,char target)
    {
        if(str.length()==0)
        {
            return false;
        }

        for(char ch:str.toCharArray())
        {
            if(ch==target)
            {
                return true;
            }
        }
        return false;
    }
    static boolean linearSearch(String str,char ch)
    {
      if(str.length()==0)
      {
          return false;
      }
      for(int i=0;i<str.length();i++)
      {
          if(ch==str.charAt(i))
          {
              return true;
          }
      }
      return false;
    }
}
