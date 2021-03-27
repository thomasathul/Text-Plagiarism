import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.util.*;

class docsimilar {

  
    public static void main(String args[]) throws IOException
      {
        Scanner s = new Scanner(System.in);
        String s1, s2;
         do {
           System.out.println("---------------------------------------------");
           System.out.println("Enter your text file directory:");
           s1 = inputfunc();

           System.out.println();
           System.out.println("Enter the text file directory to be checked:");
           s2 = inputfunc();
           
           checkfunction(s1, s2);
           
           System.out.println("Do you want to check for other files [Y/N]");
           String ch = s.next();
           if (ch.equals("N"))
           break;
            } while (true);
        }




        public static void checkfunction(String s1, String s2) {
          System.out.println();
          Set<String> orginal = new HashSet<>(Arrays.asList(s1.split(" ")));
          Set<String> temp = new HashSet<>(Arrays.asList(s2.split(" ")));
          orginal.retainAll(temp);
          int totalwordcount = temp.size();
          int similarity = (orginal.size() * 100) / totalwordcount;
          System.out.println("(((Similarity = " + similarity + "%)))\n");
          System.out.println("---------------------------------------------");
        }
        



        public static String inputfunc() throws IOException {
          Scanner scan = new Scanner(System.in);
          String stringdoc = "";
          while (true) {
            try {
              Scanner scanner = new Scanner(Paths.get(scan.next()), StandardCharsets.UTF_8.name());
              stringdoc = scanner.useDelimiter("\\A").next();
              break;
            }
           catch (Exception e) {
              System.out.println("\nError:The file seems to empty/broken. Please enter new file:");
               continue;
              }
            }
            return stringdoc;

          }


}
