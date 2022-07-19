package com.company;

public class Main {

    public static void main(String[] args) {
        AbstractFactory abstractFactory;

        abstractFactory = FactoryProvider.getFactory("Clone");
        Clone clone =(Clone) abstractFactory.create("MediumSoldier");

        abstractFactory = FactoryProvider.getFactory("Weapon");
        Weapon weapon =(Weapon) abstractFactory.create("MiniGun");

        String result = "Wyprodukowano: " + clone.getType() + " w opancerzeniu " + clone.getArmory() + " z bronią " +weapon.getWeapon();

        System.out.println(result);
    }
}
