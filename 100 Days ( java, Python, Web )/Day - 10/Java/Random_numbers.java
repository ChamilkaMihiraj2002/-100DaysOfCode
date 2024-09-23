public record Random_numbers() {
    public static void main(String[] args) {
        int min = 1;  // Minimum value
        int max = 100; // Maximum value

        for (int i = min; i < max; i++) {
            int randomInt = (int) (Math.random() * (max - min + 1) + min);
            if ((randomInt % 5 == 0) && (randomInt % 7 == 0)) {
                break;
            } else {
                System.out.println("Index : "+ i + " Number : " + randomInt);
            }
        }
    }
}
