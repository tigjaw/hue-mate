package view;

import controller.CMController;

public class CMView {
	private CMController controller;

	public CMView(CMController controller) {
		this.setController(controller);
	}

	public CMController getController() {
		return controller;
	}

	public void setController(CMController controller) {
		this.controller = controller;
	}

}