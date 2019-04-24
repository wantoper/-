package ¶þ²æÊ÷ÅÅÐò;

import java.util.ArrayList;
import java.util.List;

public class Note {
	private Note leftNote;
	private Note rightNote;
	private Object valu;

	public void add(Object v) {
		if(valu == null)
			valu =v;
		
		else {
			
			if((Integer) v -((Integer)valu) <= 0) {
				if(leftNote == null) 
					leftNote = new Note();
					leftNote.add(v);
			}else {
				if(rightNote == null)
					rightNote = new Note();
				rightNote.add(v);	
			}
		}
	}
	public List<Object> print(){
		List<Object> vo = new ArrayList();
		if(leftNote != null) {
			vo.addAll(leftNote.print());
		}
		
		vo.add(valu);
		
		if(rightNote != null) {
			vo.addAll(rightNote.print());
		}
		return vo;
		
	}

}
