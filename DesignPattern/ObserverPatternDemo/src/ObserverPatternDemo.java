import com.allen.observer.BinaryObserver;
import com.allen.observer.HexaObserver;
import com.allen.observer.OctalObserver;
import com.allen.subject.Subject;

public class ObserverPatternDemo {

	public static void main(String[] args) {
		Subject subject = new Subject();

		new HexaObserver(subject);
		new OctalObserver(subject);
		new BinaryObserver(subject);

		System.out.println("第一次状态改变: 15");
		subject.setState(15);
		System.out.println("第二次状态改变: 10");
		subject.setState(10);
	}

}
