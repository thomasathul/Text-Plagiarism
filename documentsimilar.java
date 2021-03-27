
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.util.*;


class documentsimilar {
    public static void main(String args[]) throws IOException
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your text file directory");
         try (Scanner scanner = new Scanner(Paths.get(sc.next()), StandardCharsets.UTF_8.name())) {
          String s1 = scanner.useDelimiter("\\A").next();
          System.out.println("Enter the text file directory to be checked");
         try (Scanner input = new Scanner(Paths.get(sc.next()), StandardCharsets.UTF_8.name())) {
           String s2 = input.useDelimiter("\\A").next();
          Set<String> orginal=new HashSet<>(Arrays.asList(s1.split(" ")));
          Set<String> temp=new HashSet<>(Arrays.asList(s2.split(" ")));
          System.out.println(temp);
          orginal.retainAll(temp);
          int totalwordcount=temp.size();
          int similarity = (orginal.size()*100)/totalwordcount;
          System.out.println("Similarity = "+similarity+"%");
    }
}
    }
}
