package d0120;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MemoProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FileWriter fw = null;
		
		System.out.println("저장하실 메모 이름을 입력해주세요 ▼");
		String name = sc.nextLine();
		System.out.println("단어장에 메모를 입력해주세요 ▼");
		String memo = sc.nextLine();
		name = name + ".txt";
		
		try {
			fw = new FileWriter(name);
			fw.write(memo);
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
		
		System.out.println("메모가 저장되었습니다.");
		
		System.out.println("읽을 메모의 이름을 입력해주세요 ▼");
		String find = sc.nextLine();
		find = find + ".txt";
		System.out.println("메모를 읽습니다.");
		
		FileReader fr = null;
		try {
			fr = new FileReader(find);
			int ch;
			System.out.println("메모 제목 ▶ " + find);
			System.out.println("메모 내용 ▼");
			while((ch = fr.read()) != -1) {
				System.out.print((char)ch);
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
		
		
	}

}
