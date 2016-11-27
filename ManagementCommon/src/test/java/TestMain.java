import com.reilem.management.common.classes.User;
import com.reilem.management.common.classes.UserInfo;

public class TestMain {

	public static void main(String[] args) {
		User u = new User();
		UserInfo ui = new UserInfo();
		
		ui.setCity("Berlin");
		ui.setCountry("Germany");
		
		System.out.println(ui.getJsonString());
	}

}
