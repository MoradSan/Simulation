package com.evenement;

import com.model.TypeEvtTraite;

public class Debut extends Evenement {
	
	public Debut(TypeEvtTraite evt)
	{
		this.typeEvt=evt;
	}
	public static void executer()
	{
		b=0;
		q=0;
		hs=0;
		aire_B=(float) 0;
		aire_Q=(float) 0;
		ArriveeClient.executer();
	}

}
