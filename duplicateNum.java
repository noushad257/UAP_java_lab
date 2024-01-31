public class duplicateNum  {
    public static void main(String[] args) {
        int [] numbers = new int [] {9, 4, 3, 1, 6, 4, 19, 19};
        for(int i = 0; i < numbers.length; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                if(numbers[i] == numbers[j]) {
                    System.out.println(numbers[i]);
                }
            }
        }
    }
}

