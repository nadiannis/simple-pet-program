package user;

import java.util.ArrayList;
import animal.Pet;

public class User {

  private String name = "Anonymous";
  private String email;
  private ArrayList<Pet> pets = new ArrayList<Pet>();

  public User(String name, String email) {
    this.name = name;
    this.email = email;
  }

  public User(String email) {
    this.email = email;
  }

  @Override
  public String toString() {
    return "User {name=" + name + ", email=" + email + ", pets=" + pets + "}";
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public ArrayList<Pet> getPets() {
    return this.pets;
  }

  public void setPets(ArrayList<Pet> pets) {
    this.pets = pets;
  }

  public void addPet(Pet pet) {
    this.pets.add(pet);
  }

  public void removePet(Pet pet) {
    this.pets.remove(pet);
  }

  public void displayNumOfPets() {
    if (this.pets.size() > 1) {
      System.out.println(this.name + " has " + this.pets.size() + " pets");
    } else {
      System.out.println(this.name + " has " + this.pets.size() + " pet");
    }
  }

}
