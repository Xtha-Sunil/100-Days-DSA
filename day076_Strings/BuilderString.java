public class BuilderString {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Sunil");
        sb.append(0);
        sb.append(false);
        
        System.out.println(sb.charAt(0));
        System.out.println(sb.capacity());
        System.out.println(sb.subSequence(0, 4));
        System.out.println(sb.substring(4));
        System.out.println(sb.toString());

        // reverse the original
        sb.reverse();
    }
}
