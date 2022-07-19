package com.company;

public class CloneFactory implements AbstractFactory<Clone> {

    @Override
    public Clone create(String cloneType) {
        if ("lightsoldier".equalsIgnoreCase(cloneType)) {
            return new LightSoldier();
        } else if ("mediumsoldier".equalsIgnoreCase(cloneType)) {
            return new MediumSoldier();
        }else if ("heavysoldier".equalsIgnoreCase(cloneType)) {
            return new HeavySoldier();
        }

        return null;
    }

}