public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";

        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripPrice = 3.5;
        double lattePrice = 2.5;
        double cappuccinoPrice = 4.0;

    
        // Customer name variables (add yours below)
        String customer1 = "Amir";
        String customer2 = "Adam";
        String customer3 = "Salaman";
        String customer4 = "Sara";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = true;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Amir"
        System.out.println(displayTotalMessage + dripPrice); // Displays "Your total is $3.5"
        System.out.println(customer1 + pendingMessage); // Displays "Amir, your order will be ready shortly" 
        
        if (isReadyOrder1) {
            System.out.println(customer1 + readyMessage);
        } else {
            System.out.println(customer1 + pendingMessage);
        }

        if (isReadyOrder2) {
            System.out.println(customer2 + readyMessage);
        } else {
            System.out.println(customer2 + pendingMessage);
        }

        if (isReadyOrder3) {
            System.out.println(customer3 + readyMessage);
        } else {
            System.out.println(customer3 + pendingMessage);
        }


    	// ** Your customer interaction print statements will go here ** //

    }
}
