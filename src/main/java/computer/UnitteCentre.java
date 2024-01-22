package computer;

public class UnitteCentre {
    private Vga vga;

    public void print(String message){
        System.out.println("*********Unite Centre**********");
        System.out.println(message);
        System.out.println("*******************");

    }
    public void setVga(Vga vga) {
        this.vga = vga;
    }
}
