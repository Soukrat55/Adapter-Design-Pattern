package computer;

public class VideoProjecteur implements Vga{
    @Override
    public void print(String message) {
        System.out.println("........VideoProjecteur..........");
        System.out.println(message);
        System.out.println("................");

    }
}
