package main;

import info.monitorenter.gui.chart.Chart2D;
import info.monitorenter.gui.chart.ITrace2D;
import info.monitorenter.gui.chart.traces.Trace2DLtd;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.media.opengl.GLProfile;
import javax.media.opengl.awt.GLCanvas;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.OverlayLayout;
import javax.swing.SwingConstants;

import Movement.ControlBehavior;
import Weapons.Weapon;

import com.jogamp.opengl.util.FPSAnimator;

/**
 * This class creates the Frame which will surround the Game. It will include
 * health and ammo bars including a map and a help panel
 */
public class GameFrame extends JFrame implements BatObserver, PlayerObserver {
	private static final long serialVersionUID = -6804358469481071772L;

	private Game game;

	private Weapon currentWeapon;

	private List<CheatsObserver> cheatsObservers = new LinkedList<CheatsObserver>();
	private SensitivitySlider sensitivitySlider;

	private JMenuBar menuBar = new JMenuBar();
	private JMenuItem toggleAllPanels;
	private JMenuItem toggleRadar;
	private JMenuItem toggleMap;
	private JMenuItem toggleSensitivity;
	private JMenuItem toggleInverted;
	private JMenuItem toggleHelp;
	private JMenuItem toggleWeapon;
	private JMenuItem toggleHealth;
	private JMenuItem toggleBat;
	private JMenuItem easyDifficulty;
	private JMenuItem mediumDifficulty;
	private JMenuItem hardDifficulty;
	private JMenuItem toggleScene;
	private JMenuItem performance;
	private JMenuItem console;
	private JMenuItem panelColorChooser;
	private JMenuItem textColorChooser;
	private JMenuItem toggleCrossHair;

	private JPanel mainPanel = new JPanel();
	private JPanel healthPanel;
	private JPanel weaponPanel;
	private JPanel batPanel;
	private JPanel radarPanel;
	private JPanel helpPanel;
	private JPanel codePanel;
	private JPanel controlPanel;
	private JPanel rightPanel;

	private GameConsole consolePanel;
	private JPanel sensitivityPanel;

	private GLCanvas canvas;
	private GLCanvas gameCanvas;
	private JLabel[] bats;
	private JLabel[] bullets;
	private JLabel ammoLeft;
	private JLabel gun;
	private JLabel health;
	private JLabel sensitivity;
	private JProgressBar healthBar;
	private JDialog performanceDialog = null;
	private JDialog colorChooserDialog = null;
	private JColorChooser colorChooser;

	private JLabel framesPerSec;
	private JLabel maxFPS;
	private JLabel avgFPS;
	private int numFPSpoints;
	private int maxPoint;
	private int totalFPS;
	private ITrace2D frameGraph;
	private JTextField consoleInput;
	private JTextField consoleOutput;

	private Image image = null;
	private ImageIcon blankBat = null;
	private ImageIcon bat = null;
	private ImageIcon bullet = null;
	private ImageIcon blankBullet = null;
	private ImageIcon fistIcon = null;
	private ImageIcon exampleGun = null;
	private ImageIcon redHealth = null;
	private ImageIcon orangeHealth = null;
	private ImageIcon yellowHealth = null;
	private ImageIcon greenHealth = null;

	private JLabel A_key;
	private JLabel S_key;
	private JLabel W_key;
	private JLabel D_key;
	private JLabel E_key;
	private JLabel lessthan_key;
	private JLabel greaterthan_key;
	private JLabel LEFT_key;
	private JLabel UP_key;
	private JLabel DOWN_key;
	private JLabel RIGHT_key;
	private JLabel ONE_key;
	private JLabel NINE_key;
	private JLabel R_key;
	private JLabel spaceBar_key;
	private JLabel M_key;
	private JLabel C_key;
	private JLabel ESC_key;
	//private JLabel throughSpacer;

	private JLabel[] keys;

	private String a_text = "strafe left";
	private String s_text = "move back";
	private String w_text = "move forward";
	private String d_text = "strafe right";
	private String e_text = "enter/exit vehicles";
	private String lessthan_text = "move up";
	private String greaterthan_text = "move down";
	private String m_text = "mute sound";
	private String left_text = "look left";
	private String up_text = "look up";
	private String down_text = "look down";
	private String right_text = "look right";
	private String one_text = "weapon 1...";
	private String through_text = "through";
	private String nine_text = "weapon 9";
	private String c_text = "toggle console";
	private String esc_text = "exit game";
	private String r_text = "Reload";
	private String space_text = "Jump";

	private GridBagLayout layout = new GridBagLayout();
	private GridBagLayout mapLayout;
	private GridBagLayout batLayout;
	private GridBagLayout weaponLayout;
	private GridBagLayout healthLayout;
	private GridBagLayout performanceLayout;

	private int healthNum;
	private int originalHealth;
	private boolean changeable = true;

	private Color panelColor = null;
	private Color textColor = null;

	private String text_chooser_name = "Customize Text Color";
	private String panel_chooser_name = "Customize Panel Color";

	private String control_title = "Controls";
	private String code_title = "Cheats";

	private String ammo_code = "Unlimited Ammo";
	private String allWeapons_code = "All Weapons Unlocked";
	private String god_code = "God Mode";
	private String oneShot_code = "One Shot Kills";
	private String speed_code = "Run Faster";

	private JCheckBox ammo;
	private JCheckBox allWeapons;
	private JCheckBox god;
	private JCheckBox oneShot;
	private JCheckBox speed;

	private JCheckBox[] codes;

