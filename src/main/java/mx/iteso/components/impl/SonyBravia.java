package mx.iteso.components.impl;

import mx.iteso.components.TV;

public class SonyBravia implements TV {
    public void on() {
        System.out.println("Sony Bravia is ON");
    }

    public void off() {
        System.out.println("Sony Bravia is OFF");
    }

    public void toHDMI() {
        System.out.println("Changing Sony Bravia input to HDMI");
    }
}
