package testLayer;

public class Jan3 {

	public static void main(String[] args) {
		
		String a="AAh hgdsFD GsS";
		int lower=0;
		int upper=0;
		for(int i=0;i<=a.length();i++) {
			if(Character.isUpperCase(i))
					{
				upper++;
				
			}
			else {
				lower++;
			}
			
		}
		System.out.println(lower);
		System.out.println(upper);

	}

}
