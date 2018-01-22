package binaryadder;

public class BinaryAdder {
    public static void main(String[] args) {
        String binary1 = "11101011";
        String binary2 = "11010100";
        
        int character = 7;
        char B1, B2;
        char rem = '0';
        
        char[] B3 = new char[8];
        B3[0] = '0';
        B3[1] = '0';
        B3[2] = '0';
        B3[3] = '0';
        B3[4] = '0';
        B3[5] = '0';
        B3[6] = '0';
        B3[7] = '0';
             
        while (character >= 0) {
            B1 = binary1.charAt(character);
            B2 = binary2.charAt(character);
            if (B1 == '0' & B2 == '0' & rem == '0') {
                B3[character] = '0';
                rem = '0';
            }
            else if (B1 == '0' & B2 == '0' & rem == '1') {
                B3[character] = '1';
                rem = '0';
            }
            else if (B1 == '0' & B2 == '1' & rem == '0') {
                B3[character] = '1';
                rem = '0';
            }
            else if (B1 == '0' & B2 == '1' & rem == '1') {
                B3[character] = '0';
                rem = '1';
            }
            else if (B1 == '1' & B2 == '0' & rem == '0') {
                B3[character] = '1';
                rem = '0';
            }
            else if (B1 == '1' & B2 == '0' & rem == '1') {
                B3[character] = '0';
                rem = '1';
            }
            else if (B1 == '1' & B2 == '1' & rem == '0') {
                B3[character] = '0';
                rem = '1';
            }
            else if (B1 == '1' & B2 == '1' & rem == '1') {
                B3[character] = '1';
                rem = '1';
            }
            else {
                rem = 'E';
                break;
            }
            character = character - 1;
        }
        
        switch (rem) {
            case '0':
                System.out.println(binary1 + " + " + binary2 + " = " + B3[0] + B3[1] + B3[2] + B3[3] + B3[4] + B3[5] + B3[6] + B3[7]);
                break;
            case '1':
                System.out.println(binary1 + " + " + binary2 + " = " + rem + B3[0] + B3[1] + B3[2] + B3[3] + B3[4] + B3[5] + B3[6] + B3[7]);
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
}