	private boolean healthOn = false;
	private boolean weaponOn = false;
	private boolean batOn = false;
	private boolean radarOn = false;
	private boolean helpOn = false;
	private boolean inverted = false;

	private boolean mapOn = false;
	private boolean sensitivityPanelOn = false;
	private boolean nightScene = false;
	private boolean consoleEnabled = false;
	private boolean crossHairOn = true;

	public GameFrame(Game game, GLCanvas canvas, String title) {
		this.game = game;
		gameCanvas = canvas;

		consolePanel = new GameConsole(game, canvas);
		setTitle(title);
		getContentPane().add(mainPanel);
		mainPanel.setLayout(layout);
		healthOn = true;
		weaponOn = true;
		batOn = true;
		radarOn = true;
		helpOn = true;

		init();
		pack();
		setPanelColor(Color.GRAY);
		setTextColor(Color.WHITE);
	}

	// want to be able to control where the canvas goes outside of the main
	// method
	public void addCanvas(GLCanvas canvas) {
		mainPanel.add(canvas);
		//mainPanel.add(consolePanel);
		GridBagConstraints gbc = new GridBagConstraints();

		gbc.anchor = GridBagConstraints.CENTER;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.insets = new Insets(0, 0, 0, 0);
		gbc.weighty = 2;
		gbc.weightx = 3;
		gbc.gridy = 1;
		gbc.gridx = 1;
		gbc.gridheight = 3;
		gbc.gridwidth = 2;

		layout.setConstraints(canvas, gbc);
		pack();
	}

