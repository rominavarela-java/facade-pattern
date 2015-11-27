package mx.iteso.components.impl;

import mx.iteso.components.Lights;

public class EcoLights  implements Lights {
    public void on() {
        System.out.println("EcoLights are ON");
    }

    public void off() {
        System.out.println("EcoLights are OFF");
    }
}
