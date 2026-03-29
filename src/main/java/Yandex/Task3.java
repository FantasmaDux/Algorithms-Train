package Yandex;

public class Task3 {
    public static String getRebus(String s) {

        StringBuilder res = new StringBuilder("");

        String[] strs = s.split(" ");

        for (int i = 0; i < strs.length; i++) {

            int leftApos = 0;
            int rightApos = 0;

            for (int j = 0; j < strs[i].length(); j++) {
                if (strs[i].charAt(j) == '\'') {
                    leftApos++;
                } else {
                    break;
                }

            }


            for (int j = strs[i].length() - 1; j >= 0; j--) {
                if (strs[i].charAt(j) == '\'') {
                    rightApos++;
                } else {
                    break;
                }

            }

            String word = strs[i].substring(leftApos, strs[i].length()-rightApos);
            String partOfWord = word.substring(leftApos, word.length()-rightApos);



            res.append(partOfWord);
        }

        return res.toString();
    }
}
