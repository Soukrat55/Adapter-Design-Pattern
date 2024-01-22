import computer.*;
import computer.adapter.HdmiVgaAdapter;
import computer.adapter.HdmiVgaAdapterH;

public class Test {

    public static void main(String[] args){
        UnitteCentre unitteCentre=new UnitteCentre();
        unitteCentre.setVga(new Ecran());
        unitteCentre.print("Bonjour");
        unitteCentre.setVga(new VideoProjecteur());
        unitteCentre.print("Bonjour");
        unitteCentre.setVga(new HdmiVgaAdapter());
        unitteCentre.print("Bonjour TV");

        HdmiVgaAdapter hdmiVgaAdapter=new HdmiVgaAdapter();
        hdmiVgaAdapter.setHdmi(new TV());
        unitteCentre.setVga(hdmiVgaAdapter);
        hdmiVgaAdapter.print("Bonsoir !!");

        HdmiVgaAdapterH hdmiVgaAdapterH=new HdmiVgaAdapterH();
        unitteCentre.setVga(hdmiVgaAdapter);
        hdmiVgaAdapter.print("Bonsoir !!");

        unitteCentre.setVga(new SuperVP());
        unitteCentre.print("Hello");

        HdmiVgaAdapter hdmiVgaAdapter1=new HdmiVgaAdapter();
        unitteCentre.setVga(new SuperVP());
        unitteCentre.print("Hello");
        unitteCentre.setVga(hdmiVgaAdapter1);
    }
}
