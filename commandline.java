import java.util.*;

class commandline
{
    public static void main (String args[])
    {
        System.out.println("TO COUNT COMMAND LINE ARGUMENT");
        int count ,i=0;
        String string;
        count=args.length; /*it is a length function */
        System.out.println( "No of arguments" + count);
        while(i < count)
        {
            string =args[i];
            i++;
            System.out.println(" Corresponded entered string " +i +" :"  + string + "!");
        }
    }



}
