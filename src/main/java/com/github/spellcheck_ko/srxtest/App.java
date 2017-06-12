package com.github.spellcheck_ko.srxtest;

import net.loomchild.segment.srx.SrxDocument;
import java.util.List;
import java.util.Scanner;
import java.lang.StringBuilder;
import java.io.IOException;

/**
 * Hello world!
 *j
 */
public class App 
{
    public static void main( String[] args )
    {
	String langCode = args[0];
	StringBuilder sb = new StringBuilder();

	Scanner scanner = new Scanner(System.in);
	if (scanner.hasNextLine()) {
	    sb.append(scanner.nextLine().trim());
	    while (scanner.hasNextLine()) {
		sb.append('\n');
		sb.append(scanner.nextLine().trim());
	    }
	}

	String sentence = sb.toString();

	SrxDocument srxDoc = SrxTools.createSrxDocument("segment.srx");
	List<String> tokens = SrxTools.tokenize(sentence, srxDoc, langCode);

	for (int i = 0; i < tokens.size(); ++i) {
	    System.out.println("S[" + i + "]: " + (tokens.get(i)));
	}
    }
}
