public class Cafe {
    public static void main(String[] args){
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready. ";
        String displayTotalMessage = "Your total is $";
        

        //menu variables
        double mochaPrice = 3.5;
        double espressoPrice = 4.0;
        double lattePrice = 5.5;
        // double chaiPrice = 4.0;

        //customer name variables
        String customer1 = "Cindhuri";
        String customer2 = "Odin";
        String customer3 = "Sonic";
        String customer4 = "Cookie Monster";

        //order completion
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = true;

        // Customer one orders a mocha. Print to the console the correct status message based on her order status.
        System.out.println(generalGreeting + customer1);
        System.out.println(customer1 + displayTotalMessage + mochaPrice);
        System.out.println(customer1 + pendingMessage);
        System.out.println(customer1 + readyMessage);
        System.out.println("Order ready?" + isReadyOrder1);

        // Odin ordered an esspresso. Use an if statement to check the status of his order and print the correct status message. If it is ready, also print the message to display the total. 
        System.out.println(isReadyOrder2? customer2 + readyMessage + displayTotalMessage + espressoPrice : pendingMessage);
    
        // Sonic just ordered 2 lattes, print the message to display their total. Next, use an if statement to print the appropriate order status message. Change the isReady flag value from true to false or vice versa in order to test your control logic (if-statement).
        System.out.println(customer3 + displayTotalMessage + (mochaPrice + lattePrice));
        System.out.println(isReadyOrder3? customer3 + readyMessage : customer3 + pendingMessage);

        // Cookie Monster just realized he was charged for a coffee but had ordered a latte. Print the total message with the new calculated total (what he owes) to make up the difference.
        System.out.println(customer4 + displayTotalMessage + (lattePrice - mochaPrice));
    }
}
