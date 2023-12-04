package DogApp;

public class Corgi extends Dog {

    // additional class variables
    int weight;
    int age;
    String dogType;
    
    // constructor
    public Corgi(String type, String breed, String name, int pounds, int years) {

        // invoke Dog class (super class) constructor
        super(type, breed, name);
        weight = pounds;
        age = years;
        
    }

    // mutator methods
  //Weight mutator and accessor 
    public static int Weight; 
  //setter
  public void setweight(int Weight) {
  	weight = Weight;
  }
  public int getweight() {
  		return weight;	
  }
//Age mutator and accessor 
  public static int Age; 
  //setter
  public void setage(int Age) {
	age = Age;
}
  public int getage() {
		return age;	
}	

    // override toString() method to include additional dog information
    @Override
    public String toString() {
        return (super.toString() + "\nThe Corgi is " + age +
                " years old and weighs " + weight + " pounds.");
    }

}
