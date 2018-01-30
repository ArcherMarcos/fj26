package br.com.caelum.notasfiscais.listener;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

public class CicloDeVidaListener implements PhaseListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3763189288001459870L;

	@Override
	public void afterPhase(PhaseEvent event) {
		System.out.println("Depois da fase: "+event.getPhaseId());

	}

	@Override
	public void beforePhase(PhaseEvent event) {
		System.out.println("Antes da fase: "+event.getPhaseId());
		// TODO Auto-generated method stub

	}

	@Override
	public PhaseId getPhaseId() {
		return PhaseId.ANY_PHASE;
	}

}
