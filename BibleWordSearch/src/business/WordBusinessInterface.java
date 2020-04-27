package business;

import javax.ejb.Local;

import Bean.Word;

@Local
public interface WordBusinessInterface {

	
	public void getWord(Word word);
}