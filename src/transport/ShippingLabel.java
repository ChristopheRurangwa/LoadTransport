package transport;

public class ShippingLabel {
	private static int [] arr= {890,10,21,32,43,
				                54,65,76,87,99};
	
	private static char [] chara= {'A','B','C','D','E','F','G','H','I','J','K','L','M',
								   'N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	

	static int arrRand;
	
	
	public static void labelGenerator() {
		
		arrRand=(int) (Math.random()*arr.length-1)+0;
		
		
		for(int i=0;i<arr.length-1;i++) {
			try {
				if(i%2==0 && arr.length-1<10) {
					
				System.out.print(" "+arr[(i+arrRand)]+"-");
				
				System.out.print(chara[i+arrRand]);}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(" ");
			}
			
		}
		System.out.println("\n");
		System.out.println(" |:|:|;|:|.|");
		System.out.println(" |;|;|0|;|'|");
		System.out.println(" |:|:|;|:|:|");
		
		System.out.println("\nSCAN THE BARCORD ABOVE.");
	}
	

}
