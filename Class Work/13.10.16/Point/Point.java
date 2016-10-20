class Point {
	int x;
	int y;
	String xy;

	void setX(int newX){
		x = newX;
	}

	void setY(int newY){
		y = newY;
	}

	int getX(){
		return x;
	}

	int getY(){
		return y;
	}

	String getXY(){
		String xy;
		xy = "(" + getX() + "; " + getY() + ")";
		return xy;
	}
}
