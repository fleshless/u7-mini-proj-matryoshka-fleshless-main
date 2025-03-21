package mrsklaka.projects;

public class Matryoshka {
	private Matryoshka innerDoll;
    //TODO: Create required instance variables
	String name;
	java.awt.Color hairColor;
	boolean hasBabuskha;


	/**
	 * Initializes the innerDoll to null.
	 */
	public Matryoshka() {
		innerDoll = null;
	}

	/* TODO: Constructor without innerDoll
     * ****************************
	 * Initializes the name, hair color and whether this doll is wearing a babushka, which is a headscarf tied below the chin. 
	 * This is an innermost doll, so innerDoll should be set to null. 
     * Initialize the babushka, hairColor and name fields. A babushka is a headscarf tied below the chin.
	 * @param name name of this doll
	 * @param hair hair color
	 * @param babushka true if the doll is wearing a babushka
	 */
	public Matryoshka(String name, java.awt.Color hair, boolean babushka) {
		
	}
	
	// /**
	//  * initializes the innerDoll to the specified doll
	//  * @param innerDoll the inner doll, which might contain other dolls.
	//  */
	// public Matryoshka(Matryoshka innerDoll) {
	// 	this.innerDoll = innerDoll;
	// }
	
	/**
	 * TODO: Constructor with innerDoll
     * ****************************
     * Initializes the name, hair color and whether this doll is wearing a babushka, which is a headscarf tied below the chin. 
	 * Initialize the innerDoll, babushka, hairColor and name fields. A babushka is a headscarf
	 * tied below the chin.
	 * @param innerDoll the inner doll, which might contain other dolls.
	 * @param name name of this doll
	 * @param hair hair color
	 * @param babushka true if the doll is wearing a babushka
	 */
	public Matryoshka(Matryoshka innerDoll, String name, java.awt.Color hair, boolean babushka) {
		//add code here
	}
	
	/**
	 * Determines whether this doll has an inner doll.
	 * @return true if this doll has an inner doll; false otherwise
	 */
	public boolean hasInnerDoll() {
		return innerDoll != null;
	}

	/**
	 * Returns the inner doll;
	 * @return If this doll has an inner doll, a reference to that doll is returned; otherwise null.
	 */
	public Matryoshka getInnerDoll() {
		return innerDoll;
	}

	/* SAMPLE: howManyDolls
     * *******************************
     * Recursive method that returns a count of the number of dolls contained within this doll object, including this one
	 * @return how many dolls are contained within this doll, including this one.
	 */
	public int howManyDolls() {
		// base case: no dolls inside the current doll
		if (innerDoll == null) {
			return 1;
		}else {
			// recursive case: We still have more dolls nested, so add 1 for this doll to the count for how many dolls are inside:)
			return 1 + this.innerDoll.howManyDolls();
		}
	}

	/* TODO: howManyWearingBabushkas
     **********************************
	 * A recursive method that returns the number of dolls that are wearing babushkas, including the current one.
	 * @return the number of dolls that are wearing babushkas, including the current one.
	 */
	public int howManyWearingBabushkas() {
		return -1;
	}

	/* TODO: redHeadCount
     **********************************
	 * A recursive method that returns the number of dolls, whose hair color is java.awt.Color.RED. 
	 * @return the number of dolls, whose hair color is java.awt.Color.RED.
	 */
	public int redHeadCount() {
		return -1;
	}
	
	/* TODO: lastName
     ********************************
	 * A recursive method that returns the name of the doll that is alphabetically last among the current and inner dolls. 
	 * If a Matryoshka has no inner doll, then its name is alphabetically last of the collection.
	 * If a Matryoshka has an inner doll, then return the  name of the alphabetically last name
	 * of all the remaining dolls, including the current.
	 *
     * Use the compareTo method in the String class to determine which name is later in the alphabet.
	 *
     * @return the name of the doll that is alphabetically last among the current and inner dolls.  
	 */
	public String lastName() {
		return "";
	}
}
