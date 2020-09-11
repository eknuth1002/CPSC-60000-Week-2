package com.elliotknuth.Designs;

import com.elliotknuth.Glazes.Glaze;

public class Filigree extends Design {
	private Filigree() {}
	
	public Filigree(Glaze glaze) {
		description = "fine filigree scrollwork";
		this.glaze = glaze;
	}
}
