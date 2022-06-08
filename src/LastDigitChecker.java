public class LastDigitChecker {
    public static boolean hasSameLastDigit(int one, int two, int three){
        if (!isValid(one) || !isValid(two) || !isValid(three)){
            return false;
        }
        else{
            int first = one % 10;
            int second = two % 10;
            int third = three % 10;
            if (first == second || first == third || second == third){
                return true;
            }
            else{
                return false;
            }
        }
    }

    public static boolean isValid(int number){
        if (number < 10 || number > 1000){
            return false;
        }
        else{
            return true;
        }
    }
}
