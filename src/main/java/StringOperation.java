public class StringOperation {
    public static void main(String[] args) {
        char[] ch = {'K','a','n','h','a'};
       // String kl = new String(ch);
        String klp = "Kanhaiya you are so smart";
        String klp3 = new String("Hi Kanha");

              //Creation of String by Different Ways:

       // System.out.println("Char Array to String :"+kl);
       // System.out.println("Creating String by string Literal :"+klp);
       // System.out.println("Creating String by Using New Keywords :"+klp3);
       // System.out.println("Length of String : "+kl.length());

            //Reversing of String

     //   System.out.println("Reverse String of: "+"'"+kl+"'"+" is");
     //
     //   for (int i = 0;i<kl.length();i++){
     //       System.out.print(kl.charAt(kl.length()-i-1));
     //   }

        //    charAt implementation

       //   char my = klp.charAt(2);
       // System.out.println(kl);
       // System.out.println("Index 2 character : "+my);

       //  Accessing First and Last character
       // System.out.println(klp);
       // System.out.println("Initial character is: "+"'"+klp.charAt(0)+"'"+ " and "+"Last charecter is :"+ " '"+ klp.charAt(klp.length()-1)+"'");

         //Printing odd Position character only
      // for (int i=0;i<klp.length();i++){
      //     if (i%2==0) System.out.println("Char at "+i+ "place is "+klp.charAt(i));
      // }

        // Find Number of White Space
      //  int with = klp.length();
      //
      //  System.out.println("In the String: "+klp);
      //  klp = klp.replace(" ","");
      //  int without = klp.length();
      //  System.out.println(with-without);

      // Compare
        String s1 = "Kanhaiya Lal";
        String s2 = "Kanhaiya Lal";
        String s3 = new String("Kanhaiya");
       // System.out.println(s1.equals(s2));
       // System.out.println(s1.equals(s3));
       // System.out.println(s1.equalsIgnoreCase(s2));
       // System.out.println(s1.toLowerCase());
       // System.out.println(s1.toUpperCase());
       // System.out.println(s1.contentEquals("Kanhaiya"));
       // System.out.println(s1.trim().length());
       // System.out.println(s1 == s2);

       // System.out.println(s1.compareTo(s2)); //0
       // System.out.println(s1.compareTo(s3)); //negaive
       // System.out.println(s3.compareTo(s1)); //Positive


        //Contain Method
       // String n = new String("Hey Kanha!, How are you???");
       // System.out.println(n.contains("Hey Kanha!"));
       // System.out.println(n.contains(","));
       // System.out.println(n.contains("?,"));

       // if (n.contains("HeyKanha"))
       //     System.out.println("String Contain "+"Hey Kanha");
       // else System.out.println("\"Not Found\"");

       //String s = "String End with github.com";
       // System.out.println(s.endsWith(".com"));
       // System.out.println(s.endsWith("m"));
       // System.out.println(s.endsWith(""));
       // System.out.println(s.endsWith(" "));
       // if (s.endsWith("github.com")) System.out.println("Successed");
       // else System.out.println("Not Contain");

       // if ("Hi Kanhaiya".endsWith("")) System.out.println("Inside if Block");
       // else System.out.println("Inside Else Block");
       // if ("Hi Java ".endsWith(" ")) System.out.println("Inside if");
       // else System.out.println("inside Else ");
       // if ("Hi Ananya".endsWith("K")) System.out.println("Inside If");
       // else System.out.println("inside Else");















    }
}
