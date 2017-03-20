import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Socket编程客户端
 * 
 * @author Allen
 *
 */
public class Client {
	public static void main(String[] args) {
		BufferedReader br = null;
		PrintWriter pw = null;

		try {
			Socket socket = new Socket("localhost", 2000);
			// 获取输入流
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			// 获取输出流
			pw = new PrintWriter(socket.getOutputStream(), true);
			
			pw.println("Hello");
			
			String s = null;
			while(true) {
				s = br.readLine();
				if(s != null) {
					break;
				}
			}
			System.out.println(s);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				br.close();
				pw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
