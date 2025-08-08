package FacadeDesignPattern;

public class FacadePattern {
   static class FdService{
       public void getFdServiceDetails(String accountNo){
           System.out.println("fetching fd account details :" + accountNo);
       }
   }

    static class BankFacade {
        //list of all services
        private FdService fdService;

        //constructor
        public BankFacade() {
            this.fdService = new FdService();
        }

        public void getFdServiceDetails(String accountNo) {
            fdService.getFdServiceDetails(accountNo);
        }
    }
    public static void main(String[] args){
       BankFacade bank=new BankFacade();
       bank.getFdServiceDetails("Siri5134");
    }

}
