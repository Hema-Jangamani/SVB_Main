import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.brillio.dbdriver.DBManager;

public class GetBusinessAction {

	private String str;
	private List<String> list;
	DBManager DBObject = new DBManager("struts","root","root");

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public String restaurents() throws ClassNotFoundException, SQLException {

		
		list = DBObject.getAll("restaurents");
		System.out.println(list);
		return "success";
	}

	public String hospitals() throws ClassNotFoundException, SQLException {
		
		list = DBObject.getAll("hospitals");
		System.out.println(list);
		return "success";
	}

	public String movieTheaters() throws ClassNotFoundException, SQLException {

		list = DBObject.getAll("theaters");
		System.out.println(list);
		return "success";
	}

}
