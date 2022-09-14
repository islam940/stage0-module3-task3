package lang.print.gaps.task3;

public class ReassigningValues {
    public static void main(String[] args) {
        int first=1;
        int second=10;
        int third=100;
        System.out.println(first); //w
        System.out.println(second);
        System.out.println(third);

        first=15;
        second=16;
        third=4;

        int linkToFirst=first;
        int linkToSecond=second;
        int linkToThird=third;

        System.out.println(linkToFirst); //w
        System.out.println(linkToSecond);
        System.out.println(linkToThird);

    }
}
