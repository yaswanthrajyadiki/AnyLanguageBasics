class Menu {
public static void main(String[] args) {
	Show show[] = new Show[10];
		show[0] = new Show("Srimanthudu",
			"17-08-2015", "11:00 AM", 50);
		show[1] = new Show("MI5",
			"17-08-2015", "02:30 PM", 50);
		show[2] = new Show("Upendra2",
			"18-08-2015", "11:00 AM", 50);
		show[3] = new Show("Srimanthudu",
			"19-08-2015", "11:00 AM", 50);
	BookYourShow bys = new BookYourShow();
	bys.addAShow(show[0]);
	bys.addAShow(show[1]);
	bys.addAShow(show[2]);
	bys.addAShow(show[3]);
	bys.removeAShow("Upendra2");
	bys.getAShow("Srimanthudu");
	Patron p = new Patron("Raj", "9493395040");
	bys.bookAShow(p, "Srimanthudu", "17-08-2015", "11:00 AM", 6);
	System.out.println(bys.printTicket());
}
}