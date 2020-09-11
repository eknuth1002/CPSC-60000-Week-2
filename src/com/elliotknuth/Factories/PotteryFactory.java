package com.elliotknuth.Factories;

import com.elliotknuth.Enums;
import com.elliotknuth.Enums.LocationEnums;
import com.elliotknuth.Clays.Clay;
import com.elliotknuth.Designs.Design;
import com.elliotknuth.Glazes.Glaze;
import com.elliotknuth.Pieces.Cup;
import com.elliotknuth.Pieces.LargeBowl;
import com.elliotknuth.Pieces.LargePlate;
import com.elliotknuth.Pieces.Mug;
import com.elliotknuth.Pieces.Piece;
import com.elliotknuth.Pieces.SmallBowl;
import com.elliotknuth.Pieces.SmallPlate;
import com.elliotknuth.Pieces.Teapot;

public abstract class PotteryFactory {
	Enums.LocationEnums region;
	
	public LocationEnums getRegion() { return region; }
	
	protected Piece createPiece(Enums.PieceEnums pieceType) {
		Piece piece;
		
		switch (pieceType) {
			case CUP:
				piece = new Cup(this);
				break;
			case MUG :
				piece = new Mug(this);
				break;
			case SMALL_BOWL:
				piece = new SmallBowl(this);
				break;
			case LARGE_BOWL:
				piece = new LargeBowl(this);
				break;
			case SMALL_PLATE:
				piece = new SmallPlate(this);
				break;
			case LARGE_PLATE:
				piece = new LargePlate(this);
				break;
			default:
				piece = new Teapot(this);
				break;
		}
		return piece;
		
	}
	
	public abstract Clay chooseClay();
	
	public abstract Design chooseDesign();
	
	public abstract Glaze chooseGlaze();
	
	public Piece orderPiece(Enums.PieceEnums orderedPiece) {
		Piece piece = createPiece(orderedPiece);
		piece.make();
		piece.decorate();
		piece.fire();
		piece.ship();
		return piece;
	}
}
