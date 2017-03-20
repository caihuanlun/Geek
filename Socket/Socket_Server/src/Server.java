import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Socket��̷����
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
			// ��ȡ������
			br  = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			// ��ȡ�����
			pw = new PrintWriter(socket.getOutputStream(), true);
			
			// ��ȡ���յ�������
			String s = br.readLine();
			// ������ͬ�����ݸ��ͻ���
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
