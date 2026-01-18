public class Variables {
    public static void main(String[] args) {
        // Variable names: use camelCase (ex: favoriteFood)
        // must start with a letter, use letters/numbers/_/$, no spaces, no keyword.
        // case matters with variables: (age) (Age)

        // Primitive types:
        int x = 5; // int: whole number
        System.out.println(x); 

        double number = 5; // double: number with a decimal
        System.out.println(number);

        boolean isFun = true; // boolean: true or false
        System.out.println(isFun);

        // integer which is 64 bits. can represent more numbers (2^64 - 1 to 2^64).
        long y = 14294967296;

        // Java uses double quoets for Strings and single quotes for chars.
        char c = 'A';
        System.out.println(c);

        // String is capitalized because string is not a primtive type.
        String favoriteFood = "pizza";
        System.out.println(favoriteFood);

        // Error: single quotes are for char, not String
        // System.out.println('I love dogs!');

        // Printing multiple values by concatenating with +
        System.out.println(4.21 + " dogs " + 18);

        // You can change a variable (reassign)
        x = 10;
        System.out.println(x);
    }
}