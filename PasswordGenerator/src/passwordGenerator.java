import java.util.*;

class passwordGenerator {
    public static void main(String[] args) {
        passType pass = new passType();
        Scanner sc=new Scanner(System.in);
        System.out.print("Choose a length of password : ");
        int length=sc.nextInt();
        System.out.println("\nMenu : \n");
        System.out.println("1. Alphabets only");
        System.out.println("2. Alphabets and numbers");
        System.out.println("3. Alphabets, numbers and special characters");
        System.out.println("4. Alphabets, numbers, special characters and capitals\n");
        System.out.print("Enter your choice : ");
        int type=sc.nextInt();
        StringBuilder password = new StringBuilder();
        switch (type) {
            case 1:
                password.append(pass.alphabet);
                break;
            case 2:
                password.append(pass.alphabet).append(pass.numbers);
                break;
            case 3:
                password.append(pass.alphabet).append(pass.numbers).append(pass.special);
                break;
            case 4:
                password.append(pass.alphabet).append(pass.numbers).append(pass.special).append(pass.capitals);
                break;
            default:
                System.out.println("Invalid type selected.");
                sc.close();
                return;
        }
        passGen gen = new passGen();
        System.out.println("\nGenerated password: \t\t" + gen.Generate(length, password.toString()) +'\n');

        sc.close();
    }
}
