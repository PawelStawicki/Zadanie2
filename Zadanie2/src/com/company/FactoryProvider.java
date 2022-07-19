package com.company;

public class FactoryProvider {
    public static AbstractFactory getFactory(String choice){

        if("Clone".equalsIgnoreCase(choice)){
            return new CloneFactory();
        }
        else if("Weapon".equalsIgnoreCase(choice)){
            return new WeaponFactory();
        }

        return null;
    }
}