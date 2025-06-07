public class Mart33 extends Customer33 {
        String items ="Onions";
        void billing (){
            int cost = 70;
            String items = "Onions";
            System.out.println("Child's item : " + items);
            System.out.println("Parent's item : " + super.items);
        }
        public static void main(String[] args) {
            Mart33 m  = new Mart33();
            m.billing();
          //  Customer33 c= new Customer33();
             m.purchase_list();
        }
    }

