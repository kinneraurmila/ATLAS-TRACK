package FactoryMethodDP;


public interface Interviewer {
    void askQuestions();
}
 class Developer implements Interviewer{
    @Override
     public void askQuestions(){
        System.out.println("Ask dev related questions");
    }
}

class MarketingExe implements Interviewer{
    @Override
    public void askQuestions(){
        System.out.println("Ask marketing related questions");
    }

}
