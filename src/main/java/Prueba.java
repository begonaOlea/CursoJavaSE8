import java.sql.SQLException;

public class Prueba {

	public static void main(String[] args) {
		try {
			String[] arr = new String[4];

			//throw new SQLException();
//			arr[1] = "Unix2";
//			arr[2] = "Unix2";
//			arr[3] = "Unix2";
//			for (String var : arr) {
//				System.out.print(var.trim()); // NullPointerException
//			}
			
			//ii   0    1   2
			//ii 0  jj  3   2   1    --> 0
			//ii 1  jj  3   2        --> 1
			//ii 2  jj  3            --> 1
			
			for (int ii = 0; ii < 3; ii++) {
				int count = 0;
				for (int jj = 3; jj > 0; jj-- ) { 
					if (ii == jj) {++count; break; }
				} 
				System.out.print(count); continue; 
			}
			
			float ff = 1; //int
			
			Float ff2 = 1.0f;
			Integer ii = 1;
			
			
		} catch (Exception e) {
			System.out.print(e.getClass());
		}
	}
}
