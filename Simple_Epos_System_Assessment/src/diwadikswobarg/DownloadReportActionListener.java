/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diwadikswobarg;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
/**
 *
 * @author DawidGrabowski
 */
public class DownloadReportActionListener implements ActionListener {

  private JTextArea txtAreaReport;

  public DownloadReportActionListener(JTextArea txtAreaReport) {
    this.txtAreaReport = txtAreaReport;
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    JFileChooser fileChooser = new JFileChooser();
    fileChooser.setDialogTitle("Save Report");
    fileChooser.setSelectedFile(new File("Report.txt"));
    int userSelection = fileChooser.showSaveDialog(txtAreaReport);

    if (userSelection == JFileChooser.APPROVE_OPTION) {
      File fileToSave = fileChooser.getSelectedFile();
      try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileToSave))) {
        writer.write(txtAreaReport.getText());
        JOptionPane.showMessageDialog(txtAreaReport, "Report saved successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
      } catch (IOException ex) {
        JOptionPane.showMessageDialog(txtAreaReport, "Error saving report: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
      }
    }
  }
}
