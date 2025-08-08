package CompositeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component{
    private String groupName;
    private List<Component> components= new ArrayList<>();

    public Composite(String groupName){
        this.groupName=groupName;
    }


    @Override
    public void brandName(){
        System.out.println("group:"+ groupName);
        for(Component comObj:components){
            comObj.brandName();
        }
    }
    public void add(Component subComponent){
        components.add(subComponent);
    }
}
