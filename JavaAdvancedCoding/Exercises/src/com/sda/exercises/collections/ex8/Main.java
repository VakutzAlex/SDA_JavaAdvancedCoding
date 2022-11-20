package com.sda.exercises.collections.ex8;

/*
Ex 8
Create a class imitating a weapon magazine.
The class should be able to define the size of the magazine using the constructor.
Implement the methods:
loadBullet(String bullet) → adding a cartridge to the magazine, does not allow loading more cartridges than the capacity of the magazine
isLoaded() → returns information about whether the weapon is loaded (at least one cartridge) or not
shot() → each call shots one bullet (prints string value in console) - the last loaded cartridge - and prepares the next one,
loaded before the last one, if there are no more cartridges, it prints "empty magazine" in the console
 */

public class Main {

    public static void main(String[] args) {
        WeaponMagazine clip = new WeaponMagazine(8);

        System.out.println("Weapon loaded: " + clip.isLoaded());

        clip.loadBullet("Bullet0");
        clip.loadBullet("Bullet1");
        clip.loadBullet("Bullet2");
        clip.loadBullet("Bullet3");
        clip.loadBullet("Bullet4");
        clip.loadBullet("Bullet5");
        clip.loadBullet("Bullet6");
        clip.loadBullet("Bullet7");
        clip.loadBullet("Bullet8");

        System.out.println("Weapon loaded: " + clip.isLoaded());

        clip.shot();
        clip.shot();
        clip.shot();
        clip.shot();

        System.out.println("Weapon loaded: " + clip.isLoaded());

        clip.shot();
        clip.shot();
        clip.shot();
        clip.shot();
        clip.shot();
        clip.shot();
        clip.shot();

        System.out.println("Weapon loaded: " + clip.isLoaded());
    }
}
