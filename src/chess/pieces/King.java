package chess.pieces;

import bordgame.Board;
import bordgame.Position;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece {

	public King(Board board, Color color) {
		super(board, color);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "K";
	}
	
	private boolean canMove(Position positon) {
		ChessPiece p = (ChessPiece)getBoard().piece(position);
		return p == null || getColor() !=getColor();
	}

	@Override
	public boolean [][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		
		Position p = new Position(0,0);
		
		
		// acima = above
		
		p.setValues(position.getRow() - 1, position.getColumn());
		if(getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		
		// abaixo = below
		
				p.setValues(position.getRow() +1 , position.getColumn() );
				if(getBoard().positionExists(p) && canMove(p)) {
					mat[p.getRow()][p.getColumn()] = true;
				}
		// esquerda = left
				
				p.setValues(position.getRow(), position.getColumn() -1 );
				if(getBoard().positionExists(p) && canMove(p)) {
					mat[p.getRow()][p.getColumn()] = true;
				}
		// direita = right
				
				p.setValues(position.getRow(), position.getColumn() +1 );
				if(getBoard().positionExists(p) && canMove(p)) {
					mat[p.getRow()][p.getColumn()] = true;
				}
		// noroeste = nw ( ↖ )
				
				p.setValues(position.getRow() -1 , position.getColumn() -1 );
				if(getBoard().positionExists(p) && canMove(p)) {
					mat[p.getRow()][p.getColumn()] = true;
				}
				
				// nordeste = ne( ↗ )
				
				p.setValues(position.getRow() -1 , position.getColumn() +1 );
				if(getBoard().positionExists(p) && canMove(p)) {
					mat[p.getRow()][p.getColumn()] = true;
				}
				// nordeste = sw ( ↙ )
				
				p.setValues(position.getRow() +1 , position.getColumn() -1 );
				if(getBoard().positionExists(p) && canMove(p)) {
					mat[p.getRow()][p.getColumn()] = true;
				}
				// sudeste = sd ( ↘ )
				
				p.setValues(position.getRow() +1 , position.getColumn() +1 );
				if(getBoard().positionExists(p) && canMove(p)) {
					mat[p.getRow()][p.getColumn()] = true;
				}
				
		
		
		return mat;
	}

}
