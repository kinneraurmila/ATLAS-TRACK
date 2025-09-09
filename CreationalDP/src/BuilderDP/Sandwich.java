package BuilderDP;

public class Sandwich {
    private int size;
    private String cheese;
    private String tomato;
    private String pepper;

    public Sandwich(SandwichBuilder builder){
        this.size = builder.size;
        this.cheese=builder.cheese;
        this.pepper=builder.pepper;
        this.tomato=builder.tomato;
    }
    @Override
    public String toString(){
        return "this sanchwich size: " + size+" contains: "
                +(cheese != null?" cheese":" ")
                +(tomato != null?" tomato":" ")
                +(pepper != null?" pepper":" ");
    }
}


