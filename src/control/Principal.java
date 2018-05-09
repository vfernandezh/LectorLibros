package control;

import java.awt.EventQueue;

import javax.swing.UIManager;

import vista.LectorUIEjemplo;

public class Principal {
		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			try
			{
				UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			}
			catch (Exception e1)
			{
				e1.printStackTrace();
			}
			
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try
					{
						LectorBridge frame = new LectorBridge();
						frame.setVisible(true);
					}
					catch (Exception e)
					{
						e.printStackTrace();
					}
				}
			});
		}

	}
