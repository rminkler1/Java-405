public class Main {
    public static void main(String[] args) {
        // Create two tv objects
         Tv television_01 = new Tv();
         Tv television_02 = new Tv();

         // Turn television_01 on, change the channel and turn up the volume
         television_01.power();
         television_01.setChannel(15);
         television_01.channelUp();
         television_01.volUp();
         television_01.volUp();
         television_01.volUp();

         // Show the result of the default television and the one I changed
         // They are both televisions and operate using the same rules, but they are not the same tv.
         System.out.printf("TV1: %n" + television_01 + "%n");
         System.out.println();
         System.out.printf("TV2: %n" + television_02 + "%n");
    }
}