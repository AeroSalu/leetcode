class Solution {
    public String interpret(String command) {
        StringBuilder goal= new StringBuilder(command.length());
        for(int i=0;i<command.length();i++)
        {
            if(command.charAt(i)=='G')
            {
                goal.append('G');
            }
             if(command.charAt(i)=='(')
            {
                if(command.charAt(i+1)==')')
                {
                    goal.append('o');
                }
            }
            if(command.charAt(i)=='(')
            {
                if(command.charAt(i+1)=='a')
                {
                    goal.append('a');
                    goal.append('l');
                }
            }
        }
    return goal.toString().trim();
    }
}
