package d0119;

public enum Member_Role {
	
	ADMIN {
		@Override
		public void go() {
			System.out.println("관리자 페이지로 슝~");		
		}
	}, MEMBER {
		@Override
		public void go() {
			System.out.println("회원 페이지로 슝~");
		}
	}, GUEST {
		@Override
		public void go() {
			System.out.println("손님 페이지로 슝~");
		}
	};
	

	
	// ========== 메서드 ==========
	public abstract void go();
	
}
