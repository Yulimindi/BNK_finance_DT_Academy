package d0127;

import java.time.LocalDate;

public class Hotel {
	LocalDate startDate;
	LocalDate endDate;
	String[] roomNum;
	String room;
	String name;
	HotelReservationService s;
	
	public Hotel() throws Exception {
		roomNum = new String[] {"r01", "r02", "r03", "r04", "r05", "r06", "r07", "r08", "r09", "r10"};
		s = new HotelReservationService();
	}
	
	public String reserve(String date, String room, String name) throws Exception {
		this.startDate = LocalDate.parse(date);
		String b;
		for(int i = 0; i < roomNum.length; i++) {
			if(roomNum[i].equals(room)) {
				this.room = room;
			}
		}
		
		if(room.isEmpty()) {
			return "room null 오류 발생";
		} else {
			this.name = name; 
			return s.reserve(this);
		}
		
		
	}
	
	public String cancel(String date, String room, String name) throws Exception {
		this.startDate = LocalDate.parse(date);
		for(int i = 0; i < roomNum.length; i++) {
			if(roomNum[i].equals(room)) {
				this.room = room;
			}
		}
		this.name = name;

		
		return s.cancel(this);
	}
}
