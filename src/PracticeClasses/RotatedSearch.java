package PracticeClasses;

import java.util.*;

public class RotatedSearch {

	public int rotatedArraySearch(int arr[], int search) {
		int left = 0;
		int right = arr.length - 1;
		int pos = -1;
		System.out.println(left + " " + right);
		while(left <= right) {
			int mid = (left + right)/2;
			System.out.println(left + " " + right + " " + " " + mid);
			if(arr[mid] == search) {
				pos = mid;
				break;
			}
			
			if(search < arr[left]) {
				left = mid + 1;
			}else {
				right = mid - 1;
			}
		}
		return pos;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[] = {4,5,6,7,0,1,2};
		int search = 0;
		
		RotatedSearch obj = new RotatedSearch();
		System.out.println(obj.rotatedArraySearch(arr, search));
		
		
	}

}
