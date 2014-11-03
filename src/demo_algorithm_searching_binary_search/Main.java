package demo_algorithm_searching_binary_search;

public class Main {

	public static void main(String[] args) {
		int key = 10;
		int[] arr = { 1, 2, 4, 5, 6, 6, 6, 7, 10, 123, 232, };
		int pos = Main.binarySearch(arr, key);
		if (pos > 0) {
			System.out.println("查找完成，关键字位置是：" + pos);
		} else {
			System.out.println("关键字不存在");
		}
	}

	/**
	 * 折半查找 Binary Search
	 * 
	 * @param arr 查找整型数组
	 * @param key 查找关键字
	 * @return
	 */
	public static int binarySearch(int[] arr, int key) {
		int n = arr.length;
		int low, high, mid;
		low = 0;
		high = n - 1;
		while (low <= high) {
			mid = (low + high) / 2;
			if (arr[mid] == key) {
				return mid;
			} else if (arr[mid] > key) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return -1;
	}

}
