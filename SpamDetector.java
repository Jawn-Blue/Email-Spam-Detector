package question26;

public class SpamDetector {



	public static void main(String[] args) {

		final String[] keyWords = {"amazon", "official", "bank", "security", "urgent", "alert", "important", "information", "ebay",
				"password", "credit", "verify", "confirm", "account", "bill", "immediately", "address", "telephone", "charity", "check",
				"secure", "personal", "confidential", "warning", "fraud", "citibank", "paypal"};

		FileInput fi = new FileInput();
		String[] contents = fi.emailContents();

		int totalCount = 0;

		for(int h = 0; h < contents.length; h++) {

			for(int i = 0; i < keyWords.length; i++) {

				if(contents[h].toString().equalsIgnoreCase(keyWords[i])) {
					totalCount++;

				}

			}

		}

		System.out.println("The total counts for commonly found words is " + totalCount);

	}

}
