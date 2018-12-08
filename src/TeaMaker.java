
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */

public class TeaMaker {
	public static void main(String[] args) {
		
	
	/* Figure out how to make a cup of tea using the classes below */
	TeaBag teabag = new TeaBag("Mint");
	Kettle kettle = new Kettle();
	Kettle.Water water = kettle.getWater();
	kettle.boil();
	Cup cup = new Cup();
	cup.makeTea(teabag, water);
}
}
class TeaBag {

	public final static String GREEN = "Green";
	public final static String MINT = "Mint";
	public final static String CHAMOMILE = "Chamomile";
	public final static String PASSION_FRUIT = "Passion Fruit";

	private String flavor;

	TeaBag(String flavor) {
		this.flavor = flavor;
	}

	String getFlavor() {
		return flavor;
	}

}

class Kettle {

	private Water water = new Water();

	Water getWater() {
		return water;
	}

	void boil() {
		this.water.isHot = true;
	}

	class Water {

		private boolean isHot = false;

		public boolean isHot() {
			return this.isHot;
		}
	}

}

class Cup {	
	
	private TeaBag teabag;

	void makeTea(TeaBag teabag, Kettle.Water hotWater) {
		this.teabag = teabag;
		if (hotWater.isHot())
			System.out.println("Making hot " + teabag.getFlavor() + " tea.");
		else
			System.out.println("Can't make tea with cold water! ");
	}

}


