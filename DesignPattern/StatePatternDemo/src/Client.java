/**
 * ״̬ģʽ���ͻ���
 * @author Allen
 *
 */
public class Client {
	public static void main(String args[]){
		TvController tvController = new TvController();
		
		//���ÿ���״̬
		tvController.powerOn();
		//��һ��Ƶ��
		tvController.nextChannel();
		//��������
		tvController.turnUp();
		//���ÿ���״̬
		tvController.powerOff();
		//������������ʱ������Ч
		tvController.turnUp();
	}
}
