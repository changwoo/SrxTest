package com.github.spellcheck_ko.srxtest;

import net.loomchild.segment.srx.SrxDocument;
import java.util.List;

/**
 * Hello world!
 *j
 */
public class App 
{
    public static void main( String[] args )
    {
	String sentence = "언젠 간 가겠지, 푸르른 이 청춘. 지고 또 피는 꽃잎처럼 닭밝은 밤이면 창가에 흐르는 내 젊은 연가가 구슬퍼. 가고없는 날들을 잡으려 잡으려... 빈 손짓에 슬퍼지면 차라리 보내야지 돌아서야지. 그렇게 세월은 가는거야.";
	String langCode = "ko";
	SrxDocument srxDoc = SrxTools.createSrxDocument("segment.srx");
	List<String> tokens = SrxTools.tokenize(sentence, srxDoc, langCode);

	for (String s: tokens) {
	    System.out.println(s);
	}
    }
}
