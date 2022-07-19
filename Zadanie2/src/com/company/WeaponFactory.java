package com.company;

public class WeaponFactory implements AbstractFactory<Weapon> {

    @Override
    public Weapon create(String weaponType) {
        if ("BlasterRifle".equalsIgnoreCase(weaponType)) {
            return new BlasterRifle();
        } else if ("BlasterPistols".equalsIgnoreCase(weaponType)) {
            return new BlasterPistols();
        }else if ("MiniGun".equalsIgnoreCase(weaponType)) {
            return new MiniGun();
        }

        return null;
    }

}
