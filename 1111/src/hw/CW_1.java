package hw;

public class CW_1 {

    public static void main(String[] args) {
        String originalString = "1. The situation that I’m stuck in because of the quarantine\n" +
                "Cause schools and daycares have been closed all over the country,  children have been sent home and now we stay at home.\n" +
                "Our school would be closed for more than a month. \n" +
                "It has begun remote learning for school kids after the closure of school facilities.\n" +
                "In other words, all of the students are now on a surprise month-long break, and they’ll be spending every day of it cooped up at home with their parents and self-learning.\n" +
                "Moms, dads, and kids all over the country have suddenly found themselves in a cozy and new situation.\n" +
                "So in places all over the country where remote learning will be difficult, we face a new challenge: how to avoid learning loss.\n" +
                "We can do a number of activities alongside our parents that facilitate active, engaged learning.\n" +
                "My dad working from home sometimes he teach us English. My mom goes at work every day. My grandma do math lesson with me.\n";
        String stringToBeInserted = "!!!!Keep to a schedule!!!!\n";

        String str = "students";

        int position = originalString.indexOf(str)+str.length();
        System.out.println( position );
        try{
            StringBuffer buffer = new StringBuffer(originalString);
            System.out.println( buffer.length() );
            buffer.insert(position + 1, stringToBeInserted);
            String newString = buffer.toString();
            System.out.println(newString);
        }
        catch(Exception e){ System.out.println("Sth went wrong!");}

       System.out.println("================================");
    }

}
