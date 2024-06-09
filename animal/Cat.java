package animal;

import exception.CantHaveMoreThanTwoException;
import user.User;

public class Cat extends Animal implements Pet {
  
  private String name = "Anonymous";
  private User owner;

  public Cat(String name) {
    super(4);
    this.name = name;
  }

  public Cat() {
    super(4);
  }

  @Override
  public String toString() {
    if (this.owner != null) {
      return "Cat {name=" + name + ", owner.name=" + owner.getName() + "}";
    }

    return "Cat {name=" + name + ", owner=" + owner + "}";
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public void setName(String name) {
    this.name = name;
  }

  public User getOwner() {
    return this.owner;
  }

  public void setOwner(User owner) throws CantHaveMoreThanTwoException {
    if (owner.getPets().size() >= 2) {
      throw new CantHaveMoreThanTwoException("ERR: " + owner.getName() + " can only have 2 pets at most");
    }

    if (this.owner != null) {
      this.owner.removePet(this);
      this.owner = null;
    }

    this.owner = owner;
    this.owner.addPet(this);
  }

  @Override
  public void walk() {
    System.out.println(this.name + " is walking on its " + this.getLegs() + " legs");
  }

  @Override
  public void eat() {
    System.out.println(this.name + " is eating fish");
  }

  @Override
  public void play() {
    String message = this.name + " is playing";

    if (this.owner != null) {
      message += " with " + owner.getName();
    }
      
    System.out.println(message);
  }

}
