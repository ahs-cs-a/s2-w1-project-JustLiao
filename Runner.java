import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
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
        ArrayList<Topic> ranks15 = new ArrayList<>();
        System.out.println("Here is how to play the game: You will be given a word and you will be able to rank it 1 to 5. You will be given 4 more words 1 one by one and you will rank them as well. But be careful, you cant switch your ranking. You dont want to end up ranking pinaple pizza as the best type of pizza.");
        System.out.println("your first item is" + currentTopic.get(0));
    }
}









