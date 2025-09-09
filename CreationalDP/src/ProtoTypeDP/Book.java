package ProtoTypeDP;

public class Book implements Cloneable{
    private String title;
    private String author;
    private String category;

    public Book(String title,String author,String category){
        this.author=author;
        this.category=category;
        this.title=title;
    }
    //Getters/Setters
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public String getCategory(){
        return category;
    }
    public void setCategory(String category){
        this.category=category;
    }
    @Override
    public Book clone(){
        try{
            return (Book)super.clone();
        }catch (CloneNotSupportedException e){
            throw new RuntimeException("clone not supported :" + e);
        }
    }

    @Override
    public String toString(){
        return "This book [ " + "title : " +title +" author : " +author +" category: " +category + " ]";
    }
}
