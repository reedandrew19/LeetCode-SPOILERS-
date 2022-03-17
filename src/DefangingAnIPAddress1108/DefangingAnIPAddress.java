package DefangingAnIPAddress1108;

public class DefangingAnIPAddress {
    public static String defangIPaddr(String address){
        return address.replaceAll("\\.", "[.]");
    }

    public static String defangIPaddrExpectedAnswer(String address){
        StringBuilder stringBuilder = new StringBuilder();

        for(char letter : address.toCharArray()){
            if(letter == '.'){
                stringBuilder.append("[.]");
            }else{
                stringBuilder.append(letter);
            }
        }

        return stringBuilder.toString();
    }

    public static String defangIPaddrCleaner(String address){
        StringBuilder stringBuilder = new StringBuilder();

        for(char letter : address.toCharArray()){
            stringBuilder.append(letter == '.' ? "[.]" : letter);
        }

        return stringBuilder.toString();
    }
}
