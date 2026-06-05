class Main {
    public static void main(String[] args) {
        String str = "Java is very easy";
        String[] words = str.trim().split("\\s+");

        System.out.println("Word count: " + words.length);
    }
}