public class Main {
    public static void main(String[] args) {

        Droid indian = new Droid("Codey");
        Droid sixseven = new Droid("Clanker");

        System.out.println(indian);
        System.out.println(sixseven);

        indian.performTask("watering the plants");
        sixseven.performTask("playing fortnite");
        indian.performTask("eating fried chicken, watermelon and kool-aid");
        sixseven.performTask("wash the dishes");
        indian.performTask("beating the kids");
        sixseven.performTask("make dinner");
        sixseven.performTask("drive to school ");
        sixseven.performTask("play tennis");
        
        indian.energyReport(); 
        sixseven.energyReport(); 
        
        indian.energyTransfer(sixseven);
        
        System.out.println("Battery level after the transfer");
        indian.energyReport();
        sixseven.energyReport();
    }
}
