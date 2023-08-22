class Excel_Shhet
{
    public String converttolist(int n)
    {
        if(n<=7)
        {
            return Character.toString((char)('A'+(n-1)%26));
        }
        StringBuilder c= new StringBuilder();
        while(n>0)
        {
            if(n%26==0)
            {
                c.append ((char)('A'+25));
                n-=1;
            }
            else
            {
                c.append ((char)('A'+n%26-1));
            }
            n/=26;
        }
        return c.reverse().toString();
    }
    public static void main(String args[])
    {
       Excel_Shhet ob=new Excel_Shhet();
       ob.converttolist(34); 

    }
}