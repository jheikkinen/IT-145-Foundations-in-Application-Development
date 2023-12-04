package DogApp;

public class Driver {
      public static void main(String[] args){
    	  Corgi fido = new Corgi("cattle herding", "Pembroke Welsh Corgi" , "Fido", 38, 5); //new object with Corgi inputs
          fido.setTopTrick("ringing the bell to go outside");   //input for top trick
          System.out.println(fido.toString()); //override used to add more values to dog 
      }
}
