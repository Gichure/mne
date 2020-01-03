/**
 * 
 */
package com.paurush.mne;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;

/**
 * @author Paul Gichure
 *
 */
public class MnEApplication {

	protected Shell shlSpatialDecisionSupport;
	private Text text;
	private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());
	private Text text_2;
	private Text text_3;
	private Text text_4;
	private Text text_5;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			MnEApplication window = new MnEApplication();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlSpatialDecisionSupport.open();
		shlSpatialDecisionSupport.layout();
		while (!shlSpatialDecisionSupport.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlSpatialDecisionSupport = new Shell();
		shlSpatialDecisionSupport.setImage(SWTResourceManager.getImage(MnEApplication.class, "/resources/gps.ico"));
		shlSpatialDecisionSupport.setToolTipText("SPATIAL DECISION SUPPORT SYSTEM FOR MANAGEMENT OF STREET CHILDREN");
		shlSpatialDecisionSupport.setSize(650, 450);
		shlSpatialDecisionSupport.setText("SPATIAL DECISION SUPPORT SYSTEM FOR MANAGEMENT OF STREET CHILDREN");
		shlSpatialDecisionSupport.setLayout(null);
		
		
		TabFolder tabFolder = new TabFolder(shlSpatialDecisionSupport, SWT.TOP);
		tabFolder.setLocation(0, 0);
		tabFolder.setSize(609, 279);
		tabFolder.setParent(shlSpatialDecisionSupport);
		
		TabItem tbtmMonitoring = new TabItem(tabFolder, SWT.NONE);
		tbtmMonitoring.setText("Monitoring");
		
		Composite composite = new Composite(tabFolder, SWT.NONE);
		tbtmMonitoring.setControl(composite);
		formToolkit.paintBordersFor(composite);
		
		Group group_4 = new Group(composite, SWT.NONE);
		group_4.setBounds(20, 10, 540, 231);
		formToolkit.adapt(group_4);
		formToolkit.paintBordersFor(group_4);
		
		Combo combo = new Combo(group_4, SWT.NONE);
		combo.setBounds(70, 21, 168, 23);
		formToolkit.adapt(combo);
		formToolkit.paintBordersFor(combo);
		
		Label lblNewLabel = new Label(group_4, SWT.NONE);
		lblNewLabel.setBounds(10, 21, 55, 23);
		formToolkit.adapt(lblNewLabel, true, true);
		lblNewLabel.setText("Barracks");
		
		Label lblYear = new Label(group_4, SWT.NONE);
		lblYear.setBounds(302, 21, 55, 23);
		lblYear.setText("Year");
		formToolkit.adapt(lblYear, true, true);
		
		Combo combo_1 = new Combo(group_4, SWT.NONE);
		combo_1.setBounds(362, 21, 168, 23);
		formToolkit.adapt(combo_1);
		formToolkit.paintBordersFor(combo_1);
		
		Button btnNewButton_1 = new Button(group_4, SWT.NONE);
		btnNewButton_1.setBounds(407, 50, 119, 25);
		formToolkit.adapt(btnNewButton_1, true, true);
		btnNewButton_1.setText("Display");
		
		Group grpPerformanceAnalysisDefs = new Group(group_4, SWT.NONE);
		grpPerformanceAnalysisDefs.setBounds(10, 97, 254, 99);
		grpPerformanceAnalysisDefs.setText("Performance Analysis Defs.");
		formToolkit.adapt(grpPerformanceAnalysisDefs);
		formToolkit.paintBordersFor(grpPerformanceAnalysisDefs);
		
		Button btnRadioButton = new Button(grpPerformanceAnalysisDefs, SWT.RADIO);
		btnRadioButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnRadioButton.setBounds(20, 26, 210, 16);
		formToolkit.adapt(btnRadioButton, true, true);
		btnRadioButton.setText("SC attending Boarding School");
		
		Button button_2 = new Button(grpPerformanceAnalysisDefs, SWT.RADIO);
		button_2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		button_2.setText("SC attending Primary School");
		button_2.setBounds(20, 48, 210, 16);
		formToolkit.adapt(button_2, true, true);
		
		Button button_3 = new Button(grpPerformanceAnalysisDefs, SWT.RADIO);
		button_3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		button_3.setText("SC on Lunch Programe!");
		button_3.setBounds(20, 70, 210, 16);
		formToolkit.adapt(button_3, true, true);
		
		Group grpSortBy = new Group(group_4, SWT.NONE);
		grpSortBy.setBounds(302, 97, 228, 99);
		grpSortBy.setText("Sort By");
		formToolkit.adapt(grpSortBy);
		formToolkit.paintBordersFor(grpSortBy);
		
		Button btnGender = new Button(grpSortBy, SWT.RADIO);
		btnGender.setBounds(24, 28, 90, 16);
		formToolkit.adapt(btnGender, true, true);
		btnGender.setText("Gender");
		
		Button button_4 = new Button(grpSortBy, SWT.RADIO);
		button_4.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		button_4.setText("Locality");
		button_4.setBounds(24, 51, 90, 16);
		formToolkit.adapt(button_4, true, true);
		
		Button button_5 = new Button(grpSortBy, SWT.RADIO);
		button_5.setText("Schools");
		button_5.setBounds(24, 73, 90, 16);
		formToolkit.adapt(button_5, true, true);
		
		TabItem tbtmPerformanceAnalysis_1 = new TabItem(tabFolder, SWT.NONE);
		tbtmPerformanceAnalysis_1.setText("Performance Analysis");
		
		Composite composite_1 = new Composite(tabFolder, SWT.NONE);
		tbtmPerformanceAnalysis_1.setControl(composite_1);
		formToolkit.paintBordersFor(composite_1);
		
		Composite composite_5 = new Composite(composite_1, SWT.BORDER);
		composite_5.setBounds(10, 10, 535, 221);
		formToolkit.adapt(composite_5);
		formToolkit.paintBordersFor(composite_5);
		
		Group grpPerformanceAnalysisReport = new Group(composite_5, SWT.NONE);
		grpPerformanceAnalysisReport.setBounds(21, 101, 298, 99);
		grpPerformanceAnalysisReport.setText("Performance Analysis Report Definition.");
		formToolkit.adapt(grpPerformanceAnalysisReport);
		formToolkit.paintBordersFor(grpPerformanceAnalysisReport);
		
		Button btnListOfSc = new Button(grpPerformanceAnalysisReport, SWT.RADIO);
		btnListOfSc.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnListOfSc.setText("List of SC who integrated back to family");
		btnListOfSc.setBounds(20, 26, 210, 16);
		formToolkit.adapt(btnListOfSc, true, true);
		
		Button button_8 = new Button(grpPerformanceAnalysisReport, SWT.RADIO);
		button_8.setText("List of SC who have completed Education");
		button_8.setBounds(20, 48, 210, 16);
		formToolkit.adapt(button_8, true, true);
		
		Button button_9 = new Button(grpPerformanceAnalysisReport, SWT.RADIO);
		button_9.setText("Performance Graph");
		button_9.setBounds(20, 70, 210, 16);
		formToolkit.adapt(button_9, true, true);
		
		Label label = new Label(composite_5, SWT.NONE);
		label.setBounds(21, 27, 55, 23);
		label.setText("Barracks");
		formToolkit.adapt(label, true, true);
		
		Combo combo_2 = new Combo(composite_5, SWT.NONE);
		combo_2.setBounds(81, 27, 168, 23);
		combo_2.setEnabled(false);
		formToolkit.adapt(combo_2);
		formToolkit.paintBordersFor(combo_2);
		
		Combo combo_3 = new Combo(composite_5, SWT.NONE);
		combo_3.setBounds(315, 27, 168, 23);
		combo_3.setEnabled(false);
		formToolkit.adapt(combo_3);
		formToolkit.paintBordersFor(combo_3);
		
		Button button_6 = new Button(composite_5, SWT.NONE);
		button_6.setBounds(360, 56, 119, 25);
		button_6.setText("Display");
		formToolkit.adapt(button_6, true, true);
		
		Label label_1 = new Label(composite_5, SWT.NONE);
		label_1.setBounds(255, 27, 55, 23);
		label_1.setText("Year");
		formToolkit.adapt(label_1, true, true);
		
		TabItem tbtmAssesment = new TabItem(tabFolder, SWT.NONE);
		tbtmAssesment.setText("Assesment");
		
		Composite composite_7 = new Composite(tabFolder, SWT.NONE);
		tbtmAssesment.setControl(composite_7);
		formToolkit.paintBordersFor(composite_7);
		
		Composite composite_8 = new Composite(composite_7, SWT.BORDER);
		composite_8.setBounds(10, 10, 563, 231);
		formToolkit.adapt(composite_8);
		formToolkit.paintBordersFor(composite_8);
		
		text_5 = new Text(composite_8, SWT.BORDER);
		text_5.setBounds(70, 10, 168, 21);
		formToolkit.adapt(text_5, true, true);
		
		Combo combo_9 = new Combo(composite_8, SWT.NONE);
		combo_9.setBounds(70, 63, 168, 23);
		formToolkit.adapt(combo_9);
		formToolkit.paintBordersFor(combo_9);
		
		Label label_7 = new Label(composite_8, SWT.NONE);
		label_7.setText("Barracks");
		label_7.setBounds(10, 63, 55, 23);
		formToolkit.adapt(label_7, true, true);
		
		Label label_8 = new Label(composite_8, SWT.NONE);
		label_8.setText("Name");
		label_8.setBounds(10, 10, 55, 15);
		formToolkit.adapt(label_8, true, true);
		
		Combo combo_10 = new Combo(composite_8, SWT.NONE);
		combo_10.setBounds(338, 10, 168, 23);
		formToolkit.adapt(combo_10);
		formToolkit.paintBordersFor(combo_10);
		
		Button button_14 = new Button(composite_8, SWT.NONE);
		button_14.setText("Display");
		button_14.setBounds(383, 39, 123, 25);
		formToolkit.adapt(button_14, true, true);
		
		Label label_9 = new Label(composite_8, SWT.NONE);
		label_9.setText("Year");
		label_9.setBounds(276, 10, 55, 23);
		formToolkit.adapt(label_9, true, true);
		
		Group group_5 = new Group(composite_8, SWT.NONE);
		group_5.setText("Sort By");
		group_5.setBounds(28, 122, 368, 99);
		formToolkit.adapt(group_5);
		formToolkit.paintBordersFor(group_5);
		
		Button button_15 = new Button(group_5, SWT.RADIO);
		button_15.setText("All");
		button_15.setBounds(24, 28, 90, 16);
		formToolkit.adapt(button_15, true, true);
		
		Button button_23 = new Button(group_5, SWT.RADIO);
		button_23.setText("Female");
		button_23.setBounds(24, 51, 90, 16);
		formToolkit.adapt(button_23, true, true);
		
		Button button_24 = new Button(group_5, SWT.RADIO);
		button_24.setText("Male");
		button_24.setBounds(24, 73, 90, 16);
		formToolkit.adapt(button_24, true, true);
		
		TabItem tbtmAlleviation = new TabItem(tabFolder, SWT.NONE);
		tbtmAlleviation.setText("Alleviation");
		
		Composite composite_9 = new Composite(tabFolder, SWT.NONE);
		tbtmAlleviation.setControl(composite_9);
		formToolkit.paintBordersFor(composite_9);
		
		Composite composite_10 = new Composite(composite_9, SWT.BORDER);
		composite_10.setBounds(10, 10, 581, 231);
		formToolkit.adapt(composite_10);
		formToolkit.paintBordersFor(composite_10);
		
		Label label_2 = new Label(composite_10, SWT.NONE);
		label_2.setText("Name");
		label_2.setBounds(10, 10, 55, 23);
		formToolkit.adapt(label_2, true, true);
		
		Combo combo_4 = new Combo(composite_10, SWT.NONE);
		combo_4.setBounds(70, 10, 168, 23);
		formToolkit.adapt(combo_4);
		formToolkit.paintBordersFor(combo_4);
		
		Label label_3 = new Label(composite_10, SWT.NONE);
		label_3.setText("Barracks");
		label_3.setBounds(15, 58, 55, 23);
		formToolkit.adapt(label_3, true, true);
		
		Combo combo_5 = new Combo(composite_10, SWT.NONE);
		combo_5.setBounds(75, 58, 168, 23);
		formToolkit.adapt(combo_5);
		formToolkit.paintBordersFor(combo_5);
		
		Label label_10 = new Label(composite_10, SWT.NONE);
		label_10.setText("Year");
		label_10.setBounds(274, 10, 55, 23);
		formToolkit.adapt(label_10, true, true);
		
		Combo combo_11 = new Combo(composite_10, SWT.NONE);
		combo_11.setBounds(330, 10, 168, 23);
		formToolkit.adapt(combo_11);
		formToolkit.paintBordersFor(combo_11);
		
		Button button_7 = new Button(composite_10, SWT.NONE);
		button_7.setText("Display");
		button_7.setBounds(375, 39, 119, 25);
		formToolkit.adapt(button_7, true, true);
		
		Group group = new Group(composite_10, SWT.NONE);
		group.setText("Secondary Intervention");
		group.setBounds(10, 97, 254, 108);
		formToolkit.adapt(group);
		formToolkit.paintBordersFor(group);
		
		Button button_10 = new Button(group, SWT.RADIO);
		button_10.setText("Boarding School");
		button_10.setBounds(20, 26, 210, 16);
		formToolkit.adapt(button_10, true, true);
		
		Button button_11 = new Button(group, SWT.RADIO);
		button_11.setText("Primary School");
		button_11.setBounds(20, 48, 210, 16);
		formToolkit.adapt(button_11, true, true);
		
		Button button_12 = new Button(group, SWT.RADIO);
		button_12.setText("School Lunch");
		button_12.setBounds(20, 70, 210, 16);
		formToolkit.adapt(button_12, true, true);
		
		Group group_6 = new Group(composite_10, SWT.NONE);
		group_6.setText("Primary Intervention");
		group_6.setBounds(306, 97, 254, 108);
		formToolkit.adapt(group_6);
		formToolkit.paintBordersFor(group_6);
		
		Button button_25 = new Button(group_6, SWT.RADIO);
		button_25.setText("Poverty");
		button_25.setBounds(24, 22, 90, 16);
		formToolkit.adapt(button_25, true, true);
		
		Button button_26 = new Button(group_6, SWT.RADIO);
		button_26.setText("Abuse");
		button_26.setBounds(24, 44, 90, 16);
		formToolkit.adapt(button_26, true, true);
		
		Button button_27 = new Button(group_6, SWT.RADIO);
		button_27.setText("Illicit Brewing");
		button_27.setBounds(24, 66, 90, 16);
		formToolkit.adapt(button_27, true, true);
		
		Button button_28 = new Button(group_6, SWT.RADIO);
		button_28.setText("Natural Disaster");
		button_28.setBounds(24, 88, 90, 16);
		formToolkit.adapt(button_28, true, true);
		
		TabItem tbtmSiting = new TabItem(tabFolder, SWT.NONE);
		tbtmSiting.setText("Siting");
		
		Composite composite_4 = new Composite(tabFolder, SWT.NONE);
		tbtmSiting.setControl(composite_4);
		formToolkit.paintBordersFor(composite_4);
		
		Group group_1 = new Group(composite_4, SWT.NONE);
		group_1.setBounds(10, 10, 554, 205);
		formToolkit.adapt(group_1);
		formToolkit.paintBordersFor(group_1);
		
		Label label_6 = new Label(group_1, SWT.NONE);
		label_6.setText("Barracks");
		label_6.setBounds(10, 31, 55, 23);
		formToolkit.adapt(label_6, true, true);
		
		text_2 = new Text(group_1, SWT.BORDER);
		text_2.setBounds(95, 31, 155, 21);
		formToolkit.adapt(text_2, true, true);
		
		Label lblHealthFacility = new Label(group_1, SWT.NONE);
		lblHealthFacility.setText("Health Facility");
		lblHealthFacility.setBounds(10, 78, 75, 18);
		formToolkit.adapt(lblHealthFacility, true, true);
		
		text_3 = new Text(group_1, SWT.BORDER);
		text_3.setBounds(95, 75, 155, 21);
		formToolkit.adapt(text_3, true, true);
		
		Label lblScFamily = new Label(group_1, SWT.NONE);
		lblScFamily.setText("SC Family");
		lblScFamily.setBounds(10, 123, 55, 23);
		formToolkit.adapt(lblScFamily, true, true);
		
		text_4 = new Text(group_1, SWT.BORDER);
		text_4.setBounds(95, 123, 155, 21);
		formToolkit.adapt(text_4, true, true);
		
		Button btnRunCheck = new Button(group_1, SWT.NONE);
		btnRunCheck.setBounds(175, 159, 75, 25);
		formToolkit.adapt(btnRunCheck, true, true);
		btnRunCheck.setText("Run Check");
		
		Button button_13 = new Button(group_1, SWT.NONE);
		button_13.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		button_13.setText("");
		button_13.setBounds(297, 31, 229, 153);
		formToolkit.adapt(button_13, true, true);
		
		TabItem tbtmAbout = new TabItem(tabFolder, SWT.NONE);
		tbtmAbout.setText("About");
		
		Composite composite_2 = new Composite(tabFolder, SWT.NONE);
		tbtmAbout.setControl(composite_2);
		formToolkit.paintBordersFor(composite_2);
		
		Composite composite_6 = new Composite(composite_2, SWT.BORDER);
		composite_6.setBounds(24, 21, 538, 207);
		formToolkit.adapt(composite_6);
		formToolkit.paintBordersFor(composite_6);
		
		Button btnNewButton = new Button(shlSpatialDecisionSupport, SWT.NONE);
		btnNewButton.setBounds(46, 294, 84, 25);
		btnNewButton.setText("SC Form");
		
		Button btnSfForm = new Button(shlSpatialDecisionSupport, SWT.NONE);
		btnSfForm.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnSfForm.setText("S.F Form");
		btnSfForm.setBounds(197, 294, 84, 25);
		
		Button btnBarackForm = new Button(shlSpatialDecisionSupport, SWT.NONE);
		btnBarackForm.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnBarackForm.setText("Baracks Form");
		btnBarackForm.setBounds(342, 294, 84, 25);
		
		Button btnExit = new Button(shlSpatialDecisionSupport, SWT.NONE);
		btnExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				System.exit(0);
			}
		});
		btnExit.setText("Exit");
		btnExit.setBounds(482, 294, 84, 25);
		
		Button button = new Button(shlSpatialDecisionSupport, SWT.NONE);
		button.setImage(SWTResourceManager.getImage(MnEApplication.class, "/resources/pen.png"));
		button.setBounds(27, 345, 103, 56);
		
		Button button_1 = new Button(shlSpatialDecisionSupport, SWT.NONE);
		button_1.setImage(SWTResourceManager.getImage(MnEApplication.class, "/resources/blank-cd.png"));
		button_1.setBounds(178, 345, 103, 56);
		
		Button btnSqlScripts = new Button(shlSpatialDecisionSupport, SWT.NONE);
		btnSqlScripts.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnSqlScripts.setText("SQL Scripts");
		btnSqlScripts.setBounds(323, 345, 103, 56);
		
		text = new Text(shlSpatialDecisionSupport, SWT.BORDER);
		text.setBounds(472, 345, 136, 45);

	}
}
