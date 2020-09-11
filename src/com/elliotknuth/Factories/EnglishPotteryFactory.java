package com.elliotknuth.Factories;

import com.elliotknuth.Enums.LocationEnums;
import com.elliotknuth.Clays.*;
import com.elliotknuth.Designs.*;
import com.elliotknuth.Glazes.*;

public final class EnglishPotteryFactory extends PotteryFactory {
	public EnglishPotteryFactory() {
		this.region = LocationEnums.ENGLAND;
	}

	@Override
	public Clay chooseClay() {
		Clay clay = new Porcelain();
		return clay;
	}

	@Override
	public Design chooseDesign() {
		Design design = new Filigree(new CobaltBlue());
		return design;
	}

	@Override
	public Glaze chooseGlaze() {
		Glaze glaze = new ClearGlaze();
		return glaze;
	}
}
