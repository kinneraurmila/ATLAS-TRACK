package BuilderDesignPattern;


public class BuilderMain {
    public static void main(String [] args) {
        BuildPhone.Mobile mobile = BuildPhone.Mobile.builder()
                .buildStorage(512)
                .buildMemory(16)
                .build();

        System.out.println(mobile);
    }
}



