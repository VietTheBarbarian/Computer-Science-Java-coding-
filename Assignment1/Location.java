public class Location
{

 private int row;
 private int col;


public Location(int row, int col) {
        this.row = row;
        this.col = col;

}
 public String toString() {
        return row + ", " + col;
    }

 

public int getRow() {
        return row;
}

    public int getCol() {
        return col;
}
public boolean equals(Location  other) {
     return this.col == other.col && this.row == other.row;
}

}



