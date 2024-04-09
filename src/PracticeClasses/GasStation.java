package PracticeClasses;

public class GasStation {

	public int findStartPoint(int gas[], int cost[]) {
		int startPos = -1;
		int found = -1;
        int start = -1;
		for(int i=0;i<gas.length;i++) {
			if(gas[i]>=cost[i]) {
				//Start Traversal
				start = i;
				System.out.println(startPos);
				int currPos = i;
				int gasLeft = gas[i];
				while(gasLeft > 0) {
					gasLeft -= cost[currPos];
					if(gasLeft>=0) {
						if(currPos+1 == gas.length){
							currPos = 0;
						}
						else
							currPos = currPos+1;
						gasLeft+=gas[currPos];
						System.out.println(gasLeft+" "+currPos);
					}
					if(currPos == start) {
						found = 1;
						break;
					}
				}
			}
			System.out.println(found);
			if(found == 1){
                startPos = start;
				break;
            }
		}
		return startPos;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int gas[]  = {2};
		int cost[] = {2};
		
		GasStation obj = new GasStation();
		System.out.println("Start Point is : " + obj.findStartPoint(gas, cost));
	}

}
