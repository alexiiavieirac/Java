package projects.java.introduction;

public class TwoArrays {
    public static void main(String[] args) {
        String [] names = new String[3];

        names[0] = "Íris";
        names[1] = "Aléxia";
        names[2] = "Tamasiro Vieira";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        for (String texts : names) {
            System.out.println(texts);
        }
    }
}
