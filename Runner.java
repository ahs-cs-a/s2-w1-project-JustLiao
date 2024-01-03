import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.awt.*;
import javax.swing.*;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;
// import java.util.*;  
public class Runner {
    ArrayList<Topic> topics = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    Random r = new Random();
    public void setup(){
        topics.add(new Topic("Dessert", "Ice cream,Cupcake,Fortune Cookie,Dippin Dots,Jello"));
        topics.add(new Topic("Fast Food", "In N Out,Chick Fil A,Taco Bell,McDonalds,KFC"));
        topics.add(new Topic("Trees", "Birch,Mangrove,Eucalyptus,Palm,Oak"));
        topics.add(new Topic("Holidays", "Easter,Christmas,Halloween,Thanksgiving,New Years"));
        topics.add(new Topic("Music Genres", "Rap,Metal,Country,Pop,RnB"));
        topics.add(new Topic("Weather", "Sunny,Cloudy,Snow,Rain,Thunderstorm"));
        topics.add(new Topic("Basketball Goats", "Lebron,Michael Jordan,Kobe Bryant,Shaq,Curry"));
    }
    public void game(){
        // System.out.println("do you want to play a premade list? 1 = YES || 2 = No");
        // int i1 = scanner.nextInt();
        // if(i1 == 1){
        // }

        Topic currentTopic = topics.get(r.nextInt(0,topics.size()));
        ArrayList<String> ranks15 = new ArrayList<String>();
        ranks15.add("1");
        ranks15.add("2");
        ranks15.add("3");
        ranks15.add("4");
        ranks15.add("5");
        
        System.out.println("Here is how to play the game: You will be given a word and you will be able to rank it 1 to 5. You will be given 4 more words one by one and you will rank them as well. But be careful, YOU CAN'T SWITCH YOUR RANKING. You dont want to end up ranking pinaple pizza as the best type of pizza.");
        for (int i = 0; i < 5; i++){
        System.out.println("Your item is " + currentTopic.getitems().get(i));
        System.out.println("Where do you want to put it");
        int x = scanner.nextInt();
        if(!ranks15.get(x-1).equals(x + "")){
            System.out.println("Run it back, you can't replace what you already chose!");
            i--;
        }
        else{
        ranks15.set(x-1, currentTopic.getitems().get(i) );
        }
        System.out.println(ranks15);
        }
        System.out.println("NICE LIST! You're #1 choice is questionable though you're mad weird");

    }
}

