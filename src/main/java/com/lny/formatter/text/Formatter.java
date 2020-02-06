package com.lny.formatter.text;

import java.util.ArrayList;
import java.util.List;

public class Formatter extends StringFormatter {

    @Override
    public String format(String text, Integer limit, Boolean justify) {
        StringBuilder formattedString = new StringBuilder();

        String[] lines = text.split("(\\s)(\\n)");

        List<String> stringList = new ArrayList<>();

        for (String line : lines) {
            if (!stringList.isEmpty()) {
                stringList.add("\n");
            }
            String[] stringArrayToFormat = line.split("(\\s)");

            for (String stringWord : stringArrayToFormat) {
                if (stringWord.length() + formattedString.toString().length() <= (limit != null ? limit : this.limit)) {
                    formattedString.append(stringWord).append(" ");
                } else {
                    formattedString.deleteCharAt(formattedString.lastIndexOf(" ")).append("\n");
                    stringList.add(formattedString.toString());
                    formattedString = new StringBuilder(stringWord).append(" ");
                }
            }
            formattedString.deleteCharAt(formattedString.lastIndexOf(" "));
            stringList.add(formattedString.append("\n").toString());
            formattedString = new StringBuilder();
        }

        if (justify) {
            formattedString = new StringBuilder();
            for (String s : stringList) {
                formattedString.append(this.justify(s, limit)).append("\n");
            }
        } else {
            formattedString = new StringBuilder();
            for (String s : stringList) {
                formattedString.append(s);
            }
        }

        return formattedString.toString();
    }

    /**
     * Justify all the text.
     *
     * @param text      a {@link String} to be justified.
     * @param limitLine a {@link Integer} to limit the line.
     * @return a {@link String} justified.
     */
    private String justify(String text, Integer limitLine) {
        String[] words = text.split("\\s");

        ArrayList<String> result = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();

        if (limitLine == 0 || words.length == 0) {
            result.add("");
        }
        int i = 0;
        while (i < words.length) {
            ArrayList<String> subResult = new ArrayList<>();
            int length = words[i].length();
            subResult.add(words[i]);
            int num = 1;

            while (i + 1 < words.length && (length + 1 + words[i + 1].length()) <= limitLine) {
                length += 1 + words[i + 1].length();
                subResult.add(words[i + 1]);
                i++;
                num++;
            }

            StringBuilder sb = new StringBuilder();
            if (num == 1) {
                int tempLength = limitLine - length;
                sb.append(subResult.get(0));
                while (tempLength > 0) {
                    sb.append(" ");
                    tempLength--;
                }
            } else {
                int space = (limitLine - length + num - 1) / (num - 1);
                int counter = 0;
                StringBuilder empty = new StringBuilder();
                while (space > 0) {
                    empty.append(" ");
                    space--;
                }
                int extra = (limitLine - length + num - 1) % (num - 1);
                while (counter < num - 1) {
                    sb.append(subResult.get(counter));
                    sb.append(empty);
                    if (extra > 0) {
                        sb.append(" ");
                        extra--;
                    }
                    counter++;
                }
                sb.append(subResult.get(counter));
            }
            result.add(sb.toString());
            stringBuilder.append(sb.toString());
            i++;
        }
        return stringBuilder.toString();
    }

}
