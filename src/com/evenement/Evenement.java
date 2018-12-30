package com.evenement;

import com.model.TypeEvtTraite;

public abstract class Evenement {
	static float hs;
	static float heureDebut;
	static TypeEvtTraite typeEvt;
	static int b;
	static int q;
	static float aire_B;
	static float aire_Q;
	
	
	
	/**
	 * @return the hs
	 */
	public static float getHs() {
		return hs;
	}
	/**
	 * @param hs the hs to set
	 */
	public static void setHs(float hs) {
		Evenement.hs = hs;
	}
	/**
	 * @return the heureDebut
	 */
	public static float getHeureDebut() {
		return heureDebut;
	}
	/**
	 * @param heureDebut the heureDebut to set
	 */
	public static void setHeureDebut(float heureDebut) {
		Evenement.heureDebut = heureDebut;
	}
	/**
	 * @return the typeEvt
	 */
	public static TypeEvtTraite getTypeEvt() {
		return typeEvt;
	}
	/**
	 * @param typeEvt the typeEvt to set
	 */
	public static void setTypeEvt(TypeEvtTraite typeEvt) {
		Evenement.typeEvt = typeEvt;
	}
	/**
	 * @return the b
	 */
	public static int getB() {
		return b;
	}
	/**
	 * @param b the b to set
	 */
	public static void setB(int b) {
		Evenement.b = b;
	}
	/**
	 * @return the q
	 */
	public static int getQ() {
		return q;
	}
	/**
	 * @param q the q to set
	 */
	public static void setQ(int q) {
		Evenement.q = q;
	}
	/**
	 * @return the aire_B
	 */
	public static float getAire_B() {
		return aire_B;
	}
	/**
	 * @param aire_B the aire_B to set
	 */
	public static void setAire_B(float aire_B) {
		Evenement.aire_B = aire_B;
	}
	/**
	 * @return the aire_Q
	 */
	public static float getAire_Q() {
		return aire_Q;
	}
	/**
	 * @param aire_Q the aire_Q to set
	 */
	public static void setAire_Q(float aire_Q) {
		Evenement.aire_Q = aire_Q;
	}
	
	
	

}
