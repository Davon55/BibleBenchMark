package Controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import Bean.Word;

import business.WordBusinessInterface;


@ManagedBean
@ViewScoped
public class FormController {
	
	@Inject
	WordBusinessInterface service;
	public String onSubmit(Word word)
	{

		
		//Call Business Service (for testing only and demo to CDI)
		
		
		
		
		//Forward to Test Response View along with the User Managed Bean
		FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("word", word);
		return "FoundWord.xhtml";
		
	}
	
	public WordBusinessInterface getService()
	{
		return service;
	}

}
