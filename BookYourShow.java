import java.util.ArrayList;
import java.util.ListIterator;
class BookYourShow {
	private ArrayList<Show> show;
	private String userName;
	private String userMobileNumber;
	private String movieName;
	private String movieShowDate;
	private String movieShowTime;
	private int numberOfSeats;
	BookYourShow() {
		show = new ArrayList<Show>();
	}
	public void addAShow(Show s) {
		show.add(s);
	}
	public void removeAShow(String movieName) {
		ListIterator<Show> iterator = show.listIterator();
		while(iterator.hasNext()) {
			Show ss = iterator.next();
			if (movieName==ss.getMovieName()) {
			show.remove(ss);
			break;		
		    }
		}
	}
	public void getAShow(String movieName) {
		ListIterator<Show> iterator2 = show.listIterator();
		while(iterator2.hasNext()) {
			Show ss2 = iterator2.next();
			if (movieName==ss2.getMovieName()) {
				System.out.println(ss2);		
		    }
		}
	}
	public void bookAShow(Patron patron,
		String movieName, String date,
		String time, int noOfSeats) {
		ListIterator<Show> iterator1 = show.listIterator();
		while(iterator1.hasNext()) {
			Show ss1 = iterator1.next();
			if (movieName.equals(ss1.getMovieName()) && date.equals(ss1.getMovieShowDate())
				&& time.equals(ss1.getMovieShowTime()) && ss1.getNumberOfSeats() >= noOfSeats) {
				this.userName = patron.getUserName();
				this.userMobileNumber = patron.getUserMobileNumber();
				this.movieName = movieName;
				this.movieShowDate = date;
				this.movieShowTime = time;
				this.numberOfSeats = noOfSeats;
				ss1.updateSeats(-noOfSeats);
			}
		}
	}
	public String printTicket() {
		String printTickets = "Name: " + this.userName + "\n";
		printTickets = printTickets + "Mobile number: " + this.userMobileNumber + "\n";
		printTickets = printTickets + "Movie name: " + this.movieName + "\n";
		printTickets = printTickets + "Date: " +this.movieShowDate + "\n";
		printTickets = printTickets + "Time: " +this.movieShowTime + "\n";
		printTickets = printTickets + "Number of seats: " +this.numberOfSeats;
		return printTickets;
	}
	
}