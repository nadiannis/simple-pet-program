package animal;

public class Animal {

  private int legs;

  public Animal(int legs) {
    this.legs = legs;
  }

  public int getLegs() {
    return this.legs;
  }

  public void setLegs(int legs) {
    this.legs = legs;
  }

  public void walk() {
    System.out.println("This animal is walking on its " + this.legs + " legs");
  }

  public void eat() {
    System.out.println("This animal is eating");
  }

}
