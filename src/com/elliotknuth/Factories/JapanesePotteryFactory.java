package com.elliotknuth.Factories;

import com.elliotknuth.Enums.LocationEnums;
import com.elliotknuth.Clays.*;
import com.elliotknuth.Designs.*;
import com.elliotknuth.Glazes.*;

public final class JapanesePotteryFactory extends PotteryFactory {
	public JapanesePotteryFactory() {
		region = LocationEnums.JAPAN;
	}

	@Override
	public Clay chooseClay() {
		Clay clay = new TerraCota();
		return clay;
	}

	@Override
	public Design chooseDesign() {
		Design design = new Ukiyo_e(new ScarletRed());
		return design;
	}

	@Override
	public Glaze chooseGlaze() {
		Glaze glaze = new Ash();
		return glaze;
	}
}
