import animal.Cat;
import animal.Fish;
import animal.Spider;
import exception.CantHaveMoreThanTwoException;
import user.John;
import user.Taylor;

public class Main {

  public static void main(String[] args) {
    System.out.println("\n========== CREATING OBJECTS ==========");

    System.out.println("\nCreating users...");
    
    John john = new John("john", "john@gmail.com");
    System.out.println(john);

    Taylor taylor = new Taylor("taylor", "taylor@gmail.com");
    System.out.println(taylor);

    System.out.println("\nCreating animals...");

    Spider spider1 = new Spider();
    System.out.println(spider1);
    spider1.walk();
    spider1.eat();
    System.out.println();

    Cat cat1 = new Cat("catty");
    System.out.println(cat1);
    cat1.walk();
    cat1.eat();
    cat1.play();
    System.out.println();

    Cat cat2 = new Cat("cattio");
    System.out.println(cat2);
    cat2.walk();
    cat2.eat();
    cat2.play();
    System.out.println();

    Fish fish1 = new Fish("fissy");
    System.out.println(fish1);
    fish1.walk();
    fish1.eat();
    fish1.play();
    System.out.println();

    Fish fish2 = new Fish("fisso");
    System.out.println(fish2);
    fish2.walk();
    fish2.eat();
    fish2.play();

    System.out.println("\n========== SETTING OWNERS ==========");

    System.out.println("\nSetting owner...");

    try {
      cat1.setOwner(john);
    } catch (CantHaveMoreThanTwoException e) {
      System.out.println(e.getMessage());
    } catch (Exception e) {
      System.out.println("ERR: something went wrong, " + e);
    }
    System.out.println(cat1);
    System.out.println(john);
    john.displayNumOfPets();
    cat1.play();

    System.out.println("\nChanging owner...");

    try {
      cat1.setOwner(taylor);
    } catch (CantHaveMoreThanTwoException e) {
      System.out.println(e.getMessage());
    } catch (Exception e) {
      System.out.println("ERR: something went wrong, " + e);
    }
    System.out.println(cat1);
    System.out.println(john);
    System.out.println(taylor);
    john.displayNumOfPets();
    taylor.displayNumOfPets();
    cat1.play();

    System.out.println("\nSetting owner...");

    try {
      fish1.setOwner(taylor);
    } catch (CantHaveMoreThanTwoException e) {
      System.out.println(e.getMessage());
    } catch (Exception e) {
      System.out.println("ERR: something went wrong, " + e);
    }
    System.out.println(fish1);
    System.out.println(john);
    System.out.println(taylor);
    john.displayNumOfPets();
    taylor.displayNumOfPets();
    fish1.play();

    System.out.println("\nSetting owner...");

    try {
      cat2.setOwner(john);
    } catch (CantHaveMoreThanTwoException e) {
      System.out.println(e.getMessage());
    } catch (Exception e) {
      System.out.println("ERR: something went wrong, " + e);
    }
    System.out.println(cat2);
    System.out.println(john);
    System.out.println(taylor);
    john.displayNumOfPets();
    taylor.displayNumOfPets();
    cat2.play();

    System.out.println("\nSetting owner...");

    try {
      fish2.setOwner(taylor);
    } catch (CantHaveMoreThanTwoException e) {
      System.out.println(e.getMessage());
    } catch (Exception e) {
      System.out.println("ERR: something went wrong, " + e);
    }
    System.out.println(fish2);
    System.out.println(john);
    System.out.println(taylor);
    john.displayNumOfPets();
    taylor.displayNumOfPets();
    fish2.play();
  }

}