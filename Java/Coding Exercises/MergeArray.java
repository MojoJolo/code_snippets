import java.util.ArrayList;

class MergeArray {
	public MergeArray(String[] array1, String[] array2) {
		ArrayList<String> family = new ArrayList<String>();

		for(String arr : array1)
			family.add(arr);

		for(String arr : array2)
			family.add(arr);

		for(String member : family)
			System.out.println(member);
	}

	public static void main(String[] args) {
		String[] kids = {"Jolo", "Roni", "Macoi"};
		String[] parents = {"Sam", "Vivian"};

		new MergeArray(kids, parents);
	}
}