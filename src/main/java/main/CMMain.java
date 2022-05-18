package main;

import javax.swing.SwingUtilities;

import controller.CMController;
import view.CMView;

public class CMMain implements Runnable {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new CMMain());
	}

	public void run() {
		new CMView(new CMController());
	}
}