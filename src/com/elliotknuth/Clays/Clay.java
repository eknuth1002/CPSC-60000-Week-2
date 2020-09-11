package com.elliotknuth.Clays;

import com.elliotknuth.Enums;

public abstract class Clay {
	Enums.PieceEnums type;
	double costPerLb;
	public Enums.PieceEnums getDescription() {
		return type;
	}

	public abstract double getCostPerLb();
	
	public void setCostPerLb(double costPerLb) {
		this.costPerLb = costPerLb;
	}
}
