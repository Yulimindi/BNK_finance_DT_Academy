package d0127;

public class HotelReservationMain {
	
	// 예약 프로그램 
	// 호텔 예약 프로그램 방 R01~R10
	// 1. 예약 2. 예약 취소
	
	public static void main(String[] args) throws Exception {
		Hotel h = new Hotel();
		
		// 예약 + 나중에 연박 시스템도 넣기 며칠 묵는지
		System.out.println(h.reserve("2026-01-27", "r02", "김준희"));
		System.out.println(h.reserve("2026-03-14", "r03", "김힘찬"));
		System.out.println(h.reserve("2026-04-17", "r02", "케로로"));
		System.out.println(h.reserve("2026-02-09", "r03", "김힘찬"));
		System.out.println(h.reserve("2026-10-16", "r09", "한빛나"));
		
		// 예약 취소
		System.out.println(h.cancel("2026-04-17", "r02", "김힘찬"));
		System.out.println(h.cancel("2026-04-17", "r02", "케로로"));		
		System.out.println(h.cancel("2026-04-13", "r02", "김힘찬"));
		
	}
	
}
