package p11;

public class practice {
//indexof 에대한 설명
	int[] nums = new int[0];

	public boolean add(int num) {
		int len = nums.length;
		int[] copy_num = new int[len + 1];
		for (int i = 0; i < nums.length; i++) {
			copy_num[i] = nums[i];
		}
		copy_num[len] = num;
		nums = copy_num;
		return true;
	}

	public int indexOf(int num) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == num) {
				return i;
			}
		}
		return -1;
	}

	 public int size() {
		return nums.length;
	}

	public static void main(String[] args) {
		practice le = new practice();
		for (int i = 0; i < 10; i++) {
			le.add(i);
		}
		System.out.println(le.indexOf(3));
		System.out.println(le.indexOf(2));
		System.out.println(le.indexOf(11));
	}
}
