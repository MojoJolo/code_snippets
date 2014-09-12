public class StringCompress {
	public StringCompress() {
    String res = compress("aabcccccaaabcd");

    System.out.println(res);
	}

  public String compress(String word) {
    String comp = "";
    char curr = '\0';
    int currCounter = 0;

    for(int i = 0; i < word.length(); i++) {
      char currLetter = word.charAt(i);

      if(i == 0) {
        curr = currLetter;
        currCounter++;
      }
      else if(currLetter == curr) {
        currCounter++;
      }
      else if(currLetter != curr) {
        System.out.println(i);
        System.out.println(currLetter);
        comp = comp + curr + currCounter;
        curr = currLetter;
        currCounter = 1;
      }
    }

    comp = comp + curr + currCounter;

    if(comp.length() < word.length())
      return comp;
    else
      return word;
  }

	public static void main(String[] args) {
		new StringCompress();
	}
}