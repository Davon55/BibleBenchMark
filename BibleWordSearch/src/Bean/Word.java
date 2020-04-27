package Bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class Word {
	
	String wordSearch = "";
	
	
	//Default constructor
	public Word()
	{
		
		
	}
	
	public Word(String WordSearch)
	{
		this.wordSearch = WordSearch;
	}

	public String getWordSearch() {
		return wordSearch;
	}

	public void setWordSearch(String wordSearch) {
		this.wordSearch = wordSearch;
	}

}
