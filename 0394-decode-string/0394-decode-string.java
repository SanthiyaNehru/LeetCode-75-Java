class Solution {
    public String decodeString(String s) {
        Stack<Integer> counts=new Stack<>();
        Stack<String> resultStack=new Stack<>();
        String result="";
        int index=0;
        while(index < s.length())
        {
            char ch=s.charAt(index);

            if(Character.isDigit(ch))
            {
                    int num=0;
                    while(index <s.length() && Character.isDigit(s.charAt(index)))
                    {
                        num=num*10 + (s.charAt(index)-'0');
                        index++;
                    }
                    counts.push(num);
                    continue;
            }
            else if(ch == '[')
            {
                resultStack.push(result);
                result="";
                index++;
            }
            else if(ch ==  ']')
            {
                StringBuilder temp=new StringBuilder(resultStack.pop());
                int repeatTimes=counts.pop();
                for(int i=0;i<repeatTimes;i++)
                {
                    temp.append(result);
                }
                result=temp.toString();
                index++;
            }
            else
            {
                result +=ch;
                index++;
            }
        }
        return result;
    }
}