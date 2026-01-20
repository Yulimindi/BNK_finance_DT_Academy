package d0120;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
	public static void main(String[] args) {
		FileReader fr = null;
		
		try {
			fr = new FileReader("test.txt");
			int ch;
			
			while((ch = fr.read()) != -1) { // 파일의 끝을 의미하는 상수 -1 int 즉 4바이트짜리 끝이 되면 종료한다
				System.out.print((char)ch); // int에 받으니까 이를 char로 형변환
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fr != null) fr.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("\n파일 읽기 끝!");
		
	}
}
