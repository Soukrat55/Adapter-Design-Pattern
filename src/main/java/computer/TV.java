package computer;

public class TV implements Hdmi {
    @Override
    public void view(byte[] data) {
        System.out.println("//////////////// HDMI//////////////");
        String message=new String(data);
        System.out.println(message);
        System.out.println("//////////////////////////////");

    }
}
