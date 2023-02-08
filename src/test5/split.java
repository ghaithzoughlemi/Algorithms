package test5;

public class split {

	public static void main(String args[]) {
		double longitude = 0;
		double latitude = 0;
		double lon1 = 3.879483;
		double lat1 = 43.608177;

		String s1 = "java;string;split;method;3214,36;1232,34";
		String[] words = s1.split(";");

		String lon = words[4].replace(',', '.');
		String lat = words[5].replace(',', '.');


		longitude = Double.parseDouble(lon);
		latitude = Double.parseDouble(lat);

		//double theta = lon1 - longitude;

		//double dist = Math.sin(deg2rad(lat1)) * Math.sin(deg2rad(latitude))
				//+ Math.cos(deg2rad(lat1)) * Math.cos(deg2rad(latitude)) * Math.cos(deg2rad(theta));

		double x = (deg2rad(lon1) - deg2rad(longitude)) * Math.cos((deg2rad(lat1) + deg2rad(latitude)) / 2);
		double y = (deg2rad(lat1) - deg2rad(latitude));
		double distance = (Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2))) * 6371;

		//System.out.println("dist: " + dist);
		System.out.println("distance: " + distance);
		System.out.println("longitude: " + longitude);
		System.out.println("latitude: " + latitude);
	}

	private static double rad2deg(double rad) {
		return (rad * 180.0 / Math.PI);
	}

	private static double deg2rad(double deg) {
		return (deg * Math.PI / 180.0);
	}
}
