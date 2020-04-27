package business;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import Bean.Word;
import Data.DataAccessInterface;

@Stateless
@Local(WordBusinessInterface.class)
@LocalBean
public class WordBusinessService implements WordBusinessInterface {

	@EJB
	DataAccessInterface service;
	
	@Override
	public void getWord(Word word) {
		// TODO Auto-generated method stub
		service.findAll();
	}

}
