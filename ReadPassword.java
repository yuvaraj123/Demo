class ReadPassword
{
    public static void main(String args[])
    {
        System.out.println("Enter password");
        
       char[] c=System.console().readPassword();
        
        // Just print, make it simple
        System.out.println("The password is "+new String(c));
        
    }
}