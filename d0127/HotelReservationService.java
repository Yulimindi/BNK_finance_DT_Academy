package d0127;


public class HotelReservationService {
	
	HotelReservationDB db;
	
	public HotelReservationService() throws Exception {
		db = new HotelReservationDB();
	}
	
	public String reserve(Hotel hotel) throws Exception {
		return db.reserve(hotel);
	}
	
	public String cancel(Hotel hotel) throws Exception {
		return db.cancel(hotel);
	}
	
}
