package d0127;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class HotelReservationDB {

	Connection con;
	
	private final String url = "jdbc:oracle:thin:@//localhost:1521/testdb";
	private final String user = "green";
	private final String password = "1234";
	
	PreparedStatement stmt;
	ResultSet rs;
	
	public HotelReservationDB() throws Exception {
		con = DriverManager.getConnection(url, user, password);
	}
	
	public String reserve(Hotel hotel) throws Exception {
	
		stmt = con.prepareStatement("select * from hotelReserve where rnum = ? AND reserveDay = ?");
		stmt.setString(1, hotel.room);
		stmt.setString(2, hotel.startDate.toString());
		
		rs = stmt.executeQuery();
		
		if(rs.next()) {
			return "이미 예약되었습니다.";
		} else {
			stmt = con.prepareStatement("insert into hotelReserve (rnum, reserveDay, name) values (?, ?, ?)");
			stmt.setString(1, hotel.room);
			stmt.setString(2, hotel.startDate.toString());
			stmt.setString(3, hotel.name);
			stmt.executeUpdate();
			return "성공적으로 예약이 완료되었습니다.";
		}
		
	}
	
	public String cancel(Hotel hotel) throws Exception {

		boolean c;
		String msg;
			
		stmt = con.prepareStatement("select * from hotelReserve where rnum = ? AND reserveDay = ?");
		stmt.setString(1, hotel.room);
		stmt.setString(2, hotel.startDate.toString());
		rs = stmt.executeQuery();
			
		if(rs.next()) {
			c = true;
		} else {
			c = false;
		}
			
		if(c == true) {
			stmt = con.prepareStatement("delete from hotelReserve where rnum = ? AND reserveDay = ? AND name = ?");
			stmt.setString(1, hotel.room);
			stmt.setString(2, hotel.startDate.toString());
			stmt.setString(3, hotel.name);
			rs = stmt.executeQuery();
			if(rs.next()) {
				msg = "예약이 취소되었습니다.";
				return msg;
			} else {
				msg = "타인의 예약을 취소할 수 없습니다.";
				return msg;
			}
			
		} else {
			msg = "해당 날짜의 객실은 예약되지 않았습니다.";
			return msg;
		}
		
	}
}
