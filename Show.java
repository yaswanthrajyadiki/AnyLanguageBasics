class Show {
	String nameOfMovie;
	String movieShowDate;
	String movieShowTime;
	int seatNumber;
	Show(String nameOfMovie,
		String movieShowDate,
		String movieShowTime,
		int seatNumber) {
		this.nameOfMovie = nameOfMovie;
		this.movieShowDate = movieShowDate;
		this.movieShowTime = movieShowTime;
		this.seatNumber = seatNumber;	
	}
	public String toString() {
		String s = nameOfMovie + "\n";
		s = s + movieShowDate + "\n";
		s = s + movieShowTime + "\n";
		s = s + seatNumber;
		return s;
	}
	public String getMovieName() {
		return this.nameOfMovie;
	}
	public String getMovieShowDate() {
		return this.movieShowDate;
	}
	public String getMovieShowTime() {
		return this.movieShowTime;
	}
	public int getNumberOfSeats() {
		return this.seatNumber;
	}
	public void updateSeats(int noOfSeats) {
		seatNumber = seatNumber + noOfSeats;
	}
}