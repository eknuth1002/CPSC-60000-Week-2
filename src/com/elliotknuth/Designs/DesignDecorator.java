package com.elliotknuth.Designs;

import com.elliotknuth.Pieces.Piece;

public abstract class DesignDecorator extends Piece {
	Piece piece;
		
	public abstract String getDescription ();
	public abstract double cost();
}