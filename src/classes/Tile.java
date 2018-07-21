package classes;

public class Tile {
	private char ch;
	private int row;
	private int column;
	public Tile(char ch, int row, int column) {
		super();
		this.ch = ch;
		this.row = row;
		this.column = column;
	}
	public char getCh() {
		return ch;
	}
	public void setCh(char ch) {
		this.ch = ch;
	}
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getColumn() {
		return column;
	}
	public void setColumn(int column) {
		this.column = column;
	}
	@Override
	public String toString() {
		return ch + "";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ch;
		result = prime * result + column;
		result = prime * result + row;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tile other = (Tile) obj;
		if (ch != other.ch)
			return false;
		if (column != other.column)
			return false;
		if (row != other.row)
			return false;
		return true;
	}
	@Override
	protected Tile clone() {
		return new Tile(getCh(),this.getRow(), this.getColumn());
	}
	public double getDistance(Tile tile) {
		return getDistance(tile.row, tile.column);
	}
	public double getDistance(int row, int column) {
		return Math.hypot(row-this.getRow(), column-this.getColumn());
	}
	
	public boolean isStart() {return getCh()=='s';}
	public boolean isGoal() {return getCh()== 'g';}
	public boolean isBlanck() {return getCh()== ' ';}
	public boolean isStraightLine() {return getCh()== '-'|| getCh()=='|';}
	public boolean isRIghtangle() {return getCh()=='7' || getCh()=='j'|| getCh()=='L'|| getCh()== 'F';} 
	
	public Tile hashTile() {
		char hashch=getCh();
		if(isStraightLine()) {
			hashch= '|';
		}
		else if(isRIghtangle()) {
			hashch= 'L'; 
		}
		return new Tile(hashch, row, column);
	}
	 public int NumofRotate() {
		 if(isGoal()||isStart()||isBlanck()) {
			 return 0;
		 }
		 if(isStraightLine()) {
			 return 2;
		 }
	 	if(isRIghtangle()){
	 		return 4;
	 	}
	 	return 1;
	 }
}
	 

	

// why to do hash code -andddd- equals if can use only hash to verify what we looking for 