package RescueAnimal;



import java.text.SimpleDateFormat;

public class RescueAnimal {

    // Instance variables
    private String name;
    private String type;
    private String gender;
    private int age;
    private float weight;
    private SimpleDateFormat acquisitionDate;
    private SimpleDateFormat statusDate;
    private String acquisitionSource;
    private Boolean reserved;

    private String trainingLocation;
    private SimpleDateFormat trainingStart;
    private SimpleDateFormat trainingEnd;
    private String trainingStatus;

    private String inServiceCountry;
    private String inServiceCity;
    private String inServiceAgency;
    private String inServicePOC;
    private String inServiceEmail;
    private String inServicePhone;
    private String inServicePostalAddress;

    // Constructor
    public RescueAnimal() {
    	
    	
    }

    // Accessor and Mutator Methods below
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public SimpleDateFormat getAcquisitionDate() {
		return acquisitionDate;
	}

	public void setAcquisitionDate(SimpleDateFormat acquisitionDate) {
		this.acquisitionDate = acquisitionDate;
	}

	public SimpleDateFormat getStatusDate() {
		return statusDate;
	}

	public void setStatusDate(SimpleDateFormat statusDate) {
		this.statusDate = statusDate;
	}

	public String getAcquisitionSource() {
		return acquisitionSource;
	}

	public void setAcquisitionSource(String acquisitionSource) {
		this.acquisitionSource = acquisitionSource;
	}

	public Boolean getReserved() {
		return reserved;
	}

	public void setReserved(Boolean reserved) {
		this.reserved = reserved;
	}

	public String getTrainingLocation() {
		return trainingLocation;
	}

	public void setTrainingLocation(String trainingLocation) {
		this.trainingLocation = trainingLocation;
	}

	public SimpleDateFormat getTrainingStart() {
		return trainingStart;
	}

	public void setTrainingStart(SimpleDateFormat trainingStart) {
		this.trainingStart = trainingStart;
	}

	public SimpleDateFormat getTrainingEnd() {
		return trainingEnd;
	}

	public void setTrainingEnd(SimpleDateFormat trainingEnd) {
		this.trainingEnd = trainingEnd;
	}

	public String getTrainingStatus() {
		return trainingStatus;
	}

	public void setTrainingStatus(String trainingStatus) {
		this.trainingStatus = trainingStatus;
	}

	public String getInServiceCountry() {
		return inServiceCountry;
	}

	public void setInServiceCountry(String inServiceCountry) {
		this.inServiceCountry = inServiceCountry;
	}

	public String getInServiceCity() {
		return inServiceCity;
	}

	public void setInServiceCity(String inServiceCity) {
		this.inServiceCity = inServiceCity;
	}

	public String getInServiceAgency() {
		return inServiceAgency;
	}

	public void setInServiceAgency(String inServiceAgency) {
		this.inServiceAgency = inServiceAgency;
	}

	public String getInServicePOC() {
		return inServicePOC;
	}

	public void setInServicePOC(String inServicePOC) {
		this.inServicePOC = inServicePOC;
	}

	public String getInServiceEmail() {
		return inServiceEmail;
	}

	public void setInServiceEmail(String inServiceEmail) {
		this.inServiceEmail = inServiceEmail;
	}

	public String getInServicePhone() {
		return inServicePhone;
	}

	public void setInServicePhone(String inServicePhone) {
		this.inServicePhone = inServicePhone;
	}

	public String getInServicePostalAddress() {
		return inServicePostalAddress;
	}

	public void setInServicePostalAddress(String inServicePostalAddress) {
		this.inServicePostalAddress = inServicePostalAddress;
	}

    //The Method "Ability to add animals (intake)"
    public void methodAddAnimal(String name, String type,String gender,int age,float weight) {
    	//Should read: A new member of the rescue animal team is added:
    	//Should read: Curious George is a 2 year old Male Ape, who weighs 60.0 ibs.
    	System.out.println("A new member of the rescue animal team is added:");
    	System.out.println(name + " is a " + age + " year old " + gender + " " + type + ", who weighs "+ weight + " ibs.");
    }
    

}
