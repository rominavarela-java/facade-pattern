package mx.iteso.components.impl;

import mx.iteso.components.GameController;

public class DualShock  implements GameController {
    public void on() {
        System.out.println("DualShock wireless controller is ON");
    }

    public void off() {
        System.out.println("DualShock wireless controller is OFF");
    }
}
