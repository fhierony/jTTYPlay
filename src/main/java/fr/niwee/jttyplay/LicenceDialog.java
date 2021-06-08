/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * LicenceDialog.java
 *
 * Created on 06-Feb-2010, 18:26:47
 */

package fr.niwee.jttyplay;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author ais523
 */
public class LicenceDialog extends javax.swing.JDialog {

    /** Creates new form LicenceDialog
     * @param parent The parent of the dialog box to create.
     */
    public LicenceDialog(java.awt.Frame parent) {
        super(parent, true);
        initComponents();
        getRootPane().setDefaultButton(closeButton);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bottomPanel = new javax.swing.JPanel();
        closeButton = new javax.swing.JButton();
        licenceScroller = new javax.swing.JScrollPane();
        licenceTextArea = new javax.swing.JTextArea();
        introLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Licence conditions");
        setName("Form"); // NOI18N

        bottomPanel.setName("bottomPanel"); // NOI18N
        bottomPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        closeButton.setMnemonic('c');
        closeButton.setText("Close");
        closeButton.setName("closeButton"); // NOI18N
        closeButton.addActionListener(this::closeButtonActionPerformed);
        bottomPanel.add(closeButton);

        getContentPane().add(bottomPanel, java.awt.BorderLayout.SOUTH);

        licenceScroller.setAutoscrolls(true);
        licenceScroller.setName("licenceScroller"); // NOI18N
        licenceScroller.setPreferredSize(new java.awt.Dimension(600, 500));

        licenceTextArea.setColumns(20);
        licenceTextArea.setEditable(false);
        licenceTextArea.setRows(5);
        licenceTextArea.setText(getLicenceText());
        licenceTextArea.setName("licenceTextArea"); // NOI18N
        licenceScroller.setViewportView(licenceTextArea);

        getContentPane().add(licenceScroller, java.awt.BorderLayout.CENTER);

        introLabel.setText("<html>For reference, here are the licence and (lack of) warranty for this program:");
        introLabel.setName("introLabel"); // NOI18N
        getContentPane().add(introLabel, java.awt.BorderLayout.NORTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        dispose();
    }//GEN-LAST:event_closeButtonActionPerformed

    private String getLicenceText() {
        String fname = "COPYING.txt";
        try {
            InputStream i = LicenceDialog.class.getClassLoader().getResource(fname).openStream();
            BufferedReader b = new BufferedReader(new InputStreamReader(i));
            StringBuilder s = new StringBuilder();
            for (String t = b.readLine(); t != null; t = b.readLine()) {
                s.append(t);
                s.append("\n");
            }
            i.close();
            return s.toString();
        } catch(IOException i) {
            return "Licence information not available; try reinstalling.";
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bottomPanel;
    private javax.swing.JButton closeButton;
    private javax.swing.JLabel introLabel;
    private javax.swing.JScrollPane licenceScroller;
    private javax.swing.JTextArea licenceTextArea;
    // End of variables declaration//GEN-END:variables

}
