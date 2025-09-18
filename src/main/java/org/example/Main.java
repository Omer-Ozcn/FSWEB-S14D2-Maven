package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {
        Wall w1 = new Wall("North");
        Wall w2 = new Wall("South");
        Wall w3 = new Wall("East");
        Wall w4 = new Wall("West");
        Ceiling ceiling = new Ceiling(270, PaintColor.WHITE);
        Bed bed = new Bed("Modern", 2, 60, 1, 1);
        Lamp lamp = new Lamp(LampType.NEON, true, 5);
        Wardrobe wardrobe = new Wardrobe(200, 220, 85.5);
        Carpet carpet = new Carpet(300, 400, PaintColor.GREEN);

        Bedroom bedroom = new Bedroom(
                "Master",
                w1, w2, w3, w4,
                ceiling,
                bed,
                lamp,
                wardrobe,
                carpet
        );

        w1.create(); w2.create(); w3.create(); w4.create();
        bedroom.getCeiling().create();
        bedroom.getBed().make();
        bedroom.getLamp().turnOn();
        bedroom.getWardrobe().add();
        bedroom.getCarpet().lying();

        System.out.println("Bedroom name: " + bedroom.getName());
        System.out.println("Lamp style: " + bedroom.getLamp().getStyle());
        System.out.println("Ceiling color: " + bedroom.getCeiling().getColor());
    }

}