import java.rmi.Naming;

public class SimpleInterestClient {
	public static void main(String[] args) {
		try {
			SimpleInterestInterface inf = (SimpleInterestInterface)Naming.lookup("192.168.20.202/interest");
			double res = inf.calculate(59000.0, 17, 0.74);
			
			System.out.println(res);

		} catch (Exception e) {
			System.out.println("Client Error: "+e.getMessage());
		}
	}
}
