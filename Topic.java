import java.util.*;

public class Topic {
    private String name;
    ArrayList<String> items = new ArrayList<>();
    public Topic(String n, String i){
        this.name = n;
        this.items.addAll(Arrays.asList(i.split(",")));


    }

    public ArrayList<String> getitems(){
        return items;
    } 


}
