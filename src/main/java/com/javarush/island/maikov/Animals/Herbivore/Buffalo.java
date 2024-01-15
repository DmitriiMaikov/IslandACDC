package com.javarush.island.maikov.Animals.Herbivore;

import com.javarush.island.maikov.Abstraction.Herbivore;
import com.javarush.island.maikov.Constants;

public class Buffalo extends Herbivore {
    public Buffalo(int x, int y) {
        super(700,10,3,100, x, y);
    }

    @Override
    public String toString() {
        return Constants.BUFFALO;
    }
}
