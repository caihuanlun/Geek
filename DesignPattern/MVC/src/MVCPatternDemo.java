import com.allen.controller.StudentController;
import com.allen.model.Student;
import com.allen.view.StudentView;

public class MVCPatternDemo {

	public static void main(String[] args) {

	      //从数据可获取学生记录
	      Student model  = retriveStudentFromDatabase();

	      //创建一个视图：把学生详细信息输出到控制台
	      StudentView view = new StudentView();

	      StudentController controller = new StudentController(model, view);

	      controller.updateView();

	      //更新模型数据
	      controller.setStudentName("小明");

	      controller.updateView();
	   }

	   private static Student retriveStudentFromDatabase(){
	      Student student = new Student();
	      student.setName("小刚");
	      student.setRollNo("10");
	      return student;
	   }
}
