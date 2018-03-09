package io;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;

import org.junit.Ignore;
import org.junit.Test;

public class CharStreamTest {
	String orgFilePath = "D:\\temp\\korean.txt";
	String targetFilePath = "D:\\temp\\korean_copy.txt";
	
	@Ignore
	@Test
	public void encodingTest() {
		
		FileInputStream fr = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		FileOutputStream fw = null;
		OutputStreamWriter osr = null;
		BufferedWriter bw = null;
		
		try {
			//1. ������ �о�´�.
			fr = new FileInputStream(orgFilePath);
			isr = new InputStreamReader(fr, "utf-8");
			br = new BufferedReader(isr);
			
			//1-1. ������ �� writer ��ü�� ����� �ش�.
			fw = new FileOutputStream(targetFilePath);
			osr = new OutputStreamWriter(fw, "utf-8");
			bw = new BufferedWriter(osr);
			
			String line = "";
			//2. ������ ���� �� �о�´�.
			while ((line = br.readLine()) != null) {
				//2-1. �� �� �� ���� �ؽ�Ʈ�� writer�� �̿��� ���Ͽ� ����. 			
				bw.write(line); // <== �ٹٲ��� ���� �ʴ´�. 
				bw.newLine();
			}
			
			bw.flush();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			//3. reader/writer�� close �Ѵ� 
			try {
				if (br != null ) {
					br.close();
				}
				if (bw != null) {
					bw.close();
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		
	}
	
	
	@Ignore
	@Test
	public void textFileCopyTest() {
		
		FileReader fr = null;
		BufferedReader br = null;
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			//1. ������ �о�´�.
			fr = new FileReader(orgFilePath);
			br = new BufferedReader(fr);
			
			//1-1. ������ �� writer ��ü�� ����� �ش�.
			fw = new FileWriter(targetFilePath);
			bw = new BufferedWriter(fw);
			
			String line = "";
			//2. ������ ���� �� �о�´�.
			while ((line = br.readLine()) != null) {
				//2-1. �� �� �� ���� �ؽ�Ʈ�� writer�� �̿��� ���Ͽ� ����. 			
				bw.write(line); // <== �ٹٲ��� ���� �ʴ´�. 
				bw.newLine();
			}
			
			bw.flush();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			//3. reader/writer�� close �Ѵ� 
			try {
				if (br != null ) {
					br.close();
				}
				if (bw != null) {
					bw.close();
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	@Test
	public void urlInputStreamTest() {
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			
			URL url = new URL("http://ohhoonim.blogspot.kr");
			InputStream is = url.openStream();
			InputStreamReader isr = new InputStreamReader(is, "utf-8");
			br = new BufferedReader(isr);
			
			FileOutputStream fos = new FileOutputStream("D:\\temp\\naver_main.html");
			OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8");
			bw = new BufferedWriter(osw);
			
			String line = "";
			while((line = br.readLine()) != null) {
				bw.write(line);
				bw.newLine();
			}
			
			bw.flush();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (br != null) {
					br.close();
				}
				if (bw != null) {
					bw.close();
				}
			} catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
