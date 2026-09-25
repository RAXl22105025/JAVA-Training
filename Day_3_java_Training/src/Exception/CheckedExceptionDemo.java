package Exception;
import java.sq1.*;
class TestConnection
{
	private Connection cn=null;
	public Connection getConn() {
		try {
		Class.forName("com.cj.mysq1");
		}
		catch(ClassNotFoundException ce)
		{
			ce.printStackTrace();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
}
public class CheckedExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
