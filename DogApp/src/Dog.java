/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jijones
 */

public class Dog {
    private boolean shots;
    private String name;
    private String breed;

    public boolean hasShots() {
        return shots;
    }

    public void setShots(boolean shots) {
        this.shots = shots;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    
    public Dog(String name, String breed, boolean shots){
        this.name = name;
        this.breed = breed;
        this.shots = shots;
    }

    @Override
    public String toString() {
        return "Dog{" + "shots=" + shots + ", name=" + name + ", breed=" + breed + '}';
    }
    
    
}