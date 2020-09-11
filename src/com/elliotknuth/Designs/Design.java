package com.elliotknuth.Designs;

import com.elliotknuth.Glazes.Glaze;

public abstract class Design {
	Glaze glaze;
	String description;
	
	public String getDescription() {
		return description;
	}
	
	public Glaze getGlaze() { return glaze; }
}
