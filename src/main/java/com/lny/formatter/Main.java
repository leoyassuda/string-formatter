package com.lny.formatter;

import com.lny.formatter.text.Formatter;
import com.lny.formatter.text.StringFormatter;

public class Main {

    private static final String DEFAULT_INPUT_TEXT = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce " +
            "tristique, nunc eget tincidunt dapibus, mauris metus accumsan ante, non vehicula lectus elit at neque. Nunc " +
            "sodales felis non auctor finibus. Donec id tellus nec massa varius consectetur. Sed pretium rutrum facilisis. " +
            "Phasellus fringilla mollis dolor quis sagittis. Proin efficitur tincidunt metus id lobortis. In scelerisque " +
            "lobortis dolor ut faucibus. Nulla pharetra, nulla id lacinia auctor, enim ex placerat metus, in gravida turpis " +
            "turpis nec libero. Mauris vestibulum est tellus, a rhoncus ante faucibus in. Ut sit amet justo ut nisi fermentum " +
            "dapibus. Curabitur fermentum convallis porta. Nam at iaculis tortor, ac rutrum lectus.";

    private static final Integer DEFAULT_LIMIT = 40;
    private static final Boolean DEFAULT_JUSTIFY = true;

    public static void main(String[] args) {
        String text = DEFAULT_INPUT_TEXT;
        Integer limit = DEFAULT_LIMIT;
        Boolean justify = DEFAULT_JUSTIFY;
        switch (args.length) {
            case 1:
                text = args[0];
                break;
            case 2:
                text = args[0];
                limit = Integer.parseInt(args[1]);
                break;
            case 3:
                text = args[0];
                limit = Integer.parseInt(args[1]);
                justify = Boolean.parseBoolean(args[2]);
                break;
        }

        // Print input data
        System.out.println("Inputs: ");
        System.out.println("Text: " + text);
        System.out.println("Limit: " + limit);
        System.out.println("Should justify: " + justify);
        System.out.println("=========================");

        final StringFormatter sf = new Formatter();
        String outputText = sf.format(text, limit, justify);

        // Print output text
        System.out.println("Output: ");
        System.out.println(outputText);

        System.out.println("=========================");
        System.out.println("And justify: " + false);
        System.out.println("=========================");
        outputText = sf.format(text, limit, false);

        // Print output text
        System.out.println("Output: ");
        System.out.println(outputText);
    }
}
