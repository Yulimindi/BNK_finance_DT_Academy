package d0120;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
	public static void main(String[] args) {
		FileWriter fw = null;
		
		
		try {
			
			fw = new FileWriter("test.txt");
			fw.write("Hello Java! ");
			fw.write("FileWriter 예제입니댕 \n");
			fw.write("끝~");
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		} finally {
			
			try {
				if(fw != null) {
					fw.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	
		
		System.out.println("파일 쓰기가 완료되엇슴니당");
	}
	
}
