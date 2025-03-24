class Traffic{
	public static void main(String [] args){
		String  light = "Red";
		switch(light){
			case "Red" :
				System.out.println("Stop");
				break ;

			case "Green":
				System.out.println("coming signal");
				break;

			case "Yellow":
				System.out.println("no");
				break;

			default:
				System.out.println("No such color is present in traffic lights");
		}
	}
}


