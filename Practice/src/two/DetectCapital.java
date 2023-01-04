package two;

public class DetectCapital {

	private static boolean findCapital(String str) {
		char[] arr= str.toCharArray();
		for (int i = 0; i < arr.length; i++) {

			if (!Character.isUpperCase(arr[i])) {// as soon as one char is lowercase return false
				return false;
			}
		}
        return true;
    }
}
/* best solution 
boolean firstUpperCase = Character.isUpperCase(word.charAt(0));
boolean allUpperCase = false;
for (int i = 1; i < word.length(); i++) {
  if (Character.isUpperCase(word.charAt(i))) {
    if (!firstUpperCase) {
      return false;
    }
    if (i == 1) {
      allUpperCase = true;
    } else {
      if (!allUpperCase) {
        return false;
      }
    }
  } else {
    if (allUpperCase) {
      return false;
    }
  }
}
return true;
}
}*/