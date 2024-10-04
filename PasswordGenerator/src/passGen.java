import java.util.Random;

class passGen {
    public String Generate(int length, String password) {
        Random random = new Random();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(password.length());
            char randomChar = password.charAt(randomIndex);
            result.append(randomChar);
        }
        return result.toString();
    }
}
