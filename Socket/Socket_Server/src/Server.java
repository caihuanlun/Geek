import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Socket编程服务端
 * @author Allen
 *
 */
public class Server {
	public static void main(String args[]) {
		BufferedReader br = null;
		PrintWriter pw = null;
		try {
			ServerSocket server = new ServerSocket(2000);
			Socket socket = server.accept();
			// 获取输入流
			br  = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			// 获取输出流
			pw = new PrintWriter(socket.getOutputStream(), true);
			
			// 获取接收到的数据
			String s = br.readLine();
			// 发送相同的数据给客户端
			pw.println(s);
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
