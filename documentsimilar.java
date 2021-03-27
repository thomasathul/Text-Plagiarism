import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.util.*;

class docsimilar {
    public static void main(String args[]) throws IOException
    {
        Scanner s=new Scanner(System.in);
        do{
          System.out.println("---------------------------------------------");
          System.out.println("Enter your text file directory");
          try (Scanner scanner = new Scanner(Paths.get(s.next()), StandardCharsets.UTF_8.name())) {
          String s1 = scanner.useDelimiter("\\A").next();
          System.out.println();
          System.out.println("Enter the text file directory to be checked");
          try (Scanner input = new Scanner(Paths.get(s.next()), StandardCharsets.UTF_8.name())) {
          String s2 = input.useDelimiter("\\A").next();
          checkfunction(s1,s2);
          System.out.println("Do you want to check for other files [Y/N]");
          String ch=s.next();

          if(ch.equals("N"))
          break;
                 }
              }
            } while(true);
    }
    public static void checkfunction(String s1,String s2)
    {
          System.out.println();
          Set<String> orginal=new HashSet<>(Arrays.asList(s1.split(" ")));
          Set<String> temp=new HashSet<>(Arrays.asList(s2.split(" ")));
          orginal.retainAll(temp);
          int totalwordcount=temp.size();
          int similarity = (orginal.size()*100)/totalwordcount;
          System.out.println("(Similarity = "+similarity+"%)\n");
          System.out.println("---------------------------------------------");
    }
}


