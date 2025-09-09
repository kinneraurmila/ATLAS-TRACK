package FactoryMethodDP;

public abstract class HiringManager {
    protected abstract Interviewer makeInterviewer();

    public void takeInterview(){
        Interviewer interviewer=makeInterviewer();
        interviewer.askQuestions();
    }
}
class DevManager extends HiringManager{
    @Override
    protected Interviewer makeInterviewer(){
        return new Developer();
    }
}
class MarManager extends HiringManager{
    @Override
    protected Interviewer makeInterviewer(){
        return new MarketingExe();
    }
}
