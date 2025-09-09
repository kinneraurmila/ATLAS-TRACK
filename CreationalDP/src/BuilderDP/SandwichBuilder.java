package BuilderDP;

public  class SandwichBuilder {
     int size;
     String cheese;
     String tomato;
     String pepper;

    public SandwichBuilder setSize(int size){
        this.size=size;
        return this;
    }
    public SandwichBuilder setCheese(String cheese){
        this.cheese=cheese;
        return this;
    }
    public SandwichBuilder setTomato(String tomato){
        this.tomato=tomato;
        return this;
    }
    public SandwichBuilder setPepper(String pepper){
        this.pepper=pepper;
        return this;
    }
    public Sandwich build(){
        return new Sandwich(this);

    }
}
