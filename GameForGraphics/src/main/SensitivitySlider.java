package main;

import java.awt.Dimension;

import javax.media.opengl.awt.GLCanvas;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import com.jogamp.opengl.util.FPSAnimator;

class SensitivitySlider {
	static float newValue = 1;
	private static JLabel valueLabel;
	private static float currentValue;
	private JPanel jp;
	private JFrame frame;
	private GLCanvas canvas;
	private Game game;

	public SensitivitySlider(final Game game,GLCanvas canvas) {
		this.canvas = canvas;
		this.game = game;
		final JSlider hSlider = new JSlider();
		hSlider.setPaintTicks(true);
		hSlider.setMaximum(150);
		hSlider.setMinimum(50);
		hSlider.setMajorTickSpacing(25);
		hSlider.setMinorTickSpacing(10);
		hSlider.setPaintLabels(true);
		hSlider.setValue(100);
		currentValue = hSlider.getValue() / 100;

		valueLabel = new JLabel("Sensitivity: " + currentValue);
		hSlider.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				newValue = ((float) hSlider.getValue() / 100);
				currentValue = (float) newValue;
				valueLabel.setText("Sensitivity: " + currentValue);
				game.getLookBehavior().setSensitivity(currentValue);
			}
		});
		jp = new JPanel();
		jp.setPreferredSize(new Dimension(300, 50));
		jp.add(valueLabel);
		jp.add(hSlider);
		frame = new JFrame();
		frame.setTitle("Adjust Mouse Sensitivity");
		// frame.getContentPane().add(sensitivity);
		frame.getContentPane().add(jp);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(false);
		(new FPSAnimator(canvas, 5)).start();
	}

	public void setVisible(boolean answer) {
		frame.setVisible(answer);
		jp.setOpaque(answer);
		jp.setVisible(answer);
	}
}