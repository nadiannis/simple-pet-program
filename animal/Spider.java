package animal;

public class Spider extends Animal {

  public Spider() {
    super(8);
  }

  @Override
  public String toString() {
    return "Spider {}";
  }

  @Override
  public void eat() {
    System.out.println("The spider is eating bugs");
  }
  
}
