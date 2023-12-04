package RescueAnimal;
//Monkey Class
public class Monkey extends RescueAnimal {
		private double tailLength;
		private double height;
		private double bodyLength;
		private String species;
		private double torsoMeasurement;
		private double skullMeasurement;

		//// Accessor and Mutators Methods below
		public double getTailLength() {
			return tailLength;
		}
		public void setTailLength(double tailLength) {
			this.tailLength = tailLength;
		}
		public double getHeight() {
			return height;
		}
		public void setHeight(double height) {
			this.height = height;
		}
		public double getBodyLength() {
			return bodyLength;
		}
		public void setBodyLength(double bodyLength) {
			this.bodyLength = bodyLength;
		}
		public String getSpecies() {
			return species;
		}
		public void setSpecies(String species) {
			this.species = species;
		}
		public double getTorsoMeasurement() {
			return torsoMeasurement;
		}
		public void setTorsoMeasurement(double torsoMeasurement) {
			this.torsoMeasurement = torsoMeasurement;
		}
		public double getSkullMeasurement() {
			return skullMeasurement;
		}
		public void setSkullMeasurement(double skullMeasurement) {
			this.skullMeasurement = skullMeasurement;
		}
		public double getNeckMeasurement() {
			return neckMeasurement;
		}
		public void setNeckMeasurement(double neckMeasurement) {
			this.neckMeasurement = neckMeasurement;
		}
		private double neckMeasurement;
}
