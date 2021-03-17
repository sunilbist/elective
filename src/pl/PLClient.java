package pl;

import java.rmi.Naming;

public class PLClient {
	public static void main(String[] args) {
		try {
			PLInterface inf = (PLInterface)Naming.lookup("localhost/pl");
			double res = inf.findPL(400, 820);
			if(res>0) {
				System.out.println("Profit: "+res);
			}else {
				System.out.println("Loss: "+Math.abs(res));
			}

		} catch (Exception e) {
			System.out.println("Client Error: "+e.getMessage());
		}
	}
}
