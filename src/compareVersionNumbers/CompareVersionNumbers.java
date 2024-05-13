package compareVersionNumbers;

public class CompareVersionNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(compareVersion("1.0", "1.0.1"));
	}
	
	public static int compareVersion(String version1, String version2) {
		String current1 = "";
		String current2 = "";
		
		String current_1 = "-";
		String current_2 = "-";
		
		while (version1.length() > 0 && version2.length() > 0) {
			//Trim preceding dots
			if (version1.indexOf('.') == 0 || version2.indexOf('.') == 0) {
				if (version1.indexOf('.') == 0) {
					version1 = version1.substring(1);
				}
				if (version2.indexOf('.') == 0) {
					version2 = version2.substring(1);
				}
				continue;
			}
			
			//Trim zeroes
			if (version1.indexOf('0') == 0 || version2.indexOf('0') == 0) {
				if (version1.indexOf('0') == 0) {
					version1 = version1.substring(1);
				}
				if (version2.indexOf('0') == 0) {
					version2 = version2.substring(1);
				}
				continue;
			}
			
			current_1 = version1.substring(0, 1);
			current_2 = version2.substring(0, 1);
			
			
			if (Integer.parseInt(current_1.substring(0, 1)) > Integer.parseInt(current_2.substring(0, 1))) {
				return 1;
			} else if (Integer.parseInt(current_2.substring(0, 1)) > Integer.parseInt(current_1.substring(0, 1))) {
				return -1;
			}
			
			version1 = version1.substring(1);
			version2 = version2.substring(1);
		}
		
		//Remove all dots and zeroes
		while (version1.indexOf('.') == 0 || version2.indexOf('.') == 0) {
			if (version1.indexOf('.') == 0 || version2.indexOf('.') == 0) {
				if (version1.indexOf('.') == 0) {
					version1 = version1.substring(1);
				}
				if (version2.indexOf('.') == 0) {
					version2 = version2.substring(1);
				}
				continue;
			}
			
			if (version1.indexOf('0') == 0 || version2.indexOf('0') == 0) {
				if (version1.indexOf('0') == 0) {
					version1 = version1.substring(1);
				}
				if (version2.indexOf('0') == 0) {
					version2 = version2.substring(1);
				}
				continue;
			}
		}
		
		if (version1.equals("") && version2.length() > 0) {
			return 1;
		}
		
		if (version2.equals("") && version1.length() > 0) {
			return -1;
		}
		
		if (Integer.parseInt(version1) > Integer.parseInt(version2)) {
			return 1;
		} else if (Integer.parseInt(version1) < Integer.parseInt(version2)) {
			return -1;
		}
		
		return 0;
    }
}