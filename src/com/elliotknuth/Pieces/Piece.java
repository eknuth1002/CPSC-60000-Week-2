package com.elliotknuth.Pieces;

import com.elliotknuth.Enums;
import com.elliotknuth.Clays.Clay;
import com.elliotknuth.Designs.Design;
import com.elliotknuth.Factories.PotteryFactory;
import com.elliotknuth.Glazes.Glaze;

public abstract class Piece {
	PotteryFactory factory;
	Enums.PieceEnums type;
	Clay clay;
	Design design;
	Glaze glaze;
	double weight;
	
	protected Piece() { }
	
	public Piece (PotteryFactory factory) {
		this.factory = factory;
		
	}
	
	public double getCost() {
		return (clay.getCostPerLb() * weight) + ((design.getGlaze().getCostPerOz() * weight) / 2) + (glaze.getCostPerOz() * weight);
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void make() {
		System.out.println("Making a " + factory.getRegion() + " style "+ type) ;
		clay = factory.chooseClay();
		design = factory.chooseDesign();
		glaze = factory.chooseGlaze();
	}
	
	public void decorate() {
		System.out.println("Putting on the design of " + design.getDescription() + " in " + design.getGlaze().getDescription());
	}
	
	public void fire() {
		System.out.println("Firing the " + type);
	}
	
	public void ship() {
	System.out.printf("Packaging and shipping your " + type + " for a cost of $%.2f with free shipping.\n", ((Math.round(getCost()) * 100) / 100.0));		
	}	
}
