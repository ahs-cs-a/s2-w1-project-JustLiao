import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
// import java.util.*;  
public class Runner {
    ArrayList<Topic> topics = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    Random r = new Random();
    public void setup(){
        topics.add(new Topic("dessert", "Ice cream,Cupcake,Fortune Cookie,Dippin Dots,Jello"));
        topics.add(new Topic("Fast Food", "In N Out,Burger King,Taco Bell,McDonalds,KFC"));
        topics.add(new Topic("trees", "Birch,Mangrove,Eucalyptus,Palm,Oak"));
        
        
    }
    public void game(){
        Topic currentTopic = topics.get(r.nextInt(0,topics.size()));
        ArrayList<String> ranks15 = new ArrayList<String>();
        ranks15.add("1");
        ranks15.add("2");
        ranks15.add("3");
        ranks15.add("4");
        ranks15.add("5");
        
        System.out.println("Here is how to play the game: You will be given a word and you will be able to rank it 1 to 5. You will be given 4 more words 1 one by one and you will rank them as well. But be careful, you cant switch your ranking. You dont want to end up ranking pinaple pizza as the best type of pizza.");
        for (int i = 0; i < 5; i++){
        System.out.println("your item is" + currentTopic.getitems().get(i));
        System.out.println("where do you want to put it");
        int x = scanner.nextInt();
        if(ranks15.get(x != i) ){
            System.out.println("run it back");
            
        }
        ranks15.set(x - 1, currentTopic.getitems().get(i) );
        System.out.println(ranks15);
        }
        System.out.println("NICE LIST! You're #1 choice is questionable though you're mad weird");

    }
}


   //     System.out.println("Enter 10 words in a category, one by one:");
        
    //     for (int i = 0; i < 10; i++) {
    //         System.out.print("Word " + (i + 1) + ": ");
    //         String word = scanner.nextLine();
    //         wordList.add(word);
    //     }

    //     // Display the list of words
    //     System.out.println("\nList of Words:");
    //     for (String word : wordList) {
    //         System.out.println(word);
    //     }

    //     // Close the scanner
    //     scanner.close();







