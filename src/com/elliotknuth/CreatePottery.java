package com.elliotknuth;

import com.elliotknuth.Enums.PieceEnums;
import com.elliotknuth.Factories.EnglishPotteryFactory;
import com.elliotknuth.Factories.JapanesePotteryFactory;
import com.elliotknuth.Factories.PotteryFactory;
import com.elliotknuth.Pieces.Piece;

public class CreatePottery {

	public static void main(String[] args) {
		PotteryFactory japanesePF = new JapanesePotteryFactory();
		PotteryFactory englishPF = new EnglishPotteryFactory();
		
		Piece japanesePiece = japanesePF.orderPiece(PieceEnums.CUP);
		
		System.out.println("");
		Piece englishPiece = englishPF.orderPiece(PieceEnums.TEAPOT);
		
	}

}