	private void init() {
		initMenuBar();
		setJMenuBar(menuBar);

		try {
			image = ImageIO.read(FileHelper.getFileInputStream("bat_icon.png"));
			setIconImage(image);
			bat = new ImageIcon(image);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		healthPanel = new JPanel();
		weaponPanel = new JPanel();
		batPanel = new JPanel();
		radarPanel = new JPanel();
		helpPanel = new JPanel();
		rightPanel = new JPanel();
		sensitivityPanel = new JPanel();

		colorChooser = new JColorChooser();

		sensitivitySlider = new SensitivitySlider(game, canvas);
		enableHealthPanel(true);
		enableWeaponPanel(true);
		enableBatPanel(true);
		// enableRadarPanel(true);
		enableHelpPanel(true);

		mapLayout = new GridBagLayout();
		batLayout = new GridBagLayout();
		weaponLayout = new GridBagLayout();
		healthLayout = new GridBagLayout();
		performanceLayout = new GridBagLayout();
		
		setConstraints();
		getImages();
		getKeyLabels();
		setRadarPanel();
		setBatPanel();
		setWeaponPanel();
		setHealthPanel();
		setHelpPanel();

		setConsolePanel();

		setPerformanceDialog();
		setColorChooser();
	}

	private void initMenuBar() {
		initMenuItems();
		JMenu menu1 = new JMenu("Settings");
		JMenu submenu1 = new JMenu("Difficulty");
		submenu1.add(easyDifficulty);
		submenu1.add(mediumDifficulty);
		submenu1.add(hardDifficulty);

		// menu1.add(submenu1);
		menu1.add(toggleMap);
		menu1.addSeparator();
		menu1.add(toggleScene);
		menu1.addSeparator();
		menu1.add(toggleSensitivity);
		menu1.add(toggleInverted);
		menu1.addSeparator();
		menu1.add(toggleCrossHair);

		JMenu menu2 = new JMenu("Performance");
		menu2.add(performance);

		JMenu menu3 = new JMenu("Display");
		JMenu submenu2 = new JMenu("Customization");
		submenu2.add(panelColorChooser);
		submenu2.add(textColorChooser);

		JMenu menu4 = new JMenu("Console");
		menu4.add(console);

		JMenu submenu3 = new JMenu("Show/Hide Panels");
		submenu3.add(toggleHealth);
		submenu3.add(toggleWeapon);
		submenu3.add(toggleBat);
		submenu3.add(toggleRadar);
		submenu3.add(toggleHelp);

		menu3.add(submenu2);
		menu3.add(submenu3);
		menu3.addSeparator();
		menu3.add(toggleAllPanels);

		menuBar.add(menu1);
		menuBar.add(menu2);
		menuBar.add(menu3);
		menuBar.add(menu4);
	}

	// in this method we can set the listeners for the Menu Items
	private void initMenuItems() {
		toggleAllPanels = new JMenuItem("Hide all Panels");
		toggleAllPanels.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (healthOn || weaponOn || batOn || radarOn || helpOn) {
					enableAllPanels(false);
				} else {
					enableAllPanels(true);
				}
			}
		});
		toggleRadar = new JMenuItem("Hide Radar");
		toggleRadar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (radarOn) {
					enableRadarPanel(false);
				} else {
					enableRadarPanel(true);
				}
			}
		});
		toggleMap = new JMenuItem("Show Mini-Map");
		toggleMap.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (mapOn) {
					turnOnMap(false);
				} else {
					turnOnMap(true);
				}
			}
		});
		toggleSensitivity = new JMenuItem("Mouse Sensitivity");
		toggleSensitivity.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (sensitivityPanelOn) {
					enableSensitivityPanel(false);
				} else {
					enableSensitivityPanel(true);
				}
			}
		});
		toggleInverted = new JMenuItem("Invert Mouse Controls");
		toggleInverted.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (inverted) {
					invertMouse(false);
				} else
					invertMouse(true);
			}
		});

		toggleHelp = new JMenuItem("Hide Help");
		toggleHelp.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (helpOn) {
					enableHelpPanel(false);
				} else {
					enableHelpPanel(true);
				}
			}
		});
		toggleWeapon = new JMenuItem("Hide Weapon");
		toggleWeapon.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (weaponOn) {
					enableWeaponPanel(false);
				} else {
					enableWeaponPanel(true);
				}
			}
		});
		toggleHealth = new JMenuItem("Hide Health");
		toggleHealth.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (healthOn) {
					enableHealthPanel(false);
				} else {
					enableHealthPanel(true);
				}
			}
		});
		toggleBat = new JMenuItem("Hide Bat");
		toggleBat.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (batOn) {
					enableBatPanel(false);
				} else {
					enableBatPanel(true);
				}
			}
		});

		easyDifficulty = new JMenuItem("Easy");
		mediumDifficulty = new JMenuItem("Normal");
		hardDifficulty = new JMenuItem("Hard");

		toggleScene = new JMenuItem("Change Scene");
		toggleScene.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				nightScene = !nightScene;
				game.turnOnNightScene(nightScene);
			}
		});
		performance = new JMenuItem("View Performance");
		performance.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				performanceDialog.setVisible(true);
			}
		});
		console = new JMenuItem("Show Console");
		console.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				consoleEnabled = !consoleEnabled;
				if (!consoleEnabled) {
					console.setText("Show Console");
				} else {
					console.setText("Hide Console");
				}
				enableConsole();
			}
		});
		panelColorChooser = new JMenuItem("Set Panel Color");
		panelColorChooser.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				colorChooserDialog.setTitle(panel_chooser_name);
				colorChooser.setColor(panelColor);
				colorChooserDialog.setVisible(true);
			}
		});
		textColorChooser = new JMenuItem("Set Text Color");
		textColorChooser.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				colorChooserDialog.setTitle(text_chooser_name);
				colorChooser.setColor(textColor);
				colorChooserDialog.setVisible(true);
			}
		});
		toggleCrossHair = new JMenuItem("Hide Crosshair");
		toggleCrossHair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				crossHairOn = !crossHairOn;
				game.getPlayer().turnOnCrossHair(crossHairOn);
				if (crossHairOn) {
					toggleCrossHair.setText("Hide Crosshair");
				} else {
					toggleCrossHair.setText("Show Crosshair");
				}
			}
		});
	}

	public void enableConsole() {
		if (!consoleEnabled) {
			consoleInput.setText("");
			consoleInput.setVisible(false);
			consoleOutput.setText("");
			consoleOutput.setVisible(false);
		} else {
			consoleInput.setText("");
			consoleInput.setVisible(true);
			consoleOutput.setText("");
			consoleOutput.setVisible(true);
		}
	}

	public void enableSensitivityPanel(Boolean isEnabled) {
		sensitivityPanelOn = isEnabled;
		sensitivitySlider.setVisible(isEnabled);
		if (!isEnabled) {
			toggleSensitivity.setText("Show Sensitivity Panel");
		} else {
			toggleSensitivity.setText("Hide Sensitivity Panel");
		}
		// checkIfAnyOn();
	}

	public void enableHealthPanel(boolean turnOn) {
		healthOn = turnOn;
		healthPanel.setOpaque(turnOn);
		healthPanel.setVisible(turnOn);
		if (!turnOn) {
			toggleHealth.setText("Show Health");
		} else {
			toggleHealth.setText("Hide Health");
		}
		checkIfAnyOn();
	}

	public void enableWeaponPanel(boolean turnOn) {
		weaponOn = turnOn;
		weaponPanel.setOpaque(turnOn);
		weaponPanel.setVisible(turnOn);
		if (!turnOn) {
			toggleWeapon.setText("Show Weapon");
		} else {
			toggleWeapon.setText("Hide Weapon");
		}
		checkIfAnyOn();
	}

	public void turnOnMap(boolean turnOn) {
		game.mapSetVisible(turnOn);
		mapOn = turnOn;
		if (!turnOn) {
			toggleMap.setText("Show Mini-Map");
		} else {
			toggleMap.setText("Hide Mini-Map");
		}
	}

	public void enableHelpPanel(boolean turnOn) {
		helpOn = turnOn;
		helpPanel.setOpaque(turnOn);
		helpPanel.setVisible(turnOn);
		if (!turnOn) {
			toggleHelp.setText("Show Help");
		} else {
			toggleHelp.setText("Hide Help");
		}
		if (!radarOn) {
			rightPanel.setOpaque(turnOn);
			rightPanel.setVisible(turnOn);
		}
		checkIfAnyOn();
	}

	public void enableRadarPanel(boolean turnOn) {
		radarOn = turnOn;
		radarPanel.setOpaque(turnOn);
		radarPanel.setVisible(turnOn);
		if (!turnOn) {
			toggleRadar.setText("Show Radar");
		} else {
			toggleRadar.setText("Hide Radar");
		}
		if (!helpOn) {
			rightPanel.setOpaque(turnOn);
			rightPanel.setVisible(turnOn);
		}
		checkIfAnyOn();
	}

	public void invertMouse(boolean inverted) {
		this.inverted = inverted;
		game.getLookBehavior().invert();
	}

	public void enableBatPanel(boolean turnOn) {
		batOn = turnOn;
		batPanel.setOpaque(turnOn);
		batPanel.setVisible(turnOn);
		if (!turnOn) {
			toggleBat.setText("Show Bat");
		} else {
			toggleBat.setText("Hide Bat");
		}
		checkIfAnyOn();
	}

	public void enableAllPanels(boolean turnOn) {
		enableHealthPanel(turnOn);
		enableWeaponPanel(turnOn);
		// turnOnMap(turnOn);
		enableRadarPanel(turnOn);
		enableHelpPanel(turnOn);
		enableBatPanel(turnOn);
	}

	private void checkIfAnyOn() {
		if (batOn || radarOn || helpOn || healthOn || weaponOn) {
			toggleAllPanels.setText("Hide All Panels");
		} else {
			toggleAllPanels.setText("Show All Panels");
		}
	}

	private void setConstraints() {
		GridBagConstraints gbc = new GridBagConstraints();

		gbc.anchor = GridBagConstraints.CENTER;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.insets = new Insets(0, 0, 0, 0);
		gbc.weighty = 1;
		gbc.weightx = 1;
		gbc.gridy = 4;
		gbc.gridx = 1;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;

		// healthPanel.add(lblhealth);
		mainPanel.add(healthPanel);
		
		gbc.weighty = 0;
		healthPanel.setBackground(Color.RED);
		layout.setConstraints(healthPanel, gbc);

		gbc.gridy = 5;
		gbc.gridx = 1;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbc.weighty = 0;
		// weaponPanel.add(lblweapon);
		mainPanel.add(weaponPanel);
		weaponPanel.setBackground(Color.BLUE);
		layout.setConstraints(weaponPanel, gbc);

		gbc.gridy = 4;
		gbc.gridx = 2;
		gbc.gridheight = 2;
		gbc.gridwidth = 1;
		mainPanel.add(batPanel);
		gbc.weighty = 0;
		batPanel.setBackground(Color.GREEN);
		layout.setConstraints(batPanel, gbc);

		rightPanel.setBackground(Color.BLUE);
		GridBagLayout temp = new GridBagLayout();
		rightPanel.setLayout(temp);
		gbc.anchor = GridBagConstraints.NORTH;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridy = 1;
		gbc.gridx = 1;
		gbc.gridheight = 3;
		gbc.gridwidth = 1;
		gbc.weighty = 1;
		rightPanel.add(helpPanel);
		helpPanel.setBackground(Color.CYAN);
		// helpPanel.add(lblhelp);
		temp.setConstraints(helpPanel, gbc);

		gbc.anchor = GridBagConstraints.SOUTH;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridy = 4;
		gbc.gridx = 1;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbc.weighty = 0;
		rightPanel.add(radarPanel);
		temp.setConstraints(radarPanel, gbc);
		gbc.anchor = GridBagConstraints.NORTH;
		gbc.fill = GridBagConstraints.VERTICAL;
		gbc.gridy = 1;
		gbc.gridx = 3;
		gbc.gridheight = 5;
		gbc.gridwidth = 1;
		gbc.weightx = 0;
		layout.setConstraints(rightPanel, gbc);
		mainPanel.add(rightPanel);

		/*
		 * gbc.anchor = GridBagConstraints.NORTH; gbc.fill =
		 * GridBagConstraints.BOTH; gbc.gridy = 1; gbc.gridx = 3; gbc.gridheight
		 * = 2; gbc.gridwidth = 1; helpPanel.setBackground(Color.CYAN);
		 * helpPanel.add(lblhelp); layout.setConstraints(helpPanel, gbc);
		 * mainPanel.add(helpPanel);
		 * 
		 * gbc.anchor = GridBagConstraints.SOUTH; gbc.fill =
		 * GridBagConstraints.HORIZONTAL; gbc.gridy = 2; gbc.gridx = 3;
		 * gbc.gridheight = 3; gbc.gridwidth = 1;
		 * layout.setConstraints(mapPanel, gbc); mainPanel.add(mapPanel);
		 */
	}

	private void setRadarPanel() {
		radarPanel.setLayout(mapLayout);
		radarPanel.setPreferredSize(new Dimension(125, 125));
		radarPanel.setBackground(Color.BLACK);
	}

	public void initRadarCanvas() {
		//GLProfile.initSingleton();
		canvas = new GLCanvas();
		canvas.addGLEventListener(new Radar(game.getOnlinePlayers(), game
				.getPlayer(), game.getBats(), game.getPowerups(), game
				.getTurrets(), game.getVehicles()));
		canvas.setPreferredSize(new Dimension(125, 125));
		radarPanel.add(canvas);

		GridBagConstraints gbc = new GridBagConstraints();

		gbc.anchor = GridBagConstraints.CENTER;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.insets = new Insets(0, 0, 0, 0);
		gbc.weighty = 1;
		gbc.weightx = 1;
		gbc.gridy = 1;
		gbc.gridx = 1;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;

		mapLayout.setConstraints(canvas, gbc);

		(new FPSAnimator(canvas, 5)).start();
		enableHelpPanel(false);
		enableHelpPanel(true);
		pack();
	}

	private void setBatPanel() {
		batPanel.setLayout(batLayout);

		bats = new JLabel[32];

		GridBagConstraints gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.fill = GridBagConstraints.NONE;
		gbc.insets = new Insets(0, 0, 0, 0);
		gbc.weighty = 1;
		gbc.weightx = 1;
		gbc.gridy = 1;
		gbc.gridx = 1;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;

		if (blankBat != null && bat != null) {
			for (int i = 0; i < bats.length; i++) {
				bats[i] = new JLabel(blankBat);
				if (i % 8 == 0) {
					gbc.gridy++;
					gbc.gridx = 1;
				}
				batPanel.add(bats[i]);
				batLayout.setConstraints(bats[i], gbc);
				gbc.gridx++;
			}
		}
	}

	private void setWeaponPanel() {
		weaponPanel.setLayout(weaponLayout);

		bullets = new JLabel[24];
		ammoLeft = new JLabel("0");
		ammoLeft.setFont(new Font("ammo", Font.BOLD, 24));
		gun = new JLabel(exampleGun);

		GridBagConstraints gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.fill = GridBagConstraints.NONE;
		gbc.insets = new Insets(0, 5, 0, 5);
		gbc.weighty = 1;
		gbc.weightx = 1;
		gbc.gridy = 1;
		gbc.gridx = 0;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;

		weaponPanel.add(gun);
		weaponLayout.setConstraints(gun, gbc);

		gbc.gridx++;
		gbc.insets = new Insets(0, 0, 0, 0);
		if (blankBullet != null && bullet != null) {
			for (int i = 0; i < bullets.length; i++) {
				bullets[i] = new JLabel(blankBullet);
				weaponPanel.add(bullets[i]);
				weaponLayout.setConstraints(bullets[i], gbc);
				gbc.gridx++;
			}
			gbc.insets = new Insets(0, 5, 0, 5);
			weaponPanel.add(ammoLeft);
			weaponLayout.setConstraints(ammoLeft, gbc);
		}
	}

	private void setHealthPanel() {
		healthPanel.setLayout(healthLayout);
		healthBar = new JProgressBar(0, 100);
		healthBar.setStringPainted(true);
		healthBar.setForeground(Color.GREEN);
		healthPanel.add(healthBar);
		health = new JLabel(greenHealth);
		healthPanel.add(health);

		GridBagConstraints gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.WEST;
		gbc.fill = GridBagConstraints.NONE;
		gbc.insets = new Insets(1, 15, 1, 5);
		gbc.weighty = 1;
		gbc.weightx = .1;
		gbc.gridy = 1;
		gbc.gridx = 1;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;

		healthLayout.setConstraints(health, gbc);

		gbc.insets = new Insets(0, 0, 0, 5);
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx++;
		gbc.gridwidth = 4;
		gbc.weightx = 1;
		healthLayout.setConstraints(healthBar, gbc);
	}

	private void setHelpPanel() {
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP,
				JTabbedPane.WRAP_TAB_LAYOUT);
		// tabbedPane.setSize(200, 500);
		helpPanel.add(tabbedPane);

		setControlsPanel();
		setCodePanel();

		tabbedPane.addTab(control_title, controlPanel);
		tabbedPane.addTab(code_title, codePanel);
	}

	private void setConsolePanel() {

	}

	private void setCodePanel() {
		codePanel = new JPanel();
		// codePanel.setSize(100,400);

		GridBagLayout codeLayout = new GridBagLayout();
		codePanel.setLayout(codeLayout);

		GridBagConstraints gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.WEST;
		gbc.fill = GridBagConstraints.NONE;
		gbc.insets = new Insets(5, 0, 0, 0);
		gbc.weighty = 0;
		gbc.weightx = 1;
		gbc.gridy = 1;
		gbc.gridx = 1;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;

		ammo = new JCheckBox(ammo_code);
		allWeapons = new JCheckBox(allWeapons_code);
		god = new JCheckBox(god_code);
		oneShot = new JCheckBox(oneShot_code);
		speed = new JCheckBox(speed_code);

		ammo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				for (CheatsObserver obs : cheatsObservers) {
					obs.unlimitedAmmoChanged(ammo.isSelected());
				}
			}
		});
		allWeapons.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				for (CheatsObserver obs : cheatsObservers) {
					obs.allWeaponsChanged(allWeapons.isSelected());
				}
			}
		});
		god.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				for (CheatsObserver obs : cheatsObservers) {
					obs.godModeChanged(god.isSelected());
				}
			}
		});
		oneShot.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				for (CheatsObserver obs : cheatsObservers) {
					obs.oneShotChanged(oneShot.isSelected());
				}
			}
		});
		speed.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				for (CheatsObserver obs : cheatsObservers) {
					obs.speedChanged(speed.isSelected());
				}
			}
		});

		codes = new JCheckBox[] { ammo, allWeapons, god, oneShot, speed };

		codePanel.add(ammo);
		codeLayout.setConstraints(ammo, gbc);
		gbc.gridy++;
		codePanel.add(allWeapons);
		codeLayout.setConstraints(allWeapons, gbc);
		gbc.gridy++;
		codePanel.add(god);
		codeLayout.setConstraints(god, gbc);
		gbc.gridy++;
		codePanel.add(oneShot);
		codeLayout.setConstraints(oneShot, gbc);
		gbc.gridy++;
		codePanel.add(speed);
		codeLayout.setConstraints(speed, gbc);
	}

	private void setControlsPanel() {
		controlPanel = new JPanel();
		controlPanel.setSize(100, 400);

		/*
		 * controls.setLineWrap(true); controls.setText(controls_text);
		 * controlPanel.add(controls);
		 */

		GridBagLayout controlsLayout = new GridBagLayout();
		controlPanel.setLayout(controlsLayout);

		GridBagConstraints gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.WEST;
		gbc.fill = GridBagConstraints.NONE;
		gbc.insets = new Insets(0, 0, 0, 0);
		gbc.weighty = .1;
		gbc.weightx = 1;
		gbc.gridy = 1;
		gbc.gridx = 1;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;

		controlPanel.add(A_key);
		gbc.gridy++;
		controlsLayout.setConstraints(A_key, gbc);

		controlPanel.add(S_key);
		gbc.gridy++;
		controlsLayout.setConstraints(S_key, gbc);

		controlPanel.add(W_key);
		gbc.gridy++;
		controlsLayout.setConstraints(W_key, gbc);

		controlPanel.add(D_key);
		gbc.gridy++;
		controlsLayout.setConstraints(D_key, gbc);

		controlPanel.add(E_key);
		gbc.gridy++;
		controlsLayout.setConstraints(E_key, gbc);

		//controlPanel.add(lessthan_key);
		//gbc.gridy++;
		//controlsLayout.setConstraints(lessthan_key, gbc);

		//controlPanel.add(greaterthan_key);
		//gbc.gridy++;
		//controlsLayout.setConstraints(greaterthan_key, gbc);

		controlPanel.add(UP_key);
		gbc.gridy++;
		controlsLayout.setConstraints(UP_key, gbc);

		controlPanel.add(DOWN_key);
		gbc.gridy++;
		controlsLayout.setConstraints(DOWN_key, gbc);

		controlPanel.add(LEFT_key);
		gbc.gridy++;
		controlsLayout.setConstraints(LEFT_key, gbc);

		controlPanel.add(RIGHT_key);
		gbc.gridy++;
		controlsLayout.setConstraints(RIGHT_key, gbc);

		controlPanel.add(ONE_key);
		gbc.gridy++;
		controlsLayout.setConstraints(ONE_key, gbc);

		//controlPanel.add(throughSpacer);
		//gbc.gridy++;
		//controlsLayout.setConstraints(throughSpacer, gbc);

		controlPanel.add(NINE_key);
		gbc.gridy++;
		controlsLayout.setConstraints(NINE_key, gbc);

		controlPanel.add(R_key);
		gbc.gridy++;
		controlsLayout.setConstraints(R_key, gbc);
		
		controlPanel.add(spaceBar_key);
		gbc.gridy++;
		controlsLayout.setConstraints(spaceBar_key, gbc);
		
		controlPanel.add(M_key);
		gbc.gridy++;
		controlsLayout.setConstraints(M_key, gbc);
		
		controlPanel.add(C_key);
		gbc.gridy++;
		controlsLayout.setConstraints(C_key, gbc);

		controlPanel.add(ESC_key);
		gbc.gridy++;
		controlsLayout.setConstraints(ESC_key, gbc);
	}

	private void setPerformanceDialog() {
		performanceDialog = new JDialog(this, "Performance Information");
		performanceDialog.setSize(new Dimension(400, 200));

		JPanel panel = new JPanel();
		panel.setVisible(true);
		panel.setLayout(performanceLayout);

		framesPerSec = new JLabel();
		maxFPS = new JLabel();
		avgFPS = new JLabel();
		numFPSpoints = 0;
		maxPoint = 0;
		totalFPS = 0;

		// this makes a moving chart to collect data on frame rate records
		Chart2D chart = new Chart2D();
		chart.getAxisX().getAxisTitle().setTitle("Collection Point");
		chart.getAxisY().getAxisTitle().setTitle("Rate (Frames/sec)");
		chart.getAxisX().getAxisTitle().setTitleColor(Color.GREEN);
		chart.getAxisY().getAxisTitle().setTitleColor(Color.GREEN);
		frameGraph = new Trace2DLtd("");
		frameGraph.setColor(Color.GREEN);
		chart.addTrace(frameGraph);
		chart.setBackground(Color.BLACK);
		chart.setForeground(Color.GREEN);

		GridBagConstraints gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.NORTHWEST;
		gbc.fill = GridBagConstraints.NONE;
		gbc.insets = new Insets(10, 15, 10, 5);
		gbc.weighty = .1;
		gbc.weightx = .1;
		gbc.gridy = 1;
		gbc.gridx = 1;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;

		performanceLayout.setConstraints(framesPerSec, gbc);
		gbc.gridy++;
		performanceLayout.setConstraints(maxFPS, gbc);
		gbc.gridy++;
		performanceLayout.setConstraints(avgFPS, gbc);
		panel.add(framesPerSec);
		panel.add(maxFPS);
		panel.add(avgFPS);

		gbc.gridwidth = 3;
		gbc.gridheight = 3;
		gbc.weightx = 3;
		gbc.weighty = 1;
		gbc.gridx++;
		gbc.gridy = 1;
		gbc.insets = new Insets(5, 5, 5, 5);
		gbc.fill = GridBagConstraints.BOTH;
		performanceLayout.setConstraints(chart, gbc);
		panel.add(chart);
		performanceDialog.add(panel);

		// performanceDialog.pack();
	}

	private void setColorChooser() {
		colorChooserDialog = new JDialog(this, "Color Chooser");
		colorChooserDialog.setSize(new Dimension(450, 420));

		GridBagLayout layout = new GridBagLayout();
		colorChooserDialog.setLayout(layout);

		GridBagConstraints gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.NORTH;
		gbc.fill = GridBagConstraints.NONE;
		gbc.insets = new Insets(0, 0, 0, 0);
		gbc.weighty = 1;
		gbc.weightx = 1;
		gbc.gridy = 1;
		gbc.gridx = 1;
		gbc.gridheight = 3;
		gbc.gridwidth = 2;

		layout.setConstraints(colorChooser, gbc);

		JButton ok = new JButton("OK");
		ok.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (colorChooserDialog.getTitle().equals(text_chooser_name)) {
					setTextColor(colorChooser.getColor());
				} else if (colorChooserDialog.getTitle().equals(
						panel_chooser_name)) {
					setPanelColor(colorChooser.getColor());
				}
				colorChooserDialog.setVisible(false);
			}
		});

		gbc.anchor = GridBagConstraints.CENTER;
		gbc.insets = new Insets(5, 0, 5, 80);
		gbc.gridy = 4;
		layout.setConstraints(ok, gbc);

		JButton cancel = new JButton("Cancel");
		cancel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				colorChooserDialog.setVisible(false);
			}
		});

		gbc.insets = new Insets(5, 80, 5, 0);
		gbc.gridx++;
		layout.setConstraints(cancel, gbc);

		colorChooserDialog.add(colorChooser);
		colorChooserDialog.add(ok);
		colorChooserDialog.add(cancel);
	}

	private void getImages() {
		try {
			blankBat = new ImageIcon(ImageIO.read(FileHelper
					.getFileInputStream("blank.png")));
			blankBullet = new ImageIcon(ImageIO.read(FileHelper
					.getFileInputStream("blank-bullet.png")));
			bullet = new ImageIcon(ImageIO.read(FileHelper
					.getFileInputStream("bullet.png")));
			exampleGun = new ImageIcon(ImageIO.read(FileHelper
					.getFileInputStream("exampleGun.png")));
			redHealth = new ImageIcon(ImageIO.read(FileHelper
					.getFileInputStream("redHealth.png")));
			orangeHealth = new ImageIcon(ImageIO.read(FileHelper
					.getFileInputStream("orangeHealth.png")));
			yellowHealth = new ImageIcon(ImageIO.read(FileHelper
					.getFileInputStream("yellowHealth.png")));
			greenHealth = new ImageIcon(ImageIO.read(FileHelper
					.getFileInputStream("greenHealth.png")));
			fistIcon = new ImageIcon(ImageIO.read(FileHelper.getFileInputStream("fistIcon.png")));
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	private void getKeyLabels() {
		try {
			A_key = new JLabel(a_text, new ImageIcon(ImageIO.read(FileHelper
					.getFileInputStream("key_icons/A_icon.png"))),
					SwingConstants.CENTER);
			S_key = new JLabel(s_text, new ImageIcon(ImageIO.read(FileHelper
					.getFileInputStream("key_icons/S_icon.png"))),
					SwingConstants.CENTER);
			W_key = new JLabel(w_text, new ImageIcon(ImageIO.read(FileHelper
					.getFileInputStream("key_icons/W_icon.png"))),
					SwingConstants.CENTER);
			D_key = new JLabel(d_text, new ImageIcon(ImageIO.read(FileHelper
					.getFileInputStream("key_icons/D_icon.png"))),
					SwingConstants.CENTER);
			E_key = new JLabel(e_text, new ImageIcon(ImageIO.read(FileHelper
					.getFileInputStream("key_icons/E_icon.png"))),
					SwingConstants.CENTER);
			/*
			lessthan_key = new JLabel(
					lessthan_text,
					new ImageIcon(ImageIO.read(FileHelper
							.getFileInputStream("key_icons/lessThan_icon.png"))),
					SwingConstants.CENTER);
			greaterthan_key = new JLabel(
					greaterthan_text,
					new ImageIcon(
							ImageIO.read(FileHelper
									.getFileInputStream("key_icons/greaterThan_icon.png"))),
					SwingConstants.CENTER);
					*/
			LEFT_key = new JLabel(left_text, new ImageIcon(
					ImageIO.read(FileHelper
							.getFileInputStream("key_icons/LEFT_icon.png"))),
					SwingConstants.CENTER);
			UP_key = new JLabel(up_text, new ImageIcon(ImageIO.read(FileHelper
					.getFileInputStream("key_icons/UP_icon.png"))),
					SwingConstants.CENTER);
			DOWN_key = new JLabel(down_text, new ImageIcon(
					ImageIO.read(FileHelper
							.getFileInputStream("key_icons/DOWN_icon.png"))),
					SwingConstants.CENTER);
			RIGHT_key = new JLabel(right_text, new ImageIcon(
					ImageIO.read(FileHelper
							.getFileInputStream("key_icons/RIGHT_icon.png"))),
					SwingConstants.CENTER);
			ONE_key = new JLabel(one_text, new ImageIcon(
					ImageIO.read(FileHelper
							.getFileInputStream("key_icons/1_icon.png"))),
					SwingConstants.CENTER);
			NINE_key = new JLabel(nine_text, new ImageIcon(
					ImageIO.read(FileHelper
							.getFileInputStream("key_icons/9_icon.png"))),
					SwingConstants.CENTER);
			C_key = new JLabel(c_text, new ImageIcon(
					ImageIO.read(FileHelper
							.getFileInputStream("key_icons/C_icon.png"))),
					SwingConstants.CENTER);
			ESC_key = new JLabel(esc_text, new ImageIcon(
					ImageIO.read(FileHelper
							.getFileInputStream("key_icons/ESC_icon.png"))),
					SwingConstants.CENTER);
			/*throughSpacer = new JLabel(through_text, new ImageIcon(
					ImageIO.read(FileHelper
							.getFileInputStream("key_icons/blank_icon.png"))),
					SwingConstants.CENTER);
			 */
			R_key = new JLabel(r_text, new ImageIcon(
					ImageIO.read(FileHelper
							.getFileInputStream("key_icons/R_icon.png"))),
					SwingConstants.CENTER);
			spaceBar_key = new JLabel(space_text, new ImageIcon(
					ImageIO.read(FileHelper
							.getFileInputStream("key_icons/spaceBar_icon.png"))),
					SwingConstants.CENTER);
			M_key = new JLabel(m_text, new ImageIcon(
					ImageIO.read(FileHelper
							.getFileInputStream("key_icons/M_icon.png"))),
					SwingConstants.CENTER);
			keys = new JLabel[] { A_key, S_key, W_key, D_key, E_key,
					LEFT_key, UP_key, DOWN_key,
					RIGHT_key, ONE_key, NINE_key,R_key, spaceBar_key, M_key, C_key, ESC_key};
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void setBatCount(int x) {
		int notShown = 0;
		if (bats.length < x) {
			notShown = x - (bats.length - 1);
			for (int i = 0; i < bats.length - 1; i++) {
				bats[i].setIcon(bat);
			}
			bats[bats.length - 1].setIcon(null);
			bats[bats.length - 1].setText("" + notShown + " more..");
		} else {
			bats[bats.length - 1].setText("");
			for (int i = 0; i < bats.length; i++) {
				if (i < x) {
					bats[i].setIcon(bat);
				} else {
					bats[i].setIcon(blankBat);
				}
			}
		}
	}

	private void setBulletCount(int ammo, int clipSize) {
		int notShown = ammo - clipSize;
		if (notShown < 0) {
			notShown = 0;
		}

		if (clipSize > bullets.length || clipSize < 0) {
			clipSize = bullets.length;
		}
		if (clipSize == currentWeapon.getClipSize()) {
			for (int i = 0; i < clipSize; i++) {
				bullets[i].setIcon(bullet);
			}
		} else {
			for (int i = 0; i < currentWeapon.getClipSize(); i++) {
				if (clipSize > i) {
					bullets[i].setIcon(bullet);
				} else {
					bullets[i].setIcon(blankBullet);
				}
			}
		}
		ammoLeft.setText("" + notShown);
		if (notShown == 0) {
			ammoLeft.setForeground(Color.RED);
		} else {
			ammoLeft.setForeground(textColor);
		}
	}

	private void shotWeapon() {
		/*
		 * for (int i = 0; i < bullets.length; i++) { if (i == 0 &&
		 * bullets[i].getIcon() == blankBullet) { // if first bullet is empty,
		 * then we want to reload and shoot // again
		 * setBulletCount(currentWeapon.getAmmo(), currentWeapon.getClipSize());
		 * shotWeapon(); } else if (bullets[i].getIcon() == blankBullet && i >
		 * 0) { bullets[i - 1].setIcon(blankBullet); if (i - 1 == 0) { // if we
		 * get here, that means we need to reload
		 * setBulletCount(currentWeapon.getAmmo(), currentWeapon.getClipSize());
		 * return; } return; } }
		 */
		updateBulletCount();
	}

	public void setOriginalHealth(int x) {
		originalHealth = x;
	}

	public void setHealthUnchangeable() {
		changeable = false;
	}

	public void returnToDefault() {
		healthNum = originalHealth;
		healthBar.setValue(healthNum);
		changeable = true;
	}

	public void setHealth(int x) {
		if (changeable == false) {
			System.out.print("false");
			return;
		}
		healthNum = x;
		healthBar.setValue(x);
		if (x < 25) {
			health.setIcon(redHealth);
		} else if (x < 50) {
			health.setIcon(orangeHealth);
		} else if (x < 75) {
			health.setIcon(yellowHealth);
		} else if (x >= 75) {
			health.setIcon(greenHealth);
		}
	}

	public int getHealth() {
		return healthNum;
	}

	public void setFramesPerSecond(int x) {
		numFPSpoints++;
		totalFPS += x;
		framesPerSec.setText("Frames/Sec: " + x);
		if (x > maxPoint) {
			maxPoint = x;
			maxFPS.setText("Maximum Frames/Sec: " + maxPoint);
		}
		avgFPS.setText("Average Frames/Sec: " + (int) totalFPS / numFPSpoints);
		frameGraph.addPoint(numFPSpoints, x);
	}

	public void setPanelColor(Color c) {
		if (c != null) {
			panelColor = c;

			radarPanel.setBackground(c);
			healthPanel.setBackground(c);
			batPanel.setBackground(c);
			weaponPanel.setBackground(c);
			helpPanel.setBackground(c);
			codePanel.setBackground(c);
			controlPanel.setBackground(c);
			rightPanel.setBackground(c);
			mainPanel.setBackground(c);
			for (int i = 0; i < codes.length; i++) {
				codes[i].setBackground(c);
			}
		}
	}

	public void setTextColor(Color c) {
		if (c != null) {
			textColor = c;

			bats[bats.length - 1].setForeground(c);
			ammoLeft.setForeground(c);
			for (int i = 0; i < codes.length; i++) {
				codes[i].setForeground(c);
			}
			for (int i = 0; i < keys.length; i++) {
				keys[i].setForeground(c);
			}
		}
	}

	public void updateBatCount(int count) {
		setBatCount(count);
	}

	@Override
	public void updateWeaponChange(Weapon w) {
		if (w != null) {
			currentWeapon = w;
			Icon image = w.getImage();
			if (image == null) {
				gun.setIcon(exampleGun);
			} else {
				gun.setIcon(image);
			}
			setBulletCount(w.getAmmo(), w.getCurrentClip());
		} else {
			currentWeapon = null;
			gun.setIcon(fistIcon);
			for (int i = 0; i < bullets.length; i++) {
				bullets[i].setIcon(blankBullet);
			}
			ammoLeft.setText(" ");
		}
	}

	@Override
	public void updateWeaponFired() {
		shotWeapon();
	}

	@Override
	public void updateHealth(int health) {
		setHealth(health);
	}

	@Override
	public void updateBulletCount() {
		setBulletCount(currentWeapon.getAmmo(), currentWeapon.getCurrentClip());
	}

	@Override
	public void updateControlBehavior(ControlBehavior cb) {
	}

	public void addCheatsObserver(CheatsObserver obs) {
		cheatsObservers.add(obs);
	}
}
