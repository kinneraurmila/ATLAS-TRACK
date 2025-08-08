package CompositeDesignPattern;

public class CompositeMain {
    public static void main(String[] args){
        Leaf dell= new Leaf("Dell");
        Leaf hp=new Leaf("hp");
        Leaf apple= new Leaf("aaple");

        Composite laptopBrands =new Composite("Laptop brands ");
        laptopBrands.add(hp);
        laptopBrands.add(dell);
        laptopBrands.add(apple);

        Leaf samsung=new Leaf("Samsung");
        Leaf lenovo=new Leaf("Lenovo");


        Composite phoneBrands =new Composite("phone brands ");
        phoneBrands.add(samsung);
        phoneBrands.add(lenovo);

        Composite allBrands =new Composite("All Brands");
        allBrands.add(laptopBrands);
        allBrands.add(phoneBrands);

        allBrands.brandName();

    }
}
