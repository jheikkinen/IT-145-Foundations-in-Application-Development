package DogApp;

public class Dog {

    // class variables
   String dogtype;
   String dogbreed;
   String dogname;
   public String topTrick;
   

    // constructor
public Dog (String type, String breed, String name) {
    dogtype = type;       //gets string from type
    dogbreed = breed;      //gets string from breed
    dogname = name;       //gets string from name

   }
 //TOP trick mutator and accessor 
public static String Trick; 
//setter
public void setTopTrick(String Trick) {
	topTrick = Trick;
}
public String getTopTrick() {
		return topTrick;	
}

    // method used to print Dog information
    public String toString() {
        String temp = "\nDOG DATA\n" + dogname + " is a " + dogbreed +
                ", a " + dogtype + " dog. \nThe top trick is: " +
                topTrick + ".";
        return temp;
    }

}
