import com.allen.controller.StudentController;
import com.allen.model.Student;
import com.allen.view.StudentView;

public class MVCPatternDemo {

	public static void main(String[] args) {

	      //�����ݿɻ�ȡѧ����¼
	      Student model  = retriveStudentFromDatabase();

	      //����һ����ͼ����ѧ����ϸ��Ϣ���������̨
	      StudentView view = new StudentView();

	      StudentController controller = new StudentController(model, view);

	      controller.updateView();

	      //����ģ������
	      controller.setStudentName("С��");

	      controller.updateView();
	   }

	   private static Student retriveStudentFromDatabase(){
	      Student student = new Student();
	      student.setName("С��");
	      student.setRollNo("10");
	      return student;
	   }
}
